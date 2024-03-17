
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newridiculousmodforthehahas.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.newridiculousmodforthehahas.client.particle.ConstellationVariant2Particle;
import net.mcreator.newridiculousmodforthehahas.client.particle.ConstellationVariant1Particle;
import net.mcreator.newridiculousmodforthehahas.client.particle.BloodBubbleParticle;
import net.mcreator.newridiculousmodforthehahas.client.particle.ArcaneStarParticleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NewRidiculousModForTheHahasModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(NewRidiculousModForTheHahasModParticleTypes.ARCANE_STAR_PARTICLE.get(), ArcaneStarParticleParticle::provider);
		event.registerSpriteSet(NewRidiculousModForTheHahasModParticleTypes.BLOOD_BUBBLE.get(), BloodBubbleParticle::provider);
		event.registerSpriteSet(NewRidiculousModForTheHahasModParticleTypes.CONSTELLATION_VARIANT_1.get(), ConstellationVariant1Particle::provider);
		event.registerSpriteSet(NewRidiculousModForTheHahasModParticleTypes.CONSTELLATION_VARIANT_2.get(), ConstellationVariant2Particle::provider);
	}
}
