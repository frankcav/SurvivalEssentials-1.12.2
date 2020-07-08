package com.mineundermatter.survivalessentials.entity;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.common.DungeonHooks;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.world.BossInfoServer;
import net.minecraft.world.BossInfo;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.EnumHand;
import net.minecraft.util.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.init.SoundEvents;
import net.minecraft.init.Items;
import net.minecraft.entity.projectile.EntityTippedArrow;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAIAttackRanged;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.Minecraft;

import java.util.Random;

import com.mineundermatter.survivalessentials.init.EssentialItems;

import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class EntityM16er {

	public int mobid = -2;
	public static Object instance;

	public void load(FMLInitializationEvent event) {
	}

	public void generateNether(World world, Random random, int chunkX, int chunkZ) {
	}

	public void generateSurface(World world, Random random, int chunkX, int chunkZ) {
	}

	public int addFuel(ItemStack fuel) {
		return 0;
	}

	@SideOnly(Side.CLIENT)
	public void registerRenderers() {
		RenderBiped customRender = new RenderBiped(Minecraft.getMinecraft().getRenderManager(), new ModelBiped(), 0) {
			protected ResourceLocation getEntityTexture(Entity par1Entity) {
				return new ResourceLocation("m16er.png");
			}
		};
		customRender.addLayer(new net.minecraft.client.renderer.entity.layers.LayerHeldItem(customRender));
		customRender.addLayer(new net.minecraft.client.renderer.entity.layers.LayerBipedArmor(customRender) {
			protected void initArmor() {
				this.modelLeggings = new ModelBiped();
				this.modelArmor = new ModelBiped();
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityM16er.Entitybomber.class, customRender);
		RenderingRegistry.registerEntityRenderingHandler(EntityArrowCustom.class, new RenderSnowball(Minecraft.getMinecraft().getRenderManager(),
				new ItemStack(Items.ARROW).getItem(), Minecraft.getMinecraft().getRenderItem()));

	}

	public void serverLoad(FMLServerStartingEvent event) {
	}

	public void preInit(FMLPreInitializationEvent event) {
		EntityRegistry.registerModEntity(new ResourceLocation("testenvironmentmod:bomber"), EntityM16er.Entitybomber.class, "bomber", mobid,
				instance, 64, 1, true, (255 << 16) + (255 << 8) + 255, (255 << 16) + (255 << 8) + 255);

		EntityRegistry.addSpawn(EntityM16er.Entitybomber.class, 20, 5, 30, EnumCreatureType.MONSTER,
				new Biome[]{Biome.REGISTRY.getObject(new ResourceLocation("extreme_hills")),});
		DungeonHooks.addDungeonMob(new ResourceLocation("testenvironmentmod:bomber"), 180);

		EntityRegistry.registerModEntity(new ResourceLocation("testenvironmentmod:entitybulletbomber"), EntityArrowCustom.class,
				"entitybulletbomber", 3, instance, 64, 1, true);

	}

	public static Biome[] allbiomes(net.minecraft.util.registry.RegistryNamespaced<ResourceLocation, Biome> in) {
		Iterator<Biome> itr = in.iterator();
		ArrayList<Biome> ls = new ArrayList<Biome>();
		while (itr.hasNext()) {
			ls.add(itr.next());
		}
		return ls.toArray(new Biome[ls.size()]);
	}

	public static class EntityArrowCustom extends EntityTippedArrow {
		public EntityArrowCustom(World a) {
			super(a);
		}

		public EntityArrowCustom(World worldIn, double x, double y, double z) {
			super(worldIn, x, y, z);
		}

		public EntityArrowCustom(World worldIn, EntityLivingBase shooter) {
			super(worldIn, shooter);
		}

		public void shoot(double d1, double d, double d3, float f, float g) {
			
			
		}
	}

	public static class Entitybomber extends EntityMob implements IRangedAttackMob {
		World world = null;

		public Entitybomber(World var1) {
			super(var1);
			world = var1;
			experienceValue = 5;
			this.isImmuneToFire = true;
			addRandomArmor();
			setNoAI(!true);
			this.tasks.addTask(0, new EntityAISwimming(this));
			this.tasks.addTask(6, new EntityAIWander(this, 1.0D));
			this.tasks.addTask(8, new EntityAILookIdle(this));
			this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntitySnowman.class, true));
			this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
			this.tasks.addTask(1, new EntityAIAttackRanged(this, 1.25D, 20, 10.0F));

		}

		protected void applyEntityAttributes() {
			super.applyEntityAttributes();
			this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
			this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20D);
			if (this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(5D);
		}

		protected void addRandomArmor() {

			this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, new ItemStack(EssentialItems.m16));
		}

		@Override
		public boolean isNonBoss() {
			return false;
		}

		private final BossInfoServer bossInfo = (BossInfoServer) (new BossInfoServer(this.getDisplayName(), BossInfo.Color.PURPLE,
				BossInfo.Overlay.PROGRESS));

		@Override
		public void addTrackingPlayer(EntityPlayerMP player) {
			super.addTrackingPlayer(player);
			this.bossInfo.addPlayer(player);
		}

		@Override
		public void removeTrackingPlayer(EntityPlayerMP player) {
			super.removeTrackingPlayer(player);
			this.bossInfo.removePlayer(player);
		}

		@Override
		public void onUpdate() {
			super.onUpdate();
			this.bossInfo.setPercent(this.getHealth() / this.getMaxHealth());
		}

		public void onLivingUpdate() {

			super.onLivingUpdate();
			World par1World = this.world;
			int par2 = (int) this.posX;
			int par3 = (int) this.posY;
			int par4 = (int) this.posZ;
			Random par5Random = this.rand;
			if (true)
				for (int l = 0; l < 4; ++l) {
					double d0 = (double) ((float) par2 + par5Random.nextFloat());
					double d1 = (double) ((float) par3 + par5Random.nextFloat());
					double d2 = (double) ((float) par4 + par5Random.nextFloat());
					double d3 = 0.0D;
					double d4 = 0.0D;
					double d5 = 0.0D;
					int i1 = par5Random.nextInt(2) * 2 - 1;
					d3 = ((double) par5Random.nextFloat() - 0.5D) * 0.5D;
					d4 = ((double) par5Random.nextFloat() - 0.5D) * 0.5D;
					d5 = ((double) par5Random.nextFloat() - 0.5D) * 0.5D;
					par1World.spawnParticle(EnumParticleTypes.WATER_BUBBLE, d0, d1, d2, d3, d4, d5);
				}
		}

		@Override
		public void setSwingingArms(boolean swingingArms) {
		}

		public void attackEntityWithRangedAttack(EntityLivingBase target, float flval) {
			EntityArrowCustom entityarrow = new EntityArrowCustom(this.world, this);
			double d0 = target.posY + (double) target.getEyeHeight() - 1.1;
			double d1 = target.posX - this.posX;
			double d2 = d0 - entityarrow.posY;
			double d3 = target.posZ - this.posZ;
			float f = MathHelper.sqrt(d1 * d1 + d3 * d3) * 0.2F;
			entityarrow.shoot(d1, d2 + (double) f, d3, 1.6F, 12.0F);
			this.world.spawnEntity(entityarrow);
		}

		@Override
		protected Item getDropItem() {
			return null;
		}

		@Override
		protected net.minecraft.util.SoundEvent getAmbientSound() {
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
		}

		@Override
		protected net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("game.neutral.hurt"));
		}

		@Override
		protected net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("game.neutral.die"));
		}

		@Override
		public void onStruckByLightning(EntityLightningBolt entityLightningBolt) {
			super.onStruckByLightning(entityLightningBolt);
			int i = (int) this.posX;
			int j = (int) this.posY;
			int k = (int) this.posZ;
			Entity entity = this;

		}

		@Override
		public void fall(float l, float d) {
			super.fall(l, d);
			int i = (int) this.posX;
			int j = (int) this.posY;
			int k = (int) this.posZ;
			super.fall(l, d);
			Entity entity = this;

		}

		@Override
		public void onDeath(DamageSource source) {
			super.onDeath(source);
			int i = (int) this.posX;
			int j = (int) this.posY;
			int k = (int) this.posZ;
			Entity entity = this;

			if (true) {
				EntityTippedArrow entityarrow = new EntityTippedArrow(world, (EntityLivingBase) entity);
				entityarrow.setVelocity(.5 * 2.0F, .5 * 2.0F, .5 * 2.0F);
				entityarrow.setDamage(.5 * 2.0F);
				entityarrow.setKnockbackStrength(1);
				world.playSound((EntityPlayer) null, entity.posX, entity.posY, entity.posZ, SoundEvents.ENTITY_ARROW_SHOOT, SoundCategory.NEUTRAL,
						1.0F, 1.0F);
				if (!world.isRemote)
					world.spawnEntity(entityarrow);
			}

		}

		@Override
		public boolean processInteract(EntityPlayer entity, EnumHand hand) {
			super.processInteract(entity, hand);
			int i = (int) this.posX;
			int j = (int) this.posY;
			int k = (int) this.posZ;

			return true;
		}

		@Override
		protected float getSoundVolume() {
			return 1.0F;
		}

	}

}
