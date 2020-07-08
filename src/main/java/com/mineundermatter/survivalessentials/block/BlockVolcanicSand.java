package com.mineundermatter.survivalessentials.block;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockVolcanicSand extends BlockFalling {

	public BlockVolcanicSand(Material blockMaterialIn, MapColor blockMapColorIn) {
		super(blockMaterialIn);
		this.setHarvestLevel("spade", 1);
		this.setHardness(2.0f);
	}

}
