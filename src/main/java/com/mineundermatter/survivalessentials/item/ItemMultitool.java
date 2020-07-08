package com.mineundermatter.survivalessentials.item;

import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemMultitool extends ItemTool{

	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.ACTIVATOR_RAIL, Blocks.COAL_ORE, Blocks.COBBLESTONE, Blocks.DETECTOR_RAIL, Blocks.DIAMOND_BLOCK, Blocks.DIAMOND_ORE, Blocks.DOUBLE_STONE_SLAB, Blocks.GOLDEN_RAIL, Blocks.GOLD_BLOCK, Blocks.GOLD_ORE, Blocks.ICE, Blocks.IRON_BLOCK, Blocks.IRON_ORE, Blocks.LAPIS_BLOCK, Blocks.LAPIS_ORE, Blocks.LIT_REDSTONE_ORE, Blocks.MOSSY_COBBLESTONE, Blocks.NETHERRACK, Blocks.PACKED_ICE, Blocks.RAIL, Blocks.REDSTONE_ORE, Blocks.SANDSTONE, Blocks.RED_SANDSTONE, Blocks.STONE, Blocks.STONE_SLAB, Blocks.STONE_BUTTON, Blocks.STONE_PRESSURE_PLATE, Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE, Blocks.CLAY, Blocks.DIRT, Blocks.FARMLAND, Blocks.GRASS, Blocks.GRAVEL, Blocks.MYCELIUM, Blocks.SAND, Blocks.SNOW, Blocks.SNOW_LAYER, Blocks.SOUL_SAND, Blocks.GRASS_PATH});
	
	
	
	
	public ItemMultitool(String unlocalizedName, ToolMaterial material) {
		super(material, EFFECTIVE_ON);
		this.setMaxStackSize(1);
	}
	
	public float getStrVsBlock(ItemStack stack, IBlockState state)
    {
        Material material = state.getMaterial();
        return material != Material.WOOD && material != Material.ROCK && material != Material.VINE && material != Material.AIR && material != Material.ANVIL && material != Material.BARRIER && material != Material.CACTUS && material != Material.CAKE && material != Material.CARPET && material != Material.CIRCUITS && material != Material.CLAY && material != Material.CLOTH && material != Material.CLOTH && material != Material.CORAL && material != Material.CRAFTED_SNOW && material != Material.DRAGON_EGG && material != Material.FIRE && material != Material.GLASS && material != Material.GOURD && material != Material.GRASS && material != Material.GROUND && material != Material.ICE && material != Material.IRON && material != Material.LAVA && material != Material.LEAVES && material != Material.PACKED_ICE && material != Material.PISTON && material != Material.PLANTS && material != Material.PORTAL && material != Material.REDSTONE_LIGHT && material != Material.ROCK && material != Material.SAND && material != Material.SNOW && material != Material.SPONGE && material != Material.STRUCTURE_VOID && material != Material.TNT && material != Material.VINE && material != Material.WATER && material != Material.WEB && material != Material.WOOD? super.getStrVsBlock(stack, state) : this.efficiencyOnProperMaterial;
    }
	
	
	


}
