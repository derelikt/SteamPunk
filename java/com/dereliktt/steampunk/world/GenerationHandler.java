package com.dereliktt.steampunk.world;

import java.util.Random;

import com.dereliktt.steampunk.ConfigHandler;
import com.dereliktt.steampunk.init.SteamPunkBlocks;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class GenerationHandler implements IWorldGenerator{
	// Which dimension to generate in by dimension ID (Nether -1, Overworld 0, End 1, etc)
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.getDimensionId()) {
            case -1:
                break;
            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
                break;
            case 1:
                break;
        }
    }

    //The actual generation method.
    private void generateSurface(World world, Random rand, int chunkX, int chunkZ) {
        for (int k = 0; k < 16; k++)
        {
            int firstBlockXCoord = chunkX + rand.nextInt(16);
            int firstBlockZCoord = chunkZ + rand.nextInt(16);
            //Will be found between y = 10 and y = 40
            int tinY = rand.nextInt(40)+10;
            int copperY = rand.nextInt(70)+10;
            BlockPos tinPos = new BlockPos(firstBlockXCoord, tinY, firstBlockZCoord);
            BlockPos copperPos = new BlockPos(firstBlockXCoord, copperY, firstBlockZCoord);
            if (ConfigHandler.enableTinGeneration)
                //The 10 as the second parameter sets the maximum vein size
                (new WorldGenMinable(SteamPunkBlocks.tin_ore.getDefaultState(), 10)).generate(world, rand, tinPos);
            if (ConfigHandler.enableCopperGeneration)
                //The 10 as the second parameter sets the maximum vein size
                (new WorldGenMinable(SteamPunkBlocks.copper_ore.getDefaultState(), 10)).generate(world, rand, copperPos);
        }
    }
}
