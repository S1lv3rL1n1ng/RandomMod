// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelAwakenedSkull<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "awakenedskull"), "main");
	private final ModelPart bb_main;

	public ModelAwakenedSkull(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-17.0F, -48.0F, -13.0F, 34.0F, 30.0F, 36.0F, new CubeDeformation(0.0F)).texOffs(0, 66)
						.addBox(-10.0F, -25.0F, -12.0F, 20.0F, 14.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(80, 92)
						.addBox(9.0F, -18.0F, -5.0F, 4.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(68, 66)
						.addBox(-14.0F, -18.0F, -6.0F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}