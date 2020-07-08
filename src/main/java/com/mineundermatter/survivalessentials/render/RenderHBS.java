
	
	package com.mineundermatter.survivalessentials.render;



	import org.lwjgl.opengl.GL11;

import com.mineundermatter.survivalessentials.client.Reference;
import com.mineundermatter.survivalessentials.entity.EntityHBS;
import com.mineundermatter.survivalessentials.entity.EntityMBS;
import com.mineundermatter.survivalessentials.model.ModelMBS;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHBS extends Render<EntityHBS>{

private static final ResourceLocation MBS = new ResourceLocation(Reference.MOD_ID + ":textures/entities/projectile/mbs.png");

private ModelMBS model = new ModelMBS();



public RenderHBS(RenderManager renderManager) {

	super(renderManager);

}



@Override

protected ResourceLocation getEntityTexture(EntityHBS entity) {

	return MBS;

}



@Override

public void doRender(EntityHBS entity, double x, double y, double z, float entityYaw, float partialTicks) {

	GL11.glPushMatrix();

	bindTexture(MBS);

	GL11.glTranslated(x, y, z);

	model.render(entity, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);

	GL11.glPopMatrix();

}




		    }



		




