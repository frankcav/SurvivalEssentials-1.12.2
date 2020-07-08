package com.mineundermatter.survivalessentials.block;

import com.mineundermatter.survivalessentials.client.SurvivalEssentials;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockHardened_Mud extends Block {

	public BlockHardened_Mud(Material blockMaterialIn, MapColor blockMapColorIn) {
		super(blockMaterialIn, blockMapColorIn);
		setUnlocalizedName("hardened_mud");
		setRegistryName("hardened_mud");
		setHarvestLevel("pickaxe", 0);
		setCreativeTab(SurvivalEssentials.creativeTab);
		setHardness(0.5F);
	}

	

}
