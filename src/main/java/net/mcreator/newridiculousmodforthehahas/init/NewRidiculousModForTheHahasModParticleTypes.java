
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newridiculousmodforthehahas.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.newridiculousmodforthehahas.NewRidiculousModForTheHahasMod;

public class NewRidiculousModForTheHahasModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, NewRidiculousModForTheHahasMod.MODID);
	public static final RegistryObject<SimpleParticleType> ARCANE_STAR_PARTICLE = REGISTRY.register("arcane_star_particle", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> BLOOD_BUBBLE = REGISTRY.register("blood_bubble", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> CONSTELLATION_VARIANT_1 = REGISTRY.register("constellation_variant_1", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> CONSTELLATION_VARIANT_2 = REGISTRY.register("constellation_variant_2", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> NEOLITHIC_DUST = REGISTRY.register("neolithic_dust", () -> new SimpleParticleType(false));
}
