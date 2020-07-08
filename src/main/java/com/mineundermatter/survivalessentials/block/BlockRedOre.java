package com.mineundermatter.survivalessentials.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockRedOre extends Block {

	public BlockRedOre(Material blockMaterialIn, MapColor blockMapColorIn) {
		super(blockMaterialIn, blockMapColorIn);
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(5.0f);
	}

}
