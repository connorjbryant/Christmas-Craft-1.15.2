package com.connorjbryant.christmasmod.portal;

import com.connorjbryant.christmasmod.ChristmasMod;
import com.connorjbryant.christmasmod.init.BlockInit;

import net.minecraft.block.BlockState;
import net.minecraft.block.FireBlock;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = ChristmasMod.MOD_ID, bus = Bus.FORGE)
public class PortalEvent {
	
	@SubscribeEvent
	public static void createPortal(BlockEvent.EntityPlaceEvent event) {
		BlockState state = event.getPlacedBlock();
		if (state.getBlock() instanceof FireBlock) {
			//BlockInit.PORTAL.get().trySpawnPortal(event.getWorld(), event.getPos());
		}
	}

}
