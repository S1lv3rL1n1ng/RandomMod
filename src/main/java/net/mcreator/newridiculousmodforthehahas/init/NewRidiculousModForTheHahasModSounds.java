
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newridiculousmodforthehahas.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.newridiculousmodforthehahas.NewRidiculousModForTheHahasMod;

public class NewRidiculousModForTheHahasModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, NewRidiculousModForTheHahasMod.MODID);
	public static final RegistryObject<SoundEvent> VORPAL_TREMOR = REGISTRY.register("vorpal_tremor", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("new_ridiculous_mod_for_the_hahas", "vorpal_tremor")));
}
