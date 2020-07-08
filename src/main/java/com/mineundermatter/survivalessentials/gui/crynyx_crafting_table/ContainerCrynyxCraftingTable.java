package com.mineundermatter.survivalessentials.gui.crynyx_crafting_table;

import com.mineundermatter.survivalessentials.tileentity.TileEntityCrynyxCraftingTable;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCraftResult;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ContainerCrynyxCraftingTable extends Container {

	public InventoryCrafting craftMatrix = new InventoryCrafting(this, 4, 4);
	public InventoryCraftResult craftResult = new InventoryCraftResult();
	private final TileEntityCrynyxCraftingTable table;
	private final EntityPlayer player;
	
	public ContainerCrynyxCraftingTable(InventoryPlayer player, TileEntityCrynyxCraftingTable table) {
		this.table = table;
		this.player = player.player;
		this.addSlotToContainer(new SlotCrafting(this.player, this.craftMatrix, this.craftResult, 0, 141, 47));
		
		for(int y = 0; y < 4; ++y)
			for(int x = 0; x < 4; ++x)
				this.addSlotToContainer(new Slot(this.craftMatrix, x + y * 4, 11 + x * 18, 11 + y * 18));
		
		for(int y = 0; y < 3; ++y)
			for(int x = 0; x < 9; ++x)
				this.addSlotToContainer(new Slot(player, 9 + x + y * 9, 14 + x * 18, 124 + y * 18));
		
		for(int x = 0; x < 9; ++x)
			this.addSlotToContainer(new Slot(player, x, 14 + x * 18, 182));
		
		updateMatrix();
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer playerIn) {
		return table.interact(playerIn);
	}
	
	@Override
	public boolean canMergeSlot(ItemStack stack, Slot slotIn) {
		return slotIn.inventory != this.craftResult && super.canMergeSlot(stack, slotIn);
	}
	
	@Override
	public void onCraftMatrixChanged(IInventory inventoryIn) {
		this.slotChangedCraftingGrid(table.getWorld(), player, craftMatrix, craftResult);
		super.onCraftMatrixChanged(inventoryIn);
	}
	
	@Override
	public void onContainerClosed(EntityPlayer playerIn) {
		super.onContainerClosed(playerIn);
		saveMatrix();
	}
	
	private void updateMatrix() {
		for(int i = 0; i < craftMatrix.getSizeInventory(); i++)
			craftMatrix.setInventorySlotContents(i, table.getStackInSlot(i));
	}
	
	private void saveMatrix() {
		for(int i = 0; i < craftMatrix.getSizeInventory(); i++)
			table.setStackInSlot(i, craftMatrix.getStackInSlot(i));
		table.markDirty();
	}
	
	@Override
	public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {
	      ItemStack itemstack = ItemStack.EMPTY;
	      Slot slot = this.inventorySlots.get(index);
	      if (slot != null && slot.getHasStack()) {
	         ItemStack itemstack1 = slot.getStack();
	         itemstack = itemstack1.copy();
	         if (index == 0) {
	            itemstack1.getItem().onCreated(itemstack1, table.getWorld(), playerIn);
	            if (!this.mergeItemStack(itemstack1, 26, 62, true)) {
	               return ItemStack.EMPTY;
	            }

	            slot.onSlotChange(itemstack1, itemstack);
	         } else if (index >= 26 && index < 53) {
	            if (!this.mergeItemStack(itemstack1, 53, 62, false)) {
	               return ItemStack.EMPTY;
	            }
	         } else if (index >= 53 && index < 62) {
	            if (!this.mergeItemStack(itemstack1, 26, 53, false)) {
	               return ItemStack.EMPTY;
	            }
	         } else if (!this.mergeItemStack(itemstack1, 26, 62, false)) {
	            return ItemStack.EMPTY;
	         }

	         if (itemstack1.isEmpty()) {
	            slot.putStack(ItemStack.EMPTY);
	         } else {
	            slot.onSlotChanged();
	         }

	         if (itemstack1.getCount() == itemstack.getCount()) {
	            return ItemStack.EMPTY;
	         }

	         ItemStack itemstack2 = slot.onTake(playerIn, itemstack1);
	         if (index == 0) {
	            playerIn.dropItem(itemstack2, false);
	         }
	      }

	      return itemstack;
	   }

}
