
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newridiculousmodforthehahas.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.newridiculousmodforthehahas.world.inventory.EnchantmentArchitectGuiMenu;
import net.mcreator.newridiculousmodforthehahas.NewRidiculousModForTheHahasMod;

public class NewRidiculousModForTheHahasModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, NewRidiculousModForTheHahasMod.MODID);
	public static final RegistryObject<MenuType<EnchantmentArchitectGuiMenu>> ENCHANTMENT_ARCHITECT_GUI = REGISTRY.register("enchantment_architect_gui", () -> IForgeMenuType.create(EnchantmentArchitectGuiMenu::new));
}
