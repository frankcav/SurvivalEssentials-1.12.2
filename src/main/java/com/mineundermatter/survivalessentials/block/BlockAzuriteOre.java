package com.mineundermatter.survivalessentials.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockAzuriteOre extends Block {

	public BlockAzuriteOre(Material blockMaterialIn, MapColor blockMapColorIn) {
		super(blockMaterialIn, blockMapColorIn);
		this.setHardness(4.0F);
		this.setHarvestLevel("pickaxe", 2);
	}

}
