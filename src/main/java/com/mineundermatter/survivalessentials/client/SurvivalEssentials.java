package com.mineundermatter.survivalessentials.client;

import com.google.gson.JsonObject;
import com.mineundermatter.survivalessentials.entity.EntityRegistry;
import com.mineundermatter.survivalessentials.gui.GuiHandler;
import com.mineundermatter.survivalessentials.init.EssentialBlocks;
import com.mineundermatter.survivalessentials.init.EssentialItems;
import com.mineundermatter.survivalessentials.init.EssentialTab;
import com.mineundermatter.survivalessentials.proxy.CommonProxy;
import com.mineundermatter.survivalessentials.render.RenderingRegistry;
import com.mineundermatter.survivalessentials.world.EssentialWorldGenerator;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.IRecipeFactory;
import net.minecraftforge.common.crafting.JsonContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class SurvivalEssentials {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	public static boolean activateShowAges;
	public static final EssentialTab creativeTab = new EssentialTab();
	
	
	@Instance(Reference.MOD_ID)
	public static SurvivalEssentials modInstance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		EssentialBlocks.init();
		EssentialBlocks.register();
		EssentialItems.init();
		EssentialItems.register();
		RenderingRegistry.registerEntityRenders();
		
		
		
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
	    config.load();
	    
	    activateShowAges = config.get("GENERAL", "Show the age under the item name", true, "[true/false]").getBoolean();
		
		OreDictionary.registerOre("ice_crush", new ItemStack(EssentialItems.ice_crush, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("vanilla_ice_cream", new ItemStack(EssentialItems.vanilla_ice_cream, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("chocolate_ice_cream", new ItemStack(EssentialItems.chocolate_ice_cream, 1, OreDictionary.WILDCARD_VALUE));
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		proxy.register();
		GameRegistry.registerWorldGenerator(new EssentialWorldGenerator(), 0);
		EntityRegistry.registerEntities();
		GameRegistry.addSmelting(EssentialBlocks.fire_iron_ore, new ItemStack (EssentialItems.fire_iron), 50.0F);
		GameRegistry.addSmelting(EssentialBlocks.euronium_ore, new ItemStack (EssentialItems.euronium_chunk), 50.0F);
		GameRegistry.addSmelting(EssentialBlocks.aluminum_ore, new ItemStack (EssentialItems.aluminum_ingot), 20.0F);
		GameRegistry.addSmelting(EssentialBlocks.cobalt_ore, new ItemStack (EssentialItems.cobalt_chunk), 75.0F);
		GameRegistry.addSmelting(EssentialBlocks.titanium_ore, new ItemStack (EssentialItems.titanium_ingot), 75.0F);
		GameRegistry.addSmelting(EssentialBlocks.crynyx_ore, new ItemStack(EssentialItems.crynyx_ingot), 60.0F);
		GameRegistry.addSmelting(EssentialBlocks.cursedgold_ore, new ItemStack(EssentialItems.cursed_gold_ingot), 80.0F);
		GameRegistry.addSmelting(EssentialBlocks.corceon_ore, new ItemStack(EssentialItems.corceon_ingot), 5.0f);
		GameRegistry.addSmelting(EssentialBlocks.plutonium_ore, new ItemStack(EssentialItems.plutonium_beam), 25.0f);
		GameRegistry.addSmelting(EssentialBlocks.corbite_ore, new ItemStack(EssentialItems.corbite_ingot), 6.0F);
		
		NetworkRegistry.INSTANCE.registerGuiHandler(Reference.MOD_ID, new GuiHandler());
		
		CraftingHelper.register(new ResourceLocation(Reference.MOD_ID + ":iron_multitool.json"), new IRecipeFactory() {

			@Override
			public IRecipe parse(JsonContext context, JsonObject json) {
				
				return CraftingHelper.getRecipe(json, context);
			}
			
		});
		CraftingHelper.register(new ResourceLocation(Reference.MOD_ID + ":emerald_multitool.json"), new IRecipeFactory() {

			@Override
			public IRecipe parse(JsonContext context, JsonObject json) {
				
				return CraftingHelper.getRecipe(json, context);
			}
			
		});
		CraftingHelper.register(new ResourceLocation(Reference.MOD_ID + ":fire_multitool.json"), new IRecipeFactory() {

			@Override
			public IRecipe parse(JsonContext context, JsonObject json) {
				
				return CraftingHelper.getRecipe(json, context);
			}
			
		});
		CraftingHelper.register(new ResourceLocation(Reference.MOD_ID + ":diamond_multitool.json"), new IRecipeFactory() {

			@Override
			public IRecipe parse(JsonContext context, JsonObject json) {
				
				return CraftingHelper.getRecipe(json, context);
			}
			
		});
		CraftingHelper.register(new ResourceLocation(Reference.MOD_ID + ":gold_multitool.json"), new IRecipeFactory() {

			@Override
			public IRecipe parse(JsonContext context, JsonObject json) {
				
				return CraftingHelper.getRecipe(json, context);
			}
			
		});
		
		
	}
	
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	@EventHandler
	public void serverLoad(FMLServerStartingEvent event) {
		
	}
	
	




}
