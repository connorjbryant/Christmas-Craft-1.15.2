package com.connorjbryant.christmasmod.init;

import com.connorjbryant.christmasmod.ChristmasMod;
import com.connorjbryant.christmasmod.tileentity.ExampleChestTileEntity;
import com.connorjbryant.christmasmod.tileentity.JackhammerTileEntity;
import com.connorjbryant.christmasmod.tileentity.LicoriceChestTileEntity;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntityTypes {

	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = new DeferredRegister<>(
			ForgeRegistries.TILE_ENTITIES, ChristmasMod.MOD_ID);

	public static final RegistryObject<TileEntityType<JackhammerTileEntity>> jackhammer = TILE_ENTITY_TYPES.register("jackhammer",
			() -> TileEntityType.Builder.create(JackhammerTileEntity::new, BlockInit.jackhammer.get()).build(null));

	public static final RegistryObject<TileEntityType<ExampleChestTileEntity>> EXAMPLE_CHEST = TILE_ENTITY_TYPES
			.register("example_chest", () -> TileEntityType.Builder
					.create(ExampleChestTileEntity::new, BlockInit.EXAMPLE_CHEST.get()).build(null));
	
	public static final RegistryObject<TileEntityType<LicoriceChestTileEntity>> LICORICE_CHEST = TILE_ENTITY_TYPES
			.register("licorice_chest", () -> TileEntityType.Builder
					.create(LicoriceChestTileEntity::new, BlockInit.LICORICE_CHEST.get()).build(null));

}
