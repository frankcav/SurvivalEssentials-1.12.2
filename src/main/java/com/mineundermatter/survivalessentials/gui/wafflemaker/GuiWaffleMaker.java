package com.mineundermatter.survivalessentials.gui.wafflemaker;

import com.mineundermatter.survivalessentials.client.Reference;
import com.mineundermatter.survivalessentials.tileentity.TileEntityWaffleMaker;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiWaffleMaker extends GuiContainer {

	private static final ResourceLocation WAFFLE_MAKER_TEXTURES = new ResourceLocation(Reference.MOD_ID + ":" + "textures/gui/container/wafflemaker.png");

	private final InventoryPlayer player;

	private final TileEntityWaffleMaker tileentity;
	
	
	public GuiWaffleMaker(InventoryPlayer player, TileEntityWaffleMaker tileentity) {
		super(new ContainerWaffleMaker(player, tileentity));
		this.player = player;
		this.tileentity = tileentity;
		
	}

	@Override

	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {

		String s = this.tileentity.getDisplayName().getUnformattedText();

		this.fontRenderer.drawString(s, this.xSize / 2 - this.fontRenderer.getStringWidth(s) / 2, 6, 4210752);

        this.fontRenderer.drawString(this.player.getDisplayName().getUnformattedText(), 8, this.ySize - 96 + 2, 4210752);

	}
	
	@Override

	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {

		GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);

		this.mc.getTextureManager().bindTexture(WAFFLE_MAKER_TEXTURES);

		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);

		

		if(TileEntityWaffleMaker.isBurning(this.tileentity)) {

			int k = this.getBurnLeftScaled(13);

			this.drawTexturedModalRect(this.guiLeft + 80, this.guiTop + 42 + 12 - k, 176, 12 - k, 14, k + 1);

		}

		

		int l = this.getCookProgressScaled(24);

		this.drawTexturedModalRect(this.guiLeft + 43, this.guiTop + 18, 176, 14, l + 1, 16);

		int r = this.getCookProgressScaled(24);

		this.drawTexturedModalRect(this.guiLeft + 109, this.guiTop + 18, 176, 31, 23 - r, 16);

	}
	
	private int getBurnLeftScaled(int pixels) {

		int i = this.tileentity.getField(1);

		

		if(i == 0)

			i = 200;

		return this.tileentity.getField(0) * pixels / i;

	}
	
	private int getCookProgressScaled(int pixels) {

		int i = this.tileentity.getField(2);

        int j = this.tileentity.getField(3);

        return j != 0 && i != 0 ? i * pixels / j : 0;

	}
}
