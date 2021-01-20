package com.connorjbryant.christmasmod.init;

import com.connorjbryant.christmasmod.ChristmasMod;
import com.connorjbryant.christmasmod.container.ExampleChestContainer;
import com.connorjbryant.christmasmod.container.LicoriceChestContainer;

import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModContainerTypes {

	public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = new DeferredRegister<>(
			ForgeRegistries.CONTAINERS, ChristmasMod.MOD_ID);

	public static final RegistryObject<ContainerType<ExampleChestContainer>> EXAMPLE_CHEST = CONTAINER_TYPES
			.register("example_chest", () -> IForgeContainerType.create(ExampleChestContainer::new));
	
	public static final RegistryObject<ContainerType<LicoriceChestContainer>> LICORICE_CHEST = CONTAINER_TYPES
			.register("licorice_chest", () -> IForgeContainerType.create(LicoriceChestContainer::new));
}
