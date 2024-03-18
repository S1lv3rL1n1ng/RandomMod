
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

import net.mcreator.newridiculousmodforthehahas.item.WoodenScytheItem;
import net.mcreator.newridiculousmodforthehahas.item.StoneScytheItem;
import net.mcreator.newridiculousmodforthehahas.item.PulsatingHeartItem;
import net.mcreator.newridiculousmodforthehahas.item.PetRockItem;
import net.mcreator.newridiculousmodforthehahas.item.NetheriteScytheItem;
import net.mcreator.newridiculousmodforthehahas.item.M4Item;
import net.mcreator.newridiculousmodforthehahas.item.IronScytheItem;
import net.mcreator.newridiculousmodforthehahas.item.IceCreamConeItem;
import net.mcreator.newridiculousmodforthehahas.item.GooglyEyesItem;
import net.mcreator.newridiculousmodforthehahas.item.GoldScytheItem;
import net.mcreator.newridiculousmodforthehahas.item.GlueItem;
import net.mcreator.newridiculousmodforthehahas.item.GIANTSTICKItem;
import net.mcreator.newridiculousmodforthehahas.item.DiamondScytheItem;
import net.mcreator.newridiculousmodforthehahas.item.DiamondDimensionItem;
import net.mcreator.newridiculousmodforthehahas.item.DemiseItem;
import net.mcreator.newridiculousmodforthehahas.item.ConeItem;
import net.mcreator.newridiculousmodforthehahas.item.AncientArchitectCoreItem;
import net.mcreator.newridiculousmodforthehahas.NewRidiculousModForTheHahasMod;

public class NewRidiculousModForTheHahasModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NewRidiculousModForTheHahasMod.MODID);
	public static final RegistryObject<Item> GIANTSTICK = REGISTRY.register("giantstick", () -> new GIANTSTICKItem());
	public static final RegistryObject<Item> PET_ROCK = REGISTRY.register("pet_rock", () -> new PetRockItem());
	public static final RegistryObject<Item> GLUE = REGISTRY.register("glue", () -> new GlueItem());
	public static final RegistryObject<Item> GOOGLY_EYES_HELMET = REGISTRY.register("googly_eyes_helmet", () -> new GooglyEyesItem.Helmet());
	public static final RegistryObject<Item> CONE = REGISTRY.register("cone", () -> new ConeItem());
	public static final RegistryObject<Item> ICE_CREAM_CONE = REGISTRY.register("ice_cream_cone", () -> new IceCreamConeItem());
	public static final RegistryObject<Item> M_4 = REGISTRY.register("m_4", () -> new M4Item());
	public static final RegistryObject<Item> WOODEN_SCYTHE = REGISTRY.register("wooden_scythe", () -> new WoodenScytheItem());
	public static final RegistryObject<Item> STONE_SCYTHE = REGISTRY.register("stone_scythe", () -> new StoneScytheItem());
	public static final RegistryObject<Item> IRON_SCYTHE = REGISTRY.register("iron_scythe", () -> new IronScytheItem());
	public static final RegistryObject<Item> GOLD_SCYTHE = REGISTRY.register("gold_scythe", () -> new GoldScytheItem());
	public static final RegistryObject<Item> DIAMOND_SCYTHE = REGISTRY.register("diamond_scythe", () -> new DiamondScytheItem());
	public static final RegistryObject<Item> NETHERITE_SCYTHE = REGISTRY.register("netherite_scythe", () -> new NetheriteScytheItem());
	public static final RegistryObject<Item> DEMISE = REGISTRY.register("demise", () -> new DemiseItem());
	public static final RegistryObject<Item> PULSATING_HEART = REGISTRY.register("pulsating_heart", () -> new PulsatingHeartItem());
	public static final RegistryObject<Item> FLESH_BLOCK = block(NewRidiculousModForTheHahasModBlocks.FLESH_BLOCK);
	public static final RegistryObject<Item> ENCHANTMENT_ARCHITECT = block(NewRidiculousModForTheHahasModBlocks.ENCHANTMENT_ARCHITECT);
	public static final RegistryObject<Item> GLUE_PLANT = block(NewRidiculousModForTheHahasModBlocks.GLUE_PLANT);
	public static final RegistryObject<Item> ICE_CREAM_CONE_PLANT = block(NewRidiculousModForTheHahasModBlocks.ICE_CREAM_CONE_PLANT);
	public static final RegistryObject<Item> ICE_CREAM_SCOOP = block(NewRidiculousModForTheHahasModBlocks.ICE_CREAM_SCOOP);
	public static final RegistryObject<Item> DIAMOND_DIMENSION = REGISTRY.register("diamond_dimension", () -> new DiamondDimensionItem());
	public static final RegistryObject<Item> TRIAL_TOTEM = block(NewRidiculousModForTheHahasModBlocks.TRIAL_TOTEM);
	public static final RegistryObject<Item> ANCIENT_ARCHITECT_CORE = REGISTRY.register("ancient_architect_core", () -> new AncientArchitectCoreItem());
	public static final RegistryObject<Item> SUSPICIOUS_SKULL = block(NewRidiculousModForTheHahasModBlocks.SUSPICIOUS_SKULL);
	public static final RegistryObject<Item> BONE_SPIKE = block(NewRidiculousModForTheHahasModBlocks.BONE_SPIKE);
	public static final RegistryObject<Item> SKULL_BLOCK = block(NewRidiculousModForTheHahasModBlocks.SKULL_BLOCK);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
