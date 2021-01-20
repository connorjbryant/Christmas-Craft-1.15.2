package com.connorjbryant.christmasmod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.connorjbryant.christmasmod.init.BiomeInit;
import com.connorjbryant.christmasmod.init.BiomeInit2;
import com.connorjbryant.christmasmod.init.BlockInit;
import com.connorjbryant.christmasmod.init.DimensionInit;
import com.connorjbryant.christmasmod.init.FluidInit;
import com.connorjbryant.christmasmod.init.ItemInit;
import com.connorjbryant.christmasmod.init.ModContainerTypes;
import com.connorjbryant.christmasmod.init.ModEntityTypes;
import com.connorjbryant.christmasmod.init.ModTileEntityTypes;
import com.connorjbryant.christmasmod.objects.blocks.CandyCaneCrop;
import com.connorjbryant.christmasmod.world.gen.ChristmasOreGeneration;
import com.connorjbryant.christmasmod.init.SoundInit;

import net.minecraft.block.ComposterBlock;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
//import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

@SuppressWarnings("deprecation")
@Mod("christmasmod")
@Mod.EventBusSubscriber(modid = ChristmasMod.MOD_ID, bus = Bus.MOD)
public class ChristmasMod {

	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "christmasmod";
	public static ChristmasMod instance;
	//public static final WorldType CHRISTMAS_WORLDTYPE = new ChristmasWorldType();
	public static final ResourceLocation CHRISTMAS_DIM_TYPE = new ResourceLocation(MOD_ID, "christmas");

	public ChristmasMod() {
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ItemInit.ITEMS.register(modEventBus);
		BlockInit.BLOCKS.register(modEventBus);
		FluidInit.FLUIDS.register(modEventBus);
		ModTileEntityTypes.TILE_ENTITY_TYPES.register(modEventBus);
		ModEntityTypes.ENTITY_TYPES.register(modEventBus);
		ModContainerTypes.CONTAINER_TYPES.register(modEventBus);
		BiomeInit.BIOMES.register(modEventBus);
		BiomeInit2.BIOMES.register(modEventBus);
		DimensionInit.MOD_DIMENSIONS.register(modEventBus);
		//SoundInit.SOUNDS.register(modEventBus);

		instance = this;
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();

		BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get)
		.filter(block -> !(block instanceof CandyCaneCrop) && !(block instanceof FlowingFluidBlock))
		.forEach(block -> {
			final Item.Properties properties = new Item.Properties().group(ChristmasItemGroup.instance);
			final BlockItem blockItem = new BlockItem(block, properties);
			blockItem.setRegistryName(block.getRegistryName());
			registry.register(blockItem);
		});

		LOGGER.debug("Registered BlockItems!");
	}
	
	@SubscribeEvent
	public static void onRegisterBiomes(final RegistryEvent.Register<Biome> event) {
		BiomeInit.registerBiomes();
	}

	@SubscribeEvent
	public static void onServerStarting(FMLServerStartingEvent event) {

	}

	@SubscribeEvent
	public static void loadCompleteEvent(FMLLoadCompleteEvent event) {
		// This doesnt work anymore
		ChristmasOreGeneration.generate();
	}

	@SubscribeEvent
	public static void onRegisterEntities(final RegistryEvent.Register<EntityType<?>> event) {
		//ModSpawnEggItem.initSpawnEggs();
	}

	public static class ChristmasItemGroup extends ItemGroup {
		public static final ChristmasItemGroup instance = new ChristmasItemGroup(ItemGroup.GROUPS.length, "christmastab");

		private ChristmasItemGroup(int index, String label) {
			super(index, label);
		}

		@Override
		public ItemStack createIcon() {
			return new ItemStack(BlockInit.candy_cane_block.get());
		}
	}
}