package com.legends.tropical.datagen.loot;


import com.legends.tropical.init.BlockLoader;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }
    @Override
    protected void generate() {
        this.dropSelf(BlockLoader.ASHEN_SAND.get());
        this.dropSelf(BlockLoader.SLATESTONE.get());
        this.dropSelf(BlockLoader.SULFERSTONE.get());
        this.dropSelf(BlockLoader.BUBBLE_STONE.get());
        this.dropSelf(BlockLoader.MUDDY_SLATESTONE.get());

        this.dropSelf(BlockLoader.ASHENSANDSTONE.get());
        this.dropSelf(BlockLoader.TOUGHROCK.get());
        this.dropSelf(BlockLoader.VOLCANIC_ROCK.get());

        this.dropSelf(BlockLoader.IVY.get());


    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BlockLoader.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
