package net.dra0ke.dra0kessupermod.block;

import net.dra0ke.dra0kessupermod.Dra0kesSuperMod;
import net.dra0ke.dra0kessupermod.block.custom.HellStoneBlock;
import net.dra0ke.dra0kessupermod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Dra0kesSuperMod.MOD_ID);


    public static final DeferredBlock<Block> DENSE_NETHER_QUARTZ_BLOCK = registerBlock("dense_nether_quartz_block",
            () -> new DropExperienceBlock(UniformInt.of(4, 9),BlockBehaviour.Properties.of()
                    .strength(3.8f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    public static final DeferredBlock<Block> HUBNERITE_HUBNERITE = registerBlock("hubnerite_hubnerite",
            () -> new DropExperienceBlock(UniformInt.of(9, 11),BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    public static final DeferredBlock<Block> HUBNERITE_HUBNERITE_HUBNERITE = registerBlock("hubnerite_hubnerite_hubnerite",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4.8f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> HELL_STONE = registerBlock("hell_stone",
            () -> new HellStoneBlock(BlockBehaviour.Properties.of()
                    .strength(1.5f).requiresCorrectToolForDrops().sound(SoundType.STONE).lightLevel(state -> 1)));



    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block){
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
