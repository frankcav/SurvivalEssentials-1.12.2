package com.mineundermatter.survivalessentials.entity;



import net.minecraft.entity.EntityLivingBase;

import net.minecraft.entity.player.EntityPlayer;

import net.minecraft.entity.projectile.EntityThrowable;

import net.minecraft.util.DamageSource;

import net.minecraft.util.datafix.DataFixer;

import net.minecraft.util.math.RayTraceResult;

import net.minecraft.world.World;

import net.minecraftforge.fml.relauncher.Side;

import net.minecraftforge.fml.relauncher.SideOnly;



public class EntityGrenade extends EntityThrowable {

	

	public EntityGrenade(World worldIn) {

		super(worldIn);

	}

	

	public EntityGrenade(World worldIn, EntityLivingBase throwerIn) {

		super(worldIn, throwerIn);

	}

	

	@SideOnly(Side.CLIENT)

	public EntityGrenade(World worldIn, double x, double y, double z) {

		super(worldIn, x, y, z);

	}

	

	public static void registerFixesRock(DataFixer fixer) {

		EntityThrowable.registerFixesThrowable(fixer, "ThrownGrenade");

	}



	@Override

	protected void onImpact(RayTraceResult result) {

		EntityLivingBase thrower = this.getThrower();

		

		if(result.entityHit != null)

			result.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, thrower), 3.0f);

	}

	

	@Override

	public void onUpdate() {

		EntityLivingBase thrower = this.getThrower();

		

		if(thrower != null && thrower instanceof EntityPlayer && !thrower.isEntityAlive())

			
		 this.world.createExplosion(this, this.posX, this.posY + (double)(this.height / 16.0F), this.posZ, 4.0F, true); //4.0F is explosive power

		else

			super.onUpdate();

	}

}