package com.connorjbryant.christmasmod.init;

import com.connorjbryant.christmasmod.ChristmasMod;
import com.connorjbryant.christmasmod.world.dimension.ChristmasModDimension;

import net.minecraftforge.common.ModDimension;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class DimensionInit {
	
public static final DeferredRegister<ModDimension> MOD_DIMENSIONS = new DeferredRegister<>(ForgeRegistries.MOD_DIMENSIONS, ChristmasMod.MOD_ID);
	
	public static final RegistryObject<ModDimension> CHRISTMAS_DIM = MOD_DIMENSIONS.register("christmas_dim", () -> new ChristmasModDimension());

}
