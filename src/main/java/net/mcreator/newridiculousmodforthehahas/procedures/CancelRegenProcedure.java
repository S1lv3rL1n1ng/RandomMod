package net.mcreator.newridiculousmodforthehahas.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHealEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.newridiculousmodforthehahas.init.NewRidiculousModForTheHahasModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CancelRegenProcedure {
	@SubscribeEvent
	public static void onEntityHealed(LivingHealEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(NewRidiculousModForTheHahasModMobEffects.BLEEDING.get())) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
		}
	}
}
