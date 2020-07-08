package com.mineundermatter.survivalessentials.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockHardenedSunOre extends Block {

	public BlockHardenedSunOre(Material blockMaterialIn, MapColor blockMapColorIn) {
		super(blockMaterialIn, blockMapColorIn);
		this.setHardness(12.0F);
		this.setHarvestLevel("pickaxe", 5);
	}

}
