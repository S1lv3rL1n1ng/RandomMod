
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newridiculousmodforthehahas.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.newridiculousmodforthehahas.block.entity.TrialTotemBlockEntity;
import net.mcreator.newridiculousmodforthehahas.block.entity.EnchantmentArchitectBlockEntity;
import net.mcreator.newridiculousmodforthehahas.NewRidiculousModForTheHahasMod;

public class NewRidiculousModForTheHahasModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, NewRidiculousModForTheHahasMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> ENCHANTMENT_ARCHITECT = register("enchantment_architect", NewRidiculousModForTheHahasModBlocks.ENCHANTMENT_ARCHITECT, EnchantmentArchitectBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TRIAL_TOTEM = register("trial_totem", NewRidiculousModForTheHahasModBlocks.TRIAL_TOTEM, TrialTotemBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
