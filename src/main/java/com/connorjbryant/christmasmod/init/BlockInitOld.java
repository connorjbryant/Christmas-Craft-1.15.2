package com.connorjbryant.christmasmod.init;

import com.connorjbryant.christmasmod.ChristmasMod;
import com.connorjbryant.christmasmod.ChristmasMod.ChristmasItemGroup;
import com.connorjbryant.christmasmod.objects.blocks.CandyBlock;
import com.connorjbryant.christmasmod.objects.blocks.CandyCaneBlock;
import com.connorjbryant.christmasmod.objects.blocks.ChristmasSpiritOreBlock;
import com.connorjbryant.christmasmod.objects.blocks.AChristmasTreeBlock;
import com.connorjbryant.christmasmod.objects.blocks.CrossBlock;
import com.connorjbryant.christmasmod.objects.blocks.GiftBlock;
import com.connorjbryant.christmasmod.objects.blocks.SantaHatBlock;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(ChristmasMod.MOD_ID)
@Mod.EventBusSubscriber(modid = ChristmasMod.MOD_ID, bus = Bus.MOD)
public class BlockInitOld 
{	
	/*public static final Block gift_block = null;
	public static final Block christmasspiritoreblock = null;
	public static final Block candyblock = null;
	public static final Block candy_cane_block = null;
	public static final Block a_christmas_tree_block= null;
	public static final Block cross_block= null;
	public static final Block santa_hat_block= null;
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) 
	{
		event.getRegistry().register(new GiftBlock(Block.Properties.create(Material.WOOL).hardnessAndResistance(0.8f, 0.8f).sound(SoundType.CLOTH)).setRegistryName("gift_block"));
		event.getRegistry().register(new ChristmasSpiritOreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.8f, 0.8f).sound(SoundType.STONE)).setRegistryName("christmasspiritoreblock"));
		event.getRegistry().register(new CandyBlock(Block.Properties.create(Material.BAMBOO).hardnessAndResistance(0.8f, 0.8f).sound(SoundType.GLASS)).setRegistryName("candyblock"));
		event.getRegistry().register(new CandyCaneBlock(Block.Properties.create(Material.BAMBOO).hardnessAndResistance(0.8f, 0.8f).sound(SoundType.GLASS)).setRegistryName("candy_cane_block"));
		event.getRegistry().register(new AChristmasTreeBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f, 2.0f).sound(SoundType.WOOD)).setRegistryName("a_christmas_tree_block"));
		event.getRegistry().register(new CrossBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0f, 5.0f).sound(SoundType.METAL)).setRegistryName("cross_block"));
		event.getRegistry().register(new SantaHatBlock(Block.Properties.create(Material.WOOL).hardnessAndResistance(0.8f, 0.8f).sound(SoundType.CLOTH)).setRegistryName("santa_hat_block"));
	}
	
	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event) 
	{
		event.getRegistry().register(new BlockItem(gift_block, new Item.Properties().maxStackSize(64).group(ChristmasItemGroup.instance)).setRegistryName("gift_block"));
		event.getRegistry().register(new BlockItem(christmasspiritoreblock, new Item.Properties().maxStackSize(64).group(ChristmasItemGroup.instance)).setRegistryName("christmasspiritoreblock"));
		event.getRegistry().register(new BlockItem(candyblock, new Item.Properties().maxStackSize(64).group(ChristmasItemGroup.instance)).setRegistryName("candyblock"));
		event.getRegistry().register(new BlockItem(candy_cane_block, new Item.Properties().maxStackSize(64).group(ChristmasItemGroup.instance)).setRegistryName("candy_cane_block"));
		event.getRegistry().register(new BlockItem(cross_block, new Item.Properties().maxStackSize(64).group(ChristmasItemGroup.instance)).setRegistryName("cross_block"));
		event.getRegistry().register(new BlockItem(santa_hat_block, new Item.Properties().maxStackSize(64).group(ChristmasItemGroup.instance)).setRegistryName("santa_hat_block"));
		event.getRegistry().register(new BlockItem(a_christmas_tree_block, new Item.Properties().maxStackSize(64).group(ChristmasItemGroup.instance)).setRegistryName("a_christmas_tree_block"));
	}*/

}
