package com.connorjbryant.christmasmod.world.feature;

import java.util.Random;

import com.connorjbryant.christmasmod.init.BlockInit;

import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraftforge.common.IPlantable;

public class CandyTree extends Tree {
	
	public static final TreeFeatureConfig CANDY_TREE_CONFIG = (new TreeFeatureConfig.Builder(
			new SimpleBlockStateProvider(BlockInit.candy_log.get().getDefaultState()),
			new SimpleBlockStateProvider(BlockInit.candy_leaves.get().getDefaultState()),
			new BlobFoliagePlacer(2, 0))).baseHeight(5).heightRandA(6).foliageHeight(5).ignoreVines()
					.setSapling((IPlantable) BlockInit.candy_sapling.get()).build();

	@Override
	protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean b) {
		return Feature.NORMAL_TREE.withConfiguration(CANDY_TREE_CONFIG);
	}

}
