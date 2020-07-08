package com.mineundermatter.survivalessentials.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemVanilla_Ice_Cream extends Item {
	public ItemVanilla_Ice_Cream() {
		
	setMaxDamage(3);
	setNoRepair();
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
