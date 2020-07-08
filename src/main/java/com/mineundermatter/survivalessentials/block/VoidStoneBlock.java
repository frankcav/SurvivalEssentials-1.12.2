package com.mineundermatter.survivalessentials.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class VoidStoneBlock extends Block {

	public VoidStoneBlock(Material blockMaterialIn, MapColor blockMapColorIn) {
		super(blockMaterialIn, blockMapColorIn);
		this.setHardness(7.0f);
		this.setHarvestLevel("pickaxe", 3);
	}

}
