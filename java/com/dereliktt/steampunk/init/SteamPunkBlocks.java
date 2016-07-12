package com.dereliktt.steampunk.init;

import javax.tools.Tool;

import com.dereliktt.steampunk.Reference;
import com.dereliktt.steampunk.SteamPunkMod;
import com.dereliktt.steampunk.blocks.BlockMaterials;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SteamPunkBlocks {
	public static Block tin_ore;
	public static Block copper_ore;
	public static Block tin_block;
	public static Block copper_block;
	public static Block bronze_block;
	
	public static void init()
	{
		tin_ore = new BlockMaterials(Material.rock).setUnlocalizedName("tin_ore").setHardness(5).setCreativeTab(SteamPunkMod.tabSteamPunk);
		tin_ore.setHarvestLevel("pickaxe", 1);
		copper_ore = new BlockMaterials(Material.rock).setUnlocalizedName("copper_ore").setHardness(5).setCreativeTab(SteamPunkMod.tabSteamPunk);
		copper_ore.setHarvestLevel("pickaxe", 1);
		tin_block = new BlockMaterials(Material.rock).setUnlocalizedName("tin_block").setHardness(5).setCreativeTab(SteamPunkMod.tabSteamPunk);
		tin_block.setHarvestLevel("pickaxe", 1);
		copper_block = new BlockMaterials(Material.rock).setUnlocalizedName("copper_block").setHardness(5).setCreativeTab(SteamPunkMod.tabSteamPunk);
		copper_block.setHarvestLevel("pickaxe", 1);
		bronze_block = new BlockMaterials(Material.rock).setUnlocalizedName("bronze_block").setHardness(5).setCreativeTab(SteamPunkMod.tabSteamPunk);
		bronze_block.setHarvestLevel("pickaxe", 1);
	}
	
	public static void register()
	{
		GameRegistry.registerBlock(tin_ore, tin_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(copper_ore, copper_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(tin_block, tin_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(copper_block, copper_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(bronze_block, bronze_block.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(tin_ore);
		registerRender(copper_ore);
		registerRender(tin_block);
		registerRender(copper_block);
		registerRender(bronze_block);
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
