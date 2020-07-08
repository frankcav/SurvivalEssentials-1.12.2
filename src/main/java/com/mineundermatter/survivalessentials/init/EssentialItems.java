package com.mineundermatter.survivalessentials.init;



import com.mineundermatter.survivalessentials.client.SurvivalEssentials;
import com.mineundermatter.survivalessentials.item.ItemAzuriteIngot;
import com.mineundermatter.survivalessentials.item.ItemChargedDiamond;
import com.mineundermatter.survivalessentials.item.ItemChocolate;
import com.mineundermatter.survivalessentials.item.ItemChocolate_Ice_Cream;
import com.mineundermatter.survivalessentials.item.ItemChocolate_Ice_Cream_Cone;
import com.mineundermatter.survivalessentials.item.ItemCone;
import com.mineundermatter.survivalessentials.item.ItemCorbiteIngot;
import com.mineundermatter.survivalessentials.item.ItemCorceonIngot;
import com.mineundermatter.survivalessentials.item.ItemCream;
import com.mineundermatter.survivalessentials.item.ItemCrushed_Ice;
import com.mineundermatter.survivalessentials.item.ItemCrynyxIngot;
import com.mineundermatter.survivalessentials.item.ItemCursedIngot;
import com.mineundermatter.survivalessentials.item.ItemCutlass;
import com.mineundermatter.survivalessentials.item.ItemDeagle;
import com.mineundermatter.survivalessentials.item.ItemDeagleL;
import com.mineundermatter.survivalessentials.item.ItemDrill;
import com.mineundermatter.survivalessentials.item.ItemEuronium_Chunk;
import com.mineundermatter.survivalessentials.item.ItemFire_Iron;
import com.mineundermatter.survivalessentials.item.ItemFire_Sword;
import com.mineundermatter.survivalessentials.item.ItemGrenade;
import com.mineundermatter.survivalessentials.item.ItemHBS;
import com.mineundermatter.survivalessentials.item.ItemHatchet;
import com.mineundermatter.survivalessentials.item.ItemIce_Crush;
import com.mineundermatter.survivalessentials.item.ItemIron_Rod;
import com.mineundermatter.survivalessentials.item.ItemM16;
import com.mineundermatter.survivalessentials.item.ItemM16E;
import com.mineundermatter.survivalessentials.item.ItemM16L;
import com.mineundermatter.survivalessentials.item.ItemM16R;
import com.mineundermatter.survivalessentials.item.ItemM16U;
import com.mineundermatter.survivalessentials.item.ItemMBS;
import com.mineundermatter.survivalessentials.item.ItemMechaswordA;
import com.mineundermatter.survivalessentials.item.ItemMiamiumBeam;
import com.mineundermatter.survivalessentials.item.ItemMissile;
import com.mineundermatter.survivalessentials.item.ItemModArmor;
import com.mineundermatter.survivalessentials.item.ItemModArmor1;
import com.mineundermatter.survivalessentials.item.ItemModArmor2;
import com.mineundermatter.survivalessentials.item.ItemModArmor3;
import com.mineundermatter.survivalessentials.item.ItemModArmor4;
import com.mineundermatter.survivalessentials.item.ItemMultitool;
import com.mineundermatter.survivalessentials.item.ItemPinkDiamond;
import com.mineundermatter.survivalessentials.item.ItemPlutoniumBeam;
import com.mineundermatter.survivalessentials.item.ItemPrixiumShard;
import com.mineundermatter.survivalessentials.item.ItemRPG;
import com.mineundermatter.survivalessentials.item.ItemRPGL;
import com.mineundermatter.survivalessentials.item.ItemRPGR;
import com.mineundermatter.survivalessentials.item.ItemRadioactiveRedstoneDust;
import com.mineundermatter.survivalessentials.item.ItemScythe;
import com.mineundermatter.survivalessentials.item.ItemTarniteIngot;
import com.mineundermatter.survivalessentials.item.ItemVanilla;
import com.mineundermatter.survivalessentials.item.ItemVanilla_Ice_Cream;
import com.mineundermatter.survivalessentials.item.ItemVanilla_Ice_Cream_Cone;
import com.mineundermatter.survivalessentials.item.ItemVanilla_Seeds;
import com.mineundermatter.survivalessentials.item.ItemWaffle;
import com.mineundermatter.survivalessentials.item.ItemWaffle_Mix;
import com.mineundermatter.survivalessentials.item.ItemWarAxe;
import com.mineundermatter.survivalessentials.item.ItemWarhammer;
import com.mineundermatter.survivalessentials.item.NewItemAxe;
import com.mineundermatter.survivalessentials.item.NewItemPickaxe;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EnumPlayerModelParts;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;



public class EssentialItems {
	
