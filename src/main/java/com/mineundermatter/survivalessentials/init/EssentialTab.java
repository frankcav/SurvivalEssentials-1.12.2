package com.mineundermatter.survivalessentials.init;

import com.mineundermatter.survivalessentials.client.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class EssentialTab extends CreativeTabs {

	public EssentialTab() {
		super(Reference.MOD_ID);
		setBackgroundImageName("item_search.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		
		return new ItemStack(EssentialItems.emerald_sword);
	}
	
	@Override
	public boolean hasSearchBar() {
		return true;
	}

}
