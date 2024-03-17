
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newridiculousmodforthehahas.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.newridiculousmodforthehahas.potion.BleedingMobEffect;
import net.mcreator.newridiculousmodforthehahas.NewRidiculousModForTheHahasMod;

public class NewRidiculousModForTheHahasModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, NewRidiculousModForTheHahasMod.MODID);
	public static final RegistryObject<MobEffect> BLEEDING = REGISTRY.register("bleeding", () -> new BleedingMobEffect());
}
