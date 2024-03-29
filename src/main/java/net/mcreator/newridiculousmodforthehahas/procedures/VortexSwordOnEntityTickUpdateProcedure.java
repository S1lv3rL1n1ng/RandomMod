package net.mcreator.newridiculousmodforthehahas.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class VortexSwordOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("time") == 400) {
			if (!entity.level().isClientSide())
				entity.discard();
			if (Mth.nextInt(RandomSource.create(), 1, 6) == 1) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 3, Level.ExplosionInteraction.NONE);
			}
		} else {
			entity.getPersistentData().putDouble("time", (entity.getPersistentData().getDouble("time") + 1));
		}
	}
}
