package com.connorjbryant.christmasmod.util.enums;

import java.util.function.Supplier;

import com.connorjbryant.christmasmod.ChristmasMod;
import com.connorjbryant.christmasmod.init.ItemInit;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public enum ModArmorMaterials2 implements IArmorMaterial {
	
	CANDYCANEARMOR(ChristmasMod.MOD_ID + ":candy_cane", 5, new int[] { 7, 9, 11, 7 }, 420, SoundEvents.field_226142_fM_, 6.9F, () -> {
		return Ingredient.fromItems(ItemInit.candy_cane_helmet.get());
	});
	
	private static final int[] MAX_DAMAGE_ARRAY = new int[] {16, 16, 16, 16 };
	private final String name;
	private final int maxDamageFactor;
	private final int[] damageReductionAmountArray;
	private final int enchantability;
	private final SoundEvent soundEvent;
	private final float toughness;
	private final LazyValue<Ingredient> repairMaterial;
	
	private ModArmorMaterials2(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountIn, 
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
		return this.toughness;
	}
	
	
}