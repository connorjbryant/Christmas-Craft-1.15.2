package com.connorjbryant.christmasmod.init;

import com.connorjbryant.christmasmod.ChristmasMod;
import com.connorjbryant.christmasmod.objects.blocks.AChristmasTreeBlock;
import com.connorjbryant.christmasmod.objects.blocks.CandyBlock;
import com.connorjbryant.christmasmod.objects.blocks.CandyCaneBlock;
import com.connorjbryant.christmasmod.objects.blocks.CandyCaneCrop;
import com.connorjbryant.christmasmod.objects.blocks.CandyDoor;
import com.connorjbryant.christmasmod.objects.blocks.ChristmasSpiritOreBlock;
import com.connorjbryant.christmasmod.objects.blocks.CreatorBlock;
import com.connorjbryant.christmasmod.objects.blocks.CrossBlock;
import com.connorjbryant.christmasmod.objects.blocks.ExampleChestBlock;
import com.connorjbryant.christmasmod.objects.blocks.GiftBlock;
import com.connorjbryant.christmasmod.objects.blocks.JackhammerBlock;
import com.connorjbryant.christmasmod.objects.blocks.KrampusBlock;
import com.connorjbryant.christmasmod.objects.blocks.LeavesBlockCandy;
import com.connorjbryant.christmasmod.objects.blocks.LicoriceChestBlock;
import com.connorjbryant.christmasmod.objects.blocks.LicoriceDoor;
import com.connorjbryant.christmasmod.objects.blocks.ModSaplingBlock;
import com.connorjbryant.christmasmod.objects.blocks.ModSaplingBlock2;
import com.connorjbryant.christmasmod.objects.blocks.ModWoodButtonBlock;
import com.connorjbryant.christmasmod.objects.blocks.PortalBlock;
import com.connorjbryant.christmasmod.objects.blocks.PortalBlock2;
import com.connorjbryant.christmasmod.objects.blocks.SantaHatBlock;
import com.connorjbryant.christmasmod.objects.blocks.SnowfallBlock;
import com.connorjbryant.christmasmod.world.feature.CandyTree;
import com.connorjbryant.christmasmod.world.feature.DimensionTree;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.LogBlock;
import net.minecraft.block.PressurePlateBlock.Sensitivity;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS,
			ChristmasMod.MOD_ID);
	
	public static final RegistryObject<Block> gift_block = BLOCKS.register("gift_block", () -> new GiftBlock(
			Block.Properties.create(Material.WOOL).hardnessAndResistance(0.5f, 15.0f).sound(SoundType.CLOTH)));
	
	public static final RegistryObject<Block> snowfall_block = BLOCKS.register("snowfall_block", () -> new SnowfallBlock(
			Block.Properties.create(Material.SNOW_BLOCK).hardnessAndResistance(0.5f, 15.0f).sound(SoundType.SNOW)));
	
	public static final RegistryObject<Block> krampus_block = BLOCKS.register("krampus_block", () -> new KrampusBlock(
			Block.Properties.create(Material.SNOW_BLOCK).hardnessAndResistance(0.5f, 15.0f).sound(SoundType.SNOW)));
	
	/*public static final RegistryObject<Block> portal_block = BLOCKS.register("portal", () -> new PortalBlock2(
			Block.Properties.create(Material.ROCK).hardnessAndResistance(50.0f, 1200.0f).sound(SoundType.STONE)));*/
	
	//public static final RegistryObject<PortalBlock> PORTAL = BLOCKS.register("portal",
			//() -> new PortalBlock(Block.Properties.create(Material.PORTAL)));
	
	public static final RegistryObject<Block> creator_block = BLOCKS.register("creator_block", () -> new CreatorBlock(
			Block.Properties.create(Material.WOOL).hardnessAndResistance(0.5f, 15.0f).sound(SoundType.CLOTH)));
	
	public static final RegistryObject<Block> christmasspiritoreblock = BLOCKS.register("christmasspiritoreblock", () -> new ChristmasSpiritOreBlock(
			Block.Properties.create(Material.ROCK).hardnessAndResistance(0.5f, 15.0f).sound(SoundType.STONE)));
	
	public static final RegistryObject<Block> candyblock = BLOCKS.register("candyblock", () -> new CandyBlock(
			Block.Properties.create(Material.BAMBOO).hardnessAndResistance(0.5f, 15.0f).sound(SoundType.GLASS)));
	
	public static final RegistryObject<Block> candy_cane_block = BLOCKS.register("candy_cane_block", () -> new CandyCaneBlock(
			Block.Properties.create(Material.BAMBOO).hardnessAndResistance(0.5f, 15.0f).sound(SoundType.GLASS)));
	
	public static final RegistryObject<Block> a_christmas_tree_block = BLOCKS.register("a_christmas_tree_block", () -> new AChristmasTreeBlock(
			Block.Properties.create(Material.BAMBOO).hardnessAndResistance(0.5f, 15.0f).sound(SoundType.PLANT)));
	
	public static final RegistryObject<Block> cross_block = BLOCKS.register("cross_block", () -> new CrossBlock(
			Block.Properties.create(Material.IRON).hardnessAndResistance(0.5f, 15.0f).sound(SoundType.METAL)));
	
	public static final RegistryObject<Block> santa_hat_block = BLOCKS.register("santa_hat_block", () -> new SantaHatBlock(
			Block.Properties.create(Material.WOOL).hardnessAndResistance(0.5f, 15.0f).sound(SoundType.CLOTH)));
	
	public static final RegistryObject<Block> jackhammer = BLOCKS.register("jackhammer",
			() -> new JackhammerBlock(Block.Properties.create(Material.IRON)));
	
	public static final RegistryObject<Block> CANDY_STAIRS = BLOCKS.register("candy_stairs",
			() -> new StairsBlock(() -> BlockInit.candy_planks.get().getDefaultState(),
					Block.Properties.create(Material.SAND, MaterialColor.GOLD)));
	public static final RegistryObject<Block> CANDY_FENCE = BLOCKS.register("candy_fence",
			() -> new FenceBlock(Block.Properties.create(Material.SAND, MaterialColor.GOLD)));
	public static final RegistryObject<Block> CANDY_BUTTON = BLOCKS.register("candy_button",
			() -> new ModWoodButtonBlock(Block.Properties.create(Material.SAND, MaterialColor.GOLD)));
	public static final RegistryObject<Block> CANDY_PRESSURE_PLATE = BLOCKS.register("candy_pressure_plate",
			() -> new ModPressurePlateBlock(Sensitivity.EVERYTHING,
					Block.Properties.create(Material.SAND, MaterialColor.GOLD)));
	
	public static final RegistryObject<Block> DIMENSION_STAIRS = BLOCKS.register("dimension_stairs",
			() -> new StairsBlock(() -> BlockInit.dimension_planks.get().getDefaultState(),
					Block.Properties.create(Material.SAND, MaterialColor.GOLD)));
	public static final RegistryObject<Block> DIMENSION_FENCE = BLOCKS.register("dimension_fence",
			() -> new FenceBlock(Block.Properties.create(Material.SAND, MaterialColor.GOLD)));
	public static final RegistryObject<Block> DIMENSION_BUTTON = BLOCKS.register("dimension_button",
			() -> new ModWoodButtonBlock(Block.Properties.create(Material.SAND, MaterialColor.GOLD)));
	public static final RegistryObject<Block> DIMENSION_PRESSURE_PLATE = BLOCKS.register("dimension_pressure_plate",
			() -> new ModPressurePlateBlock(Sensitivity.EVERYTHING,
					Block.Properties.create(Material.SAND, MaterialColor.GOLD)));
	
	/*public static final RegistryObject<Block> candy_planks = BLOCKS.register("candy_planks", () -> new Block(Block.Properties.from(Blocks.OAK_PLANKS)));
	
	public static final RegistryObject<Block> candy_log = BLOCKS.register("candy_log", () -> new LogBlock(MaterialColor.WOOD, Block.Properties.from(Blocks.OAK_LOG)));
	
	public static final RegistryObject<Block> candy_leaves = BLOCKS.register("candy_leaves", () -> new LeavesBlock(Block.Properties.from(Blocks.OAK_LEAVES)));
	
	public static final RegistryObject<Block> candy_sapling = BLOCKS.register("candy_sapling", () -> new ModSaplingBlock(null, Block.Properties.from(Blocks.OAK_SAPLING)));*/
	
	public static final RegistryObject<Block> candy_planks = BLOCKS.register("candy_planks",
			() -> new Block(Block.Properties.from(Blocks.OAK_PLANKS)));
	
	public static final RegistryObject<Block> dimension_planks = BLOCKS.register("dimension_planks",
			() -> new Block(Block.Properties.from(Blocks.OAK_PLANKS)));

	public static final RegistryObject<Block> candy_log = BLOCKS.register("candy_log",
			() -> new LogBlock(MaterialColor.WOOD, Block.Properties.from(Blocks.OAK_LOG)));

	public static final RegistryObject<Block> candy_leaves = BLOCKS.register("candy_leaves",
			() -> new LeavesBlockCandy(Block.Properties.from(Blocks.OAK_LEAVES)));

	public static final RegistryObject<Block> candy_sapling = BLOCKS.register("candy_sapling",
			() -> new ModSaplingBlock(() -> new CandyTree(), Block.Properties.from(Blocks.OAK_SAPLING)));
	
	public static final RegistryObject<Block> dimension_log = BLOCKS.register("dimension_log",
			() -> new LogBlock(MaterialColor.WOOD, Block.Properties.from(Blocks.OAK_LOG)));

	public static final RegistryObject<Block> dimension_leaves = BLOCKS.register("dimension_leaves",
			() -> new LeavesBlockCandy(Block.Properties.from(Blocks.OAK_LEAVES)));

	public static final RegistryObject<Block> dimension_sapling = BLOCKS.register("dimension_sapling",
			() -> new ModSaplingBlock2(() -> new DimensionTree(), Block.Properties.from(Blocks.OAK_SAPLING)));

	public static final RegistryObject<Block> candy_slab = BLOCKS.register("candy_slab",
			() -> new SlabBlock(Block.Properties.from(BlockInit.candy_planks.get())));
	
	public static final RegistryObject<Block> dimension_slab = BLOCKS.register("dimension_slab",
			() -> new SlabBlock(Block.Properties.from(BlockInit.dimension_planks.get())));
	
	public static final RegistryObject<FenceGateBlock> CANDY_FENCE_GATE = BLOCKS.register("candy_fence_gate",
			() -> new FenceGateBlock(Block.Properties.from(Blocks.ACACIA_FENCE_GATE)));
	
	public static final RegistryObject<FenceGateBlock> DIMENSION_FENCE_GATE = BLOCKS.register("dimension_fence_gate",
			() -> new FenceGateBlock(Block.Properties.from(Blocks.ACACIA_FENCE_GATE)));
	
	public static final RegistryObject<Block> EXAMPLE_CHEST = BLOCKS.register("example_chest",
			() -> new ExampleChestBlock(Block.Properties.from(BlockInit.candy_planks.get())));
	
	public static final RegistryObject<Block> LICORICE_CHEST = BLOCKS.register("licorice_chest",
			() -> new LicoriceChestBlock(Block.Properties.from(BlockInit.candy_planks.get())));
	
	public static final RegistryObject<Block> CANDYCANE_CROP = BLOCKS.register("candycane_crop",
			() -> new CandyCaneCrop(Block.Properties.from(Blocks.WHEAT)));
	
	public static final RegistryObject<Block> CANDY_DOOR = BLOCKS.register("candy_door",
			() -> new CandyDoor(Block.Properties.from(Blocks.OAK_DOOR)));
	
	public static final RegistryObject<Block> LICORICE_DOOR = BLOCKS.register("licorice_door",
			() -> new LicoriceDoor(Block.Properties.from(Blocks.OAK_DOOR)));
	
	
	
	

}
