package com.mineundermatter.survivalessentials.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockPlutoniumOre extends Block {

	public BlockPlutoniumOre(Material blockMaterialIn, MapColor blockMapColorIn) {
		super(blockMaterialIn, blockMapColorIn);
		this.setHardness(4.0F);
		this.setHarvestLevel("pickaxe", 3);
	}

}
