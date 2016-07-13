package dereliktt.steampunk;

import dereliktt.steampunk.proxy.common.ConfigHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=SteamPunk.MODID,name=SteamPunk.MODNAME,version=SteamPunk.VERSION,dependencies="")
public class SteamPunk {
	
	public static final String MODID = "SteamPunk";
	public static final String MODNAME = "Steam Punk";
	public static final String VERSION = "${Version}";
	
	@Mod.Instance(MODID)
	public static SteamPunk instance = new SteamPunk();
	
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ConfigHandler.init(event.getSuggestedConfigurationFile());
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
