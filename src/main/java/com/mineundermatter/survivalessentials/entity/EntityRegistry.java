package com.mineundermatter.survivalessentials.entity;

import com.mineundermatter.survivalessentials.client.Reference;
import com.mineundermatter.survivalessentials.client.SurvivalEssentials;

import net.minecraft.util.ResourceLocation;

public class EntityRegistry {

	public static void registerEntities() {


		net.minecraftforge.fml.common.registry.EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":mbs"), EntityMBS.class, "MBS", -1, SurvivalEssentials.modInstance, 64, 1, true);
		net.minecraftforge.fml.common.registry.EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":missile"), EntityMissile.class, "Missile", -2, SurvivalEssentials.modInstance, 64, 1, true);
		
		net.minecraftforge.fml.common.registry.EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":grenade"), EntityGrenade.class, "Grenade", -4, SurvivalEssentials.modInstance, 64, 1, true);
	
	}
}
