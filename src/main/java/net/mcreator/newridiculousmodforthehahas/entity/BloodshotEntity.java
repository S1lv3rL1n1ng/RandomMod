
package net.mcreator.newridiculousmodforthehahas.entity;

import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.RandomSource;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import net.mcreator.newridiculousmodforthehahas.procedures.BloodshotWhileProjectileFlyingTickProcedure;
import net.mcreator.newridiculousmodforthehahas.procedures.BloodshotProjectileHitsLivingEntityProcedure;
import net.mcreator.newridiculousmodforthehahas.init.NewRidiculousModForTheHahasModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class BloodshotEntity extends AbstractArrow implements ItemSupplier {
	public static final ItemStack PROJECTILE_ITEM = new ItemStack(Blocks.AIR);

	public BloodshotEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(NewRidiculousModForTheHahasModEntities.BLOODSHOT.get(), world);
	}

	public BloodshotEntity(EntityType<? extends BloodshotEntity> type, Level world) {
		super(type, world);
	}

	public BloodshotEntity(EntityType<? extends BloodshotEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public BloodshotEntity(EntityType<? extends BloodshotEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected ItemStack getPickupItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		BloodshotProjectileHitsLivingEntityProcedure.execute(entityHitResult.getEntity());
	}

	@Override
	public void tick() {
		super.tick();
		BloodshotWhileProjectileFlyingTickProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ());
		if (this.inGround)
			this.discard();
	}

	public static BloodshotEntity shoot(Level world, LivingEntity entity, RandomSource source) {
		return shoot(world, entity, source, 1f, 5, 5);
	}

	public static BloodshotEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		BloodshotEntity entityarrow = new BloodshotEntity(NewRidiculousModForTheHahasModEntities.BLOODSHOT.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		return entityarrow;
	}

	public static BloodshotEntity shoot(LivingEntity entity, LivingEntity target) {
		BloodshotEntity entityarrow = new BloodshotEntity(NewRidiculousModForTheHahasModEntities.BLOODSHOT.get(), entity, entity.level());
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 1f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(5);
		entityarrow.setKnockback(5);
		entityarrow.setCritArrow(false);
		entity.level().addFreshEntity(entityarrow);
		return entityarrow;
	}
}
