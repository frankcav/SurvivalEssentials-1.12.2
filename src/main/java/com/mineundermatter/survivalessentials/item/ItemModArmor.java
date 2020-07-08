package com.mineundermatter.survivalessentials.item;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemModArmor extends ItemArmor {

	public ItemModArmor(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setMaxStackSize(1);
	}

}
