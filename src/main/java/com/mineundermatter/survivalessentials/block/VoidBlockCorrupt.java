package com.mineundermatter.survivalessentials.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class VoidBlockCorrupt extends Block {

	public VoidBlockCorrupt(Material blockMaterialIn, MapColor blockMapColorIn) {
		super(blockMaterialIn, blockMapColorIn);
		this.setHardness(4.0f);
		this.setHarvestLevel("pickaxe", 4);
	}

}
