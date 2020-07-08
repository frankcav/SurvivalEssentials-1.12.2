package com.mineundermatter.survivalessentials.item;

import java.util.Map;
import java.util.Map.Entry;

import com.mineundermatter.survivalessentials.init.EssentialItems;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemEnchantedBook;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemFire_Sword extends ItemSword {

	public ItemFire_Sword(ToolMaterial material) {
		super(material);
		


		
	}

	
	 
	 @SideOnly(Side.CLIENT)
	    public boolean isFull3D()
	    {
	        return true;
	    }
	 
	 @SideOnly(Side.CLIENT)
	    public boolean hasEffect(ItemStack stack)
	    {
	        return true;
	    }
	 
	 public EnumRarity getRarity(ItemStack stack)
	    {
	        return stack.getMetadata() == 0 ? EnumRarity.RARE : EnumRarity.EPIC;
	    }
	 
	 
	  
	  @Override
		public EnumActionResult onItemUse(EntityPlayer entity, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX,
				float hitY, float hitZ) {
			EnumActionResult ret = super.onItemUse(entity, world, pos, hand, facing, hitX, hitY, hitZ);
			int i = pos.getX();
			int j = pos.getY();
			int k = pos.getZ();
			float var4 = 1.0F;

			if (true) {
				world.setBlockState(new BlockPos(i, j + 1, k), Blocks.FIRE.getDefaultState(), 3);
				world.setBlockState(new BlockPos(i+1, j + 1, k), Blocks.FIRE.getDefaultState(), 3);
				world.setBlockState(new BlockPos(i+2, j + 1, k), Blocks.FIRE.getDefaultState(), 3);
				world.setBlockState(new BlockPos(i, j + 1, k+1), Blocks.FIRE.getDefaultState(), 3);
				world.setBlockState(new BlockPos(i, j + 1, k+2), Blocks.FIRE.getDefaultState(), 3);
				world.setBlockState(new BlockPos(i+1, j + 1, k+1), Blocks.FIRE.getDefaultState(), 3);
			}

			return ret;
		}
	  
	  public void onUpdate(ItemStack stack, World world, Entity player, int itemSlot, boolean isSelected){
		  if (stack.isItemEnchantable() == true) {
			  stack.addEnchantment(Enchantment.getEnchantmentByID(20), 4);
			  stack.addEnchantment(Enchantment.getEnchantmentByID(16), 7);
		  }
		  
	  }
	  
	  
}
