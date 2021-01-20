package com.connorjbryant.christmasmod.util;

import com.connorjbryant.christmasmod.ChristmasMod;
import com.connorjbryant.christmasmod.client.entity.gui.ExampleChestScreen;
import com.connorjbryant.christmasmod.client.entity.gui.LicoriceChestScreen;
import com.connorjbryant.christmasmod.client.entity.render.ReindeerEntityRender;
//import com.connorjbryant.christmasmod.client.entity.render.ReindeerEntityRender;
import com.connorjbryant.christmasmod.init.BlockInit;
import com.connorjbryant.christmasmod.init.ItemInit;
import com.connorjbryant.christmasmod.init.ModContainerTypes;
import com.connorjbryant.christmasmod.init.ModEntityTypes;
import com.connorjbryant.christmasmod.init.ModTileEntityTypes;

import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = ChristmasMod.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {
	
	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {

		RenderTypeLookup.setRenderLayer(BlockInit.candy_sapling.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.candy_leaves.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.EXAMPLE_CHEST.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.LICORICE_CHEST.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.CANDYCANE_CROP.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CANDY_DOOR.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.LICORICE_DOOR.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.dimension_sapling.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.dimension_leaves.get(), RenderType.getTranslucent());
		RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.REINDEER_ENTITY.get(), ReindeerEntityRender::new);
		ScreenManager.registerFactory(ModContainerTypes.EXAMPLE_CHEST.get(), ExampleChestScreen::new);
		ScreenManager.registerFactory(ModContainerTypes.LICORICE_CHEST.get(), LicoriceChestScreen::new);



}
}
