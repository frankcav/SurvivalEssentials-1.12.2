package com.mineundermatter.survivalessentials.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockPalmLeaves extends Block {

	public BlockPalmLeaves(Material blockMaterialIn, MapColor blockMapColorIn) {
		super(blockMaterialIn, blockMapColorIn);
		this.setLightOpacity(1);
		this.setSoundType(SoundType.PLANT);
		
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
