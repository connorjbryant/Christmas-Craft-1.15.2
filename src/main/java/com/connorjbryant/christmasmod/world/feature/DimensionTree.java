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

public class DimensionTree extends Tree {
	
	public static final TreeFeatureConfig DIMENSION_TREE_CONFIG = (new TreeFeatureConfig.Builder(
			new SimpleBlockStateProvider(BlockInit.dimension_log.get().getDefaultState()),
			new SimpleBlockStateProvider(BlockInit.dimension_leaves.get().getDefaultState()),
			new BlobFoliagePlacer(3, 2))).baseHeight(20).heightRandA(1).foliageHeight(10).ignoreVines()
					.setSapling((IPlantable) BlockInit.dimension_sapling.get()).build();

	@Override
	protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean b) {
		return Feature.NORMAL_TREE.withConfiguration(DIMENSION_TREE_CONFIG);
	}

}
