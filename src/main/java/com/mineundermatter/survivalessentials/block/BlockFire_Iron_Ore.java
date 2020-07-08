package com.mineundermatter.survivalessentials.block;

import com.mineundermatter.survivalessentials.client.SurvivalEssentials;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockFire_Iron_Ore extends Block {

	public BlockFire_Iron_Ore(Material blockMaterialIn, MapColor blockMapColorIn) {
		super(blockMaterialIn, blockMapColorIn);
		setUnlocalizedName("fire_iron_ore");
		setRegistryName("fire_iron_ore");
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(SurvivalEssentials.creativeTab);
		setHardness(1.0F);
	}

}
