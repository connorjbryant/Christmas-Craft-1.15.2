// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
package com.connorjbryant.christmasmod.client.entity.model;

import com.connorjbryant.christmasmod.entities.ReindeerEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ReindeerEntityModel<T extends ReindeerEntity> extends EntityModel<T> {
	private final ModelRenderer field_78200_a;
	private final ModelRenderer field_78197_d;
	private final ModelRenderer field_78199_c;
	private final ModelRenderer field_78198_b;

	public ReindeerEntityModel() {
		textureWidth = 64;
		textureHeight = 32;

		field_78200_a = new ModelRenderer(this);
		field_78200_a.setRotationPoint(0.0F, 0.0F, 0.0F);
		field_78200_a.setTextureOffset(0, 16).addBox(-3.0F, 17.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);

		field_78197_d = new ModelRenderer(this);
		field_78197_d.setRotationPoint(0.0F, 0.0F, 0.0F);
		field_78197_d.setTextureOffset(32, 8).addBox(0.0F, 21.0F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		field_78199_c = new ModelRenderer(this);
		field_78199_c.setRotationPoint(0.0F, 0.0F, 0.0F);
		field_78199_c.setTextureOffset(32, 4).addBox(1.25F, 18.0F, -3.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		field_78198_b = new ModelRenderer(this);
		field_78198_b.setRotationPoint(0.0F, 0.0F, 0.0F);
		field_78198_b.setTextureOffset(32, 0).addBox(-3.25F, 18.0F, -3.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		field_78200_a.render(matrixStack, buffer, packedLight, packedOverlay);
		field_78197_d.render(matrixStack, buffer, packedLight, packedOverlay);
		field_78199_c.render(matrixStack, buffer, packedLight, packedOverlay);
		field_78198_b.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
	
	
}