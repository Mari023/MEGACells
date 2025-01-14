package gripe._90.megacells.init.loader;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.IForgeRegistry;

import gripe._90.megacells.block.MEGABlocks;
import gripe._90.megacells.block.entity.MEGABlockEntities;
import gripe._90.megacells.item.MEGAItems;

public class Registration {

    public static void registerBlocks(IForgeRegistry<Block> registry) {
        for (var definition : MEGABlocks.getBlocks()) {
            Block block = definition.asBlock();
            registry.register(definition.getId(), block);
        }
    }

    public static void registerItems(IForgeRegistry<Item> registry) {
        for (var definition : MEGABlocks.getBlocks()) {
            var item = definition.asItem();
            registry.register(definition.getId(), item);
        }
        for (var definition : MEGAItems.getItems()) {
            var item = definition.asItem();
            registry.register(definition.getId(), item);
        }
    }

    public static void registerBlockEntities(IForgeRegistry<BlockEntityType<?>> registry) {
        for (var be : MEGABlockEntities.getBlockEntityTypes().entrySet()) {
            registry.register(be.getKey(), be.getValue());
        }
    }

}
