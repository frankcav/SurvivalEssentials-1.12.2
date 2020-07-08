package com.mineundermatter.survivalessentials.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockScotchCookie extends Block {

	public BlockScotchCookie(Material blockMaterialIn, MapColor blockMapColorIn) {
		super(blockMaterialIn, blockMapColorIn);
		this.setHardness(2.5F);
		this.setHarvestLevel("pickaxe", 0);
	}

}
