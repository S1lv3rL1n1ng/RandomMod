
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newridiculousmodforthehahas.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.newridiculousmodforthehahas.entity.SkullBoiEntity;
import net.mcreator.newridiculousmodforthehahas.entity.M4ProjectileEntity;
import net.mcreator.newridiculousmodforthehahas.entity.HeartWrenchEntity;
import net.mcreator.newridiculousmodforthehahas.entity.DamageHitboxEntity;
import net.mcreator.newridiculousmodforthehahas.entity.CognizantSkullEntity;
import net.mcreator.newridiculousmodforthehahas.entity.BloodshotEntity;
import net.mcreator.newridiculousmodforthehahas.entity.ArcaneHuskEntity;
import net.mcreator.newridiculousmodforthehahas.NewRidiculousModForTheHahasMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NewRidiculousModForTheHahasModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, NewRidiculousModForTheHahasMod.MODID);
	public static final RegistryObject<EntityType<M4ProjectileEntity>> M_4_PROJECTILE = register("projectile_m_4_projectile",
			EntityType.Builder.<M4ProjectileEntity>of(M4ProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(M4ProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ArcaneHuskEntity>> ARCANE_HUSK = register("arcane_husk",
			EntityType.Builder.<ArcaneHuskEntity>of(ArcaneHuskEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ArcaneHuskEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CognizantSkullEntity>> COGNIZANT_SKULL = register("cognizant_skull", EntityType.Builder.<CognizantSkullEntity>of(CognizantSkullEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(256).setUpdateInterval(3).setCustomClientFactory(CognizantSkullEntity::new).fireImmune().sized(1.5f, 1.5f));
	public static final RegistryObject<EntityType<SkullBoiEntity>> SKULL_BOI = register("skull_boi",
			EntityType.Builder.<SkullBoiEntity>of(SkullBoiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(SkullBoiEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HeartWrenchEntity>> HEART_WRENCH = register("heart_wrench", EntityType.Builder.<HeartWrenchEntity>of(HeartWrenchEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(256).setUpdateInterval(3).setCustomClientFactory(HeartWrenchEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BloodshotEntity>> BLOODSHOT = register("projectile_bloodshot",
			EntityType.Builder.<BloodshotEntity>of(BloodshotEntity::new, MobCategory.MISC).setCustomClientFactory(BloodshotEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DamageHitboxEntity>> DAMAGE_HITBOX = register("damage_hitbox", EntityType.Builder.<DamageHitboxEntity>of(DamageHitboxEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DamageHitboxEntity::new).fireImmune().sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ArcaneHuskEntity.init();
			CognizantSkullEntity.init();
			SkullBoiEntity.init();
			HeartWrenchEntity.init();
			DamageHitboxEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ARCANE_HUSK.get(), ArcaneHuskEntity.createAttributes().build());
		event.put(COGNIZANT_SKULL.get(), CognizantSkullEntity.createAttributes().build());
		event.put(SKULL_BOI.get(), SkullBoiEntity.createAttributes().build());
		event.put(HEART_WRENCH.get(), HeartWrenchEntity.createAttributes().build());
		event.put(DAMAGE_HITBOX.get(), DamageHitboxEntity.createAttributes().build());
	}
}
