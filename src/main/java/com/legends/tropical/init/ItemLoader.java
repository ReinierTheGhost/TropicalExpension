package com.legends.tropical.init;

import com.legends.tropical.TropicalExpension;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ItemLoader {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TropicalExpension.MODID);





    /**
     * registratoion methodes
     * @param eventBus
     */
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
