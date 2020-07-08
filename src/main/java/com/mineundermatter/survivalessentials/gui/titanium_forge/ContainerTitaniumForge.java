package com.mineundermatter.survivalessentials.gui.titanium_forge;

import com.mineundermatter.survivalessentials.recipe.IceCreamRecipes;
import com.mineundermatter.survivalessentials.recipe.TitaniumForgeRecipes;
import com.mineundermatter.survivalessentials.slot.SlotTitaniumForgeFuel;
import com.mineundermatter.survivalessentials.slot.SlotTitaniumForgeOutput;
import com.mineundermatter.survivalessentials.tileentity.TileEntityIceCreamMaker;
import com.mineundermatter.survivalessentials.tileentity.TileEntityTitaniumForge;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IContainerListener;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ContainerTitaniumForge extends Container {

private final TileEntityTitaniumForge tileentity;
	
	private int cookTime;
	private int totalCookTime;
	private int burnTime;
	private int currentBurnTime;
	
	public ContainerTitaniumForge(InventoryPlayer player, TileEntityTitaniumForge tileentity) {
		this.tileentity = tileentity;
		this.addSlotToContainer(new Slot(tileentity, 0, 56, 17));
		this.addSlotToContainer(new SlotTitaniumForgeFuel(tileentity, 1, 56, 53));
		this.addSlotToContainer(new SlotTitaniumForgeOutput(player.player, tileentity, 2, 116, 35));
		
		  for (int y = 0; y < 3; ++y) {

		        for (int x = 0; x < 9; ++x) {

		            this.addSlotToContainer(new Slot(player, x + y * 9 + 9, 8 + x * 18, 84 + y * 18));

		        }

		    }



		  

		    for (int x = 0; x < 9; ++x) {

		        this.addSlotToContainer(new Slot(player, x, 8 + x * 18, 142));

		    }

		}
	
	@Override

	public void addListener(IContainerListener listener) {

		super.addListener(listener);

		listener.sendAllWindowProperties(this, this.tileentity);
		this.detectAndSendChanges();
	}
	
	@Override

	public void detectAndSendChanges() {

		super.detectAndSendChanges();

		

		for(int i = 0; i < this.listeners.size(); ++i) {

			IContainerListener listener = (IContainerListener)this.listeners.get(i);

			

			if(this.cookTime != this.tileentity.getField(2))

				listener.sendWindowProperty(this, 2, this.tileentity.getField(2));

			if(this.burnTime != this.tileentity.getField(0))

				listener.sendWindowProperty(this, 0, this.tileentity.getField(0));

			if(this.currentBurnTime != this.tileentity.getField(1))

				listener.sendWindowProperty(this, 1, this.tileentity.getField(1));

			if(this.totalCookTime != this.tileentity.getField(3))

				listener.sendWindowProperty(this, 3, this.tileentity.getField(3));

		}

		

		this.cookTime = this.tileentity.getField(2);

		this.burnTime = this.tileentity.getField(0);

		this.currentBurnTime = this.tileentity.getField(1);

		this.totalCookTime = this.tileentity.getField(3);

	}
	@Override

	@SideOnly(Side.CLIENT)

	public void updateProgressBar(int id, int data) {

		this.tileentity.setField(id, data);

	}
	
	@Override
	public boolean canInteractWith(EntityPlayer playerIn) {
		return this.tileentity.isUsableByPlayer(playerIn);
	}
	
	@Override

	public ItemStack transferStackInSlot(EntityPlayer playerIn, int index)
    {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (index == 2)
            {
                if (!this.mergeItemStack(itemstack1, 3, 39, true))
                {
                    return ItemStack.EMPTY;
                }

                slot.onSlotChange(itemstack1, itemstack);
            }
            else if (index != 1 && index != 0)
            {
                if (!TitaniumForgeRecipes.instance().getForgingResult(itemstack1).isEmpty())
                {
                    if (!this.mergeItemStack(itemstack1, 0, 1, false))
                    {
                        return ItemStack.EMPTY;
                    }
                }
                else if (TileEntityTitaniumForge.isItemFuel(itemstack1))
                {
                    if (!this.mergeItemStack(itemstack1, 1, 2, false))
                    {
                        return ItemStack.EMPTY;
                    }
                }
                else if (index >= 3 && index < 30)
                {
                    if (!this.mergeItemStack(itemstack1, 30, 39, false))
                    {
                        return ItemStack.EMPTY;
                    }
                }
                else if (index >= 30 && index < 39 && !this.mergeItemStack(itemstack1, 3, 30, false))
                {
                    return ItemStack.EMPTY;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 3, 39, false))
            {
                return ItemStack.EMPTY;
            }

            if (itemstack1.isEmpty())
            {
                slot.putStack(ItemStack.EMPTY);
            }
            else
            {
                slot.onSlotChanged();
            }

            if (itemstack1.getCount() == itemstack.getCount())
            {
                return ItemStack.EMPTY;
            }

            slot.onTake(playerIn, itemstack1);
        }

        return itemstack;
    }
	
}
