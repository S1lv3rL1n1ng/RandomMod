package net.mcreator.newridiculousmodforthehahas.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class ConstructOfOblivionPlayerCollidesWithThisEntityProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (Mth.nextInt(RandomSource.create(), 1, 32) == 1) {
			sourceentity.setDeltaMovement(new Vec3((sourceentity.getDeltaMovement().x()), 1, (sourceentity.getDeltaMovement().z())));
		}
	}
}
