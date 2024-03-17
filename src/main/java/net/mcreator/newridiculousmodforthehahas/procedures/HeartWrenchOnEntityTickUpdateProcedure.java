package net.mcreator.newridiculousmodforthehahas.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import net.mcreator.newridiculousmodforthehahas.init.NewRidiculousModForTheHahasModEntities;
import net.mcreator.newridiculousmodforthehahas.entity.BloodshotEntity;

import java.util.List;
import java.util.Comparator;

public class HeartWrenchOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double ypos = 0;
		double zpos = 0;
		double xpos = 0;
		if (Mth.nextInt(RandomSource.create(), 1, 50) == 1) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() + entity.getLookAngle().x * 2), (entity.getDeltaMovement().y() + entity.getLookAngle().y * 2), (entity.getDeltaMovement().z() + entity.getLookAngle().z * 2)));
		}
		if (Mth.nextInt(RandomSource.create(), 1, 200) == 1) {
			for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 8, 12); index0++) {
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
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
							AbstractArrow entityToSpawn = new BloodshotEntity(NewRidiculousModForTheHahasModEntities.BLOODSHOT.get(), level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, 5, 1);
					_entityToSpawn.setPos(x, (y + 1.5), z);
					_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), 2, 20);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
		}
	}
}
