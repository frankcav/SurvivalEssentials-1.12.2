package com.mineundermatter.survivalessentials.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockWhiteSand extends BlockFalling {

	public BlockWhiteSand(Material blockMaterialIn, MapColor blockMapColorIn) {
		super(blockMaterialIn);
		this.setHarvestLevel("spade", 0);
		this.setHardness(0.5f);
	}

}
