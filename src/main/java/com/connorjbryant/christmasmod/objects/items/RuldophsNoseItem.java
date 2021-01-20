package com.connorjbryant.christmasmod.objects.items;

import java.util.List;
import java.util.Random;

import com.connorjbryant.christmasmod.init.ItemInit;
import com.connorjbryant.christmasmod.util.helpers.KeyboardHelper;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;

public class RuldophsNoseItem extends Item
{

	public RuldophsNoseItem(Properties properties) {
		super(properties);
	}
	
	@Override
	public boolean hasEffect(ItemStack stack) {
		return true;
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
	{
		tooltip.add(new StringTextComponent("\u00A7e" + "Use Ruldoph's luminescent red nose to help guide your way at night. Right-click to activate."));
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn)
	{
		worldIn.setTimeLightningFlash(100);
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}

}
