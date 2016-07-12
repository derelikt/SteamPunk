package com.dereliktt.steampunk.proxy;

import com.dereliktt.steampunk.init.SteamPunkBlocks;
import com.dereliktt.steampunk.init.SteamPunkItems;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders()
	{
		SteamPunkBlocks.registerRenders();
		SteamPunkItems.registerRenders();
	}
}
