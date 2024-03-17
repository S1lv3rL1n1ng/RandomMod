package net.mcreator.newridiculousmodforthehahas.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.newridiculousmodforthehahas.init.NewRidiculousModForTheHahasModParticleTypes;
import net.mcreator.newridiculousmodforthehahas.init.NewRidiculousModForTheHahasModItems;
import net.mcreator.newridiculousmodforthehahas.init.NewRidiculousModForTheHahasModEntities;
import net.mcreator.newridiculousmodforthehahas.entity.DamageHitboxEntity;

import java.util.List;
import java.util.Comparator;

public class DemiseSwingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double particleNum = 0;
		double vX = 0;
		double vY = 0;
		double vZ = 0;
		double i = 0;
		double x_pos = 0;
		double z_pos = 0;
		double speed = 0;
		double arcAngle = 0;
		double radAngle = 0;
		double radYaw = 0;
		double radPitch = 0;
		double angle = 0;
		double y_pos = 0;
		double radius = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == NewRidiculousModForTheHahasModItems.DEMISE.get()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("new_ridiculous_mod_for_the_hahas:slash")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("new_ridiculous_mod_for_the_hahas:slash")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
			radius = 3;
			speed = 10;
			particleNum = 30;
			arcAngle = 180;
			radYaw = Math.toRadians(entity.getYRot() + 90);
			radPitch = Math.toRadians((entity.getXRot() + 90) * (-1));
			for (int index0 = 0; index0 < (int) particleNum; index0++) {
				angle = i * (arcAngle / particleNum);
				radAngle = Math.toRadians(angle);
				vX = (Math.sin(radAngle) * Math.sin(radPitch) * Math.cos(radYaw) + Math.cos(radAngle) * Math.sin(radYaw)) * (-1);
				vY = Math.sin(radAngle) * Math.cos(radPitch);
				vZ = Math.sin(radAngle) * Math.sin(radPitch) * Math.sin(radYaw) * (-1) + Math.cos(radAngle) * Math.cos(radYaw);
				x_pos = x + radius * vX;
				y_pos = y + radius * vY;
				z_pos = z + radius * vZ;
				i = i + 1;
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (NewRidiculousModForTheHahasModParticleTypes.BLOOD_BUBBLE.get()), x_pos, (y_pos + 1), z_pos, 1, 0, 0, 0, 0);
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = NewRidiculousModForTheHahasModEntities.DAMAGE_HITBOX.get().spawn(_level, BlockPos.containing(x_pos, y_pos + 1.5, z_pos), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				{
					final Vec3 _center = new Vec3(x_pos, (y_pos + 1.5), z_pos);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1.5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof DamageHitboxEntity) {
							entityiterator.getPersistentData().putString("user", (entity.getDisplayName().getString()));
						}
					}
				}
			}
		}
	}
}
