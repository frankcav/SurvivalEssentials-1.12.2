package com.mineundermatter.survivalessentials.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockChargedDiamondOre extends Block {

	public BlockChargedDiamondOre(Material blockMaterialIn, MapColor blockMapColorIn) {
		super(blockMaterialIn, blockMapColorIn);
		this.setHardness(6.0F);
		this.setHarvestLevel("pickaxe", 4);
	}

}
