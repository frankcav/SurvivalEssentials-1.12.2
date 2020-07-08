package com.mineundermatter.survivalessentials.gui;

import com.mineundermatter.survivalessentials.gui.crynyx_crafting_table.ContainerCrynyxCraftingTable;
import com.mineundermatter.survivalessentials.gui.crynyx_crafting_table.GuiCrynyxCraftingTable;
import com.mineundermatter.survivalessentials.gui.icecreammaker.ContainerIceCreamMaker;
import com.mineundermatter.survivalessentials.gui.icecreammaker.GuiIceCreamMaker;
import com.mineundermatter.survivalessentials.gui.titanium_forge.ContainerTitaniumForge;
import com.mineundermatter.survivalessentials.gui.titanium_forge.GuiTitaniumForge;
import com.mineundermatter.survivalessentials.gui.wafflemaker.ContainerWaffleMaker;
import com.mineundermatter.survivalessentials.gui.wafflemaker.GuiWaffleMaker;
import com.mineundermatter.survivalessentials.tileentity.TileEntityCrynyxCraftingTable;
import com.mineundermatter.survivalessentials.tileentity.TileEntityIceCreamMaker;
import com.mineundermatter.survivalessentials.tileentity.TileEntityTitaniumForge;
import com.mineundermatter.survivalessentials.tileentity.TileEntityWaffleMaker;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
	
	public static final int ICE_CREAM_MAKER_GUI = 0;	
	public static final int WAFFLE_MAKER_GUI = 1;
	public static final int TITANIUM_FORGE_GUI = 2;
	public static final int CRYNYX_CRAFTING_TABLE_GUI = 3;
	

	@Override

	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

		if(ID == WAFFLE_MAKER_GUI)

			return new ContainerWaffleMaker(player.inventory, ((TileEntityWaffleMaker)world.getTileEntity(new BlockPos(x, y, z))));
		
		if(ID == ICE_CREAM_MAKER_GUI)
			
			return new ContainerIceCreamMaker(player.inventory, ((TileEntityIceCreamMaker)world.getTileEntity(new BlockPos(x, y, z))));
		
		if(ID == TITANIUM_FORGE_GUI)
			
			return new ContainerTitaniumForge(player.inventory, ((TileEntityTitaniumForge)world.getTileEntity(new BlockPos(x, y, z))));
		
		if(ID == CRYNYX_CRAFTING_TABLE_GUI)
			
			return new ContainerCrynyxCraftingTable(player.inventory, ((TileEntityCrynyxCraftingTable)world.getTileEntity(new BlockPos(x,y,z))));

		return null;

	}

	

	@Override

	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

		if(ID == WAFFLE_MAKER_GUI)

			return new GuiWaffleMaker(player.inventory, ((TileEntityWaffleMaker)world.getTileEntity(new BlockPos(x, y, z))));

		if(ID == ICE_CREAM_MAKER_GUI)
			
			return new GuiIceCreamMaker(player.inventory, ((TileEntityIceCreamMaker)world.getTileEntity(new BlockPos(x, y, z))));
		
		if(ID == TITANIUM_FORGE_GUI)
			
			return new GuiTitaniumForge(player.inventory, ((TileEntityTitaniumForge)world.getTileEntity(new BlockPos(x, y, z))));
		
		if(ID == CRYNYX_CRAFTING_TABLE_GUI)
			
			return new GuiCrynyxCraftingTable(player.inventory, ((TileEntityCrynyxCraftingTable)world.getTileEntity(new BlockPos(x,y,x))));
		
		return null;

	}
	

}
