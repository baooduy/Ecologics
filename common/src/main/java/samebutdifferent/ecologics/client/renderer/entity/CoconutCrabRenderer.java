package samebutdifferent.ecologics.client.renderer.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.jetbrains.annotations.Nullable;
import samebutdifferent.ecologics.client.model.CoconutCrabModel;
import samebutdifferent.ecologics.entity.CoconutCrab;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

@Environment(EnvType.CLIENT)
public class CoconutCrabRenderer extends GeoEntityRenderer<CoconutCrab> {

    public CoconutCrabRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new CoconutCrabModel());
        this.shadowRadius = 0.6F;
    }

    @Override
    public ResourceLocation getTextureLocation(CoconutCrab entity) {
        return getTextureResource(entity);
    }

    @Override
    public RenderType getRenderType(CoconutCrab animatable, float partialTicks, PoseStack stack, @Nullable MultiBufferSource renderTypeBuffer, @Nullable VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
        return RenderType.entityCutoutNoCull(textureLocation);
    }
}
