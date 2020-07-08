package com.mineundermatter.survivalessentials.slot;

import com.mineundermatter.survivalessentials.tileentity.TileEntityIceCreamMaker;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotIceCreamMakerFuel extends Slot {

	public SlotIceCreamMakerFuel(IInventory inventoryIn, int index, int xPosition, int yPosition) {
		super(inventoryIn, index, xPosition, yPosition);
		
	}
	
	@Override

	public boolean isItemValid(ItemStack stack) {

		return TileEntityIceCreamMaker.isItemFuel(stack);

	}

	

	@Override

	public int getItemStackLimit(ItemStack stack) {

		return super.getItemStackLimit(stack);

	}

}
