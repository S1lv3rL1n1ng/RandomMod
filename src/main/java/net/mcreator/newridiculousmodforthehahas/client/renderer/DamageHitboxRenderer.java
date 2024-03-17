
package net.mcreator.newridiculousmodforthehahas.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.newridiculousmodforthehahas.entity.DamageHitboxEntity;
import net.mcreator.newridiculousmodforthehahas.client.model.Modeldamageentity;

public class DamageHitboxRenderer extends MobRenderer<DamageHitboxEntity, Modeldamageentity<DamageHitboxEntity>> {
	public DamageHitboxRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldamageentity(context.bakeLayer(Modeldamageentity.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(DamageHitboxEntity entity) {
		return new ResourceLocation("new_ridiculous_mod_for_the_hahas:textures/entities/pixil-frame-0_-_2024-03-17t103632.292.png");
	}
}
