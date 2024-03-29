package net.mcreator.newridiculousmodforthehahas.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.newridiculousmodforthehahas.init.NewRidiculousModForTheHahasModEntities;
import net.mcreator.newridiculousmodforthehahas.entity.PlayerSummonedVortexSwordEntity;

import java.util.List;
import java.util.Comparator;

public class VortexBladeRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = Mth.nextInt(RandomSource.create(), -6, 6);
		sy = Mth.nextInt(RandomSource.create(), -6, 6);
		sz = Mth.nextInt(RandomSource.create(), -6, 6);
		while (!((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.AIR)) {
			sx = Mth.nextInt(RandomSource.create(), -6, 6);
			sy = Mth.nextInt(RandomSource.create(), -6, 6);
			sz = Mth.nextInt(RandomSource.create(), -6, 6);
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = NewRidiculousModForTheHahasModEntities.PLAYER_SUMMONED_VORTEX_SWORD.get().spawn(_level, BlockPos.containing(x + sx, y + sy, z + sz), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
			}
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(12 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof PlayerSummonedVortexSwordEntity) {
					if ((entityiterator.getPersistentData().getString("player")).isEmpty()) {
						entityiterator.getPersistentData().putString("player", (entity.getDisplayName().getString()));
					}
				}
			}
		}
	}
}
