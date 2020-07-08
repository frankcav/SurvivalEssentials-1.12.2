package com.mineundermatter.survivalessentials.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockWhiteChocoookieOre extends Block {

	public BlockWhiteChocoookieOre(Material blockMaterialIn, MapColor blockMapColorIn) {
		super(blockMaterialIn, blockMapColorIn);
		this.setHardness(8.0F);
		this.setHarvestLevel("pickaxe", 2);
	}

}
