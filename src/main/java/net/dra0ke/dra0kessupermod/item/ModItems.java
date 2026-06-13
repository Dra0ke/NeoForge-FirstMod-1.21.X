package net.dra0ke.dra0kessupermod.item;

import net.dra0ke.dra0kessupermod.Dra0kesSuperMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Dra0kesSuperMod.MOD_ID);

    public static final DeferredItem<Item> HUBNERITE = ITEMS.register("hubnerite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NETHER_QUARTZ_SHARD = ITEMS.register("nether_quartz_shard", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
