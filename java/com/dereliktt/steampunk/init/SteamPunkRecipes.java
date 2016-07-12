package com.dereliktt.steampunk.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class SteamPunkRecipes {
	
	private static void registerShapedRecipes()
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SteamPunkBlocks.tin_block), "XXX", "XXX","XXX", 'X', "ingotTin"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SteamPunkBlocks.copper_block), "XXX", "XXX","XXX", 'X', "ingotCopper"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SteamPunkBlocks.bronze_block), "XXX", "XXX","XXX", 'X', "ingotBronze"));
	}
	
	private static void registerShapelessRecipes()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(SteamPunkItems.tin_ingot,9), new ItemStack(SteamPunkBlocks.tin_block));
		GameRegistry.addShapelessRecipe(new ItemStack(SteamPunkItems.copper_ingot,9), new ItemStack(SteamPunkBlocks.copper_block));
		GameRegistry.addShapelessRecipe(new ItemStack(SteamPunkItems.bronze_ingot,9), new ItemStack(SteamPunkBlocks.bronze_block));
		GameRegistry.addShapelessRecipe(new ItemStack(SteamPunkItems.bronze_dust, 4), SteamPunkItems.tin_dust, SteamPunkItems.copper_dust, SteamPunkItems.copper_dust, SteamPunkItems.copper_dust);
	}
	
	private static void registerSmeltingRecipes()
	{
		GameRegistry.addSmelting(new ItemStack(SteamPunkBlocks.tin_ore), new ItemStack(SteamPunkItems.tin_ingot,1), 10);
		GameRegistry.addSmelting(new ItemStack(SteamPunkBlocks.copper_ore), new ItemStack(SteamPunkItems.copper_ingot,1), 10);
		GameRegistry.addSmelting(new ItemStack(SteamPunkItems.tin_dust), new ItemStack(SteamPunkItems.tin_ingot,1), 10);
		GameRegistry.addSmelting(new ItemStack(SteamPunkItems.copper_dust), new ItemStack(SteamPunkItems.copper_ingot,1), 10);
		GameRegistry.addSmelting(new ItemStack(SteamPunkItems.bronze_dust), new ItemStack(SteamPunkItems.bronze_ingot,1), 0);
	}
	
	private static void registerSteamPunkRecipes()
	{
		
	}
	
	public static void registerRecipes()
	{
		registerShapedRecipes();
		registerShapelessRecipes();
		registerSmeltingRecipes();
	}
}
