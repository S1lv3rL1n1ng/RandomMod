
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newridiculousmodforthehahas.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.newridiculousmodforthehahas.enchantment.WitheringEdgeEnchantment;
import net.mcreator.newridiculousmodforthehahas.NewRidiculousModForTheHahasMod;

public class NewRidiculousModForTheHahasModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, NewRidiculousModForTheHahasMod.MODID);
	public static final RegistryObject<Enchantment> WITHERING_EDGE = REGISTRY.register("withering_edge", () -> new WitheringEdgeEnchantment());
}
