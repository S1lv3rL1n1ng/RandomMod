
package net.mcreator.newridiculousmodforthehahas.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.newridiculousmodforthehahas.entity.SkullBoiEntity;
import net.mcreator.newridiculousmodforthehahas.client.model.ModelSkullBoiz;

public class SkullBoiRenderer extends MobRenderer<SkullBoiEntity, ModelSkullBoiz<SkullBoiEntity>> {
	public SkullBoiRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSkullBoiz(context.bakeLayer(ModelSkullBoiz.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SkullBoiEntity entity) {
		return new ResourceLocation("new_ridiculous_mod_for_the_hahas:textures/entities/skullboiz.png");
	}
}
