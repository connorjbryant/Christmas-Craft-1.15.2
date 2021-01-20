package com.connorjbryant.christmasmod.init;

import com.connorjbryant.christmasmod.ChristmasMod;
import com.connorjbryant.christmasmod.entities.ReindeerEntity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {
	
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES,
			ChristmasMod.MOD_ID);

	public static final RegistryObject<EntityType<ReindeerEntity>> REINDEER_ENTITY = ENTITY_TYPES
			.register("reindeer_entity",
					() -> EntityType.Builder.<ReindeerEntity>create(ReindeerEntity::new, EntityClassification.CREATURE)
							.size(0.9f, 1.3f)
							.build(new ResourceLocation(ChristmasMod.MOD_ID, "reindeer_entity").toString()));

}
