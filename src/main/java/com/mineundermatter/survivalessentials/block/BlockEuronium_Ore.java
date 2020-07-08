package com.mineundermatter.survivalessentials.block;

import com.mineundermatter.survivalessentials.client.SurvivalEssentials;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockEuronium_Ore extends Block {

	public BlockEuronium_Ore(Material blockMaterialIn, MapColor blockMapColorIn) {
		super(blockMaterialIn, blockMapColorIn);
		setUnlocalizedName("euronium_ore");
		setRegistryName("euronium_ore");
		setHarvestLevel("pickaxe", 0);
		setHarvestLevel("shovel", 0);
		setHarvestLevel("axe", 0);
		setHarvestLevel("sword", 0);
		this.slipperiness(2.0F);
		setCreativeTab(SurvivalEssentials.creativeTab);
		setHardness(0.7F);
	}

	private void slipperiness(float f) {
		
		
	}

}
