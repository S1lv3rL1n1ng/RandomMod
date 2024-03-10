package net.mcreator.newridiculousmodforthehahas.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.newridiculousmodforthehahas.init.NewRidiculousModForTheHahasModItems;
import net.mcreator.newridiculousmodforthehahas.init.NewRidiculousModForTheHahasModBlocks;

public class IceCreamConePlantPlantRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), NewRidiculousModForTheHahasModBlocks.ICE_CREAM_SCOOP.get().defaultBlockState(), 3);
		if (world instanceof ServerLevel _level) {
			ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(NewRidiculousModForTheHahasModItems.ICE_CREAM_CONE.get()));
			entityToSpawn.setPickUpDelay(10);
			_level.addFreshEntity(entityToSpawn);
		}
	}
}
