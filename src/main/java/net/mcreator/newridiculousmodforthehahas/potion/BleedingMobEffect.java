
package net.mcreator.newridiculousmodforthehahas.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class BleedingMobEffect extends MobEffect {
	public BleedingMobEffect() {
		super(MobEffectCategory.HARMFUL, -52429);
	}

	@Override
	public String getDescriptionId() {
		return "effect.new_ridiculous_mod_for_the_hahas.bleeding";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
