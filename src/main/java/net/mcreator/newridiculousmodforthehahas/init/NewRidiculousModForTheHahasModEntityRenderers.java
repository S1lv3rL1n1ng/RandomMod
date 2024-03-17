
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newridiculousmodforthehahas.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.newridiculousmodforthehahas.client.renderer.SkullBoiRenderer;
import net.mcreator.newridiculousmodforthehahas.client.renderer.HeartWrenchRenderer;
import net.mcreator.newridiculousmodforthehahas.client.renderer.DamageHitboxRenderer;
import net.mcreator.newridiculousmodforthehahas.client.renderer.CognizantSkullRenderer;
import net.mcreator.newridiculousmodforthehahas.client.renderer.BloodshotRenderer;
import net.mcreator.newridiculousmodforthehahas.client.renderer.ArcaneHuskRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NewRidiculousModForTheHahasModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(NewRidiculousModForTheHahasModEntities.M_4_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(NewRidiculousModForTheHahasModEntities.ARCANE_HUSK.get(), ArcaneHuskRenderer::new);
		event.registerEntityRenderer(NewRidiculousModForTheHahasModEntities.COGNIZANT_SKULL.get(), CognizantSkullRenderer::new);
		event.registerEntityRenderer(NewRidiculousModForTheHahasModEntities.SKULL_BOI.get(), SkullBoiRenderer::new);
		event.registerEntityRenderer(NewRidiculousModForTheHahasModEntities.HEART_WRENCH.get(), HeartWrenchRenderer::new);
		event.registerEntityRenderer(NewRidiculousModForTheHahasModEntities.BLOODSHOT.get(), BloodshotRenderer::new);
		event.registerEntityRenderer(NewRidiculousModForTheHahasModEntities.DAMAGE_HITBOX.get(), DamageHitboxRenderer::new);
	}
}
