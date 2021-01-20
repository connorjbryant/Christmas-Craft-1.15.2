package com.connorjbryant.christmasmod.world.dimension;

import net.minecraft.block.Blocks;
import net.minecraft.world.gen.GenerationSettings;

public class ChristmasGenSettings extends GenerationSettings {
	
	public ChristmasGenSettings(){
        this.defaultBlock = Blocks.STONE.getDefaultState();
    }
	
	public int getBiomeSize() {
		return 4;
	}

	public int getRiverSize() {
		return 4;
	}

	public int getBiomeId() {
		return -1;
	}

	@Override
	public int getBedrockFloorHeight() {
		return 0;
	}

}
