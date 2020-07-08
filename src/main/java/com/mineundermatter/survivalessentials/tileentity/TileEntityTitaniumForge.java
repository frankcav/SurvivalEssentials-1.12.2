package com.mineundermatter.survivalessentials.tileentity;

import com.mineundermatter.survivalessentials.block.BlockIceCreamMaker;
import com.mineundermatter.survivalessentials.block.BlockTitaniumForge;
import com.mineundermatter.survivalessentials.init.EssentialItems;
import com.mineundermatter.survivalessentials.recipe.IceCreamRecipes;
import com.mineundermatter.survivalessentials.recipe.TitaniumForgeRecipes;

import net.minecraft.block.BlockFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TileEntityTitaniumForge extends TileEntity implements IInventory, ITickable {

	private NonNullList<ItemStack> inventory = NonNullList.<ItemStack>withSize(3, ItemStack.EMPTY);
	private String customName;
	
	private int burnTime;
	private int currentBurnTime;
	private int cookTime;
	private int totalCookTime;
	
	
	@Override
	public String getName() {
		
		return this.hasCustomName() ? this.customName : "container.titanium_forge";
	}
	
	

	@Override
	public boolean hasCustomName() {
		
		return this.customName != null && ! this.customName.isEmpty();
	}
	
	public void setCustomName(String customName) {
		this.customName = customName;
	}
	
	@Override
	public ITextComponent getDisplayName() {
		return this.hasCustomName() ? new TextComponentString(this.getName()) : new TextComponentTranslation(this.getName());
	}

	

	@Override
	public int getSizeInventory() {
		
		return this.inventory.size();
	}

	@Override
	public boolean isEmpty() {
		
		for(ItemStack stack: this.inventory)
			if(!stack.isEmpty())
				return false;
		return true;
	}
	
	

	@Override
	public ItemStack getStackInSlot(int index) {
		
		return (ItemStack)this.inventory.get(index);
	}

	@Override
	public ItemStack decrStackSize(int index, int count) {
		return ItemStackHelper.getAndSplit(this.inventory, index, count);
	}

	@Override
	public ItemStack removeStackFromSlot(int index) {
		return ItemStackHelper.getAndRemove(this.inventory, index);
	}

	@Override
	public void setInventorySlotContents(int index, ItemStack stack) {
		ItemStack itemstack = (ItemStack)this.inventory.get(index);
		boolean flag = !stack.isEmpty() && stack.isItemEqual(itemstack) && ItemStack.areItemsEqual(stack, itemstack);
		this.inventory.set(index, stack);
		
		if(stack.getCount() > this.getInventoryStackLimit())

			stack.setCount(this.getInventoryStackLimit());

		if(index == 0 && !flag) {

			this.totalCookTime = this.getCookTime(stack);

			this.cookTime = 0;

			this.markDirty();
		}
		
	}
	
	@Override

	public void readFromNBT(NBTTagCompound compound) {

		super.readFromNBT(compound);

		this.inventory = NonNullList.<ItemStack>withSize(this.getSizeInventory(), ItemStack.EMPTY);

		ItemStackHelper.loadAllItems(compound, this.inventory);

		this.burnTime = compound.getInteger("BurnTime");

		this.cookTime = compound.getInteger("CookTime");

		this.totalCookTime = compound.getInteger("CookTimeTotal");

		this.currentBurnTime = getItemBurnTime((ItemStack)this.inventory.get(1));

		

		if(compound.hasKey("CustomName", 8))

			this.setCustomName(compound.getString("CustomName"));

	}

	

	@Override

	public NBTTagCompound writeToNBT(NBTTagCompound compound) {

		super.writeToNBT(compound);

		compound.setInteger("BurnTime", (short)this.burnTime);

		compound.setInteger("CookTime", (short)this.cookTime);

		compound.setInteger("CookTimeTotal", (short)this.totalCookTime);

		ItemStackHelper.saveAllItems(compound, this.inventory);

		

		if(this.hasCustomName())

			compound.setString("CustomName", this.customName);

		

		return compound;
		
	}
	

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}
	
	public boolean isBurning() {

		return this.burnTime > 0;

	}

	

	@SideOnly(Side.CLIENT)

	public static boolean isBurning(IInventory inventory) {

		return inventory.getField(0) > 0;

	}

	
	
	@Override
	public void update()
    {
        boolean flag = this.isBurning();
        boolean flag1 = false;

        if (this.isBurning())
        {
            --this.burnTime;
        }

        if (!this.world.isRemote)
        {
            ItemStack itemstack = this.inventory.get(1);

            if (this.isBurning() || !itemstack.isEmpty() && !((ItemStack)this.inventory.get(0)).isEmpty())
            {
                if (!this.isBurning() && this.canSmelt())
                {
                    this.burnTime = getItemBurnTime(itemstack);
                    this.currentBurnTime = this.burnTime;

                    if (this.isBurning())
                    {
                        flag1 = true;

                        if (!itemstack.isEmpty())
                        {
                            Item item = itemstack.getItem();
                            itemstack.shrink(1);

                            if (itemstack.isEmpty())
                            {
                                ItemStack item1 = item.getContainerItem(itemstack);
                                this.inventory.set(1, item1);
                            }
                        }
                    }
                }

                if (this.isBurning() && this.canSmelt())
                {
                    ++this.cookTime;

                    if (this.cookTime == this.totalCookTime)
                    {
                        this.cookTime = 0;
                        this.totalCookTime = this.getCookTime(this.inventory.get(0));
                        this.smeltItem();
                        flag1 = true;
                    }
                }
                else
                {
                    this.cookTime = 0;
                }
            }
            else if (!this.isBurning() && this.cookTime > 0)
            {
                this.cookTime = MathHelper.clamp(this.cookTime - 2, 0, this.totalCookTime);
            }

            if (flag != this.isBurning())
            {
                flag1 = true;
                BlockTitaniumForge.setState(this.isBurning(), this.world, this.pos);
            }
        }

        if (flag1)
        {
            this.markDirty();
        }
    }
	
	public int getCookTime(ItemStack input1) {

		return 200;

	}
		
		
	private boolean canSmelt() {

		if (((ItemStack)this.inventory.get(0)).isEmpty())
        {
            return false;
        }
        else
        {
            ItemStack itemstack = TitaniumForgeRecipes.instance().getForgingResult(this.inventory.get(0));

            if (itemstack.isEmpty())
            {
                return false;
            }
            else
            {
                ItemStack itemstack1 = this.inventory.get(2);

                if (itemstack1.isEmpty())
                {
                    return true;
                }
                else if (!itemstack1.isItemEqual(itemstack))
                {
                    return false;
                }
                else if (itemstack1.getCount() + itemstack.getCount() <= this.getInventoryStackLimit() && itemstack1.getCount() + itemstack.getCount() <= itemstack1.getMaxStackSize())  // Forge fix: make furnace respect stack sizes in furnace recipes
                {
                    return true;
                }
                else
                {
                    return itemstack1.getCount() + itemstack.getCount() <= itemstack.getMaxStackSize(); // Forge fix: make furnace respect stack sizes in furnace recipes
                }
            }
        }

	}

