package com.mineundermatter.survivalessentials.tileentity;

import javax.annotation.Nullable;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.fml.common.Optional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public class TileEntityCrynyxCraftingTable extends TileEntity {

private ItemStackHandler inventory = new ItemStackHandler(16);
	
	public TileEntityCrynyxCraftingTable() {
		super();
	}
	
	public boolean interact(EntityPlayer player) {
		return this.world.getTileEntity(pos) != this ? false : player.getDistanceSqToEntity(player) <= 64.0D;
	}
	
	public void save() {
		IBlockState state = this.world.getBlockState(this.pos);
		this.world.markBlockRangeForRenderUpdate(this.pos, this.pos);
		this.world.notifyBlockUpdate(pos, state, state, 3);
		this.markDirty();
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		this.inventory.deserializeNBT(compound.getCompoundTag("inventory"));
		super.readFromNBT(compound);
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) {
		compound.setTag("inventory", inventory.serializeNBT());
		return super.writeToNBT(compound);
	}
	
	@Override
	public NBTTagCompound getUpdateTag() {
		return this.writeToNBT(new NBTTagCompound());
	}
	
	@Override
	public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt) {
		this.readFromNBT(pkt.getNbtCompound());
	}
	
	@Override
	public SPacketUpdateTileEntity getUpdatePacket() {
		return new SPacketUpdateTileEntity(pos, 0, this.getUpdateTag());
	}
	
	
	
	public void setStackInSlot(int slot, @Nullable ItemStack stack) {
		inventory.setStackInSlot(slot, stack);
	}
	
	public ItemStack getStackInSlot(int slot) {
		return inventory.getStackInSlot(slot);
	}
	
}
