package com.connorjbryant.christmasmod.init;

import com.connorjbryant.christmasmod.ChristmasMod;

import net.minecraft.block.Block;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Rarity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FluidInit {
	
	public static final ResourceLocation HOT_COCOA_STILL_RL = new ResourceLocation(ChristmasMod.MOD_ID, "blocks/hot_cocoa_still");
	public static final ResourceLocation HOT_COCOA_FLOWING_RL = new ResourceLocation(ChristmasMod.MOD_ID,
			"blocks/hot_cocoa_flowing");
	public static final ResourceLocation HOT_COCOA_OVERLAY_RL = new ResourceLocation(ChristmasMod.MOD_ID,
			"blocks/hot_cocoa_overlay");

	public static final DeferredRegister<Fluid> FLUIDS = new DeferredRegister<Fluid>(ForgeRegistries.FLUIDS,
			ChristmasMod.MOD_ID);

	public static final RegistryObject<FlowingFluid> HOT_COCOA_FLUID = FLUIDS.register("hot_cocoa_fluid",
			() -> new ForgeFlowingFluid.Source(FluidInit.HOT_COCOA_PROPERTIES));

	public static final RegistryObject<FlowingFluid> HOT_COCOA_FLOWING = FLUIDS.register("hot_cocoa_flowing",
			() -> new ForgeFlowingFluid.Flowing(FluidInit.HOT_COCOA_PROPERTIES));

	public static final ForgeFlowingFluid.Properties HOT_COCOA_PROPERTIES = new ForgeFlowingFluid.Properties(
			() -> HOT_COCOA_FLUID.get(), () -> HOT_COCOA_FLOWING.get(),
			FluidAttributes.builder(HOT_COCOA_STILL_RL, HOT_COCOA_FLOWING_RL).density(5).luminosity(10).rarity(Rarity.RARE)
					.sound(SoundEvents.ITEM_HONEY_BOTTLE_DRINK).overlay(HOT_COCOA_OVERLAY_RL))
							.block(() -> FluidInit.HOT_COCOA_BLOCK.get()).bucket(() -> ItemInit.HOT_COCOA_BUCKET.get());

	public static final RegistryObject<FlowingFluidBlock> HOT_COCOA_BLOCK = BlockInit.BLOCKS.register("hot_cocoa",
			() -> new FlowingFluidBlock(() -> FluidInit.HOT_COCOA_FLUID.get(), Block.Properties.create(Material.WATER)
					.doesNotBlockMovement().hardnessAndResistance(100.0f).noDrops()));

}
