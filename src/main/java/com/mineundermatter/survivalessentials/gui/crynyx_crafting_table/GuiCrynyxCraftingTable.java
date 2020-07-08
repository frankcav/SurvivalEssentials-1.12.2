package com.mineundermatter.survivalessentials.gui.crynyx_crafting_table;

import com.mineundermatter.survivalessentials.client.Reference;
import com.mineundermatter.survivalessentials.tileentity.TileEntityCrynyxCraftingTable;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiCrynyxCraftingTable extends GuiContainer {

	private static final ResourceLocation GUI = new ResourceLocation(Reference.MOD_ID, "textures/gui/container/crynyx_crafting_table.png");
	private static final ResourceLocation INVENTORY = new ResourceLocation(Reference.MOD_ID, "textures/gui/container/separated_inventory.png");
	
	public GuiCrynyxCraftingTable(InventoryPlayer player, TileEntityCrynyxCraftingTable table) {
		super(new ContainerCrynyxCraftingTable(player, table));
		this.xSize = 188;
		this.ySize = 206;
	}
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		this.drawDefaultBackground();
		super.drawScreen(mouseX, mouseY, partialTicks);
		this.renderHoveredToolTip(mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(GUI);
		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, 188, 110);
		this.mc.getTextureManager().bindTexture(INVENTORY);
		this.drawTexturedModalRect(this.guiLeft + 6, this.guiTop + 116, 0, 0, 176, 90);
	}
	
}
