package net.mcreator.newridiculousmodforthehahas.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.newridiculousmodforthehahas.world.inventory.EnchantmentArchitectGuiMenu;
import net.mcreator.newridiculousmodforthehahas.network.EnchantmentArchitectGuiButtonMessage;
import net.mcreator.newridiculousmodforthehahas.NewRidiculousModForTheHahasMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class EnchantmentArchitectGuiScreen extends AbstractContainerScreen<EnchantmentArchitectGuiMenu> {
	private final static HashMap<String, Object> guistate = EnchantmentArchitectGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_pixilframe0_20240311t16584;

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

	private static final ResourceLocation texture = new ResourceLocation("new_ridiculous_mod_for_the_hahas:textures/screens/enchantment_architect_gui.png");

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
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("new_ridiculous_mod_for_the_hahas:textures/screens/gui.png"), this.leftPos + 23, this.topPos + -33, 0, 0, 128, 128, 128, 128);

		guiGraphics.blit(new ResourceLocation("new_ridiculous_mod_for_the_hahas:textures/screens/aefaa.png"), this.leftPos + -10, this.topPos + 22, 0, 0, 210, 170, 210, 170);

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
		imagebutton_pixilframe0_20240311t16584 = new ImageButton(this.leftPos + 172, this.topPos + 107, 19, 18, 0, 0, 18, new ResourceLocation("new_ridiculous_mod_for_the_hahas:textures/screens/atlas/imagebutton_pixilframe0_20240311t16584.png"), 19,
				36, e -> {
					if (true) {
						NewRidiculousModForTheHahasMod.PACKET_HANDLER.sendToServer(new EnchantmentArchitectGuiButtonMessage(0, x, y, z));
						EnchantmentArchitectGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
					}
				});
		guistate.put("button:imagebutton_pixilframe0_20240311t16584", imagebutton_pixilframe0_20240311t16584);
		this.addRenderableWidget(imagebutton_pixilframe0_20240311t16584);
	}
}
