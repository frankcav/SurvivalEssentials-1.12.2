package com.mineundermatter.survivalessentials.item;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.item.Item.ToolMaterial;

public class ItemWarAxe extends ItemTool {

	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE});
    

    private static final float[] ATTACK_DAMAGES = new float[] {6.0F, 8.0F, 8.0F, 8.0F, 6.0F};

    private static final float[] ATTACK_SPEEDS = new float[] { -3.2F, -3.2F, -3.1F, -3.0F, -3.0F};


    

        public ItemWarAxe(float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn,
    			Set<Block> effectiveBlocksIn) {
    		super(attackDamageIn, -3F, materialIn, EFFECTIVE_ON);
    		
    	
    

        this.bFull3D(true);

        this.setMaxStackSize(1);
        
        }

    
       


    private void bFull3D(boolean b) {
			
			
		}





	public float getStrVsBlock(ItemStack stack, IBlockState state)

    {

        Material material = state.getMaterial();

        return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getStrVsBlock(stack, state) : this.efficiencyOnProperMaterial;

    }

}