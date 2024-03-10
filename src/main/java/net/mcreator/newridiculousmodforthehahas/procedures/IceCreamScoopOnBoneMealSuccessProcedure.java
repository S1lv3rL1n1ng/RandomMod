package net.mcreator.newridiculousmodforthehahas.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.newridiculousmodforthehahas.init.NewRidiculousModForTheHahasModBlocks;

public class IceCreamScoopOnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double RNG = 0;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == NewRidiculousModForTheHahasModBlocks.ICE_CREAM_SCOOP.get()) {
			RNG = Mth.nextInt(RandomSource.create(), 0, 1);
			if (RNG == 0) {
				world.setBlock(BlockPos.containing(x, y, z), NewRidiculousModForTheHahasModBlocks.ICE_CREAM_CONE_PLANT.get().defaultBlockState(), 3);
			}
		}
	}
}
