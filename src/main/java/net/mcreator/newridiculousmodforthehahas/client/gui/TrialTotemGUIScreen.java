package net.mcreator.newridiculousmodforthehahas.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.newridiculousmodforthehahas.world.inventory.TrialTotemGUIMenu;
import net.mcreator.newridiculousmodforthehahas.network.TrialTotemGUIButtonMessage;
import net.mcreator.newridiculousmodforthehahas.NewRidiculousModForTheHahasMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class TrialTotemGUIScreen extends AbstractContainerScreen<TrialTotemGUIMenu> {
	private final static HashMap<String, Object> guistate = TrialTotemGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_pixilframe0_20240311t16584;

	public TrialTotemGUIScreen(TrialTotemGUIMenu container, Inventory inventory, Component text) {
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

		guiGraphics.blit(new ResourceLocation("new_ridiculous_mod_for_the_hahas:textures/screens/pixil-frame-0_-_2024-03-14t121517.784_1.png"), this.leftPos + 1, this.topPos + -18, 0, 0, 180, 180, 180, 180);

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
		imagebutton_pixilframe0_20240311t16584 = new ImageButton(this.leftPos + 76, this.topPos + 61, 19, 18, 0, 0, 18, new ResourceLocation("new_ridiculous_mod_for_the_hahas:textures/screens/atlas/imagebutton_pixilframe0_20240311t16584.png"), 19,
				36, e -> {
					if (true) {
						NewRidiculousModForTheHahasMod.PACKET_HANDLER.sendToServer(new TrialTotemGUIButtonMessage(0, x, y, z));
						TrialTotemGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
					}
				});
		guistate.put("button:imagebutton_pixilframe0_20240311t16584", imagebutton_pixilframe0_20240311t16584);
		this.addRenderableWidget(imagebutton_pixilframe0_20240311t16584);
	}
}
