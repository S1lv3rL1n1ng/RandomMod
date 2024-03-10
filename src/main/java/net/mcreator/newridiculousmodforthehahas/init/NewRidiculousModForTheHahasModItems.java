
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newridiculousmodforthehahas.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.newridiculousmodforthehahas.item.PetRockItem;
import net.mcreator.newridiculousmodforthehahas.item.M4Item;
import net.mcreator.newridiculousmodforthehahas.item.IceCreamConeItem;
import net.mcreator.newridiculousmodforthehahas.item.GooglyEyesItem;
import net.mcreator.newridiculousmodforthehahas.item.GlueItem;
import net.mcreator.newridiculousmodforthehahas.item.GIANTSTICKItem;
import net.mcreator.newridiculousmodforthehahas.item.DiamondDimensionItem;
import net.mcreator.newridiculousmodforthehahas.item.ConeItem;
import net.mcreator.newridiculousmodforthehahas.NewRidiculousModForTheHahasMod;

public class NewRidiculousModForTheHahasModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NewRidiculousModForTheHahasMod.MODID);
	public static final RegistryObject<Item> GIANTSTICK = REGISTRY.register("giantstick", () -> new GIANTSTICKItem());
	public static final RegistryObject<Item> PET_ROCK = REGISTRY.register("pet_rock", () -> new PetRockItem());
	public static final RegistryObject<Item> GLUE_PLANT = block(NewRidiculousModForTheHahasModBlocks.GLUE_PLANT);
	public static final RegistryObject<Item> GOOGLY_EYES_HELMET = REGISTRY.register("googly_eyes_helmet", () -> new GooglyEyesItem.Helmet());
	public static final RegistryObject<Item> DIAMOND_DIMENSION = REGISTRY.register("diamond_dimension", () -> new DiamondDimensionItem());
	public static final RegistryObject<Item> CONE = REGISTRY.register("cone", () -> new ConeItem());
	public static final RegistryObject<Item> ICE_CREAM_CONE = REGISTRY.register("ice_cream_cone", () -> new IceCreamConeItem());
	public static final RegistryObject<Item> ICE_CREAM_CONE_PLANT = block(NewRidiculousModForTheHahasModBlocks.ICE_CREAM_CONE_PLANT);
	public static final RegistryObject<Item> GLUE = REGISTRY.register("glue", () -> new GlueItem());
	public static final RegistryObject<Item> M_4 = REGISTRY.register("m_4", () -> new M4Item());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
