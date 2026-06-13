package net.dra0ke.dra0kessupermod.item;

import net.dra0ke.dra0kessupermod.Dra0kesSuperMod;
import net.dra0ke.dra0kessupermod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Dra0kesSuperMod.MOD_ID);

    public static final Supplier<CreativeModeTab> DRA0KES_SUPER_ITEMS_TAB = CREATIVE_MODE_TAB.register("dra0kes_super_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.HUBNERITE.get()))
                    .title(Component.translatable("creativetab.dra0kessupermod.dra0kes_super_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.HUBNERITE);
                        output.accept(ModItems.NETHER_QUARTZ_SHARD);
                    }).build());

    public static final Supplier<CreativeModeTab> DRA0KES_SUPER_BLOCKS_TAB = CREATIVE_MODE_TAB.register("dra0kes_super_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.DENSE_NETHER_QUARTZ_BLOCK.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(Dra0kesSuperMod.MOD_ID, "dra0kes_super_items_tab"))
                    .title(Component.translatable("creativetab.dra0kessupermod.dra0kes_super_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.HUBNERITE_HUBNERITE);
                        output.accept(ModBlocks.HUBNERITE_HUBNERITE_HUBNERITE);
                        output.accept(ModBlocks.DENSE_NETHER_QUARTZ_BLOCK);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
