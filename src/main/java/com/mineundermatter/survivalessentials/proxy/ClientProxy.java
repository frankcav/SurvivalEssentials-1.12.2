package com.mineundermatter.survivalessentials.proxy;

import com.mineundermatter.survivalessentials.entity.EntityGrenade;
import com.mineundermatter.survivalessentials.entity.EntityHBS;
import com.mineundermatter.survivalessentials.entity.EntityMBS;
import com.mineundermatter.survivalessentials.entity.EntityMissile;
import com.mineundermatter.survivalessentials.init.EssentialBlocks;
import com.mineundermatter.survivalessentials.init.EssentialItems;
import com.mineundermatter.survivalessentials.render.RenderGrenade;
import com.mineundermatter.survivalessentials.render.RenderHBS;
import com.mineundermatter.survivalessentials.render.RenderMBS;
import com.mineundermatter.survivalessentials.render.RenderMissile;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy	{
	
	@Override

	public void register() {

		

		EssentialItems.registerRenders();
		EssentialBlocks.registerRenders();
		
		

	
	
		RenderingRegistry.registerEntityRenderingHandler(EntityMBS.class, new RenderMBS(Minecraft.getMinecraft().getRenderManager()));
		RenderingRegistry.registerEntityRenderingHandler(EntityMissile.class, new RenderMissile(Minecraft.getMinecraft().getRenderManager()));
		RenderingRegistry.registerEntityRenderingHandler(EntityHBS.class, new RenderHBS(Minecraft.getMinecraft().getRenderManager()));
		RenderingRegistry.registerEntityRenderingHandler(EntityGrenade.class, new RenderGrenade(Minecraft.getMinecraft().getRenderManager()));
		
}
}
