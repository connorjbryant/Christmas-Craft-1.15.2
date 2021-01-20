package com.connorjbryant.christmasmod.init;

import java.util.function.Supplier;

import com.connorjbryant.christmasmod.ChristmasMod;
import com.connorjbryant.christmasmod.ChristmasMod.ChristmasItemGroup;
import com.connorjbryant.christmasmod.objects.items.ChristmasSpiritItem;
import com.connorjbryant.christmasmod.objects.items.ModSpawnEggItem;
import com.connorjbryant.christmasmod.objects.items.RuldophsNoseItem;
import com.connorjbryant.christmasmod.util.enums.ModArmorMaterials;
import com.connorjbryant.christmasmod.util.enums.ModArmorMaterials2;
import com.connorjbryant.christmasmod.util.enums.ModItemTiers;
import com.connorjbryant.christmasmod.util.enums.ModItemTiers2;
import com.connorjbryant.christmasmod.init.SoundInit;
import com.connorjbryant.christmasmod.objects.items.ModMusicDiscItem;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Rarity;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS,
			ChristmasMod.MOD_ID);
	
	//special items
	
	public static final RegistryObject<ChristmasSpiritItem> christmas_spirit = ITEMS.register("christmas_spirit",
			() -> new ChristmasSpiritItem(new Item.Properties().group(ChristmasItemGroup.instance)));
	
	public static final RegistryObject<RuldophsNoseItem> ruldophs_nose_item = ITEMS.register("ruldophs_nose_item",
			() -> new RuldophsNoseItem(new Item.Properties().group(ChristmasItemGroup.instance)));
	
	//food
	public static final RegistryObject<Item> candy = ITEMS.register("candy",
			() -> new Item(new Item.Properties().group(ChristmasItemGroup.instance).food(new Food.Builder().hunger(6)
					.saturation(1.2f).build())));
	
	public static final RegistryObject<Item> candycane = ITEMS.register("candycane",
			() -> new Item(new Item.Properties().group(ChristmasItemGroup.instance).food(new Food.Builder().hunger(6)
					.saturation(1.2f).build())));
	
	public static final RegistryObject<Item> fruitcake = ITEMS.register("fruitcake",
			() -> new Item(new Item.Properties().group(ChristmasItemGroup.instance).food(new Food.Builder().hunger(6)
					.saturation(1.2f).build())));
	
	public static final RegistryObject<Item> gingerbreadman = ITEMS.register("gingerbreadman",
			() -> new Item(new Item.Properties().group(ChristmasItemGroup.instance).food(new Food.Builder().hunger(6)
					.saturation(1.2f).build())));
	
	//candy tools

	public static final RegistryObject<SwordItem> candy_sword = ITEMS.register("candy_sword",
			() -> new SwordItem(ModItemTiers2.CANDYARMOR, 7, 5.0f,
					new Item.Properties().group(ChristmasItemGroup.instance)));

	public static final RegistryObject<PickaxeItem> candy_pickaxe = ITEMS.register("candy_pickaxe",
			() -> new PickaxeItem(ModItemTiers2.CANDYARMOR, 4, 5.0f,
					new Item.Properties().group(ChristmasItemGroup.instance)));

	public static final RegistryObject<ShovelItem> candy_shovel = ITEMS.register("candy_shovel",
			() -> new ShovelItem(ModItemTiers2.CANDYARMOR, 2, 5.0f,
					new Item.Properties().group(ChristmasItemGroup.instance)));

	public static final RegistryObject<AxeItem> candy_axe = ITEMS.register("candy_axe",
			() -> new AxeItem(ModItemTiers2.CANDYARMOR, 11, 5.0f, new Item.Properties().group(ChristmasItemGroup.instance)));

	public static final RegistryObject<HoeItem> candy_hoe = ITEMS.register("candy_hoe",
			() -> new HoeItem(ModItemTiers2.CANDYARMOR, 5.0f, new Item.Properties().group(ChristmasItemGroup.instance)));
	
	//candy cane tools
	
	public static final RegistryObject<SwordItem> candy_cane_sword = ITEMS.register("candy_cane_sword",
			() -> new SwordItem(ModItemTiers.CANDYCANE, 7, 5.0f,
					new Item.Properties().group(ChristmasItemGroup.instance)));

	public static final RegistryObject<PickaxeItem> candy_cane_pickaxe = ITEMS.register("candy_cane_pickaxe",
			() -> new PickaxeItem(ModItemTiers.CANDYCANE, 4, 5.0f,
					new Item.Properties().group(ChristmasItemGroup.instance)));

	public static final RegistryObject<ShovelItem> candy_cane_shovel = ITEMS.register("candy_cane_shovel",
			() -> new ShovelItem(ModItemTiers.CANDYCANE, 2, 5.0f,
					new Item.Properties().group(ChristmasItemGroup.instance)));

	public static final RegistryObject<AxeItem> candy_cane_axe = ITEMS.register("candy_cane_axe",
			() -> new AxeItem(ModItemTiers.CANDYCANE, 11, 5.0f, new Item.Properties().group(ChristmasItemGroup.instance)));

	public static final RegistryObject<HoeItem> candy_cane_hoe = ITEMS.register("candy_cane_hoe",
			() -> new HoeItem(ModItemTiers.CANDYCANE, 5.0f, new Item.Properties().group(ChristmasItemGroup.instance)));
	
	//candy armor
	
	public static final RegistryObject<ArmorItem> candy_helmet = ITEMS.register("candy_helmet",
			() -> new ArmorItem(ModArmorMaterials.CANDYARMOR, EquipmentSlotType.HEAD,
					new Item.Properties().group(ChristmasItemGroup.instance)));

	public static final RegistryObject<ArmorItem> candy_chestplate = ITEMS.register("candy_chestplate",
			() -> new ArmorItem(ModArmorMaterials.CANDYARMOR, EquipmentSlotType.CHEST,
					new Item.Properties().group(ChristmasItemGroup.instance)));

	public static final RegistryObject<ArmorItem> candy_leggings = ITEMS.register("candy_leggings",
			() -> new ArmorItem(ModArmorMaterials.CANDYARMOR, EquipmentSlotType.LEGS,
					new Item.Properties().group(ChristmasItemGroup.instance)));

	public static final RegistryObject<ArmorItem> candy_boots = ITEMS.register("candy_boots",
			() -> new ArmorItem(ModArmorMaterials.CANDYARMOR, EquipmentSlotType.FEET,
					new Item.Properties().group(ChristmasItemGroup.instance)));
	
	//candy cane armor
	
	public static final RegistryObject<ArmorItem> candy_cane_helmet = ITEMS.register("candy_cane_helmet",
			() -> new ArmorItem(ModArmorMaterials2.CANDYCANEARMOR, EquipmentSlotType.HEAD,
						new Item.Properties().group(ChristmasItemGroup.instance)));

	public static final RegistryObject<ArmorItem> candy_cane_chestplate = ITEMS.register("candy_cane_chestplate",
			() -> new ArmorItem(ModArmorMaterials2.CANDYCANEARMOR, EquipmentSlotType.CHEST,
						new Item.Properties().group(ChristmasItemGroup.instance)));

	public static final RegistryObject<ArmorItem> candy_cane_leggings = ITEMS.register("candy_cane_leggings",
			() -> new ArmorItem(ModArmorMaterials2.CANDYCANEARMOR, EquipmentSlotType.LEGS,
						new Item.Properties().group(ChristmasItemGroup.instance)));

	public static final RegistryObject<ArmorItem> candy_cane_boots = ITEMS.register("candy_cane_boots",
			() -> new ArmorItem(ModArmorMaterials2.CANDYCANEARMOR, EquipmentSlotType.FEET,
						new Item.Properties().group(ChristmasItemGroup.instance)));
	
	public static final RegistryObject<BucketItem> HOT_COCOA_BUCKET = ITEMS.register("hot_cocoa_bucket",
			() -> new BucketItem(() -> FluidInit.HOT_COCOA_FLUID.get(),
					new Item.Properties().group(ChristmasItemGroup.instance).maxStackSize(1)));
	
	public static final RegistryObject<ModSpawnEggItem> EXAMPLE_SPAWN_EGG = ITEMS.register("example_spawn_egg",
			() -> new ModSpawnEggItem(ModEntityTypes.REINDEER_ENTITY, 0xC90000, 0x17152,
					new Item.Properties().group(ChristmasItemGroup.instance).maxStackSize(16)));
	
	public static final RegistryObject<BlockItem> SEED_ITEM = ITEMS.register("seed_item",
			() -> new BlockItem(BlockInit.CANDYCANE_CROP.get(), new Item.Properties().group(ChristmasItemGroup.instance)));
	
	/*public static final RegistryObject<ModMusicDiscItem> PROMISES_DISC = ITEMS.register("disc_promises",
			() -> new ModMusicDiscItem(5, SoundInit.LAZY_PROMISES_MUSIC.get(),
					new Item.Properties().group(ChristmasItemGroup.instance).maxStackSize(1).rarity(Rarity.RARE)));*/
		
		
		
		
}
