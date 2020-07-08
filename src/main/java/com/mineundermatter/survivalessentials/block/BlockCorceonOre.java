package com.mineundermatter.survivalessentials.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockCorceonOre extends Block {

	public BlockCorceonOre(Material blockMaterialIn, MapColor blockMapColorIn) {
		super(blockMaterialIn, blockMapColorIn);
		
		this.setHardness(3.0F);
		this.setHarvestLevel("pickaxe", 1);
		
	}

}
