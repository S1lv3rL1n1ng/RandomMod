package net.mcreator.newridiculousmodforthehahas.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

import net.mcreator.newridiculousmodforthehahas.init.NewRidiculousModForTheHahasModMobEffects;
import net.mcreator.newridiculousmodforthehahas.entity.DamageHitboxEntity;

import java.util.List;
import java.util.Comparator;

public class DamageHitboxOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("time", (entity.getPersistentData().getDouble("time") + 1));
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(0.5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator.getDisplayName().getString()).equals(entity.getPersistentData().getString("user")) && !(entityiterator instanceof DamageHitboxEntity)) {
					entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.PLAYER_ATTACK)), 3);
					if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(NewRidiculousModForTheHahasModMobEffects.BLEEDING.get(), 60, 1, false, false));
				}
			}
		}
		if (entity.getPersistentData().getDouble("time") >= 40) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
