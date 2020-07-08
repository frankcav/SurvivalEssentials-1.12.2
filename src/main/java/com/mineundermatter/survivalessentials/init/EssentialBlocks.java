package com.mineundermatter.survivalessentials.init;

import com.mineundermatter.survivalessentials.block.BlockAluminum_Ore;
import com.mineundermatter.survivalessentials.block.BlockAzuriteOre;
import com.mineundermatter.survivalessentials.block.BlockBookshelf2;
import com.mineundermatter.survivalessentials.block.BlockCamilineOre;
import com.mineundermatter.survivalessentials.block.BlockCandyCookieOre;
import com.mineundermatter.survivalessentials.block.BlockChargedDiamondOre;
import com.mineundermatter.survivalessentials.block.BlockChocoCookie;
import com.mineundermatter.survivalessentials.block.BlockChocoCookieOre;
import com.mineundermatter.survivalessentials.block.BlockCobalt_Ore;
import com.mineundermatter.survivalessentials.block.BlockCookie;
import com.mineundermatter.survivalessentials.block.BlockCorbiteOre;
import com.mineundermatter.survivalessentials.block.BlockCorceonOre;
import com.mineundermatter.survivalessentials.block.BlockCrynyxCraftingTable;
import com.mineundermatter.survivalessentials.block.BlockCrynyxOre;
import com.mineundermatter.survivalessentials.block.BlockCursedGold;
import com.mineundermatter.survivalessentials.block.BlockCyanCobble;
import com.mineundermatter.survivalessentials.block.BlockDarkChocoCookieOre;
import com.mineundermatter.survivalessentials.block.BlockEnderiumOre;
import com.mineundermatter.survivalessentials.block.BlockEuronium_Ore;
import com.mineundermatter.survivalessentials.block.BlockFire_Iron_Ore;
import com.mineundermatter.survivalessentials.block.BlockFreezineOre;
import com.mineundermatter.survivalessentials.block.BlockFrozenStone;
import com.mineundermatter.survivalessentials.block.BlockHardenedStone;
import com.mineundermatter.survivalessentials.block.BlockHardenedSunOre;
import com.mineundermatter.survivalessentials.block.BlockHardened_Mud;
import com.mineundermatter.survivalessentials.block.BlockIceCreamMaker;
import com.mineundermatter.survivalessentials.block.BlockLeadOre;
import com.mineundermatter.survivalessentials.block.BlockLiquiumOre;
import com.mineundermatter.survivalessentials.block.BlockLithiumOre;
import com.mineundermatter.survivalessentials.block.BlockMiamiumOre;
import com.mineundermatter.survivalessentials.block.BlockPalmLeaves;
import com.mineundermatter.survivalessentials.block.BlockPalmPlanks;
import com.mineundermatter.survivalessentials.block.BlockPanel;
import com.mineundermatter.survivalessentials.block.BlockPetroliumOre;
import com.mineundermatter.survivalessentials.block.BlockPinkDiamond;
import com.mineundermatter.survivalessentials.block.BlockPinkDiamondOre;
import com.mineundermatter.survivalessentials.block.BlockPlutoniumOre;
import com.mineundermatter.survivalessentials.block.BlockPrixiumOre;
import com.mineundermatter.survivalessentials.block.BlockRadioactiveRedstoneOre;
import com.mineundermatter.survivalessentials.block.BlockRadioactiveRedstoneWire;
import com.mineundermatter.survivalessentials.block.BlockRedOre;
import com.mineundermatter.survivalessentials.block.BlockScotchCookie;
import com.mineundermatter.survivalessentials.block.BlockScotchCookieOre;
import com.mineundermatter.survivalessentials.block.BlockSun_Block;
import com.mineundermatter.survivalessentials.block.BlockTarniteOre;
import com.mineundermatter.survivalessentials.block.BlockTitaniumForge;
import com.mineundermatter.survivalessentials.block.BlockTitanium_Ore;
import com.mineundermatter.survivalessentials.block.BlockTopazOre;
import com.mineundermatter.survivalessentials.block.BlockVelvyxOre;
import com.mineundermatter.survivalessentials.block.BlockVolcanicSand;
import com.mineundermatter.survivalessentials.block.BlockWaffleMaker;
import com.mineundermatter.survivalessentials.block.BlockWhiteChocoookieOre;
import com.mineundermatter.survivalessentials.block.BlockWhiteSand;
import com.mineundermatter.survivalessentials.block.BlockXenonCrystal;
import com.mineundermatter.survivalessentials.block.BlockXenonCrystal2;
import com.mineundermatter.survivalessentials.block.BlockXenonOre;
import com.mineundermatter.survivalessentials.block.MossBlock;
import com.mineundermatter.survivalessentials.block.VanillaBlock;
import com.mineundermatter.survivalessentials.block.VoidBleediumOre;
import com.mineundermatter.survivalessentials.block.VoidBlockBroken;
import com.mineundermatter.survivalessentials.block.VoidBlockCorrupt;
import com.mineundermatter.survivalessentials.block.VoidDiamondOre;
import com.mineundermatter.survivalessentials.block.VoidPortalBlock;
import com.mineundermatter.survivalessentials.block.VoidStoneBlock;
import com.mineundermatter.survivalessentials.client.SurvivalEssentials;
import com.mineundermatter.survivalessentials.tileentity.TileEntityCrynyxCraftingTable;
import com.mineundermatter.survivalessentials.tileentity.TileEntityIceCreamMaker;
import com.mineundermatter.survivalessentials.tileentity.TileEntityTitaniumForge;
import com.mineundermatter.survivalessentials.tileentity.TileEntityWaffleMaker;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class EssentialBlocks {

	
	
	
	//worldgen
	public static Block hardened_mud;	
	public static Block vanillablock;	
	public static Block sun_block;
	public static Block cyan_cobble;
	public static Block red_cobble;
	public static Block palm_leaves;
	public static Block palm_planks;
	public static Block pink_diamond_block;
	public static Block titanium_block;
	public static Block grey_panel;
	public static Block rose_panel;
	public static Block yellow_panel;
	public static Block lime_panel;
	public static Block cyan_panel;
	public static Block void_stone_block;
	public static Block void_block_broken;
	public static Block void_block_corrupt;
	public static Block moss_block;
	
	//Ores
	public static Block euronium_ore;
	public static Block fire_iron_ore;
	public static Block cursedgold_ore;
	public static Block plutonium_ore;
	public static Block xenon_ore;
	public static Block aluminum_ore;
	public static Block titanium_ore;
	public static Block cobalt_ore;	
	public static Block crynyx_ore;
	public static Block camiline_ore;
	public static Block lithium_ore;
	public static Block charged_diamond_ore;
	public static Block cookie_block;
	public static Block choco_cookie_block;
	public static Block scotch_cookie_block;
	public static Block azurite_ore;
	public static Block enderium_ore;
	public static Block pink_diamond_ore;
	public static Block radioactive_redstone_ore;
	public static Block hardened_sun_ore;
	public static Block tarnite_ore;
	public static Block prixium_ore;
	public static Block freezine_ore;
	public static Block miamium_ore;
	public static Block lead_ore;
	public static Block velvyx_ore;
	public static Block topaz_ore;
	public static Block corceon_ore;
	public static Block corbite_ore;
	public static Block red_ore;
	public static Block liquium_ore;
	public static Block dark_choco_cookie_ore;
	public static Block white_choco_cookie_ore;
	public static Block candy_cookie_ore;
	public static Block frozen_stone;
	public static Block hardened_stone;
	public static Block volcanic_sand;
	public static Block white_sand;
	public static Block choco_cookie_ore;
	public static Block scotch_cookie_ore;
	public static Block petrolium_ore;
	public static Block void_ore_1;
	public static Block void_diamond_ore;
	
	//Useables
	public static Block icecreammaker;
	public static Block wafflemaker;
	public static Block barrel;
	public static Block titanium_forge;
	public static Block radioactive_redstone_wire;
	public static Block void_portal_block;
	public static Block crynyx_crafting_table;
	
	
	//else
	public static Block bookshelf_2;
	public static Block bookshelf_3;
	public static Block xenon_crystal;
	public static Block xenon_crystal_2;
	

	public static void init() {
		hardened_mud = new BlockHardened_Mud(Material.ROCK, MapColor.BROWN);
		euronium_ore = new BlockEuronium_Ore(Material.ROCK, MapColor.ICE);
		fire_iron_ore = new BlockFire_Iron_Ore(Material.ROCK, MapColor.RED);
		icecreammaker = new BlockIceCreamMaker(Material.IRON, MapColor.WHITE_STAINED_HARDENED_CLAY);
		vanillablock = new VanillaBlock().setUnlocalizedName("vanillablock").setRegistryName("vanillablock");
		wafflemaker = new BlockWaffleMaker(Material.IRON, MapColor.WHITE_STAINED_HARDENED_CLAY);
		aluminum_ore = new BlockAluminum_Ore(Material.ROCK, MapColor.WHITE_STAINED_HARDENED_CLAY).setRegistryName("aluminum_ore").setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("aluminum_ore");
		titanium_ore = new BlockTitanium_Ore(Material.ROCK, MapColor.WHITE_STAINED_HARDENED_CLAY).setRegistryName("titanium_ore").setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("titanium_ore");
		cobalt_ore = new BlockCobalt_Ore(Material.ROCK, MapColor.BLUE).setUnlocalizedName("cobalt_ore").setRegistryName("cobalt_ore").setCreativeTab(SurvivalEssentials.creativeTab);
		sun_block = new BlockSun_Block(Material.ROCK, MapColor.ORANGE_STAINED_HARDENED_CLAY).setUnlocalizedName("sun_block").setRegistryName("sun_block").setCreativeTab(SurvivalEssentials.creativeTab);
		cursedgold_ore = new BlockCursedGold(Material.ROCK, MapColor.WHITE_STAINED_HARDENED_CLAY).setUnlocalizedName("cursedgold_ore").setRegistryName("cursedgold_ore").setCreativeTab(SurvivalEssentials.creativeTab);
		plutonium_ore = new BlockPlutoniumOre(Material.ROCK, MapColor.WHITE_STAINED_HARDENED_CLAY).setUnlocalizedName("plutonium_ore").setRegistryName("plutonium_ore").setCreativeTab(SurvivalEssentials.creativeTab);
		xenon_ore = new BlockXenonOre(Material.ROCK, MapColor.WHITE_STAINED_HARDENED_CLAY).setUnlocalizedName("xenon_ore").setRegistryName("xenon_ore").setCreativeTab(SurvivalEssentials.creativeTab);
		crynyx_ore = new BlockCrynyxOre(Material.ROCK, MapColor.WHITE_STAINED_HARDENED_CLAY).setUnlocalizedName("crynyx_ore").setRegistryName("crynyx_ore").setCreativeTab(SurvivalEssentials.creativeTab);
		camiline_ore = new BlockCamilineOre(Material.ROCK, MapColor.WHITE_STAINED_HARDENED_CLAY).setUnlocalizedName("camiline_ore").setRegistryName("camiline_ore").setCreativeTab(SurvivalEssentials.creativeTab);
		lithium_ore = new BlockLithiumOre(Material.ROCK, MapColor.WHITE_STAINED_HARDENED_CLAY).setUnlocalizedName("lithium_ore").setRegistryName("lithium_ore").setCreativeTab(SurvivalEssentials.creativeTab);
		charged_diamond_ore = new BlockChargedDiamondOre(Material.ROCK, MapColor.WHITE_STAINED_HARDENED_CLAY).setUnlocalizedName("charged_diamond_ore").setRegistryName("charged_diamond_ore").setCreativeTab(SurvivalEssentials.creativeTab);
		cookie_block = new BlockCookie(Material.ROCK, MapColor.BROWN).setUnlocalizedName("cookie_block").setRegistryName("cookie_block").setCreativeTab(SurvivalEssentials.creativeTab);
		choco_cookie_block = new BlockChocoCookie(Material.ROCK, MapColor.BROWN).setUnlocalizedName("choco_cookie_block").setRegistryName("choco_cookie_block").setCreativeTab(SurvivalEssentials.creativeTab);
		scotch_cookie_block = new BlockScotchCookie(Material.ROCK, MapColor.BROWN).setUnlocalizedName("scotch_cookie_block").setRegistryName("scotch_cookie_block").setCreativeTab(SurvivalEssentials.creativeTab);
		cyan_cobble = new BlockCyanCobble(Material.ROCK, MapColor.CYAN).setUnlocalizedName("cyan_cobble").setRegistryName("cyan_cobble").setCreativeTab(SurvivalEssentials.creativeTab);
		red_cobble = new BlockCyanCobble(Material.ROCK, MapColor.RED).setUnlocalizedName("red_cobble").setRegistryName("red_cobble").setCreativeTab(SurvivalEssentials.creativeTab);
		palm_leaves = new BlockPalmLeaves(Material.LEAVES, MapColor.GREEN).setUnlocalizedName("palm_leaves").setRegistryName("palm_leaves").setCreativeTab(SurvivalEssentials.creativeTab);
		palm_planks = new BlockPalmPlanks(Material.WOOD, MapColor.BROWN).setUnlocalizedName("palm_planks").setRegistryName("palm_planks").setCreativeTab(SurvivalEssentials.creativeTab);
		azurite_ore = new BlockAzuriteOre(Material.ROCK, MapColor.WHITE_STAINED_HARDENED_CLAY).setUnlocalizedName("azurite_ore").setRegistryName("azurite_ore").setCreativeTab(SurvivalEssentials.creativeTab);
		enderium_ore = new BlockEnderiumOre(Material.ROCK, MapColor.WHITE_STAINED_HARDENED_CLAY).setUnlocalizedName("enderium_ore").setRegistryName("enderium_ore").setCreativeTab(SurvivalEssentials.creativeTab);
		pink_diamond_ore = new BlockPinkDiamondOre(Material.ROCK, MapColor.RED).setUnlocalizedName("pink_diamond_ore").setRegistryName("pink_diamond_ore").setCreativeTab(SurvivalEssentials.creativeTab);
		radioactive_redstone_ore = new BlockRadioactiveRedstoneOre(Material.ROCK, MapColor.WHITE_STAINED_HARDENED_CLAY).setUnlocalizedName("radioactive_redstone_ore").setRegistryName("radioactive_redstone_ore").setCreativeTab(SurvivalEssentials.creativeTab);
		hardened_sun_ore = new BlockHardenedSunOre(Material.ROCK, MapColor.WHITE_STAINED_HARDENED_CLAY).setUnlocalizedName("hardened_sun_ore").setRegistryName("hardened_sun_ore").setCreativeTab(SurvivalEssentials.creativeTab);
		tarnite_ore = new BlockTarniteOre(Material.ROCK, MapColor.RED).setUnlocalizedName("tarnite_ore").setRegistryName("tarnite_ore").setCreativeTab(SurvivalEssentials.creativeTab);
		prixium_ore = new BlockPrixiumOre(Material.ROCK, MapColor.RED).setUnlocalizedName("prixium_ore").setRegistryName("prixium_ore").setCreativeTab(SurvivalEssentials.creativeTab);
		pink_diamond_block = new BlockPinkDiamond(Material.IRON, MapColor.PINK).setUnlocalizedName("pink_diamond_block").setRegistryName("pink_diamond_block").setCreativeTab(SurvivalEssentials.creativeTab);
		frozen_stone = new BlockFrozenStone(Material.ROCK, MapColor.CYAN).setUnlocalizedName("frozen_stone").setRegistryName("frozen_stone").setCreativeTab(SurvivalEssentials.creativeTab);
		hardened_stone = new BlockHardenedStone(Material.ROCK, MapColor.BLACK).setUnlocalizedName("hardened_stone").setRegistryName("hardened_stone").setCreativeTab(SurvivalEssentials.creativeTab);
		topaz_ore = new BlockTopazOre(Material.ROCK, MapColor.CYAN).setUnlocalizedName("topaz_ore").setRegistryName("topaz_ore").setCreativeTab(SurvivalEssentials.creativeTab);
		miamium_ore = new BlockMiamiumOre(Material.ROCK, MapColor.CYAN).setUnlocalizedName("miamium_ore").setRegistryName("miamium_ore").setCreativeTab(SurvivalEssentials.creativeTab);
		velvyx_ore = new BlockVelvyxOre(Material.ROCK, MapColor.CYAN).setUnlocalizedName("velvyx_ore").setRegistryName("velvyx_ore").setCreativeTab(SurvivalEssentials.creativeTab);
		freezine_ore = new BlockFreezineOre(Material.ROCK, MapColor.CYAN).setUnlocalizedName("freezine_ore").setRegistryName("freezine_ore").setCreativeTab(SurvivalEssentials.creativeTab);
		lead_ore = new BlockLeadOre(Material.ROCK, MapColor.BLACK).setUnlocalizedName("lead_ore").setRegistryName("lead_ore").setCreativeTab(SurvivalEssentials.creativeTab);
		titanium_forge = new BlockTitaniumForge(Material.IRON, MapColor.WHITE_STAINED_HARDENED_CLAY);
		corbite_ore = new BlockCorbiteOre(Material.ROCK, MapColor.WHITE_STAINED_HARDENED_CLAY).setUnlocalizedName("corbite_ore").setRegistryName("corbite_ore").setCreativeTab(SurvivalEssentials.creativeTab);
		corceon_ore = new BlockCorceonOre(Material.ROCK, MapColor.WHITE_STAINED_HARDENED_CLAY).setUnlocalizedName("corceon_ore").setRegistryName("corceon_ore").setCreativeTab(SurvivalEssentials.creativeTab);
		volcanic_sand = new BlockVolcanicSand(Material.SAND, MapColor.BLACK).setUnlocalizedName("volcanic_sand").setRegistryName("volcanic_sand").setCreativeTab(SurvivalEssentials.creativeTab);
		white_sand = new BlockWhiteSand(Material.SAND, MapColor.WHITE_STAINED_HARDENED_CLAY).setUnlocalizedName("white_sand").setRegistryName("white_sand").setCreativeTab(SurvivalEssentials.creativeTab);
		petrolium_ore = new BlockPetroliumOre(Material.ROCK, MapColor.BLACK).setUnlocalizedName("petrolium_ore").setRegistryName("petrolium_ore").setCreativeTab(SurvivalEssentials.creativeTab);
		choco_cookie_ore = new BlockChocoCookieOre(Material.ROCK, MapColor.BROWN).setUnlocalizedName("choco_cookie_ore").setRegistryName("choco_cookie_ore").setCreativeTab(SurvivalEssentials.creativeTab);
		scotch_cookie_ore = new BlockScotchCookieOre(Material.ROCK, MapColor.BROWN).setUnlocalizedName("scotch_cookie_ore").setRegistryName("scotch_cookie_ore").setCreativeTab(SurvivalEssentials.creativeTab);
		bookshelf_2 = new BlockBookshelf2(Material.WOOD, MapColor.BROWN).setUnlocalizedName("bookshelf_2").setRegistryName("bookshelf_2").setCreativeTab(SurvivalEssentials.creativeTab);
		liquium_ore = new BlockLiquiumOre(Material.ROCK, MapColor.BLACK).setUnlocalizedName("liquium_ore").setRegistryName("liquium_ore").setCreativeTab(SurvivalEssentials.creativeTab);
		dark_choco_cookie_ore = new BlockDarkChocoCookieOre(Material.ROCK, MapColor.BROWN).setUnlocalizedName("dark_choco_cookie_ore").setRegistryName("dark_choco_cookie_ore").setCreativeTab(SurvivalEssentials.creativeTab);
		white_choco_cookie_ore = new BlockWhiteChocoookieOre(Material.ROCK, MapColor.BROWN).setUnlocalizedName("white_choco_cookie_ore").setRegistryName("white_choco_cookie_ore").setCreativeTab(SurvivalEssentials.creativeTab);
		candy_cookie_ore = new BlockCandyCookieOre(Material.ROCK, MapColor.BROWN).setUnlocalizedName("candy_cookie_ore").setRegistryName("candy_cookie_ore").setCreativeTab(SurvivalEssentials.creativeTab);
		radioactive_redstone_wire = new BlockRadioactiveRedstoneWire().setUnlocalizedName("radioactive_redstone_wire").setRegistryName("radioactive_redstone_wire");
		red_ore = new BlockRedOre(Material.ROCK, MapColor.WHITE_STAINED_HARDENED_CLAY).setUnlocalizedName("red_ore").setRegistryName("red_ore").setCreativeTab(SurvivalEssentials.creativeTab);
		bookshelf_3 = new BlockBookshelf2(Material.WOOD, MapColor.BROWN).setUnlocalizedName("bookshelf_3").setRegistryName("bookshelf_3").setCreativeTab(SurvivalEssentials.creativeTab);
		xenon_crystal = new BlockXenonCrystal(Material.IRON, MapColor.GREEN).setUnlocalizedName("xenon_crystal").setRegistryName("xenon_crystal").setCreativeTab(SurvivalEssentials.creativeTab);
		titanium_block = new BlockTitanium_Ore(Material.IRON, MapColor.WHITE_STAINED_HARDENED_CLAY).setUnlocalizedName("titanium_block").setRegistryName("titanium_block").setCreativeTab(SurvivalEssentials.creativeTab);
		rose_panel = new BlockPanel(Material.CLOTH, MapColor.RED).setUnlocalizedName("rose_panel").setRegistryName("rose_panel").setCreativeTab(SurvivalEssentials.creativeTab);
		yellow_panel = new BlockPanel(Material.CLOTH, MapColor.YELLOW).setUnlocalizedName("yellow_panel").setRegistryName("yellow_panel").setCreativeTab(SurvivalEssentials.creativeTab);
		cyan_panel = new BlockPanel(Material.CLOTH, MapColor.CYAN).setUnlocalizedName("cyan_panel").setRegistryName("cyan_panel").setCreativeTab(SurvivalEssentials.creativeTab);
		lime_panel = new BlockPanel(Material.CLOTH, MapColor.LIME).setUnlocalizedName("lime_panel").setRegistryName("lime_panel").setCreativeTab(SurvivalEssentials.creativeTab);
		grey_panel = new BlockPanel(Material.CLOTH, MapColor.GRAY).setUnlocalizedName("grey_panel").setRegistryName("grey_panel").setCreativeTab(SurvivalEssentials.creativeTab);
		void_block_corrupt = new VoidBlockCorrupt(Material.IRON, MapColor.PURPLE).setUnlocalizedName("void_block_corrupt").setRegistryName("void_block_corrupt").setCreativeTab(SurvivalEssentials.creativeTab);
		xenon_crystal_2 = new BlockXenonCrystal2(Material.IRON, MapColor.GREEN).setUnlocalizedName("xenon_crystal_2").setRegistryName("xenon_crystal_2").setCreativeTab(SurvivalEssentials.creativeTab);
		void_stone_block = new VoidStoneBlock(Material.ROCK, MapColor.PURPLE).setUnlocalizedName("void_stone_block").setRegistryName("void_stone_block").setCreativeTab(SurvivalEssentials.creativeTab);
		void_portal_block = new VoidPortalBlock(Material.ROCK, MapColor.PURPLE).setUnlocalizedName("void_portal_block").setRegistryName("void_portal_block").setCreativeTab(SurvivalEssentials.creativeTab);
		void_diamond_ore = new VoidDiamondOre(Material.ROCK, MapColor.PURPLE).setUnlocalizedName("void_diamond_ore").setRegistryName("void_diamond_ore").setCreativeTab(SurvivalEssentials.creativeTab);
		void_block_broken = new VoidBlockBroken(Material.ROCK, MapColor.PURPLE).setUnlocalizedName("void_block_broken").setRegistryName("void_block_broken").setCreativeTab(SurvivalEssentials.creativeTab);
		void_ore_1 = new VoidBleediumOre(Material.ROCK, MapColor.PURPLE).setUnlocalizedName("void_ore_1").setRegistryName("void_ore_1").setCreativeTab(SurvivalEssentials.creativeTab);
		moss_block = new MossBlock(Material.SPONGE, MapColor.GREEN).setUnlocalizedName("moss_block").setRegistryName("moss_block").setCreativeTab(SurvivalEssentials.creativeTab);
		crynyx_crafting_table = new BlockCrynyxCraftingTable(Material.IRON, MapColor.PURPLE);
		
	}

	

	public static void register() {
		
		registerBlock(hardened_mud);
		registerBlock(euronium_ore);
		registerBlock(fire_iron_ore);
		registerBlock(icecreammaker);
		GameRegistry.registerTileEntity(TileEntityIceCreamMaker.class, "icecreammaker");
		registerBlock(vanillablock);
		registerBlock(wafflemaker);
		GameRegistry.registerTileEntity(TileEntityWaffleMaker.class, "wafflemaker");
		GameRegistry.registerTileEntity(TileEntityTitaniumForge.class, "titanium_forge");
		GameRegistry.registerTileEntity(TileEntityCrynyxCraftingTable.class, "crynyx_crafting_table");
		registerBlock(titanium_ore);
		registerBlock(cobalt_ore);
		registerBlock(aluminum_ore);
		registerBlock(sun_block);
		registerBlock(cursedgold_ore);
		registerBlock(xenon_ore);
		registerBlock(plutonium_ore);
		registerBlock(crynyx_ore);
		registerBlock(camiline_ore);
		registerBlock(lithium_ore);
		registerBlock(charged_diamond_ore);
		registerBlock(cookie_block);
		registerBlock(choco_cookie_block);
		registerBlock(scotch_cookie_block);
		registerBlock(cyan_cobble);
		registerBlock(red_cobble);
		registerBlock(palm_leaves);
		registerBlock(palm_planks);
		registerBlock(prixium_ore);
		registerBlock(pink_diamond_ore);
		registerBlock(radioactive_redstone_ore);
		registerBlock(azurite_ore);
		registerBlock(enderium_ore);
		registerBlock(tarnite_ore);
		registerBlock(hardened_sun_ore);
		registerBlock(pink_diamond_block);
		registerBlock(frozen_stone);
		registerBlock(hardened_stone);
		registerBlock(freezine_ore);
		registerBlock(miamium_ore);
		registerBlock(lead_ore);
		registerBlock(velvyx_ore);
		registerBlock(topaz_ore);
		registerBlock(titanium_forge);
		registerBlock(corbite_ore);
		registerBlock(corceon_ore);
		registerBlock(volcanic_sand);
		registerBlock(white_sand);
		registerBlock(choco_cookie_ore);
		registerBlock(scotch_cookie_ore);
		registerBlock(petrolium_ore);
		registerBlock(bookshelf_2);
		registerBlock(candy_cookie_ore);
		registerBlock(dark_choco_cookie_ore);
		registerBlock(white_choco_cookie_ore);
		registerBlock(liquium_ore);
		registerBlock(radioactive_redstone_wire);
		registerBlock(red_ore);
		registerBlock(bookshelf_3);
		registerBlock(xenon_crystal);
		registerBlock(titanium_block);
		registerBlock(cyan_panel);
		registerBlock(yellow_panel);
		registerBlock(rose_panel);
		registerBlock(grey_panel);
		registerBlock(lime_panel);
		registerBlock(xenon_crystal_2);
		registerBlock(void_portal_block);
		registerBlock(void_stone_block);
		registerBlock(void_ore_1);
		registerBlock(void_diamond_ore);
		registerBlock(void_block_broken);
		registerBlock(void_block_corrupt);
		registerBlock(moss_block);
		registerBlock(crynyx_crafting_table);
		
	}

	

	private static void registerBlock(Block block) {

		ForgeRegistries.BLOCKS.register(block);

		ItemBlock item = new ItemBlock(block);

		item.setRegistryName(block.getRegistryName());

		ForgeRegistries.ITEMS.register(item);

	}

	

	public static void registerRenders() {

		registerRender(hardened_mud);
		registerRender(euronium_ore);
		registerRender(fire_iron_ore);
		registerRender(icecreammaker);
		registerRender(vanillablock);
		registerRender(wafflemaker);
		registerRender(aluminum_ore);
		registerRender(titanium_ore);
		registerRender(cobalt_ore);
		registerRender(sun_block);
		registerRender(cursedgold_ore);
		registerRender(plutonium_ore);
		registerRender(xenon_ore);
		registerRender(crynyx_ore);
		registerRender(camiline_ore);
		registerRender(lithium_ore);
		registerRender(charged_diamond_ore);
		registerRender(cookie_block);
		registerRender(choco_cookie_block);
		registerRender(scotch_cookie_block);
		registerRender(cyan_cobble);
		registerRender(red_cobble);
		registerRender(palm_leaves);
		registerRender(palm_planks);
		registerRender(prixium_ore);
		registerRender(pink_diamond_ore);
		registerRender(radioactive_redstone_ore);
		registerRender(azurite_ore);
		registerRender(enderium_ore);
		registerRender(tarnite_ore);
		registerRender(hardened_sun_ore);
		registerRender(pink_diamond_block);
		registerRender(frozen_stone);
		registerRender(hardened_stone);
		registerRender(freezine_ore);
		registerRender(miamium_ore);
		registerRender(lead_ore);
		registerRender(velvyx_ore);
		registerRender(topaz_ore);
		registerRender(titanium_forge);
		registerRender(corbite_ore);
		registerRender(corceon_ore);
		registerRender(volcanic_sand);
		registerRender(white_sand);
		registerRender(choco_cookie_ore);
		registerRender(scotch_cookie_ore);
		registerRender(petrolium_ore);
		registerRender(bookshelf_2);
		registerRender(candy_cookie_ore);
		registerRender(dark_choco_cookie_ore);
		registerRender(white_choco_cookie_ore);
		registerRender(liquium_ore);
		registerRender(radioactive_redstone_wire);
		registerRender(red_ore);
		registerRender(bookshelf_3);
		registerRender(xenon_crystal);
		registerRender(titanium_block);
		registerRender(cyan_panel);
		registerRender(yellow_panel);
		registerRender(rose_panel);
		registerRender(grey_panel);
		registerRender(lime_panel);
		registerRender(xenon_crystal_2);
		registerRender(void_portal_block);
		registerRender(void_stone_block);
		registerRender(void_ore_1);
		registerRender(void_diamond_ore);
		registerRender(void_block_broken);
		registerRender(void_block_corrupt);
		registerRender(moss_block);
		registerRender(crynyx_crafting_table);
		

	}

	

	public static void registerRender(Block block) {

		Item item = Item.getItemFromBlock(block);

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));

	}

}

