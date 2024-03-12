
package net.mcreator.newridiculousmodforthehahas.client.renderer;

public class ArcaneHuskRenderer extends HumanoidMobRenderer<ArcaneHuskEntity, HumanoidModel<ArcaneHuskEntity>> {

	public ArcaneHuskRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));

		this.addLayer(new RenderLayer<ArcaneHuskEntity, HumanoidModel<ArcaneHuskEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("new_ridiculous_mod_for_the_hahas:textures/entities/e238fbf0c9764f06915a3c0e5762049d3a108aab.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, ArcaneHuskEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, 15728640, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(ArcaneHuskEntity entity) {
		return new ResourceLocation("new_ridiculous_mod_for_the_hahas:textures/entities/e238fbf0c9764f06915a3c0e5762049d3a108aab.png");
	}

}
