package com.connorjbryant.christmasmod.util.enums;

import java.util.function.Supplier;

import com.connorjbryant.christmasmod.init.ItemInit;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum ModItemTiers2 implements IItemTier {
	
	CANDYARMOR(4, 1500, 15.0F, 7.0F, 250, () -> {
		return Ingredient.fromItems(ItemInit.christmas_spirit.get());
	});
	
	private final int harvestLevel;
	private final int maxUses;
	private final float efficiency;
	private final float attackDamage;
	private final int enchantability;
	private final LazyValue<Ingredient> repairMaterial; 
	
	
	private ModItemTiers2(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability,
			Supplier<Ingredient> repairMaterial) {
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
