package com.mineundermatter.survivalessentials.render;

import com.mineundermatter.survivalessentials.entity.EntityHBS;
import com.mineundermatter.survivalessentials.entity.EntityM16er;
import com.mineundermatter.survivalessentials.entity.EntityMBS;
import com.mineundermatter.survivalessentials.entity.EntityMissile;
import com.mineundermatter.survivalessentials.model.ModelM16er;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderingRegistry {

	public static void registerEntityRenders() {

		net.minecraftforge.fml.client.registry.RenderingRegistry.registerEntityRenderingHandler(EntityMBS.class, new IRenderFactory<EntityMBS>() {



			@Override

			public Render<? super EntityMBS> createRenderFor(RenderManager manager) {

				return new RenderMBS(manager);

			}

		});
		
		net.minecraftforge.fml.client.registry.RenderingRegistry.registerEntityRenderingHandler(EntityMissile.class, new IRenderFactory<EntityMissile>() {



			@Override

			public Render<? super EntityMissile> createRenderFor(RenderManager manager) {

				return new RenderMissile(manager);

			}

		});
		
		net.minecraftforge.fml.client.registry.RenderingRegistry.registerEntityRenderingHandler(EntityHBS.class, new IRenderFactory<EntityHBS>() {



			@Override

			public Render<? super EntityHBS> createRenderFor(RenderManager manager) {

				return new RenderHBS(manager);

			}

		});
		
		

		

	}
	
	
}


