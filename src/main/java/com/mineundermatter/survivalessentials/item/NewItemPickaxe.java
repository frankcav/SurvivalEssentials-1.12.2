package com.mineundermatter.survivalessentials.item;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class NewItemPickaxe extends ItemPickaxe {
	
	public NewItemPickaxe(ToolMaterial material) {
		super(material);
		setMaxStackSize(1);
	}

}
