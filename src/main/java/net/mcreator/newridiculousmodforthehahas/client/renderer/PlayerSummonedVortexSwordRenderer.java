
package net.mcreator.newridiculousmodforthehahas.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.newridiculousmodforthehahas.entity.PlayerSummonedVortexSwordEntity;
import net.mcreator.newridiculousmodforthehahas.client.model.ModelVortexSword;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PlayerSummonedVortexSwordRenderer extends MobRenderer<PlayerSummonedVortexSwordEntity, ModelVortexSword<PlayerSummonedVortexSwordEntity>> {
	public PlayerSummonedVortexSwordRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelVortexSword(context.bakeLayer(ModelVortexSword.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<PlayerSummonedVortexSwordEntity, ModelVortexSword<PlayerSummonedVortexSwordEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("new_ridiculous_mod_for_the_hahas:textures/entities/vortexsworddual.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PlayerSummonedVortexSwordEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, 15728640, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(PlayerSummonedVortexSwordEntity entity) {
		return new ResourceLocation("new_ridiculous_mod_for_the_hahas:textures/entities/blanktxt.png");
	}
}
