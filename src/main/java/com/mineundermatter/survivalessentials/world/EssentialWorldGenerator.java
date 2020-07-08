package com.mineundermatter.survivalessentials.world;

import java.util.Random;

import com.mineundermatter.survivalessentials.init.EssentialBlocks;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class EssentialWorldGenerator implements IWorldGenerator {

	private WorldGenerator gen_hardened_mud;
	private WorldGenerator gen_fire_iron_ore;
	private WorldGenerator gen_euronium_ore;
	private WorldGenerator gen_titanium_ore;
	private WorldGenerator gen_cobalt_ore;
	private WorldGenerator gen_aluminum_ore;
	private WorldGenerator gen_camiline_ore;
	private WorldGenerator gen_charged_diamond_ore;
	private WorldGenerator gen_crynyx_ore;
	private WorldGenerator gen_cursed_gold_ore;
	private WorldGenerator gen_lithium_ore;
	private WorldGenerator gen_plutonium_ore;
	private WorldGenerator gen_xenon_ore;
	private WorldGenerator gen_pressured_stone;
	private WorldGenerator gen_lead_ore;
	private WorldGenerator gen_azurite_ore;
	private WorldGenerator gen_enderium_ore;
	private WorldGenerator gen_pink_diamond_ore;
	private WorldGenerator gen_hardened_sun_ore;
	private WorldGenerator gen_radioactive_redstone_ore;
	private WorldGenerator gen_tarnite_ore;
	private WorldGenerator gen_prixium_ore;
	private WorldGenerator gen_corceon_ore;
	private WorldGenerator gen_corbite_ore;
	
	
	public EssentialWorldGenerator() {
	
	this.gen_hardened_mud = new WorldGenMinable(EssentialBlocks.hardened_mud.getDefaultState(), 45, BlockMatcher.forBlock(Blocks.GRASS));
	this.gen_fire_iron_ore = new WorldGenMinable(EssentialBlocks.fire_iron_ore.getDefaultState(), 6, BlockMatcher.forBlock(Blocks.NETHERRACK));
	this.gen_euronium_ore = new WorldGenMinable(EssentialBlocks.euronium_ore.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.PACKED_ICE));
	this.gen_aluminum_ore = new WorldGenMinable(EssentialBlocks.aluminum_ore.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.STONE));
	this.gen_cobalt_ore = new WorldGenMinable(EssentialBlocks.cobalt_ore.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.STONE));
	this.gen_titanium_ore = new WorldGenMinable(EssentialBlocks.titanium_ore.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.STONE));
	this.gen_camiline_ore = new WorldGenMinable(EssentialBlocks.camiline_ore.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE));
	this.gen_charged_diamond_ore = new WorldGenMinable(EssentialBlocks.charged_diamond_ore.getDefaultState(), 3, BlockMatcher.forBlock(Blocks.STONE));
	this.gen_crynyx_ore = new WorldGenMinable(EssentialBlocks.crynyx_ore.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
	this.gen_cursed_gold_ore = new WorldGenMinable(EssentialBlocks.cursedgold_ore.getDefaultState(), 6, BlockMatcher.forBlock(Blocks.STONE));
	this.gen_lithium_ore = new WorldGenMinable(EssentialBlocks.lithium_ore.getDefaultState(), 12, BlockMatcher.forBlock(Blocks.STONE));
	this.gen_plutonium_ore = new WorldGenMinable(EssentialBlocks.plutonium_ore.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.STONE));
	this.gen_xenon_ore = new WorldGenMinable(EssentialBlocks.xenon_ore.getDefaultState(), 7, BlockMatcher.forBlock(Blocks.STONE));
	this.gen_pressured_stone = new WorldGenMinable(EssentialBlocks.hardened_stone.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.STONE));
	this.gen_lead_ore = new WorldGenMinable(EssentialBlocks.lead_ore.getDefaultState(), 6, BlockMatcher.forBlock(EssentialBlocks.hardened_stone));
	this.gen_azurite_ore = new WorldGenMinable(EssentialBlocks.azurite_ore.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.END_STONE));
	this.gen_enderium_ore = new WorldGenMinable(EssentialBlocks.enderium_ore.getDefaultState(), 6, BlockMatcher.forBlock(Blocks.END_STONE));
	this.gen_pink_diamond_ore = new WorldGenMinable(EssentialBlocks.pink_diamond_ore.getDefaultState(), 2, BlockMatcher.forBlock(Blocks.NETHERRACK));
	this.gen_hardened_sun_ore = new WorldGenMinable(EssentialBlocks.hardened_sun_ore.getDefaultState(), 2, BlockMatcher.forBlock(Blocks.END_STONE));
	this.gen_radioactive_redstone_ore = new WorldGenMinable(EssentialBlocks.radioactive_redstone_ore.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.END_STONE));
	this.gen_tarnite_ore = new WorldGenMinable(EssentialBlocks.tarnite_ore.getDefaultState(), 10, BlockMatcher.forBlock(Blocks.NETHERRACK));
	this.gen_prixium_ore = new WorldGenMinable(EssentialBlocks.prixium_ore.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.NETHERRACK));
	this.gen_corbite_ore = new WorldGenMinable(EssentialBlocks.corbite_ore.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE));
	this.gen_corceon_ore = new WorldGenMinable(EssentialBlocks.corceon_ore.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.STONE));
	
	}
	@Override

	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {		

		switch (world.provider.getDimension()) {

		case 0: //Overworld

			this.runGenerator(this.gen_hardened_mud, world, random, chunkX, chunkZ, 16, 30, 128);
			this.runGenerator(this.gen_euronium_ore, world, random, chunkX, chunkZ, 16, 30, 128);
			this.runGenerator(this.gen_aluminum_ore, world, random, chunkX, chunkZ, 16, 30, 128);
			this.runGenerator(this.gen_titanium_ore, world, random, chunkX, chunkZ, 16, 10, 60);
			this.runGenerator(this.gen_cobalt_ore, world, random, chunkX, chunkZ, 16, 10, 60);
			this.runGenerator(this.gen_camiline_ore, world, random, chunkX, chunkZ, 16, 10, 20);
			this.runGenerator(this.gen_charged_diamond_ore, world, random, chunkX, chunkZ, 16, 10, 15);
			this.runGenerator(this.gen_crynyx_ore, world, random, chunkX, chunkZ, 16, 10, 20);
			this.runGenerator(this.gen_cursed_gold_ore, world, random, chunkX, chunkZ, 16, 10, 80);
			this.runGenerator(this.gen_lithium_ore, world, random, chunkX, chunkZ, 16, 30, 100);
			this.runGenerator(this.gen_plutonium_ore, world, random, chunkX, chunkZ, 16, 10, 40);
			this.runGenerator(this.gen_xenon_ore, world, random, chunkX, chunkZ, 16, 10, 70);
			this.runGenerator(this.gen_corbite_ore, world, random, chunkX, chunkZ, 16, 10, 50);
			this.runGenerator(this.gen_corceon_ore, world, random, chunkX, chunkZ, 16, 10, 100);
			this.runGenerator(this.gen_pressured_stone, world, random, chunkX, chunkZ, 16, 5, 40);
			this.runGenerator(this.gen_lead_ore, world, random, chunkX, chunkZ, 16, 5, 40);
			
			break;

		case -1: //Nether

			this.runGenerator(this.gen_fire_iron_ore, world, random, chunkX, chunkZ, 16, 30, 128);
			this.runGenerator(this.gen_prixium_ore, world, random, chunkX, chunkZ, 16, 30, 128);
			this.runGenerator(this.gen_tarnite_ore, world, random, chunkX, chunkZ, 16, 30, 128);
			this.runGenerator(this.gen_pink_diamond_ore, world, random, chunkX, chunkZ, 16, 30, 128);
			
			

			break;

		case 1: //End

			this.runGenerator(this.gen_radioactive_redstone_ore, world, random, chunkX, chunkZ, 16, 30, 128);
			this.runGenerator(this.gen_hardened_sun_ore, world, random, chunkX, chunkZ, 16, 30, 128);
			this.runGenerator(this.gen_azurite_ore, world, random, chunkX, chunkZ, 16, 30, 128);
			this.runGenerator(this.gen_enderium_ore, world, random, chunkX, chunkZ, 16, 30, 128);

			break;

		}

	}
	

	private void runGenerator(WorldGenerator generator, World world, Random random, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {

		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)

			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

		

		int heightDiff = maxHeight - minHeight + 1;

		for (int i = 0; i < chancesToSpawn; i++) {

			int x = chunk_X * 16 + random.nextInt(16);

			int y = minHeight + random.nextInt(heightDiff);

			int z = chunk_Z * 16 + random.nextInt(16);

			generator.generate(world, random, new BlockPos(x, y, z));

		}

	}

	
}
