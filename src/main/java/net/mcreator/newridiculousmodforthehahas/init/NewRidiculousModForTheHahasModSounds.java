
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
	public static final RegistryObject<SoundEvent> TRIAL_BEGIN = REGISTRY.register("trial_begin", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("new_ridiculous_mod_for_the_hahas", "trial_begin")));
	public static final RegistryObject<SoundEvent> HEARTBEAT = REGISTRY.register("heartbeat", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("new_ridiculous_mod_for_the_hahas", "heartbeat")));
	public static final RegistryObject<SoundEvent> SILENCE = REGISTRY.register("silence", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("new_ridiculous_mod_for_the_hahas", "silence")));
	public static final RegistryObject<SoundEvent> RAPTURE = REGISTRY.register("rapture", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("new_ridiculous_mod_for_the_hahas", "rapture")));
	public static final RegistryObject<SoundEvent> SLASH = REGISTRY.register("slash", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("new_ridiculous_mod_for_the_hahas", "slash")));
}
