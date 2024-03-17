
package net.mcreator.newridiculousmodforthehahas.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.newridiculousmodforthehahas.entity.CognizantSkullEntity;
import net.mcreator.newridiculousmodforthehahas.client.model.ModelAwakenedSkull;

public class CognizantSkullRenderer extends MobRenderer<CognizantSkullEntity, ModelAwakenedSkull<CognizantSkullEntity>> {
	public CognizantSkullRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelAwakenedSkull(context.bakeLayer(ModelAwakenedSkull.LAYER_LOCATION)), 1.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CognizantSkullEntity entity) {
		return new ResourceLocation("new_ridiculous_mod_for_the_hahas:textures/entities/skull_-_copy.png");
	}
}
