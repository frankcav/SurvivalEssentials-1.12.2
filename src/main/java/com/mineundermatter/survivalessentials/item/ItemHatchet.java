package com.mineundermatter.survivalessentials.item;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class ItemHatchet extends ItemTool {

	public static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE});
    public static final float[] ATTACK_DAMAGES = new float[] {1.7F};
    public static final float[] ATTACK_SPEEDS = new float[] { -3.6F};

    public ItemHatchet(float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn,
			Set<Block> effectiveBlocksIn) {
		super(attackDamageIn, -2.2F, materialIn, EFFECTIVE_ON);
		
	
    
        
        
        this.setMaxStackSize(1);
    }
    

    

	public float getStrVsBlock(ItemStack stack, IBlockState state)
    {
        Material material = state.getMaterial();
        return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getStrVsBlock(stack, state) : this.efficiencyOnProperMaterial;
    }
	
}
