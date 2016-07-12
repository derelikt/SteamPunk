package com.dereliktt.steampunk.utilities;

import com.dereliktt.steampunk.init.SteamPunkBlocks;
import com.dereliktt.steampunk.init.SteamPunkItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHandler {
	//Oredict entries
    //items
    public static String powderBlaze = "powderBlaze";
    public static String ingotTin = "ingotTin";
    public static String dustTin = "dustTin";
    public static String ingotCopper = "ingotCopper";
    public static String dustCopper = "dustCopper";
    public static String ingotBronze = "ingotBronze";
    public static String dustBronze = "dustBronze";

    //blocks
    public static String oreTin = "oreTin";
    public static String oreCopper = "oreCopper";
    public static String blockTin = "blockTin";
    public static String blockCopper = "blockCopper";
    public static String blockBronze = "blockBronze";

    public static void registerOreDict() {
        OreDictionary.registerOre(ingotTin, new ItemStack(SteamPunkItems.tin_ingot));
        OreDictionary.registerOre(dustTin, new ItemStack(SteamPunkItems.tin_dust));
        OreDictionary.registerOre(oreTin, new ItemStack(SteamPunkBlocks.tin_ore));
        OreDictionary.registerOre(blockTin, new ItemStack(SteamPunkBlocks.tin_ore));
        OreDictionary.registerOre(ingotCopper, new ItemStack(SteamPunkItems.copper_ingot));
        OreDictionary.registerOre(dustCopper, new ItemStack(SteamPunkItems.copper_dust));
        OreDictionary.registerOre(oreCopper, new ItemStack(SteamPunkBlocks.copper_ore));
        OreDictionary.registerOre(blockCopper, new ItemStack(SteamPunkBlocks.copper_ore));
        OreDictionary.registerOre(ingotBronze, new ItemStack(SteamPunkItems.bronze_ingot));
        OreDictionary.registerOre(dustBronze, new ItemStack(SteamPunkItems.bronze_dust));
        OreDictionary.registerOre(blockBronze, new ItemStack(SteamPunkBlocks.bronze_block));
    }
}
