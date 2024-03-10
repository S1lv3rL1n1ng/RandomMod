
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newridiculousmodforthehahas.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.newridiculousmodforthehahas.block.IceCreamConePlantBlock;
import net.mcreator.newridiculousmodforthehahas.block.GluePlantBlock;
import net.mcreator.newridiculousmodforthehahas.block.DiamondDimensionPortalBlock;
import net.mcreator.newridiculousmodforthehahas.NewRidiculousModForTheHahasMod;

public class NewRidiculousModForTheHahasModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, NewRidiculousModForTheHahasMod.MODID);
	public static final RegistryObject<Block> GLUE_PLANT = REGISTRY.register("glue_plant", () -> new GluePlantBlock());
	public static final RegistryObject<Block> DIAMOND_DIMENSION_PORTAL = REGISTRY.register("diamond_dimension_portal", () -> new DiamondDimensionPortalBlock());
	public static final RegistryObject<Block> ICE_CREAM_CONE_PLANT = REGISTRY.register("ice_cream_cone_plant", () -> new IceCreamConePlantBlock());
}
