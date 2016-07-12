package com.dereliktt.steampunk;

import com.dereliktt.steampunk.init.SteamPunkBlocks;
import com.dereliktt.steampunk.init.SteamPunkItems;
import com.dereliktt.steampunk.init.SteamPunkRecipes;
import com.dereliktt.steampunk.proxy.CommonProxy;
import com.dereliktt.steampunk.utilities.OreDictionaryHandler;
import com.dereliktt.steampunk.world.GenerationHandler;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class SteamPunkMod {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final SteamPunkTab tabSteamPunk = new SteamPunkTab("tabSteamPunk");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		
		SteamPunkBlocks.init();
		SteamPunkBlocks.register();
		SteamPunkItems.init();
		SteamPunkItems.register();
		
		OreDictionaryHandler.registerOreDict();
		
		GameRegistry.registerWorldGenerator(new GenerationHandler(), 2);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		
	    SteamPunkRecipes.registerRecipes();
		proxy.registerRenders();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
}
