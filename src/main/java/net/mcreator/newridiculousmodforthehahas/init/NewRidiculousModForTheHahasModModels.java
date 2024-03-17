
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newridiculousmodforthehahas.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.newridiculousmodforthehahas.client.model.Modeldamageentity;
import net.mcreator.newridiculousmodforthehahas.client.model.ModelSkullBoiz;
import net.mcreator.newridiculousmodforthehahas.client.model.ModelPulsarHeart;
import net.mcreator.newridiculousmodforthehahas.client.model.ModelBloodshot;
import net.mcreator.newridiculousmodforthehahas.client.model.ModelAwakenedSkull;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class NewRidiculousModForTheHahasModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelBloodshot.LAYER_LOCATION, ModelBloodshot::createBodyLayer);
		event.registerLayerDefinition(ModelPulsarHeart.LAYER_LOCATION, ModelPulsarHeart::createBodyLayer);
		event.registerLayerDefinition(ModelAwakenedSkull.LAYER_LOCATION, ModelAwakenedSkull::createBodyLayer);
		event.registerLayerDefinition(ModelSkullBoiz.LAYER_LOCATION, ModelSkullBoiz::createBodyLayer);
		event.registerLayerDefinition(Modeldamageentity.LAYER_LOCATION, Modeldamageentity::createBodyLayer);
	}
}
