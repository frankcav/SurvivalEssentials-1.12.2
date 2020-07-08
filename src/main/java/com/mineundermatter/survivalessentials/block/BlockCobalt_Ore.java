package com.mineundermatter.survivalessentials.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockCobalt_Ore extends Block {

	public BlockCobalt_Ore(Material blockMaterialIn, MapColor blockMapColorIn) {
		super(blockMaterialIn, blockMapColorIn);
		this.setHardness(6.5F);
		this.setHarvestLevel("pickaxe", 3);
	}

}
