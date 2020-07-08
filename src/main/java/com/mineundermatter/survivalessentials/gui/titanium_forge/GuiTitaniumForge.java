package com.mineundermatter.survivalessentials.gui.titanium_forge;

import com.mineundermatter.survivalessentials.client.Reference;
import com.mineundermatter.survivalessentials.gui.icecreammaker.ContainerIceCreamMaker;
import com.mineundermatter.survivalessentials.tileentity.TileEntityIceCreamMaker;
import com.mineundermatter.survivalessentials.tileentity.TileEntityTitaniumForge;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.ResourceLocation;

public class GuiTitaniumForge extends GuiContainer {

	private static final ResourceLocation TITANIUM_FORGE_TEXTURES = new ResourceLocation(Reference.MOD_ID + ":" + "textures/gui/container/titanium_forge.png");

	private final InventoryPlayer player;

	private final TileEntityTitaniumForge tileentity;
	
	
	public GuiTitaniumForge(InventoryPlayer player, TileEntityTitaniumForge tileentity) {
		super(new ContainerTitaniumForge(player, tileentity));
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

	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
    {
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(TITANIUM_FORGE_TEXTURES);
        int i = (this.width - this.xSize) / 2;
        int j = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(i, j, 0, 0, this.xSize, this.ySize);

        if (TileEntityFurnace.isBurning(this.tileentity))
        {
            int k = this.getBurnLeftScaled(13);
            this.drawTexturedModalRect(i + 56, j + 36 + 12 - k, 176, 12 - k, 14, k + 1);
        }

        int l = this.getCookProgressScaled(24);
        this.drawTexturedModalRect(i + 79, j + 34, 176, 14, l + 1, 16);
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
