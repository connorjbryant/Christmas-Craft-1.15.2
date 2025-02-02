package com.connorjbryant.christmasmod.world.gen;

import com.connorjbryant.christmasmod.init.BlockInit;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class ChristmasOreGeneration {

	private static void setupOreGeneration() {
		for (Biome biome : ForgeRegistries.BIOMES) {
			biome.addFeature(Decoration.UNDERGROUND_ORES,
					Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
							BlockInit.christmasspiritoreblock.get().getDefaultState(), 10)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 5, 0, 128))));
		}
	}
	
	public static void generate() {
		setupOreGeneration();
	}

}