	public static Item iron_rod;
	public static Item iron_hatchet;
	public static ToolMaterial customiron = EnumHelper.addToolMaterial("CustomIron", 3, 250, 6.0F, 6.0F, 14);
	public static Item iron_warhammer;
	public static ToolMaterial customiron1 = EnumHelper.addToolMaterial("CustomIron1", 3, 240, 5.0F, 9.0F, 15);
	public static Item iron_cutlass;
	public static ToolMaterial customiron2 = EnumHelper.addToolMaterial("CustomIron2", 3, 270, 5.5F, 7.0F, 20);
	public static Item gold_hatchet;
	public static ToolMaterial customgold = EnumHelper.addToolMaterial("CustomGold", 1, 32, 12.0F, 4.0F, 22);
	public static Item gold_warhammer;
	public static ToolMaterial customgold1 = EnumHelper.addToolMaterial("CustomGold1", 1, 22, 11.0F, 7.0F, 23);
	public static Item gold_cutlass;
	public static ToolMaterial customgold2 = EnumHelper.addToolMaterial("CustomGold2", 1, 52, 11.5F, 5.0F, 28);
	public static Item diamond_hatchet;
	public static ToolMaterial customdiamond = EnumHelper.addToolMaterial("CustomDiamond", 4, 1561, 8.0F, 7.0F, 10);
	public static Item diamond_warhammer;
	public static ToolMaterial customdiamond1 = EnumHelper.addToolMaterial("CustomDiamond1", 4, 1551, 7.0F, 10.0F, 11);
	public static Item diamond_cutlass;
	public static ToolMaterial customdiamond2 = EnumHelper.addToolMaterial("CustomDiamond2", 4, 1571, 7.5F, 8.0F, 16);
	public static Item emerald_hatchet;
	public static ToolMaterial customemerald = EnumHelper.addToolMaterial("CustomEmerald", 5, 1991, 12.5F, 8.0F, 20);
	public static Item emerald_warhammer;
	public static ToolMaterial customemerald1 = EnumHelper.addToolMaterial("CustomEmerald1", 5, 1981, 11.5F, 11.0F, 21);
	public static Item emerald_cutlass;
	public static ToolMaterial customemerald2 = EnumHelper.addToolMaterial("CustomEmerald2", 5, 2011, 12.0F, 9.0F, 26);
	public static Item fire_iron;
	public static Item fire_hatchet;
	public static Item fire_sword;
	public static Item fire_pickaxe;
	public static Item fire_axe;
	public static Item fire_hoe;
	public static Item fire_shovel;
	public static Item fire_warhammer;
	public static Item fire_cutlass;
	
