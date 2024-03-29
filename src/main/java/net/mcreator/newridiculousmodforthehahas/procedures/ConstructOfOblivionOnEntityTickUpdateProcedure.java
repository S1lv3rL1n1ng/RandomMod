package net.mcreator.newridiculousmodforthehahas.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import net.mcreator.newridiculousmodforthehahas.init.NewRidiculousModForTheHahasModParticleTypes;
import net.mcreator.newridiculousmodforthehahas.init.NewRidiculousModForTheHahasModEntities;
import net.mcreator.newridiculousmodforthehahas.entity.VortexSwordEntity;

import java.util.List;
import java.util.Comparator;

public class ConstructOfOblivionOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xc = 0;
		double yc = 0;
		double zc = 0;
		if (entity.getPersistentData().getDouble("music") <= 0) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("new_ridiculous_mod_for_the_hahas:grand_oblivion")), SoundSource.VOICE, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("new_ridiculous_mod_for_the_hahas:grand_oblivion")), SoundSource.VOICE, 1, 1, false);
				}
			}
			entity.getPersistentData().putDouble("music", 2360);
		} else {
			entity.getPersistentData().putDouble("music", (entity.getPersistentData().getDouble("music") - 1));
		}
		if (Mth.nextInt(RandomSource.create(), 1, 256) == 1) {
			xc = Mth.nextInt(RandomSource.create(), -12, 12);
			yc = Mth.nextInt(RandomSource.create(), -12, 12);
			zc = Mth.nextInt(RandomSource.create(), -12, 12);
			while (!((world.getBlockState(BlockPos.containing(x + xc, y + yc, z + zc))).getBlock() == Blocks.AIR) && !((world.getBlockState(BlockPos.containing(x + xc, y + yc + 1, z + zc))).getBlock() == Blocks.AIR)) {
				xc = Mth.nextInt(RandomSource.create(), -12, 12);
				yc = Mth.nextInt(RandomSource.create(), -12, 12);
				zc = Mth.nextInt(RandomSource.create(), -12, 12);
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (NewRidiculousModForTheHahasModParticleTypes.ARCANE_STAR_PARTICLE.get()), x, y, z, 12, 0.5, 2, 0.5, 0);
			{
				Entity _ent = entity;
				_ent.teleportTo((x + xc), (y + yc), (z + zc));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((x + xc), (y + yc), (z + zc), _ent.getYRot(), _ent.getXRot());
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (NewRidiculousModForTheHahasModParticleTypes.ARCANE_STAR_PARTICLE.get()), x, y, z, 12, 0.5, 2, 0.5, 0);
		}
		if (Mth.nextInt(RandomSource.create(), 1, 512) == 1) {
			for (int index1 = 0; index1 < Mth.nextInt(RandomSource.create(), 4, 6); index1++) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = NewRidiculousModForTheHahasModEntities.VORTEX_SWORD.get().spawn(_level,
							BlockPos.containing(x + Mth.nextInt(RandomSource.create(), -3, 3), y + Mth.nextInt(RandomSource.create(), -3, 3), z + Mth.nextInt(RandomSource.create(), -3, 3)), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
		}
		if (Mth.nextInt(RandomSource.create(), 1, 128) == 1) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() + entity.getLookAngle().x * 3), (entity.getDeltaMovement().y() + entity.getLookAngle().y * 3), (entity.getDeltaMovement().z() + entity.getLookAngle().z * 3)));
		}
		if (Mth.nextInt(RandomSource.create(), 1, 256) == 1) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(64 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof Player) {
						xc = entityiterator.getX();
						yc = entityiterator.getY();
						zc = entityiterator.getZ();
					}
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(64 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof VortexSwordEntity) {
						entityiterator.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(xc, yc, zc));
						entityiterator.setDeltaMovement(new Vec3((entityiterator.getDeltaMovement().x() + entityiterator.getLookAngle().x * 3), (entityiterator.getDeltaMovement().y() + entityiterator.getLookAngle().y * 3),
								(entityiterator.getDeltaMovement().z() + entityiterator.getLookAngle().z * 3)));
					}
				}
			}
		}
	}
}
