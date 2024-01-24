package com.legends.tropical.datagen;


import com.legends.tropical.TropicalExpension;

import com.legends.tropical.init.BlockLoader;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModBlockStateProvider extends BlockStateProvider {
    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }
    public ModBlockStateProvider(PackOutput gen, ExistingFileHelper exFileHelper) {
        super(gen, TropicalExpension.MODID, exFileHelper);

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }



    @Override
    protected void registerStatesAndModels() {
        blockWithItem(BlockLoader.ASHEN_SAND);
        blockWithItem(BlockLoader.SLATESTONE);
        blockWithItem(BlockLoader.SULFERSTONE);
        blockWithItem(BlockLoader.MUDDY_SLATESTONE);
        blockWithItem(BlockLoader.BUBBLE_STONE);


    }
}
