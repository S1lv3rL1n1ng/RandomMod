package net.mcreator.newridiculousmodforthehahas.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.SmallFireball;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractHurtingProjectile;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import net.mcreator.newridiculousmodforthehahas.init.NewRidiculousModForTheHahasModEntities;
import net.mcreator.newridiculousmodforthehahas.init.NewRidiculousModForTheHahasModBlocks;

import java.util.List;
import java.util.Comparator;

public class CognizantSkullOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double ypos = 0;
		double xpos = 0;
		double zpos = 0;
		if (Mth.nextInt(RandomSource.create(), 1, 100) == 1) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() + entity.getLookAngle().x * 2), (entity.getDeltaMovement().y() + entity.getLookAngle().y * 2), (entity.getDeltaMovement().z() + entity.getLookAngle().z * 2)));
		}
		if (Mth.nextInt(RandomSource.create(), 1, 300) == 1) {
			for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 2, 4); index0++) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = NewRidiculousModForTheHahasModEntities.SKULL_BOI.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
		}
		if (Mth.nextInt(RandomSource.create(), 1, 400) == 1) {
			for (int index1 = 0; index1 < Mth.nextInt(RandomSource.create(), 4, 8); index1++) {
				ypos = 0;
				xpos = Mth.nextInt(RandomSource.create(), -5, 5);
				zpos = Mth.nextInt(RandomSource.create(), -5, 5);
				while ((world.getBlockState(BlockPos.containing(x + xpos, y + ypos, z + zpos))).getBlock() == Blocks.AIR) {
					ypos = ypos - 1;
				}
				if (!((world.getBlockState(BlockPos.containing(x + xpos, y + ypos, z + zpos))).getBlock() == NewRidiculousModForTheHahasModBlocks.BONE_SPIKE.get())) {
					ypos = ypos + 1;
					world.setBlock(BlockPos.containing(x + xpos, y + ypos, z + zpos), NewRidiculousModForTheHahasModBlocks.BONE_SPIKE.get().defaultBlockState(), 3);
				}
			}
		}
		if (Mth.nextInt(RandomSource.create(), 1, 200) == 1) {
			for (int index3 = 0; index3 < Mth.nextInt(RandomSource.create(), 4, 8); index3++) {
				xpos = Mth.nextInt(RandomSource.create(), -2, 2);
				ypos = Mth.nextInt(RandomSource.create(), -2, 2);
				zpos = Mth.nextInt(RandomSource.create(), -2, 2);
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(128 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof Player) {
							entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ())));
						}
					}
				}
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getFireball(Level level, double ax, double ay, double az) {
							AbstractHurtingProjectile entityToSpawn = new SmallFireball(EntityType.SMALL_FIREBALL, level);
							entityToSpawn.xPower = ax;
							entityToSpawn.yPower = ay;
							entityToSpawn.zPower = az;
							return entityToSpawn;
						}
					}.getFireball(projectileLevel, (entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z));
					_entityToSpawn.setPos((x + xpos), (y + ypos), (z + zpos));
					_entityToSpawn.shoot(0, 0, 0, 1, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
		}
	}
}
