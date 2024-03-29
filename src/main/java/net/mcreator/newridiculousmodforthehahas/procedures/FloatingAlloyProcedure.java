package net.mcreator.newridiculousmodforthehahas.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.newridiculousmodforthehahas.init.NewRidiculousModForTheHahasModParticleTypes;
import net.mcreator.newridiculousmodforthehahas.init.NewRidiculousModForTheHahasModItems;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class FloatingAlloyProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(256 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if ((entityiterator instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY).getItem() == NewRidiculousModForTheHahasModItems.ASTRAL_ALLOY.get()) {
					if (entityiterator.getPersistentData().getDouble("yy") == 0) {
						entityiterator.getPersistentData().putDouble("yy", (entityiterator.getY()));
					}
					entityiterator.getPersistentData().putBoolean("noGravity", true);
					entityiterator.setDeltaMovement(new Vec3((entityiterator.getDeltaMovement().x()), 0, (entityiterator.getDeltaMovement().z())));
					{
						Entity _ent = entityiterator;
						_ent.teleportTo((entityiterator.getX()), (entityiterator.getPersistentData().getDouble("yy")), (entityiterator.getZ()));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getPersistentData().getDouble("yy")), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
					}
					if (Mth.nextInt(RandomSource.create(), 1, 10) == 1) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (NewRidiculousModForTheHahasModParticleTypes.ARCANE_STAR_PARTICLE.get()), (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 1, 0.2, 0.2, 0.2, 0);
					}
				}
			}
		}
	}
}
