package net.tyler.superitalianman.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.tyler.superitalianman.SuperItalianMan;
import net.tyler.superitalianman.entity.custom.GoombaEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class GoombaRenderer extends GeoEntityRenderer<GoombaEntity> {
    public GoombaRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new GoombaModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(GoombaEntity instance) {
        return new ResourceLocation(SuperItalianMan.MOD_ID, "textures/entity/goomba/goomba.png");
    }

    @Override
    public RenderType getRenderType(GoombaEntity animatable, float partialTick, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8F, 0.8F, 0.8F);
        return super.getRenderType(animatable, partialTick, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
