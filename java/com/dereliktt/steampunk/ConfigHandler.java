package com.dereliktt.steampunk;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {
	public static Configuration config;

    // Sections to add to the config
    //public static String exampleSection = "Example Section";
    public static String generation = "Generation";

    // Options in the config
    //public static boolean exampleOption;
    public static boolean enableTinGeneration;
    public static boolean enableCopperGeneration;
    
    public static void init(File file) {
        config = new Configuration(file);
        syncConfig();
    }

    public static void syncConfig() {
        //config.addCustomCategoryComment(exampleSection, "Example section comment");
        config.addCustomCategoryComment(generation, "This section contains all settings regarding ore generation.");

        //exampleOption = config.get(exampleSection, "exampleOption", true, "Description of option goes here.").getBoolean(exampleOption);
        enableTinGeneration = config.get(generation, "enableTinGeneration", true, "Enable tin ore generation").getBoolean(enableTinGeneration);
        enableCopperGeneration = config.get(generation, "enableCopperGeneration", true, "Enable copper ore generation").getBoolean(enableCopperGeneration);

        config.save();
    }
}
