package com.connorjbryant.christmasmod.world.dimension;

import net.minecraft.world.WorldType;
import net.minecraft.world.biome.provider.IBiomeProviderSettings;
import net.minecraft.world.storage.WorldInfo;

public class ChristmasBiomeProviderSettings implements IBiomeProviderSettings {
	
	private final long seed;
	private final WorldType worldType;
	private ChristmasGenSettings generatorSettings = new ChristmasGenSettings();

	public ChristmasBiomeProviderSettings(WorldInfo info) {
		this.seed = info.getSeed();
		this.worldType = info.getGenerator();
	}

	public ChristmasBiomeProviderSettings setGeneratorSettings(ChristmasGenSettings settings) {
		this.generatorSettings = settings;
		return this;
	}

	public long getSeed() {
		return this.seed;
	}

	public WorldType getWorldType() {
		return this.worldType;
	}

	public ChristmasGenSettings getGeneratorSettings() {
		return this.generatorSettings;
	}

}
