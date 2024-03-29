
package net.mcreator.newridiculousmodforthehahas.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.newridiculousmodforthehahas.entity.model.ConstructOfOblivionModel;
import net.mcreator.newridiculousmodforthehahas.entity.layer.ConstructOfOblivionLayer;
import net.mcreator.newridiculousmodforthehahas.entity.ConstructOfOblivionEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ConstructOfOblivionRenderer extends GeoEntityRenderer<ConstructOfOblivionEntity> {
	public ConstructOfOblivionRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ConstructOfOblivionModel());
		this.shadowRadius = 0.5f;
		this.addRenderLayer(new ConstructOfOblivionLayer(this));
	}

	@Override
	public RenderType getRenderType(ConstructOfOblivionEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, ConstructOfOblivionEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
