package com.mineundermatter.survivalessentials.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class VoidBlockBroken extends Block {

	public VoidBlockBroken(Material blockMaterialIn, MapColor blockMapColorIn) {
		super(blockMaterialIn, blockMapColorIn);
		this.setHardness(9.0f);
		this.setHarvestLevel("pickaxe", 2);
	}

}
