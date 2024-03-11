package net.mcreator.newridiculousmodforthehahas.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.newridiculousmodforthehahas.world.inventory.EnchantmentArchitectGuiMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class EnchantmentArchitectGuiScreen extends AbstractContainerScreen<EnchantmentArchitectGuiMenu> {
	private final static HashMap<String, Object> guistate = EnchantmentArchitectGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public EnchantmentArchitectGuiScreen(EnchantmentArchitectGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 172;
		this.imageHeight = 166;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("new_ridiculous_mod_for_the_hahas:textures/screens/image_2024-03-10_2105299341.png"), this.leftPos + -2, this.topPos + 22, 0, 0, 177, 170, 177, 170);

		guiGraphics.blit(new ResourceLocation("new_ridiculous_mod_for_the_hahas:textures/screens/gui.png"), this.leftPos + 23, this.topPos + -33, 0, 0, 128, 128, 128, 128);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
	}
}
