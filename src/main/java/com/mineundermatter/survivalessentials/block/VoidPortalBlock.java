package com.mineundermatter.survivalessentials.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class VoidPortalBlock extends Block {

	public VoidPortalBlock(Material blockMaterialIn, MapColor blockMapColorIn) {
		super(blockMaterialIn, blockMapColorIn);
		this.setHardness(10.0f);
		this.setHarvestLevel("pickaxe", 3);
	}

}
