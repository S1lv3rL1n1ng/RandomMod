
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

import net.mcreator.newridiculousmodforthehahas.entity.M4ProjectileEntity;
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

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ArcaneHuskEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ARCANE_HUSK.get(), ArcaneHuskEntity.createAttributes().build());
	}
}
