package com.connorjbryant.christmasmod.world.dimension;

import java.util.function.BiFunction;

import net.minecraft.world.World;
import net.minecraft.world.dimension.Dimension;
import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.common.ModDimension;

public class ChristmasModDimension extends ModDimension {
	
	@Override
	public BiFunction<World, DimensionType, ? extends Dimension> getFactory() {
		return ChristmasDimension::new;
	}

}
