package net.mcreator.newridiculousmodforthehahas.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.newridiculousmodforthehahas.entity.ConstructOfOblivionEntity;

public class ConstructOfOblivionModel extends GeoModel<ConstructOfOblivionEntity> {
	@Override
	public ResourceLocation getAnimationResource(ConstructOfOblivionEntity entity) {
		return new ResourceLocation("new_ridiculous_mod_for_the_hahas", "animations/coo6.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ConstructOfOblivionEntity entity) {
		return new ResourceLocation("new_ridiculous_mod_for_the_hahas", "geo/coo6.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ConstructOfOblivionEntity entity) {
		return new ResourceLocation("new_ridiculous_mod_for_the_hahas", "textures/entities/" + entity.getTexture() + ".png");
	}

}
