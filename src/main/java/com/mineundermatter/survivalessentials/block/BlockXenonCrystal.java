package com.mineundermatter.survivalessentials.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockXenonCrystal extends Block {

	public BlockXenonCrystal(Material blockMaterialIn, MapColor blockMapColorIn) {
		super(blockMaterialIn, blockMapColorIn);
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(4.0f);
		this.setLightLevel(3f);
	}

}
