package com.mineundermatter.survivalessentials.item;



import com.mineundermatter.survivalessentials.client.SurvivalEssentials;
import com.mineundermatter.survivalessentials.entity.EntityGrenade;
import com.mineundermatter.survivalessentials.init.EssentialBlocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;



public class ItemGrenade extends Item {

	

	public ItemGrenade() {

		this.setUnlocalizedName("grenade");

		this.setRegistryName("grenade");

		this.setCreativeTab(SurvivalEssentials.creativeTab);

	}

	

	@Override

	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {

		ItemStack stack = playerIn.getHeldItem(handIn);

		

		if(!playerIn.capabilities.isCreativeMode)

			stack.shrink(1);

		

		worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.BLOCK_ANVIL_FALL, SoundCategory.NEUTRAL, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

		playerIn.getCooldownTracker().setCooldown(this, 10);

		

		if(!worldIn.isRemote) {

			EntityGrenade rock = new EntityGrenade(worldIn, playerIn);

			rock.setHeadingFromThrower(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0f, 1.5f, 1.0f);

			worldIn.spawnEntity(rock);

		}

		

		playerIn.addStat(StatList.getObjectUseStats(this));

		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, stack);

	}

	

	@Override

	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

		if(!worldIn.isRemote) {

			if(worldIn.getBlockState(pos.up()).equals(Blocks.AIR.getDefaultState())) {

				worldIn.setBlockState(pos.up(), EssentialBlocks.titanium_ore.getDefaultState());

				return EnumActionResult.SUCCESS;

			}

			player.sendMessage(new TextComponentString(TextFormatting.RED + "There is not enough space to spawn the block!"));

		}

		return EnumActionResult.PASS;

	}
}
