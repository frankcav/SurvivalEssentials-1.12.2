package com.mineundermatter.survivalessentials.item;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemCrynyxIngot extends Item {

	public EnumRarity getRarity(ItemStack stack)
    {
        return stack.getMetadata() == 0 ? EnumRarity.EPIC : EnumRarity.EPIC;
    }
	
	
}
