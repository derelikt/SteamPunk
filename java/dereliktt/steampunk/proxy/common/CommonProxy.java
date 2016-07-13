package dereliktt.steampunk.proxy.common;

import java.util.UUID;

import com.mojang.authlib.GameProfile;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class CommonProxy implements IGuiHandler{

	public void preInit(){}
	public void init(){}
	public void postInit(){}
	public void serverStarting(){}
	public void onWorldLoad(){}
	
	//Gui Handling for server side
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		
		return null;
	}
	
	//Client side Gui not handled here, pass it off to Client Proxy
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		
		return null;
	}
	
	
	
	//Useful Things
	public String[] splitStringOnWidth(String s, int w)
	{
		return new String[]{s};
	}
	public World getClientWorld()
	{
		return null;
	}
	public String getNameFromUUID(String uuid)
	{
		return MinecraftServer.getServer().getMinecraftSessionService().fillProfileProperties(new GameProfile(UUID.fromString(uuid.replaceAll("(\\w{8})(\\w{4})(\\w{4})(\\w{4})(\\w{12})", "$1-$2-$3-$4-$5")), null), false).getName();
	}
	public void reInitGui()
	{
	}

}
