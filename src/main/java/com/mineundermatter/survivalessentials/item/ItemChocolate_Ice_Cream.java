package com.mineundermatter.survivalessentials.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemChocolate_Ice_Cream extends Item {
	
	public ItemChocolate_Ice_Cream() {
		setNoRepair();
		setMaxDamage(3);
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
