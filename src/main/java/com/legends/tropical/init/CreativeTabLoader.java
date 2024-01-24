package com.legends.tropical.init;

import com.legends.tropical.TropicalExpension;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabLoader {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TropicalExpension.MODID);

    public static final RegistryObject<CreativeModeTab> BLOCKS = CREATIVE_MODE_TABS.register("tropical_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(BlockLoader.ASHEN_SAND.get()))
                    .title(Component.translatable("creativetab.tropical_blocks"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(BlockLoader.ASHEN_SAND.get());
                        pOutput.accept(BlockLoader.BUBBLE_STONE.get());
                        pOutput.accept(BlockLoader.MUDDY_SLATESTONE.get());
                        pOutput.accept(BlockLoader.SLATESTONE.get());
                        pOutput.accept(BlockLoader.SULFERSTONE.get());
                        pOutput.accept(BlockLoader.ASHENSANDSTONE.get());
                        pOutput.accept(BlockLoader.VOLCANIC_ROCK.get());
                        pOutput.accept(BlockLoader.TOUGHROCK.get());
                        pOutput.accept(BlockLoader.IVY.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
