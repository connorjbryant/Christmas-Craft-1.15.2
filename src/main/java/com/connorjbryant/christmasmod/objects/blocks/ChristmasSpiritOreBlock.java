package com.connorjbryant.christmasmod.objects.blocks;

import java.util.Random;

import net.minecraft.block.OreBlock;
import net.minecraft.util.math.MathHelper;

public class ChristmasSpiritOreBlock extends OreBlock {

	public ChristmasSpiritOreBlock(Properties properties) {
		super(properties);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected int getExperience(Random rand) {
		// TODO Auto-generated method stub
		return MathHelper.nextInt(rand, 2, 10);
	}

}
