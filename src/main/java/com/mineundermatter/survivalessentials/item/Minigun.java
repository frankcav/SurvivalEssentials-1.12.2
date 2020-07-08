package com.mineundermatter.survivalessentials.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import net.minecraft.world.World;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ActionResult;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.EnumAction;
import net.minecraft.init.Items;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Blocks;
import net.minecraft.entity.projectile.EntityTippedArrow;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.Minecraft;
import net.minecraft.block.Block;

import java.util.Random;

public class Minigun {

	public Minigun() {
	}

	public static Item block;
	public static Object instance;

	public void load(FMLInitializationEvent event) {
		if (event.getSide() == Side.CLIENT) {
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(block, 0, new ModelResourceLocation("testenvironmentmod:pistol", "inventory"));
		}

	}

	@SideOnly(Side.CLIENT)
	public void registerRenderers() {
		RenderingRegistry.registerEntityRenderingHandler(EntityArrowCustom.class, new RenderSnowball(Minecraft.getMinecraft().getRenderManager(),
				new ItemStack(Blocks.MAGMA).getItem(), Minecraft.getMinecraft().getRenderItem()));
	}

	public void generateNether(World world, Random random, int chunkX, int chunkZ) {
	}

	public void generateSurface(World world, Random random, int chunkX, int chunkZ) {
	}

	public int addFuel(ItemStack fuel) {
		return 0;
	}

	public void serverLoad(FMLServerStartingEvent event) {
	}

	public void preInit(FMLPreInitializationEvent event) {
		EntityRegistry.registerModEntity(new ResourceLocation("testenvironmentmod:entitybulletpistol"), EntityArrowCustom.class,
				"testenvironmentmod:entitybulletpistol", 1, instance, 64, 1, true);
		ForgeRegistries.ITEMS.register(block);
	}

	static {
		block = (new ItemgGUN());
	}

	static class ItemgGUN extends Item {

		public ItemgGUN() {
			super();
			setMaxDamage(100);
			maxStackSize = 1;
			setFull3D();
			setUnlocalizedName("pistol");
			setRegistryName("pistol");
			setCreativeTab(CreativeTabs.COMBAT);
		}

		boolean active = false;

		@Override
		public int getMaxItemUseDuration(ItemStack par1ItemStack) {
			return 72000;
		}

		@Override
		public ActionResult<ItemStack> onItemRightClick(World par2World, EntityPlayer par3EntityPlayer, EnumHand hand) {
			ActionResult<ItemStack> ar = super.onItemRightClick(par2World, par3EntityPlayer, hand);
			par3EntityPlayer.setActiveHand(hand);
			active = true;
			return ar;
		}

		@Override
		public void onPlayerStoppedUsing(ItemStack stack, World worldIn, EntityLivingBase entityLiving, int timeLeft) {
			super.onPlayerStoppedUsing(stack, worldIn, entityLiving, timeLeft);
			active = false;
		}

		@Override
		public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3EntityPlayer2, int itemSlot, boolean isSelected) {

			final EntityPlayer par3EntityPlayer = (EntityPlayer) par3EntityPlayer2;

			boolean flag = par3EntityPlayer.capabilities.isCreativeMode
					|| EnchantmentHelper.getEnchantmentLevel(Enchantments.INFINITY, par1ItemStack) > 0;
			if (active && (flag || par3EntityPlayer.inventory.hasItemStack(new ItemStack(Items.ARROW)))
					&& (par3EntityPlayer.inventory.getCurrentItem() != null && par3EntityPlayer.inventory.getCurrentItem().getItem() == block)) {
				float f = 2.5F;

				EntityArrowCustom entityarrow = new EntityArrowCustom(par2World, par3EntityPlayer);

				entityarrow.shoot(par3EntityPlayer.getLookVec().x, par3EntityPlayer.getLookVec().y, par3EntityPlayer.getLookVec().z, f * 2.0F, 0);
				entityarrow.setIsCritical(true);
				entityarrow.setDamage(7.0);
				entityarrow.setKnockbackStrength(15);

				if (true) {
					entityarrow.setFire(100);
				}

				par1ItemStack.damageItem(1, par3EntityPlayer);
				int i = (int) par3EntityPlayer.posX;
				int j = (int) par3EntityPlayer.posY;
				int k = (int) par3EntityPlayer.posZ;
				par2World.playSound((EntityPlayer) null, (double) i + 0.5D, (double) j + 0.5D, (double) k + 0.5D,
						(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
								.getObject(new ResourceLocation(("entity.arrow.shoot"))), SoundCategory.NEUTRAL, 1.0F, 1.0F
								/ (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

				if (flag) {
					entityarrow.pickupStatus = EntityArrow.PickupStatus.CREATIVE_ONLY;
				} else {
					par3EntityPlayer.inventory.clearMatchingItems(new ItemStack(Items.ARROW).getItem(), -1, 1, null);
				}

				if (!par2World.isRemote) {
					par2World.spawnEntity(entityarrow);
				}
				World world = par2World;
				EntityPlayer entity = par3EntityPlayer;

			}

		}

		public Block getBlock(World par1World, int i, int j, int k) {
			return par1World.getBlockState(new BlockPos(i, j, k)).getBlock();
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.BOW;
		}

	}

	public static class EntityArrowCustom extends EntityTippedArrow {
		public EntityArrowCustom(World a) {
			super(a);
		}

		public void shoot(double x, double y, double z, float f, int i) {
			
			
		}

		public EntityArrowCustom(World worldIn, double x, double y, double z) {
			super(worldIn, x, y, z);
		}

		public EntityArrowCustom(World worldIn, EntityLivingBase shooter) {
			super(worldIn, shooter);
		}

		@Override
		public void onCollideWithPlayer(EntityPlayer entity) {
			super.onCollideWithPlayer(entity);
			int i = MathHelper.floor(this.getEntityBoundingBox().minX + 0.001D);
			int j = MathHelper.floor(this.getEntityBoundingBox().minY + 0.001D);
			int k = MathHelper.floor(this.getEntityBoundingBox().minZ + 0.001D);
			World world = this.world;

		}

		@Override
		public void onUpdate() {
			super.onUpdate();
			int i = MathHelper.floor(this.getEntityBoundingBox().minX + 0.001D);
			int j = MathHelper.floor(this.getEntityBoundingBox().minY + 0.001D);
			int k = MathHelper.floor(this.getEntityBoundingBox().minZ + 0.001D);
			World world = this.world;
			Entity entity = (Entity) shootingEntity;

			if (getBlock(this.world, i, j, k) != Blocks.AIR || getBlock(this.world, i, j - 1, k) != Blocks.AIR
					|| getBlock(this.world, i, j + 1, k) != Blocks.AIR || getBlock(this.world, i + 1, j, k) != Blocks.AIR
					|| getBlock(this.world, i - 1, j, k) != Blocks.AIR || getBlock(this.world, i, j, k + 1) != Blocks.AIR
					|| getBlock(this.world, i, j, k - 1) != Blocks.AIR) {

				this.world.removeEntity(this);
			}

		}

		public Block getBlock(World par1World, int i, int j, int k) {
			return par1World.getBlockState(new BlockPos(i, j, k)).getBlock();
		}

	}

}
