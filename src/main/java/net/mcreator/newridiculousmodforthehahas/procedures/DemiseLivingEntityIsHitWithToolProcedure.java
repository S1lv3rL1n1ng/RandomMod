package net.mcreator.newridiculousmodforthehahas.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.newridiculousmodforthehahas.init.NewRidiculousModForTheHahasModMobEffects;

public class DemiseLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(NewRidiculousModForTheHahasModMobEffects.BLEEDING.get(), 60, 1, false, false));
	}
}
