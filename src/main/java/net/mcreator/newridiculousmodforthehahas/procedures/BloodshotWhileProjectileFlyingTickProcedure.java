package net.mcreator.newridiculousmodforthehahas.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.newridiculousmodforthehahas.init.NewRidiculousModForTheHahasModParticleTypes;

public class BloodshotWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (NewRidiculousModForTheHahasModParticleTypes.BLOOD_BUBBLE.get()), x, y, z, 1, 0, 0, 0, 0);
	}
}
