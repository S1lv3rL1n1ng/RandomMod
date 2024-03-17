package net.mcreator.newridiculousmodforthehahas.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

import net.mcreator.newridiculousmodforthehahas.entity.SkullBoiEntity;
import net.mcreator.newridiculousmodforthehahas.entity.HeartWrenchEntity;
import net.mcreator.newridiculousmodforthehahas.entity.CognizantSkullEntity;

public class FleshySpikeEntityCollidesInTheBlockProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof CognizantSkullEntity) && !(entity instanceof SkullBoiEntity) && !(entity instanceof HeartWrenchEntity)) {
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.STALAGMITE)), 2);
		}
	}
}
