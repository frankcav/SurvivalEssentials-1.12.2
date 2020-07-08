package com.mineundermatter.survivalessentials.render;



import org.lwjgl.opengl.GL11;

import com.mineundermatter.survivalessentials.client.Reference;
import com.mineundermatter.survivalessentials.entity.EntityGrenade;
import com.mineundermatter.survivalessentials.model.ModelGrenade;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;



public class RenderGrenade extends Render<EntityGrenade>{

	

	private static final ResourceLocation ROCK = new ResourceLocation(Reference.MOD_ID + ":textures/entity/grenade.png");

	private ModelGrenade model = new ModelGrenade();

	

	public RenderGrenade(RenderManager renderManager) {

		super(renderManager);

	}



	@Override

	protected ResourceLocation getEntityTexture(EntityGrenade entity) {

		return ROCK;

	}

	

	@Override

	public void doRender(EntityGrenade entity, double x, double y, double z, float entityYaw, float partialTicks) {

		GL11.glPushMatrix();

		bindTexture(ROCK);

		GL11.glTranslated(x, y, z);

		model.render(entity, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);

		GL11.glPopMatrix();

	}

}