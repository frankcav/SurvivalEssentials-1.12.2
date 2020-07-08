package com.mineundermatter.survivalessentials.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;

public class BlockXenonCrystal2 extends Block {

	public BlockXenonCrystal2(Material blockMaterialIn, MapColor blockMapColorIn) {
		super(blockMaterialIn, blockMapColorIn);
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(4.0f);
		this.setLightLevel(3f);
	}
	
	@Override
	public BlockRenderLayer getBlockLayer() {
		
		return BlockRenderLayer.CUTOUT_MIPPED;
		
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

}
