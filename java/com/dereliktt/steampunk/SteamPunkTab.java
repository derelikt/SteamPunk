package com.dereliktt.steampunk;

import com.dereliktt.steampunk.init.SteamPunkItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SteamPunkTab extends CreativeTabs{

	public SteamPunkTab(String label) {
		super(label);
		this.setBackgroundImageName("steampunk.png");

	}

	@Override
	public Item getTabIconItem() {
		return SteamPunkItems.wrench;
	}

}
