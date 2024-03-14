package net.mcreator.newridiculousmodforthehahas.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.newridiculousmodforthehahas.init.NewRidiculousModForTheHahasModParticleTypes;
import net.mcreator.newridiculousmodforthehahas.init.NewRidiculousModForTheHahasModBlocks;

public class ArcaneHuskOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		boolean found = false;
		boolean safe = false;
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (NewRidiculousModForTheHahasModParticleTypes.ARCANE_STAR_PARTICLE.get()), x, y, z, 5, 0.5, 0.5, 0.5, 0);
		sx = -12;
		found = false;
		for (int index0 = 0; index0 < 24; index0++) {
			sy = -12;
			for (int index1 = 0; index1 < 24; index1++) {
				sz = -12;
				for (int index2 = 0; index2 < 24; index2++) {
					if ((new Object() {
						public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getBoolean(tag);
							return false;
						}
					}.getValue(world, BlockPos.containing(x + sx, y + sy, z + sz), "trial")) == true) {
						found = true;
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == NewRidiculousModForTheHahasModBlocks.ENCHANTMENT_ARCHITECT.get()) {
							safe = true;
						}
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		if (safe == true) {
			entity.getPersistentData().putBoolean("safe", true);
		} else {
			entity.getPersistentData().putBoolean("safe", false);
		}
		if (found == false) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