public void smeltItem()
{
    if (this.canSmelt())
    {
        ItemStack itemstack = this.inventory.get(0);
        ItemStack itemstack1 = TitaniumForgeRecipes.instance().getForgingResult(itemstack);
        ItemStack itemstack2 = this.inventory.get(2);

        if (itemstack2.isEmpty())
        {
            this.inventory.set(2, itemstack1.copy());
        }
        else if (itemstack2.getItem() == itemstack1.getItem())
        {
            itemstack2.grow(itemstack1.getCount());
        }

        if (itemstack.getItem() == Item.getItemFromBlock(Blocks.SPONGE) && itemstack.getMetadata() == 1 && !((ItemStack)this.inventory.get(1)).isEmpty() && ((ItemStack)this.inventory.get(1)).getItem() == Items.BUCKET)
        {
            this.inventory.set(1, new ItemStack(Items.WATER_BUCKET));
        }

        itemstack.shrink(1);
    }
}



public static int getItemBurnTime(ItemStack fuel) {

	if(fuel.isEmpty())

		return 0;

	else {

		Item item = fuel.getItem();



		



		
		
		if (item == Items.COAL) return 400;



		return GameRegistry.getFuelValue(fuel);

	}

}

	

public static boolean isItemFuel(ItemStack fuel) {

	return getItemBurnTime(fuel) > 0;

}



@Override

public boolean isUsableByPlayer(EntityPlayer player) {

	return this.world.getTileEntity(this.pos) != this ? false : player.getDistanceSq((double)this.pos.getX() + 0.5D, (double)this.pos.getY() + 0.5D, (double)this.pos.getZ() + 0.5D) <= 64.0D;

}



@Override

public void openInventory(EntityPlayer player) {

}



@Override

public void closeInventory(EntityPlayer player) {

}



@Override

public boolean isItemValidForSlot(int index, ItemStack stack) {

	if(index == 2)

		return false;

	else if(index != 1)

		return true;

	else {

		return isItemFuel(stack);

	}

}



public String getGuiID() {

	return "survivalessentials:titanium_forge";

}





@Override

public int getField(int id) {

	switch(id) {

	case 0:

		return this.burnTime;

	case 1:

		return this.currentBurnTime;

	case 2:

		return this.cookTime;

	case 3:

		return this.totalCookTime;

	default:

		return 0;

	}

}



@Override

public void setField(int id, int value) {

	switch(id) {

	case 0:

		this.burnTime = value;

		break;

	case 1:

		this.currentBurnTime = value;

		break;

	case 2:

		this.cookTime = value;

		break;

	case 3:

		this.totalCookTime = value;

	}

}



@Override

public int getFieldCount() {

	return 4;

}



@Override

public void clear() {

	this.inventory.clear();

}
	
}
