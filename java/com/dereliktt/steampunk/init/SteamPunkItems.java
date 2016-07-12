package com.dereliktt.steampunk.init;

import com.dereliktt.steampunk.Reference;
import com.dereliktt.steampunk.SteamPunkMod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SteamPunkItems {
	
	public static Item wrench;
	public static Item tin_ingot;
	public static Item tin_dust;
	public static Item copper_ingot;
	public static Item copper_dust;
	public static Item bronze_ingot;
	public static Item bronze_dust;
	
	public static void init()
	{
		wrench = new Item().setUnlocalizedName("wrench").setCreativeTab(SteamPunkMod.tabSteamPunk);
		tin_ingot = new Item().setUnlocalizedName("tin_ingot").setCreativeTab(SteamPunkMod.tabSteamPunk);
		tin_dust = new Item().setUnlocalizedName("tin_dust").setCreativeTab(SteamPunkMod.tabSteamPunk);
		copper_ingot = new Item().setUnlocalizedName("copper_ingot").setCreativeTab(SteamPunkMod.tabSteamPunk);
		copper_dust = new Item().setUnlocalizedName("copper_dust").setCreativeTab(SteamPunkMod.tabSteamPunk);
		bronze_ingot = new Item().setUnlocalizedName("bronze_ingot").setCreativeTab(SteamPunkMod.tabSteamPunk);
		bronze_dust = new Item().setUnlocalizedName("bronze_dust").setCreativeTab(SteamPunkMod.tabSteamPunk);
	}
	
	public static void register()
	{
		GameRegistry.registerItem(wrench, wrench.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(tin_ingot, tin_ingot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(copper_ingot, copper_ingot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(bronze_ingot, bronze_ingot.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(tin_dust, tin_dust.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(copper_dust, copper_dust.getUnlocalizedName().substring(5));		
		GameRegistry.registerItem(bronze_dust, bronze_dust.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(wrench);
		registerRender(tin_ingot);
		registerRender(tin_dust);
		registerRender(copper_ingot);
		registerRender(copper_dust);
		registerRender(bronze_ingot);
		registerRender(bronze_dust);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
