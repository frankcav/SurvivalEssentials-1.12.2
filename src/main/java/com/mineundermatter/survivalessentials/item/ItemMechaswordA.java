package com.mineundermatter.survivalessentials.item;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;

public class ItemMechaswordA extends ItemTool {

	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {null});
	
	public ItemMechaswordA(float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn,
			Set<Block> effectiveBlocksIn) {
		super(attackDamageIn, -3.5f, materialIn, effectiveBlocksIn);
		setMaxStackSize(1);
	}
	
	public float getStrVsBlock(ItemStack stack, IBlockState state)
    {
        Material material = state.getMaterial();
        return material != Material.WOOD && material != Material.ROCK && material != Material.VINE && material != Material.AIR && material != Material.ANVIL && material != Material.BARRIER && material != Material.CACTUS && material != Material.CAKE && material != Material.CARPET && material != Material.CIRCUITS && material != Material.CLAY && material != Material.CLOTH && material != Material.CLOTH && material != Material.CORAL && material != Material.CRAFTED_SNOW && material != Material.DRAGON_EGG && material != Material.FIRE && material != Material.GLASS && material != Material.GOURD && material != Material.GRASS && material != Material.GROUND && material != Material.ICE && material != Material.IRON && material != Material.LAVA && material != Material.LEAVES && material != Material.PACKED_ICE && material != Material.PISTON && material != Material.PLANTS && material != Material.PORTAL && material != Material.REDSTONE_LIGHT && material != Material.ROCK && material != Material.SAND && material != Material.SNOW && material != Material.SPONGE && material != Material.STRUCTURE_VOID && material != Material.TNT && material != Material.VINE && material != Material.WATER && material != Material.WEB && material != Material.WOOD? super.getStrVsBlock(stack, state) : this.efficiencyOnProperMaterial;
    }


	

}
