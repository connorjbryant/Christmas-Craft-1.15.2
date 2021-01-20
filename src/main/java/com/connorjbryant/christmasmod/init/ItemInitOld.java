package com.connorjbryant.christmasmod.init;

import java.util.function.Supplier;

import com.connorjbryant.christmasmod.ChristmasMod;
import com.connorjbryant.christmasmod.ChristmasMod.ChristmasItemGroup;
import com.connorjbryant.christmasmod.objects.items.ChristmasSpiritItem;
import com.connorjbryant.christmasmod.objects.items.RuldophsNoseItem;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = ChristmasMod.MOD_ID, bus = Bus.MOD)
@ObjectHolder(ChristmasMod.MOD_ID)
public class ItemInitOld {
	/*public static final Item christmas_spirit = null;
	
	//candy tools
	public static final Item candy_axe = null;
	public static final Item candy_hoe = null;
	public static final Item candy_pickaxe = null;
	public static final Item candy_shovel = null;
	public static final Item candy_sword = null;
	
	//candy armor
	public static final Item candy_helmet = null;
	public static final Item candy_chestplate = null;
	public static final Item candy_leggings = null;
	public static final Item candy_boots = null;
	
	//candy cane armor
	public static final Item candy_cane_helmet = null;
	public static final Item candy_cane_chestplate = null;
	public static final Item candy_cane_leggings = null;
	public static final Item candy_cane_boots = null;
	
	//event items
	public static final Item ruldophs_nose_item = null;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry().register(new ChristmasSpiritItem(new Item.Properties().group(ChristmasItemGroup.instance)).setRegistryName("christmas_spirit"));
		event.getRegistry().register(new Item(new Item.Properties().group(ChristmasItemGroup.instance).food(new Food.Builder().hunger(6).saturation(1.2f).build())).setRegistryName("candy"));
		event.getRegistry().register(new Item(new Item.Properties().group(ChristmasItemGroup.instance).food(new Food.Builder().hunger(6).saturation(1.2f).build())).setRegistryName("candycane"));
		event.getRegistry().register(new Item(new Item.Properties().group(ChristmasItemGroup.instance).food(new Food.Builder().hunger(6).saturation(1.2f).build())).setRegistryName("fruitcake"));
		event.getRegistry().register(new Item(new Item.Properties().group(ChristmasItemGroup.instance).food(new Food.Builder().hunger(6).saturation(1.2f).build())).setRegistryName("gingerbreadman"));
		event.getRegistry().register(new RuldophsNoseItem(new Item.Properties().group(ChristmasItemGroup.instance)).setRegistryName("ruldophs_nose_item"));
		
		//tools
		event.getRegistry().register(new SwordItem(CandyToolTier.CANDY, 7, 5.0F, new Item.Properties().group(ChristmasMod.ChristmasItemGroup.instance)).setRegistryName("candy_sword"));
		event.getRegistry().register(new PickaxeItem(CandyToolTier.CANDY, 4, 5.0F, new Item.Properties().group(ChristmasMod.ChristmasItemGroup.instance)).setRegistryName("candy_pickaxe"));
		event.getRegistry().register(new ShovelItem(CandyToolTier.CANDY, 2, 5.0F, new Item.Properties().group(ChristmasMod.ChristmasItemGroup.instance)).setRegistryName("candy_shovel"));
		event.getRegistry().register(new AxeItem(CandyToolTier.CANDY, 11, 5.0F, new Item.Properties().group(ChristmasMod.ChristmasItemGroup.instance)).setRegistryName("candy_axe"));
		event.getRegistry().register(new HoeItem(CandyToolTier.CANDY, 5.0F, new Item.Properties().group(ChristmasMod.ChristmasItemGroup.instance)).setRegistryName("candy_hoe"));
		
		event.getRegistry().register(new SwordItem(CandyCaneToolTier.CANDYCANE, 7, 5.0F, new Item.Properties().group(ChristmasMod.ChristmasItemGroup.instance)).setRegistryName("candy_cane_sword"));
		event.getRegistry().register(new PickaxeItem(CandyCaneToolTier.CANDYCANE, 4, 5.0F, new Item.Properties().group(ChristmasMod.ChristmasItemGroup.instance)).setRegistryName("candy_cane_pickaxe"));
		event.getRegistry().register(new ShovelItem(CandyCaneToolTier.CANDYCANE, 2, 5.0F, new Item.Properties().group(ChristmasMod.ChristmasItemGroup.instance)).setRegistryName("candy_cane_shovel"));
		event.getRegistry().register(new AxeItem(CandyCaneToolTier.CANDYCANE, 11, 5.0F, new Item.Properties().group(ChristmasMod.ChristmasItemGroup.instance)).setRegistryName("candy_cane_axe"));
		event.getRegistry().register(new HoeItem(CandyCaneToolTier.CANDYCANE, 5.0F, new Item.Properties().group(ChristmasMod.ChristmasItemGroup.instance)).setRegistryName("candy_cane_hoe"));
		
		//armor
		event.getRegistry().register(new ArmorItem(CandyArmorMaterial.CANDYARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(ChristmasItemGroup.instance)).setRegistryName("candy_helmet"));
		event.getRegistry().register(new ArmorItem(CandyArmorMaterial.CANDYARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(ChristmasItemGroup.instance)).setRegistryName("candy_chestplate"));
		event.getRegistry().register(new ArmorItem(CandyArmorMaterial.CANDYARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(ChristmasItemGroup.instance)).setRegistryName("candy_leggings"));
		event.getRegistry().register(new ArmorItem(CandyArmorMaterial.CANDYARMOR, EquipmentSlotType.FEET, new Item.Properties().group(ChristmasItemGroup.instance)).setRegistryName("candy_boots"));
		
		event.getRegistry().register(new ArmorItem(CandyCaneArmorMaterial.CANDYCANEARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(ChristmasItemGroup.instance)).setRegistryName("candy_cane_helmet"));
		event.getRegistry().register(new ArmorItem(CandyCaneArmorMaterial.CANDYCANEARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(ChristmasItemGroup.instance)).setRegistryName("candy_cane_chestplate"));
		event.getRegistry().register(new ArmorItem(CandyCaneArmorMaterial.CANDYCANEARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(ChristmasItemGroup.instance)).setRegistryName("candy_cane_leggings"));
		event.getRegistry().register(new ArmorItem(CandyCaneArmorMaterial.CANDYCANEARMOR, EquipmentSlotType.FEET, new Item.Properties().group(ChristmasItemGroup.instance)).setRegistryName("candy_cane_boots"));
	}
	
	public enum CandyToolTier implements IItemTier 
	{
		CANDY(4, 1500, 15.0F, 7.0F, 250, () -> {
			return Ingredient.fromItems(ItemInit.christmas_spirit);
		});
		
		private final int harvestLevel;
		private final int maxUses;
		private final float efficiency;
		private final float attackDamage;
		private final int enchantability;
		private final LazyValue<Ingredient> repairMaterial; 
		
		
		private CandyToolTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial)
		{
			this.harvestLevel = harvestLevel;
			this.maxUses = maxUses;
			this.efficiency = efficiency;
			this.attackDamage = attackDamage;
			this.enchantability = enchantability;
			this.repairMaterial = new LazyValue<>(repairMaterial);
		}


		@Override
		public int getMaxUses() {
			// TODO Auto-generated method stub
			return this.maxUses;
		}


		@Override
		public float getEfficiency() {
			// TODO Auto-generated method stub
			return this.efficiency;
		}


		@Override
		public float getAttackDamage() {
			// TODO Auto-generated method stub
			return this.attackDamage;
		}


		@Override
		public int getHarvestLevel() {
			// TODO Auto-generated method stub
			return this.harvestLevel;
		}


		@Override
		public int getEnchantability() {
			// TODO Auto-generated method stub
			return this.enchantability;
		}


		@Override
		public Ingredient getRepairMaterial() {
			// TODO Auto-generated method stub
			return this.repairMaterial.getValue();
		}
	}
	
	public enum CandyCaneToolTier implements IItemTier 
	{
		CANDYCANE(3, 1400, 14.0F, 6.0F, 200, () -> {
			return Ingredient.fromItems(ItemInit.christmas_spirit);
		});
		
		private final int harvestLevel;
		private final int maxUses;
		private final float efficiency;
		private final float attackDamage;
		private final int enchantability;
		private final LazyValue<Ingredient> repairMaterial; 
		
		
		private CandyCaneToolTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial)
		{
			this.harvestLevel = harvestLevel;
			this.maxUses = maxUses;
			this.efficiency = efficiency;
			this.attackDamage = attackDamage;
			this.enchantability = enchantability;
			this.repairMaterial = new LazyValue<>(repairMaterial);
		}


		@Override
		public int getMaxUses() {
			// TODO Auto-generated method stub
			return this.maxUses;
		}


		@Override
		public float getEfficiency() {
			// TODO Auto-generated method stub
			return this.efficiency;
		}


		@Override
		public float getAttackDamage() {
			// TODO Auto-generated method stub
			return this.attackDamage;
		}


		@Override
		public int getHarvestLevel() {
			// TODO Auto-generated method stub
			return this.harvestLevel;
		}


		@Override
		public int getEnchantability() {
			// TODO Auto-generated method stub
			return this.enchantability;
		}


		@Override
		public Ingredient getRepairMaterial() {
			// TODO Auto-generated method stub
			return this.repairMaterial.getValue();
		}
	}
	
	//candy armor
	public enum CandyArmorMaterial implements IArmorMaterial 
	{
		CANDYARMOR(ChristmasMod.MOD_ID + ":candy", 5, new int[] { 6, 8, 10, 6 }, 320, SoundEvents.field_226142_fM_, 6.8F, () -> {
			return Ingredient.fromItems(ItemInit.candy_helmet);
		});
		
		private static final int[] MAX_DAMAGE_ARRAY = new int[] {16, 16, 16, 16 };
		private final String name;
		private final int maxDamageFactor;
		private final int[] damageReductionAmountArray;
		private final int enchantability;
		private final SoundEvent soundEvent;
		private final float toughness;
		private final LazyValue<Ingredient> repairMaterial;
		
		private CandyArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountIn, 
				int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn, 
				Supplier<Ingredient> repairMaterialIn){
			this.name = nameIn;
			this.maxDamageFactor = maxDamageFactorIn;
			this.damageReductionAmountArray = damageReductionAmountIn;
			this.enchantability = enchantabilityIn;
			this.soundEvent = soundEventIn;
			this.toughness = toughnessIn;
			this.repairMaterial = new LazyValue<>(repairMaterialIn);
		}

		@Override
		public int getDurability(EquipmentSlotType slotIn) {
			return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
		}

		@Override
		public int getDamageReductionAmount(EquipmentSlotType slotIn) {
			return this.damageReductionAmountArray[slotIn.getIndex()];
		}

		@Override
		public int getEnchantability() {
			return this.enchantability;
		}

		@Override
		public SoundEvent getSoundEvent() {
			return this.soundEvent;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return this.repairMaterial.getValue();
		}

		@OnlyIn(Dist.CLIENT)
		@Override
		public String getName() {
			return this.name;
		}

		@Override
		public float getToughness() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		
	}
	
	//candy armor
		public enum CandyCaneArmorMaterial implements IArmorMaterial 
		{
			CANDYCANEARMOR(ChristmasMod.MOD_ID + ":candy_cane", 5, new int[] { 7, 9, 11, 7 }, 420, SoundEvents.field_226142_fM_, 6.9F, () -> {
				return Ingredient.fromItems(ItemInit.candy_helmet);
			});
			
			private static final int[] MAX_DAMAGE_ARRAY = new int[] {16, 16, 16, 16 };
			private final String name;
			private final int maxDamageFactor;
			private final int[] damageReductionAmountArray;
			private final int enchantability;
			private final SoundEvent soundEvent;
			private final float toughness;
			private final LazyValue<Ingredient> repairMaterial;
			
			private CandyCaneArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountIn, 
					int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn, 
					Supplier<Ingredient> repairMaterialIn){
				this.name = nameIn;
				this.maxDamageFactor = maxDamageFactorIn;
				this.damageReductionAmountArray = damageReductionAmountIn;
				this.enchantability = enchantabilityIn;
				this.soundEvent = soundEventIn;
				this.toughness = toughnessIn;
				this.repairMaterial = new LazyValue<>(repairMaterialIn);
			}

			@Override
			public int getDurability(EquipmentSlotType slotIn) {
				return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slotIn) {
				return this.damageReductionAmountArray[slotIn.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return this.enchantability;
			}

			@Override
			public SoundEvent getSoundEvent() {
				return this.soundEvent;
			}

			@Override
			public Ingredient getRepairMaterial() {
				return this.repairMaterial.getValue();
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return this.name;
			}

			@Override
			public float getToughness() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			
		}*/
}
