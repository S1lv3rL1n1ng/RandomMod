
package net.mcreator.newridiculousmodforthehahas.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.newridiculousmodforthehahas.entity.HeartWrenchEntity;
import net.mcreator.newridiculousmodforthehahas.client.model.ModelPulsarHeart;

public class HeartWrenchRenderer extends MobRenderer<HeartWrenchEntity, ModelPulsarHeart<HeartWrenchEntity>> {
	public HeartWrenchRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPulsarHeart(context.bakeLayer(ModelPulsarHeart.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HeartWrenchEntity entity) {
		return new ResourceLocation("new_ridiculous_mod_for_the_hahas:textures/entities/hearttxt.png");
	}
}
