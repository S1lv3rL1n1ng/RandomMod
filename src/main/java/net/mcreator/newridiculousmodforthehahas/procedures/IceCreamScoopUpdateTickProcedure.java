package net.mcreator.newridiculousmodforthehahas.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.newridiculousmodforthehahas.init.NewRidiculousModForTheHahasModBlocks;

public class IceCreamScoopUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.FARMLAND)) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.FARMLAND && Math.random() < 0.75
				&& !((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == NewRidiculousModForTheHahasModBlocks.ICE_CREAM_CONE_PLANT.get())) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == NewRidiculousModForTheHahasModBlocks.ICE_CREAM_SCOOP.get()) {
				world.setBlock(BlockPos.containing(x, y, z), NewRidiculousModForTheHahasModBlocks.ICE_CREAM_CONE_PLANT.get().defaultBlockState(), 3);
			}
		}
	}
}
