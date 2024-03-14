
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newridiculousmodforthehahas.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.newridiculousmodforthehahas.client.gui.TrialTotemGUIScreen;
import net.mcreator.newridiculousmodforthehahas.client.gui.EnchantmentArchitectGuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NewRidiculousModForTheHahasModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(NewRidiculousModForTheHahasModMenus.ENCHANTMENT_ARCHITECT_GUI.get(), EnchantmentArchitectGuiScreen::new);
			MenuScreens.register(NewRidiculousModForTheHahasModMenus.TRIAL_TOTEM_GUI.get(), TrialTotemGUIScreen::new);
		});
	}
}
