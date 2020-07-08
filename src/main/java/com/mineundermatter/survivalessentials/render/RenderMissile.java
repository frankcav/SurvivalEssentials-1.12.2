
	
	package com.mineundermatter.survivalessentials.render;



	import org.lwjgl.opengl.GL11;

import com.mineundermatter.survivalessentials.client.Reference;
import com.mineundermatter.survivalessentials.entity.EntityMissile;
import com.mineundermatter.survivalessentials.model.ModelMissile;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMissile extends Render<EntityMissile>{

private static final ResourceLocation Missile = new ResourceLocation(Reference.MOD_ID + ":textures/entities/projectile/missile.png");

private ModelMissile model = new ModelMissile();



public RenderMissile(RenderManager renderManager) {

	super(renderManager);

}



@Override

protected ResourceLocation getEntityTexture(EntityMissile entity) {

	return Missile;

}



@Override

public void doRender(EntityMissile entity, double x, double y, double z, float entityYaw, float partialTicks) {

	GL11.glPushMatrix();

	bindTexture(Missile);

	GL11.glTranslated(x, y, z);

	model.render(entity, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);

	GL11.glPopMatrix();

}




		    }



		




