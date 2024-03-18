
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newridiculousmodforthehahas.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.newridiculousmodforthehahas.block.TrialTotemBlock;
import net.mcreator.newridiculousmodforthehahas.block.SuspiciousSkullBlock;
import net.mcreator.newridiculousmodforthehahas.block.SkullBlockBlock;
import net.mcreator.newridiculousmodforthehahas.block.IceCreamScoopBlock;
import net.mcreator.newridiculousmodforthehahas.block.IceCreamConePlantBlock;
import net.mcreator.newridiculousmodforthehahas.block.GluePlantBlock;
import net.mcreator.newridiculousmodforthehahas.block.FleshBlockBlock;
import net.mcreator.newridiculousmodforthehahas.block.EnchantmentArchitectBlock;
import net.mcreator.newridiculousmodforthehahas.block.DiamondDimensionPortalBlock;
import net.mcreator.newridiculousmodforthehahas.block.BoneSpikeBlock;
import net.mcreator.newridiculousmodforthehahas.NewRidiculousModForTheHahasMod;

public class NewRidiculousModForTheHahasModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, NewRidiculousModForTheHahasMod.MODID);
	public static final RegistryObject<Block> FLESH_BLOCK = REGISTRY.register("flesh_block", () -> new FleshBlockBlock());
	public static final RegistryObject<Block> ENCHANTMENT_ARCHITECT = REGISTRY.register("enchantment_architect", () -> new EnchantmentArchitectBlock());
	public static final RegistryObject<Block> GLUE_PLANT = REGISTRY.register("glue_plant", () -> new GluePlantBlock());
	public static final RegistryObject<Block> ICE_CREAM_CONE_PLANT = REGISTRY.register("ice_cream_cone_plant", () -> new IceCreamConePlantBlock());
	public static final RegistryObject<Block> ICE_CREAM_SCOOP = REGISTRY.register("ice_cream_scoop", () -> new IceCreamScoopBlock());
	public static final RegistryObject<Block> DIAMOND_DIMENSION_PORTAL = REGISTRY.register("diamond_dimension_portal", () -> new DiamondDimensionPortalBlock());
	public static final RegistryObject<Block> TRIAL_TOTEM = REGISTRY.register("trial_totem", () -> new TrialTotemBlock());
	public static final RegistryObject<Block> SUSPICIOUS_SKULL = REGISTRY.register("suspicious_skull", () -> new SuspiciousSkullBlock());
	public static final RegistryObject<Block> BONE_SPIKE = REGISTRY.register("bone_spike", () -> new BoneSpikeBlock());
	public static final RegistryObject<Block> SKULL_BLOCK = REGISTRY.register("skull_block", () -> new SkullBlockBlock());
}
