package com.connorjbryant.christmasmod.init;

import com.connorjbryant.christmasmod.ChristmasMod;
import com.connorjbryant.christmasmod.world.biomes.ChristmasBiome;
import com.connorjbryant.christmasmod.world.biomes.ChristmasBiomeSurfaceBuilder;

import net.minecraft.block.Blocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.biome.Biome.RainType;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.ISurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomeInit {
	
	public static final DeferredRegister<Biome> BIOMES = new DeferredRegister<>(ForgeRegistries.BIOMES,
			ChristmasMod.MOD_ID);

	public static final RegistryObject<Biome> CHRISTMAS_BIOME = BIOMES
			.register("christmas_biome",
					() -> new ChristmasBiome(
							new Biome.Builder().precipitation(RainType.SNOW).scale(1.2f).temperature(0.5f)
									.waterColor(16724639).waterFogColor(16762304)
									.surfaceBuilder(
											new ConfiguredSurfaceBuilder<SurfaceBuilderConfig>(
													register("christmas_surface",
															new ChristmasBiomeSurfaceBuilder(
																	SurfaceBuilderConfig::deserialize)),
													new SurfaceBuilderConfig(Blocks.COARSE_DIRT.getDefaultState(),
															Blocks.DIRT.getDefaultState(),
															Blocks.DIRT.getDefaultState())))
									.category(Category.PLAINS).downfall(0.5f).depth(0.12f).parent(null)));

	public static void registerBiomes() {
		registerBiome(CHRISTMAS_BIOME.get(), Type.PLAINS, Type.OVERWORLD);
	}

	private static void registerBiome(Biome biome, Type... types) {
		// the line below will make it spawn in the overworld
		BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(biome, 100));
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addSpawnBiome(biome);
	}

	@SuppressWarnings("deprecation")
	private static <C extends ISurfaceBuilderConfig, F extends SurfaceBuilder<C>> F register(String key, F builderIn) {
		return (F) (Registry.<SurfaceBuilder<?>>register(Registry.SURFACE_BUILDER, key, builderIn));
	}
	
	

}
