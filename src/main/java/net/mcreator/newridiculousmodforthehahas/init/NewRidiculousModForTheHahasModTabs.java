
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newridiculousmodforthehahas.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.newridiculousmodforthehahas.NewRidiculousModForTheHahasMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NewRidiculousModForTheHahasModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NewRidiculousModForTheHahasMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(NewRidiculousModForTheHahasModBlocks.GLUE_PLANT.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(NewRidiculousModForTheHahasModItems.GIANTSTICK.get());
			tabData.accept(NewRidiculousModForTheHahasModItems.GOOGLY_EYES_HELMET.get());
			tabData.accept(NewRidiculousModForTheHahasModItems.M_4.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(NewRidiculousModForTheHahasModItems.DIAMOND_DIMENSION.get());
			tabData.accept(NewRidiculousModForTheHahasModItems.GLUE.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(NewRidiculousModForTheHahasModItems.PET_ROCK.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(NewRidiculousModForTheHahasModItems.CONE.get());
			tabData.accept(NewRidiculousModForTheHahasModItems.ICE_CREAM_CONE.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(NewRidiculousModForTheHahasModBlocks.ICE_CREAM_CONE_PLANT.get().asItem());
		}
	}
}
