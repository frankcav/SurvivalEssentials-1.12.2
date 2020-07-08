package com.mineundermatter.survivalessentials.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockHardenedStone extends Block {

	public BlockHardenedStone(Material blockMaterialIn, MapColor blockMapColorIn) {
		super(blockMaterialIn, blockMapColorIn);
		
		this.setHardness(10.0F);
		this.setHarvestLevel("pickaxe", 2);
		
	}

}
