package net.mcreator.newridiculousmodforthehahas.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class IceCreamScoopOnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double RNG = 0;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == NewRidiculousModForTheHahasModItems.DELETED_MOD_ELEMENT.get()) {
			RNG = Mth.nextInt(RandomSource.create(), 0, 1);
			if (RNG == 0) {
				world.setBlock(BlockPos.containing(x, y, z), NewRidiculousModForTheHahasModBlocks.ICE_CREAM_CONE_PLANT.get().defaultBlockState(), 3);
			}
		}
	}
}
