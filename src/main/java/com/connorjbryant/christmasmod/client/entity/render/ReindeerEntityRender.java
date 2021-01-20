package com.connorjbryant.christmasmod.client.entity.render;

import com.connorjbryant.christmasmod.ChristmasMod;
import com.connorjbryant.christmasmod.client.entity.model.ReindeerEntityModel;
//import com.connorjbryant.christmasmod.client.entity.model.ReindeerEntityModel;
import com.connorjbryant.christmasmod.entities.ReindeerEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ReindeerEntityRender extends MobRenderer<ReindeerEntity, ReindeerEntityModel<ReindeerEntity>> {
	
	protected static final ResourceLocation TEXTURE = new ResourceLocation(ChristmasMod.MOD_ID,
			"textures/entity/reindeer_entity.png");

	public ReindeerEntityRender(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new ReindeerEntityModel(), 0.5f);
	}

	@Override
	public ResourceLocation getEntityTexture(ReindeerEntity entity) {
		return TEXTURE;
	}

}
