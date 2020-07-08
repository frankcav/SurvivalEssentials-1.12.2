package com.mineundermatter.survivalessentials.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemModArmor1 extends ItemArmor {

	public ItemModArmor1(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setMaxStackSize(1);
		
	}

	
   	public void OnCreated(ItemStack stack, World worldIn, EntityPlayer playerIn)
   	{
    this.onCreated(stack, worldIn, playerIn);
    playerIn.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 200000, 5));
		
   	}
	
}
