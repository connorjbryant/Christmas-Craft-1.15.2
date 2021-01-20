package com.connorjbryant.christmasmod.util;

import com.connorjbryant.christmasmod.ChristmasMod;
import com.connorjbryant.christmasmod.init.DimensionInit;

import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.world.RegisterDimensionsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = ChristmasMod.MOD_ID, bus = Bus.FORGE)
public class ForgeEventBusSubscriber {
	
	@SubscribeEvent
	public static void registerDimensions(final RegisterDimensionsEvent event) {
		if (DimensionType.byName(ChristmasMod.CHRISTMAS_DIM_TYPE) == null) {
			DimensionManager.registerDimension(ChristmasMod.CHRISTMAS_DIM_TYPE, DimensionInit.CHRISTMAS_DIM.get(), null,
					true);
		}
		ChristmasMod.LOGGER.info("Dimensions Registered!");
	}

}
