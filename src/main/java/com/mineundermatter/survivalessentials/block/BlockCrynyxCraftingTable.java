package com.mineundermatter.survivalessentials.block;

import java.util.Random;

import com.mineundermatter.survivalessentials.client.Reference;
import com.mineundermatter.survivalessentials.client.SurvivalEssentials;
import com.mineundermatter.survivalessentials.gui.GuiHandler;
import com.mineundermatter.survivalessentials.gui.crynyx_crafting_table.ContainerCrynyxCraftingTable;
import com.mineundermatter.survivalessentials.init.EssentialBlocks;
import com.mineundermatter.survivalessentials.tileentity.TileEntityCrynyxCraftingTable;
import com.mineundermatter.survivalessentials.tileentity.TileEntityTitaniumForge;

import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerWorkbench;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.IInteractionObject;
import net.minecraft.world.World;

public class BlockCrynyxCraftingTable extends Block {

	public BlockCrynyxCraftingTable(Material blockMaterialIn, MapColor blockMapColorIn) {
		super(blockMaterialIn, blockMapColorIn);
		this.setHardness(9.0f);
		this.setHarvestLevel("pickaxe", 3);
		setRegistryName("crynyx_crafting_table");
		setUnlocalizedName("crynyx_crafting_table");
		setCreativeTab(SurvivalEssentials.creativeTab);
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if(!worldIn.isRemote) {
			
			playerIn.openGui(Reference.MOD_ID, GuiHandler.CRYNYX_CRAFTING_TABLE_GUI, worldIn, pos.getX(), pos.getY(), pos.getZ());
		}
		return true;
	}
	
	@Override
	public boolean hasTileEntity(IBlockState state) {
		return true;
	}

	@Override
	public TileEntity createTileEntity(World world, IBlockState state) {
		return new TileEntityCrynyxCraftingTable();
	}
	
	public static class InterfaceCrynyxCraftingTable implements IInteractionObject {

		private final TileEntityCrynyxCraftingTable table;
		
		public InterfaceCrynyxCraftingTable(TileEntityCrynyxCraftingTable table) {
			this.table = table;
		}
		
		@Override
		public String getName() {
			return null;
		}

		@Override
		public boolean hasCustomName() {
			return false;
		}

		@Override
		public ITextComponent getDisplayName() {
			return null;
		}

		@Override
		public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
			return new ContainerCrynyxCraftingTable(playerInventory, table);
		}

        
    

		@Override
		public String getGuiID() {
			return Reference.MOD_ID + ":crynyx_crafting_table";
		}

		
		
	}
}


	