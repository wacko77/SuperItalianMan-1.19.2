package net.tyler.superitalianman.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.tyler.superitalianman.SuperItalianMan;
import net.tyler.superitalianman.entity.custom.GoombaEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GoombaModel extends AnimatedGeoModel<GoombaEntity> {
    @Override
    public ResourceLocation getModelResource(GoombaEntity object) {
        return new ResourceLocation(SuperItalianMan.MOD_ID, "geo/goomba.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GoombaEntity object) {
        return new ResourceLocation(SuperItalianMan.MOD_ID, "textures/entity/goomba/goomba.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GoombaEntity animatable) {
        return new ResourceLocation(SuperItalianMan.MOD_ID, "animations/goomba.animation.json");
    }
}