	public static ToolMaterial fire1 = EnumHelper.addToolMaterial("Fire1", 10, 350, 14.0F, 8.0F, 14);
	public static ToolMaterial fire2 = EnumHelper.addToolMaterial("Fire2", 10, 340, 13.0F, 11.0F, 15);
	public static ToolMaterial fire3 = EnumHelper.addToolMaterial("Fire3", 10, 360, 13.5F, 9.0F, 16);
	public static Item fih;
	public static Item fic;
	public static Item fil;
	public static Item fib;
	public static ArmorMaterial fireiron = EnumHelper.addArmorMaterial("Fire Iron", "survivalessentials:fire_iron", 350, new int[]{4, 7, 9, 4 }, 22, SoundEvents.ENTITY_PLAYER_SPLASH, 1.5F);
	public static Item m16;
	public static Item m16u;
	public static Item m16r;
	public static Item m16e;
	public static Item m16l;
	public static Item mbs;
	public static Item euronium_chunk;
	public static Item eh;
	public static Item ec;
	public static Item el;
	public static Item eb;
	public static ArmorMaterial emerald = EnumHelper.addArmorMaterial("Emerald", "survivalessentials:emerald", 450, new int[]{4, 8, 10, 4}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
	public static Item emerald_sword;
	public static Item emerald_axe;
	public static Item emerald_hoe;
	public static Item emerald_shovel;
	public static Item emerald_pickaxe;
	
	public static Item cream;
	public static Item crushed_ice;
	public static Item ice_crush;
	public static Item chocolate;
	public static Item chocolate_ice_cream;
	public static Item vanilla_ice_cream;
	public static Item cone;
	public static Item vanilla_ice_cream_cone;
	public static Item chocolate_ice_cream_cone;
	public static Item vanilla;
	public static Item vanilla_seeds;
	public static Item waffle;
	public static Item waffle_mix;
	public static Item iron_multitool;
	public static ToolMaterial customiron3 = EnumHelper.addToolMaterial("CustomIron3", 2, 250, 6.0F, 2.0F, 14);
	public static Item gold_multitool;
	public static ToolMaterial customgold3 = EnumHelper.addToolMaterial("CustomGold3", 0, 32, 12.0F, 0.0F, 22);
	public static Item diamond_multitool;
	public static Item emerald_multitool;
	public static Item fire_multitool;
	public static ToolMaterial customdiamond3 = EnumHelper.addToolMaterial("CustomDiamond3", 3, 1561, 8.0F, 3.0F, 10);
	public static ToolMaterial customemerald3 = EnumHelper.addToolMaterial("CustomEmerald3", 4, 1991, 6.0F, 4.0F, 14);
	public static ToolMaterial customfire3 = EnumHelper.addToolMaterial("CustomFire3", 4, 350, 14.0F, 4.0F, 10);
	public static Item iron_scythe;
	public static ToolMaterial customiron4 = EnumHelper.addToolMaterial("CustomIron4", 2, 250, 6.0F, 6.0F, 18);
	public static Item gold_scythe;
	public static ToolMaterial customgold4 = EnumHelper.addToolMaterial("CustomGold4", 0, 32, 12.0F, 4.0F, 26);
	public static Item diamond_scythe;
	public static ToolMaterial customdiamond4 = EnumHelper.addToolMaterial("CustomDiamond4", 3, 1561, 7.0F, 9.0F, 14);
	public static Item emerald_scythe;
	public static ToolMaterial customemerald4 = EnumHelper.addToolMaterial("CustomEmerald4", 4, 1991, 6.0F, 10.0F, 18);
	public static Item fire_scythe;
	public static ToolMaterial customfire4 = EnumHelper.addToolMaterial("CustomFire4", 4, 350, 14.0F, 8.0F, 14);
	public static Item reinforced_iron_rod;
	public static Item diamond_drill;
	public static ToolMaterial customdiamond5 = EnumHelper.addToolMaterial("CustomDiamond5", 3, 2061, 13.0F, 3.0F, 10);
	public static Item emerald_drill;
	public static ToolMaterial customemerald5 = EnumHelper.addToolMaterial("CustomEmerald4", 4, 2491, 11.0F, 4.0F, 14);
	public static Item fire_drill;
	public static ToolMaterial fire5 = EnumHelper.addToolMaterial("Fire5", 4, 850, 19.0F, 4.0F, 10);
	public static Item titanium_ingot;
	public static Item aluminum_ingot;
	public static Item cobalt_chunk;
	public static Item bullet_casing;
	public static Item missile;
	public static Item rpg;
	public static Item rpgl;
	public static Item rpgr;
	public static Item hbs;
	public static Item deagle;
	public static Item deaglel;
	public static Item boh;
	public static Item boc;
	public static Item bol;
	public static Item bob;
	public static ArmorMaterial bo = EnumHelper.addArmorMaterial("BlackOps", "survivalessentials:blackops", 400, new int[]{1, 12, 9, 1}, 10, SoundEvents.BLOCK_CLOTH_PLACE, 12.0F);
	public static Item grenade;
	public static Item cowh;
	public static Item cowc;
	public static Item cowl;
	public static Item cowb;
	public static ArmorMaterial cow = EnumHelper.addArmorMaterial("Cowboy", "survivalessentials:cowboy", 850, new int[]{1, 3, 2, 1}, 15, SoundEvents.BLOCK_NOTE_GUITAR, 25.0F);
	public static Item cach;
	public static Item cacc;
	public static Item cacl;
	public static Item cacb;
	public static ArmorMaterial cac = EnumHelper.addArmorMaterial("Cactus", "survivalessentials:cactus", 200, new int[]{1, 4, 3, 1}, 16, SoundEvents.BLOCK_NOTE_BASS, 10.0F);
	public static Item iwa;
	public static ToolMaterial customiron6 = EnumHelper.addToolMaterial("CustomIron6", 2, 750, 5.5F, 8.0F, 15);
	public static Item gwa;
	public static ToolMaterial customgold6 = EnumHelper.addToolMaterial("CustomGold6", 0, 532, 11.5F, 6.0F, 23);
	public static Item dwa;
	public static ToolMaterial customdiamond6 = EnumHelper.addToolMaterial("CustomDiamond6", 3, 2061, 7.5F, 9.0F, 11);
	public static Item ewa;
	public static ToolMaterial customemerald6 = EnumHelper.addToolMaterial("CustomEmerald6", 4, 2491, 5.5F, 10.0F, 15);
	public static Item fwa;
	public static ToolMaterial customfire6 = EnumHelper.addToolMaterial("CustomFire6", 4, 850, 13.5F, 10.0F, 11);
	public static Item crynyx_ingot;
	
	public static Item cursed_cutlass;
	public static Item cursed_gold_ingot;
	public static Item mechasword_a;
	
	public static Item pink_diamond;
	public static Item radioactive_redstone_dust;
	public static Item charged_diamond;
	public static Item azurite_ingot;
	public static Item tarnite_ingot;
	public static Item plutonium_beam;
	public static Item prixium_shard;
	public static Item miamium_beam;
	public static Item corceon_ingot;
	
	public static Item corceon_shovel;
	public static Item corceon_pickaxe;
	public static Item corceon_axe;
	public static Item corceon_hoe;
	public static Item corceon_sword;
	
	public static Item corbite_sword;
	public static Item corbite_hoe;
	public static Item corbite_axe;
	public static Item corbite_shovel;
	public static Item corbite_pickaxe;
	public static Item corbite_ingot;
	
	public static Item tarnite_sword;
	public static Item tarnite_hoe;
	public static Item tarnite_axe;
	public static Item tarnite_shovel;
	public static Item tarnite_pickaxe;
	
	public static Item azurite_sword;
	public static Item azurite_hoe;
	public static Item azurite_axe;
	public static Item azurite_shovel;
	public static Item azurite_pickaxe;
	
	//Tool Materials
	public static ToolMaterial corbite = EnumHelper.addToolMaterial("Corbite", 3, 751, 6.0F, 2.5F, 14);
	public static ToolMaterial corcoeon = EnumHelper.addToolMaterial("Corceon", 2, 200, 6.5F, 2.0f, 20);
	public static ToolMaterial mechaswordA = EnumHelper.addToolMaterial("MechaswordA", 3, 2061, 8f, 24f, 6);
	public static ToolMaterial cursedGold = EnumHelper.addToolMaterial("CursedGold", 5, 1200, 12.0f, 12.0f, 20);
	public static ToolMaterial fire = EnumHelper.addToolMaterial("Fire", 10, 350, 14.0F, 4.0F, 10);
	public static ToolMaterial emerald1 = EnumHelper.addToolMaterial("Emerald1", 4, 1991, 6.0F, 4.0F, 14);
	public static ToolMaterial azurite = EnumHelper.addToolMaterial("Azurite", 3, 3051, 7.0f, 4.0f, 45);
	public static ToolMaterial tarnite = EnumHelper.addToolMaterial("Tarnite", 2, 151, 5.0f, 3.0f, 10);
	
	public static void init() {

		//Items
		iron_rod = new ItemIron_Rod().setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("iron_rod").setRegistryName("iron_rod");
		fire_iron = new ItemFire_Iron().setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("fire_iron").setRegistryName("fire_iron");
		euronium_chunk = new ItemEuronium_Chunk().setUnlocalizedName("euronium_chunk").setRegistryName("euronium_chunk").setCreativeTab(SurvivalEssentials.creativeTab);
		reinforced_iron_rod = new Item().setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("reinforced_iron_rod").setUnlocalizedName("reinforced_iron_rod");
		titanium_ingot = new Item().setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("titanium_ingot").setUnlocalizedName("titanium_ingot");
		cobalt_chunk = new Item().setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("cobalt_chunk").setUnlocalizedName("cobalt_chunk");
		aluminum_ingot = new Item().setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("aluminum_ingot").setUnlocalizedName("aluminum_ingot");
		bullet_casing = new Item().setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("bullet_casing").setUnlocalizedName("bullet_casing");
		crynyx_ingot = new ItemCrynyxIngot().setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("crynyx_ingot").setUnlocalizedName("crynyx_ingot");
		cursed_gold_ingot = new ItemCursedIngot().setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("cursed_gold_ingot").setUnlocalizedName("cursed_gold_ingot");
		pink_diamond = new ItemPinkDiamond().setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("pink_diamond").setUnlocalizedName("pink_diamond");
		radioactive_redstone_dust = new ItemRadioactiveRedstoneDust().setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("radioactive_redstone_dust").setUnlocalizedName("radioactive_redstone_dust");
		charged_diamond = new ItemChargedDiamond().setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("charged_diamond").setUnlocalizedName("charged_diamond");
		azurite_ingot = new ItemAzuriteIngot().setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("azurite_ingot").setUnlocalizedName("azurite_ingot");
		tarnite_ingot = new ItemTarniteIngot().setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("tarnite_ingot").setUnlocalizedName("tarnite_ingot");
		plutonium_beam = new ItemPlutoniumBeam().setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("plutonium_beam").setUnlocalizedName("plutonium_beam");
		prixium_shard = new ItemPrixiumShard().setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("prixium_shard").setUnlocalizedName("prixium_shard");
		miamium_beam = new ItemMiamiumBeam().setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("miamium_beam").setUnlocalizedName("miamium_beam");
		corceon_ingot = new ItemCorceonIngot().setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("corceon_ingot").setUnlocalizedName("corceon_ingot");
		corbite_ingot = new ItemCorbiteIngot().setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("corbite_ingot").setUnlocalizedName("corbite_ingot");
		
		//Foods
		cream = new ItemCream().setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("cream").setRegistryName("cream");
		crushed_ice = new ItemCrushed_Ice().setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("crushed_ice").setRegistryName("crushed_ice");
		ice_crush = new ItemIce_Crush().setCreativeTab(SurvivalEssentials.creativeTab);
		vanilla = new ItemVanilla(2, 1.0F, false).setUnlocalizedName("vanilla").setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("vanilla");
		vanilla_seeds = new ItemVanilla_Seeds(EssentialBlocks.vanillablock, Blocks.FARMLAND).setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("vanilla_seeds").setRegistryName("vanilla_seeds");
		vanilla_ice_cream = new ItemVanilla_Ice_Cream().setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("vanilla_ice_cream").setRegistryName("vanilla_ice_cream");
		chocolate_ice_cream = new ItemChocolate_Ice_Cream().setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("chocolate_ice_cream").setRegistryName("chocolate_ice_cream");
		chocolate = new ItemChocolate(2, 2.0F, false).setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("chocolate").setRegistryName("chocolate");
		cone = new ItemCone(2, .5F, false).setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("cone").setRegistryName("cone");
		vanilla_ice_cream_cone = new ItemVanilla_Ice_Cream_Cone(2, 4.0F, false).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("vanilla_ice_cream_cone").setUnlocalizedName("vanilla_ice_cream_cone");
		chocolate_ice_cream_cone = new ItemChocolate_Ice_Cream_Cone(2, 4.0F, false).setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("chocolate_ice_cream_cone").setRegistryName("chocolate_ice_cream_cone");
		waffle = new ItemWaffle(2, 1.5F, false).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("waffle").setUnlocalizedName("waffle");
		waffle_mix = new ItemWaffle_Mix().setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("waffle_mix").setUnlocalizedName("waffle_mix");
		
		
		//Swords
		fire_sword = new ItemFire_Sword(fire).setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("fire_sword").setRegistryName("fire_sword");
		emerald_sword = new ItemSword(emerald1).setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("emerald_sword").setRegistryName("emerald_sword");
		mechasword_a = new ItemMechaswordA(0, 0, mechaswordA, null).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("mechasword_a").setUnlocalizedName("mechasword_a");
		corceon_sword = new ItemSword(corcoeon).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("corceon_sword").setUnlocalizedName("corceon_sword");
		corbite_sword = new ItemSword(corbite).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("corbite_sword").setUnlocalizedName("corbite_sword");
		tarnite_sword = new ItemSword(tarnite).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("tarnite_sword").setUnlocalizedName("tarnite_sword");
		azurite_sword = new ItemSword(azurite).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("azurite_sword").setUnlocalizedName("azurite_sword");
		
		//Axes
		fire_axe = new NewItemAxe(0, 0, fire, null).setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("fire_axe").setRegistryName("fire_axe");
		emerald_axe = new NewItemAxe(0, 0, emerald1, null).setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("emerald_axe").setRegistryName("emerald_axe");
		corceon_axe = new NewItemAxe(0, 0, corcoeon, null).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("corceon_axe").setUnlocalizedName("corceon_axe");
		corbite_axe = new NewItemAxe(0, 0, corbite, null).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("corbite_axe").setUnlocalizedName("corbite_axe");
		tarnite_axe = new NewItemAxe(0, 0, tarnite, null).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("tarnite_axe").setUnlocalizedName("tarnite_axe");
		azurite_axe = new NewItemAxe(0, 0, azurite, null).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("azurite_axe").setUnlocalizedName("azurite_axe");
		
		
		//Pickaxes
		fire_pickaxe = new NewItemPickaxe(fire).setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("fire_pickaxe").setRegistryName("fire_pickaxe");
		emerald_pickaxe = new NewItemPickaxe(emerald1).setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("emerald_pickaxe").setRegistryName("emerald_pickaxe");
		corceon_pickaxe = new NewItemPickaxe(corcoeon).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("corceon_pickaxe").setUnlocalizedName("corceon_pickaxe");
		corbite_pickaxe = new NewItemPickaxe(corbite).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("corbite_pickaxe").setUnlocalizedName("corbite_pickaxe");
		azurite_pickaxe = new NewItemPickaxe(tarnite).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("tarnite_pickaxe").setUnlocalizedName("tarnite_pickaxe");
		tarnite_pickaxe = new NewItemPickaxe(azurite).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("azurite_pickaxe").setUnlocalizedName("azurite_pickaxe");
		
		//Shovels
		fire_shovel = new ItemSpade(fire).setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("fire_shovel").setRegistryName("fire_shovel");
		emerald_shovel = new ItemSpade(emerald1).setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("emerald_shovel").setRegistryName("emerald_shovel");
		corceon_shovel = new ItemSpade(corcoeon).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("corceon_shovel").setUnlocalizedName("corceon_shovel");
		corbite_shovel = new ItemSpade(corbite).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("corbite_shovel").setUnlocalizedName("corbite_shovel");
		tarnite_shovel = new ItemSpade(tarnite).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("tarnite_shovel").setUnlocalizedName("tarnite_shovel");
		azurite_shovel = new ItemSpade(azurite).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("azurite_shovel").setUnlocalizedName("azurite_shovel");
		
		//Hoes
		fire_hoe = new ItemHoe(fire).setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("fire_hoe").setRegistryName("fire_hoe");
		emerald_hoe = new ItemHoe(emerald1).setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("emerald_hoe").setRegistryName("emerald_hoe");
		corceon_hoe = new ItemHoe(corcoeon).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("corceon_hoe").setUnlocalizedName("corceon_hoe");
		tarnite_hoe = new ItemHoe(tarnite).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("tarnite_hoe").setUnlocalizedName("tarnite_hoe");
		azurite_hoe = new ItemHoe(azurite).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("azurite_hoe").setUnlocalizedName("azurite_hoe");
		corbite_hoe = new ItemHoe(corbite).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("corbite_hoe").setUnlocalizedName("corbite_hoe");
		
		
		//Hatchets
		iron_hatchet = new ItemHatchet(0, 0, customiron, null).setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("iron_hatchet").setRegistryName("iron_hatchet");
		gold_hatchet = new ItemHatchet(0, 0, customgold, null).setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("gold_hatchet").setRegistryName("gold_hatchet");
		diamond_hatchet = new ItemHatchet(0, 0, customdiamond, null).setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("diamond_hatchet").setRegistryName("diamond_hatchet");
		emerald_hatchet = new ItemHatchet(0, 0, customemerald, null).setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("emerald_hatchet").setRegistryName("emerald_hatchet");
		fire_hatchet = new ItemHatchet(0, 0, fire1, null).setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("fire_hatchet").setRegistryName("fire_hatchet");
		
		
		//Warhammers
		iron_warhammer = new ItemWarhammer(0, 0, customiron1, null).setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("iron_warhammer").setRegistryName("iron_warhammer");
		gold_warhammer = new ItemWarhammer(0, 0, customgold1, null).setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("gold_warhammer").setRegistryName("gold_warhammer");
		diamond_warhammer = new ItemWarhammer(0, 0, customdiamond1, null).setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("diamond_warhammer").setRegistryName("diamond_warhammer");
		emerald_warhammer = new ItemWarhammer(0, 0, customemerald1, null).setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("emerald_warhammer").setRegistryName("emerald_warhammer");
		fire_warhammer = new ItemWarhammer(0, 0, fire2, null).setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("fire_warhammer").setRegistryName("fire_warhammer");
		
		
		//War Axes
		iwa = new ItemWarAxe(0, 0, customiron6, null).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("iwa").setUnlocalizedName("iwa");
		gwa = new ItemWarAxe(0, 0, customgold6, null).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("gwa").setUnlocalizedName("gwa");
		dwa = new ItemWarAxe(0, 0, customdiamond6, null).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("dwa").setUnlocalizedName("dwa");
		ewa = new ItemWarAxe(0, 0, customemerald6, null).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("ewa").setUnlocalizedName("ewa");
		fwa = new ItemWarAxe(0, 0, customfire6, null).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("fwa").setUnlocalizedName("fwa");
		
		
		//Cutlasses
		iron_cutlass = new ItemCutlass(0,0, customiron2, null).setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("iron_cutlass").setRegistryName("iron_cutlass");
		gold_cutlass = new ItemCutlass(0, 0, customgold2, null).setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("gold_cutlass").setRegistryName("gold_cutlass");
		diamond_cutlass = new ItemCutlass(0, 0, customdiamond2, null).setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("diamond_cutlass").setRegistryName("diamond_cutlass");
		emerald_cutlass = new ItemCutlass(0, 0, customemerald2, null).setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("emerald_cutlass").setRegistryName("emerald_cutlass");
		fire_cutlass = new ItemCutlass(0, 0, fire3, null).setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("fire_cutlass").setRegistryName("fire_cutlass");
		cursed_cutlass = new ItemCutlass(0, 0, cursedGold, null).setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("cursed_cutlass").setRegistryName("cursed_cutlass");
		
		//Scythes
		iron_scythe = new ItemScythe(customiron4).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("iron_scythe").setUnlocalizedName("iron_scythe");
		gold_scythe = new ItemScythe(customgold4).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("gold_scythe").setUnlocalizedName("gold_scythe");
		diamond_scythe = new ItemScythe(customdiamond4).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("diamond_scythe").setUnlocalizedName("diamond_scythe");
		emerald_scythe = new ItemScythe(customemerald4).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("emerald_scythe").setUnlocalizedName("emerald_scythe");
		fire_scythe = new ItemScythe(customfire4).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("fire_scythe").setUnlocalizedName("fire_scythe");
		
		
		//Drills
		diamond_drill = new ItemDrill(customdiamond5).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("diamond_drill").setUnlocalizedName("diamond_drill");
		emerald_drill = new ItemDrill(customemerald5).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("emerald_drill").setUnlocalizedName("emerald_drill");
		fire_drill = new ItemDrill(fire5).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("fire_drill").setUnlocalizedName("fire_drill");
		
		
		//Guns and Ammo
		m16 = new ItemM16().setUnlocalizedName("m16").setRegistryName("m16").setCreativeTab(SurvivalEssentials.creativeTab);
		m16u = new ItemM16U().setUnlocalizedName("m16u").setRegistryName("m16u").setCreativeTab(SurvivalEssentials.creativeTab);
		m16r = new ItemM16R().setUnlocalizedName("m16r").setRegistryName("m16r").setCreativeTab(SurvivalEssentials.creativeTab);
		m16e = new ItemM16E().setUnlocalizedName("m16e").setRegistryName("m16e").setCreativeTab(SurvivalEssentials.creativeTab);
		m16l = new ItemM16L().setUnlocalizedName("m16l").setRegistryName("m16l").setCreativeTab(SurvivalEssentials.creativeTab);
		mbs = new ItemMBS().setUnlocalizedName("mbs").setRegistryName("mbs").setCreativeTab(SurvivalEssentials.creativeTab);
		missile = new ItemMissile().setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("missile").setUnlocalizedName("missile");
		rpg = new ItemRPG().setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("rpg").setUnlocalizedName("rpg");
		rpgl = new ItemRPGL().setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("rpgl").setUnlocalizedName("rpgl");
		rpgr = new ItemRPGR().setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("rpgr").setUnlocalizedName("rpgr");;
		hbs = new ItemHBS().setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("hbs").setUnlocalizedName("hbs");
		deagle = new ItemDeagle().setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("deagle").setUnlocalizedName("deagle");
		deaglel = new ItemDeagleL().setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("deaglel").setUnlocalizedName("deaglel");
		grenade = new ItemGrenade();
		
		//Helmets
		eh = new ItemModArmor(emerald, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("eh").setRegistryName("eh").setCreativeTab(SurvivalEssentials.creativeTab);
		fih = new ItemModArmor1(fireiron, 0, EntityEquipmentSlot.HEAD).setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("fih").setRegistryName("fih");
		boh = new ItemModArmor2(bo, 0, EntityEquipmentSlot.HEAD).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("boh").setUnlocalizedName("boh");
		cowh = new ItemModArmor3(cow, 0, EntityEquipmentSlot.HEAD).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("cowh").setUnlocalizedName("cowh");
		cach = new ItemModArmor4(cac, 0, EntityEquipmentSlot.HEAD).setRegistryName("cach").setUnlocalizedName("cach").setCreativeTab(SurvivalEssentials.creativeTab);
		
		//Chestplates
		ec = new ItemModArmor(emerald, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("ec").setRegistryName("ec").setCreativeTab(SurvivalEssentials.creativeTab);
		fic = new ItemModArmor1(fireiron, 0, EntityEquipmentSlot.CHEST).setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("fic").setRegistryName("fic");
		boc = new ItemModArmor2(bo, 0, EntityEquipmentSlot.CHEST).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("boc").setUnlocalizedName("boc");
		cowc = new ItemModArmor3(cow, 0, EntityEquipmentSlot.CHEST).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("cowc").setUnlocalizedName("cowc");
		
		//Leggings
		el = new ItemModArmor(emerald, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("el").setRegistryName("el").setCreativeTab(SurvivalEssentials.creativeTab);
		fil = new ItemModArmor1(fireiron, 0, EntityEquipmentSlot.LEGS).setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("fil").setRegistryName("fil");
		bol = new ItemModArmor2(bo, 0, EntityEquipmentSlot.LEGS).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("bol").setUnlocalizedName("bol");
		cowl = new ItemModArmor3(cow, 0, EntityEquipmentSlot.LEGS).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("cowl").setUnlocalizedName("cowl");
		
		//Boots
		eb = new ItemModArmor(emerald, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("eb").setRegistryName("eb").setCreativeTab(SurvivalEssentials.creativeTab);
		fib = new ItemModArmor1(fireiron, 0, EntityEquipmentSlot.FEET).setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("fib").setRegistryName("fib");
		bob = new ItemModArmor2(bo, 0, EntityEquipmentSlot.FEET).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("bob").setUnlocalizedName("bob");
		cowb = new ItemModArmor3(cow, 0, EntityEquipmentSlot.FEET).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("cowb").setUnlocalizedName("cowb");
		
		//Multitools
		iron_multitool = new ItemMultitool(null, customiron3).setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("iron_multitool").setRegistryName("iron_multitool");
		gold_multitool = new ItemMultitool(null, customgold3).setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("gold_multitool").setRegistryName("gold_multitool");
		diamond_multitool = new ItemMultitool(null, customdiamond3).setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("diamond_multitool").setRegistryName("diamond_multitool");
		emerald_multitool = new ItemMultitool(null, customemerald3).setCreativeTab(SurvivalEssentials.creativeTab).setUnlocalizedName("emerald_multitool").setRegistryName("emerald_multitool");
		fire_multitool = new ItemMultitool(null, customfire3).setCreativeTab(SurvivalEssentials.creativeTab).setRegistryName("fire_multitool").setUnlocalizedName("fire_multitool");
				
	}

	

	public static void register() {

		registerItem(iron_rod);
		registerItem(iron_hatchet);
		registerItem(iron_warhammer);
		registerItem(iron_cutlass);
		registerItem(gold_hatchet);
		registerItem(gold_warhammer);
		registerItem(gold_cutlass);
		registerItem(diamond_warhammer);
		registerItem(diamond_hatchet);
		registerItem(diamond_cutlass);
		registerItem(emerald_hatchet);
		registerItem(emerald_warhammer);
		registerItem(emerald_cutlass);
		registerItem(fire_iron);
		registerItem(fire_sword);
		registerItem(fire_axe);
		registerItem(fire_pickaxe);
		registerItem(fire_hatchet);
		registerItem(fire_warhammer);
		registerItem(fire_hoe);
		registerItem(fire_shovel);
		registerItem(fire_cutlass);
		registerItem(m16);
		registerItem(m16u);
		registerItem(m16r);
		registerItem(m16e);
		registerItem(m16l);
		registerItem(mbs);
		registerItem(euronium_chunk);
		registerItem(eh);
		registerItem(ec);
		registerItem(el);
		registerItem(eb);
		registerItem(emerald_axe);
		registerItem(emerald_sword);
		registerItem(emerald_shovel);
		registerItem(emerald_hoe);
		registerItem(emerald_pickaxe);
		registerItem(fih);
		registerItem(fic);
		registerItem(fil);
		registerItem(fib);
		registerItem(crushed_ice);
		registerItem(cream);
		registerItem(ice_crush);
		registerItem(vanilla);
		registerItem(vanilla_seeds);
		registerItem(chocolate);
		registerItem(cone);
		registerItem(vanilla_ice_cream);
		registerItem(chocolate_ice_cream);
		registerItem(chocolate_ice_cream_cone);
		registerItem(vanilla_ice_cream_cone);
		registerItem(waffle);
		registerItem(waffle_mix);
		registerItem(iron_multitool);
		registerItem(gold_multitool);
		registerItem(diamond_multitool);
		registerItem(emerald_multitool);
		registerItem(fire_multitool);
		registerItem(iron_scythe);
		registerItem(gold_scythe);
		registerItem(diamond_scythe);
		registerItem(emerald_scythe);
		registerItem(fire_scythe);
		registerItem(reinforced_iron_rod);
		registerItem(diamond_drill);
		registerItem(emerald_drill);
		registerItem(fire_drill);
		registerItem(titanium_ingot);
		registerItem(aluminum_ingot);
		registerItem(cobalt_chunk);
		registerItem(bullet_casing);
		registerItem(missile);
		registerItem(rpg);
		registerItem(rpgl);
		registerItem(rpgr);
		registerItem(deagle);
		registerItem(hbs);
		registerItem(deaglel);
		registerItem(boh);
		registerItem(boc);
		registerItem(bol);
		registerItem(bob);
		registerItem(grenade);
		registerItem(cowh);
		registerItem(cowc);
		registerItem(cowl);
		registerItem(cowb);
		registerItem(iwa);
		registerItem(gwa);
		registerItem(dwa);
		registerItem(ewa);
		registerItem(fwa);
		registerItem(cursed_cutlass);
		registerItem(crynyx_ingot);
		registerItem(cursed_gold_ingot);
		registerItem(mechasword_a);
		registerItem(pink_diamond);
		registerItem(radioactive_redstone_dust);
		registerItem(charged_diamond);
		registerItem(azurite_ingot);
		registerItem(tarnite_ingot);
		registerItem(prixium_shard);
		registerItem(plutonium_beam);
		registerItem(corceon_ingot);
		registerItem(miamium_beam);
		registerItem(corceon_sword);
		registerItem(corceon_shovel);
		registerItem(corceon_axe);
		registerItem(corceon_pickaxe);
		registerItem(corceon_hoe);
		registerItem(corbite_ingot);
		registerItem(corbite_sword);
		registerItem(corbite_hoe);
		registerItem(corbite_axe);
		registerItem(corbite_pickaxe);
		registerItem(corbite_shovel);
		registerItem(tarnite_sword);
		registerItem(tarnite_hoe);
		registerItem(tarnite_axe);
		registerItem(tarnite_pickaxe);
		registerItem(tarnite_shovel);
		registerItem(azurite_sword);
		registerItem(azurite_hoe);
		registerItem(azurite_axe);
		registerItem(azurite_pickaxe);
		registerItem(azurite_shovel);
		
	}

	

	private static void registerItem(Item item) {

		ForgeRegistries.ITEMS.register(item);

	}

	

	public static void registerRenders() {

		registerRender(iron_rod);
		registerRender(iron_hatchet);
		registerRender(iron_warhammer);
		registerRender(iron_cutlass);
		registerRender(gold_hatchet);
		registerRender(gold_warhammer);
		registerRender(gold_cutlass);
		registerRender(diamond_hatchet);
		registerRender(diamond_warhammer);
		registerRender(diamond_cutlass);
		registerRender(emerald_hatchet);
		registerRender(emerald_warhammer);
		registerRender(emerald_cutlass);
		registerRender(fire_iron);
		registerRender(fire_axe);
		registerRender(fire_sword);
		registerRender(fire_hoe);
		registerRender(fire_shovel);
		registerRender(fire_pickaxe);
		registerRender(fire_hatchet);
		registerRender(fire_warhammer);
		registerRender(fire_cutlass);
		registerRender(m16);
		registerRender(m16u);
		registerRender(m16r);
		registerRender(m16e);
		registerRender(m16l);
		registerRender(mbs);
		registerRender(euronium_chunk);
		registerRender(eh);
		registerRender(ec);
		registerRender(el);
		registerRender(eb);
		registerRender(emerald_axe);
		registerRender(emerald_sword);
		registerRender(emerald_shovel);
		registerRender(emerald_hoe);
		registerRender(emerald_pickaxe);
		registerRender(fih);
		registerRender(fic);
		registerRender(fil);
		registerRender(fib);
		registerRender(cream);
		registerRender(crushed_ice);
		registerRender(ice_crush);
		registerRender(vanilla);
		registerRender(vanilla_seeds);
		registerRender(chocolate);
		registerRender(vanilla_ice_cream);
		registerRender(chocolate_ice_cream);
		registerRender(cone);
		registerRender(vanilla_ice_cream_cone);
		registerRender(chocolate_ice_cream_cone);
		registerRender(waffle);
		registerRender(waffle_mix);
		registerRender(iron_multitool);
		registerRender(gold_multitool);
		registerRender(diamond_multitool);
		registerRender(emerald_multitool);
		registerRender(fire_multitool);
		registerRender(iron_scythe);
		registerRender(gold_scythe);
		registerRender(diamond_scythe);
		registerRender(emerald_scythe);
		registerRender(fire_scythe);
		registerRender(reinforced_iron_rod);
		registerRender(diamond_drill);
		registerRender(emerald_drill);
		registerRender(fire_drill);
		registerRender(aluminum_ingot);
		registerRender(cobalt_chunk);
		registerRender(titanium_ingot);
		registerRender(bullet_casing);
		registerRender(rpg);
		registerRender(missile);
		registerRender(rpgl);
		registerRender(rpgr);
		registerRender(hbs);
		registerRender(deagle);
		registerRender(deaglel);
		registerRender(boh);
		registerRender(boc);
		registerRender(bol);
		registerRender(bob);
		registerRender(grenade);
		registerRender(cowh);
		registerRender(cowc);
		registerRender(cowl);
		registerRender(cowb);
		registerRender(iwa);
		registerRender(gwa);
		registerRender(dwa);
		registerRender(ewa);
		registerRender(fwa);
		registerRender(cursed_cutlass);
		registerRender(crynyx_ingot);
		registerRender(cursed_gold_ingot);
		registerRender(mechasword_a);
		registerRender(pink_diamond);
		registerRender(radioactive_redstone_dust);
		registerRender(charged_diamond);
		registerRender(azurite_ingot);
		registerRender(tarnite_ingot);
		registerRender(prixium_shard);
		registerRender(plutonium_beam);
		registerRender(corceon_ingot);
		registerRender(miamium_beam);
		registerRender(corceon_sword);
		registerRender(corceon_shovel);
		registerRender(corceon_axe);
		registerRender(corceon_pickaxe);
		registerRender(corceon_hoe);
		registerRender(corbite_sword);
		registerRender(corbite_hoe);
		registerRender(corbite_axe);
		registerRender(corbite_pickaxe);
		registerRender(corbite_shovel);
		registerRender(corbite_ingot);
		registerRender(tarnite_sword);
		registerRender(tarnite_hoe);
		registerRender(tarnite_axe);
		registerRender(tarnite_pickaxe);
		registerRender(tarnite_shovel);
		registerRender(azurite_sword);
		registerRender(azurite_hoe);
		registerRender(azurite_axe);
		registerRender(azurite_pickaxe);
		registerRender(azurite_shovel);
		
	}
	
	

	

	public static void registerRender(Item item) {

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));

	}

}