package com.connorjbryant.christmasmod.events;
import com.connorjbryant.christmasmod.ChristmasMod;
import com.connorjbryant.christmasmod.init.ItemInit;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.SkeletonEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.monster.ZombiePigmanEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ChristmasMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModEntitySpawnEvent {
	@SubscribeEvent
	public static void onSpawn(EntityJoinWorldEvent event) {
		Entity mob = event.getEntity();
		
		if (mob instanceof ZombieEntity) {
			mob.setItemStackToSlot(EquipmentSlotType.HEAD, new ItemStack(ItemInit.candy_cane_helmet.get()));
			mob.setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(ItemInit.candy_cane_chestplate.get()));
			mob.setItemStackToSlot(EquipmentSlotType.LEGS, new ItemStack(ItemInit.candy_cane_leggings.get()));
			mob.setItemStackToSlot(EquipmentSlotType.FEET, new ItemStack(ItemInit.candy_cane_boots.get()));
		}
		
		if (mob instanceof SkeletonEntity) {
			mob.setItemStackToSlot(EquipmentSlotType.HEAD, new ItemStack(ItemInit.candy_cane_helmet.get()));
			mob.setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(ItemInit.candy_cane_chestplate.get()));
			mob.setItemStackToSlot(EquipmentSlotType.LEGS, new ItemStack(ItemInit.candy_cane_leggings.get()));
			mob.setItemStackToSlot(EquipmentSlotType.FEET, new ItemStack(ItemInit.candy_cane_boots.get()));
		}
		
		if (mob instanceof ZombiePigmanEntity) {
			mob.setItemStackToSlot(EquipmentSlotType.HEAD, new ItemStack(ItemInit.candy_cane_helmet.get()));
			mob.setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(ItemInit.candy_cane_chestplate.get()));
			mob.setItemStackToSlot(EquipmentSlotType.LEGS, new ItemStack(ItemInit.candy_cane_leggings.get()));
			mob.setItemStackToSlot(EquipmentSlotType.FEET, new ItemStack(ItemInit.candy_cane_boots.get()));
		}
		
	}

}
