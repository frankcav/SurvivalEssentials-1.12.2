package com.mineundermatter.survivalessentials.util;

import javax.annotation.Nullable;

import com.mineundermatter.survivalessentials.entity.EntityMBS;

import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;

public class EssentialDamageSource {
	


	 public static DamageSource causeBulletDamage(EntityMBS arrow, @Nullable Entity indirectEntityIn)
	    {
	        return (new EntityDamageSourceIndirect("mbs", arrow, indirectEntityIn)).setProjectile();
	    }

}
