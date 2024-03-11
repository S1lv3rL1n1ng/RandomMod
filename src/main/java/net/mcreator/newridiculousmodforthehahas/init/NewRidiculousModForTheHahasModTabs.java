
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newridiculousmodforthehahas.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.newridiculousmodforthehahas.NewRidiculousModForTheHahasMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NewRidiculousModForTheHahasModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NewRidiculousModForTheHahasMod.MODID);
	public static final RegistryObject<CreativeModeTab> RANDOM_GOODIES = REGISTRY.register("random_goodies", () -> CreativeModeTab.builder().title(Component.translatable("item_group.new_ridiculous_mod_for_the_hahas.random_goodies"))
			.icon(() -> new ItemStack(NewRidiculousModForTheHahasModItems.PET_ROCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(NewRidiculousModForTheHahasModItems.GIANTSTICK.get());
				tabData.accept(NewRidiculousModForTheHahasModItems.PET_ROCK.get());
				tabData.accept(NewRidiculousModForTheHahasModItems.GLUE.get());
				tabData.accept(NewRidiculousModForTheHahasModItems.GOOGLY_EYES_HELMET.get());
				tabData.accept(NewRidiculousModForTheHahasModItems.CONE.get());
				tabData.accept(NewRidiculousModForTheHahasModItems.ICE_CREAM_CONE.get());
				tabData.accept(NewRidiculousModForTheHahasModItems.M_4.get());
				tabData.accept(NewRidiculousModForTheHahasModItems.WOODEN_SCYTHE.get());
				tabData.accept(NewRidiculousModForTheHahasModItems.STONE_SCYTHE.get());
				tabData.accept(NewRidiculousModForTheHahasModItems.IRON_SCYTHE.get());
				tabData.accept(NewRidiculousModForTheHahasModItems.DIAMOND_SCYTHE.get());
				tabData.accept(NewRidiculousModForTheHahasModItems.GOLD_SCYTHE.get());
				tabData.accept(NewRidiculousModForTheHahasModItems.NETHERITE_SCYTHE.get());
				tabData.accept(NewRidiculousModForTheHahasModItems.DEMISE.get());
				tabData.accept(NewRidiculousModForTheHahasModItems.PULSATING_HEART.get());
				tabData.accept(NewRidiculousModForTheHahasModBlocks.FLESH_BLOCK.get().asItem());
				tabData.accept(NewRidiculousModForTheHahasModBlocks.ENCHANTMENT_ARCHITECT.get().asItem());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(NewRidiculousModForTheHahasModItems.DIAMOND_DIMENSION.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(NewRidiculousModForTheHahasModBlocks.GLUE_PLANT.get().asItem());
			tabData.accept(NewRidiculousModForTheHahasModBlocks.ICE_CREAM_CONE_PLANT.get().asItem());
			tabData.accept(NewRidiculousModForTheHahasModBlocks.ICE_CREAM_SCOOP.get().asItem());
		}
	}
}
