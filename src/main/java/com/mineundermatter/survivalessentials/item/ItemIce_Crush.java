package com.mineundermatter.survivalessentials.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemIce_Crush extends Item {
	
	public ItemIce_Crush() {
		setUnlocalizedName("ice_crush");
		setRegistryName("ice_crush");
		setNoRepair();
		setMaxDamage(100);
		setMaxStackSize(1);
	}
	
	@Override
	public boolean hasContainerItem(ItemStack stack) {
		return true;
	}
	
	@Override
	public ItemStack getContainerItem(ItemStack itemStack) {
		return itemStack.getItemDamage() < itemStack.getMaxDamage() ? new ItemStack(itemStack.getItem(), 1, itemStack.getItemDamage() + 1) : ItemStack.EMPTY;
	}

}
