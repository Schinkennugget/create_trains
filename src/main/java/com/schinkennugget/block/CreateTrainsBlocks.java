package com.schinkennugget.block;

import com.schinkennugget.CreateTrains;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class CreateTrainsBlocks {
    public static final Block DB423_BLOCK = new DB423Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK));

    public static void init() {
        register("db_423_block", DB423_BLOCK);

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(ct -> {
            ct.accept(DB423_BLOCK);
        });
    }

    public static void register(String name, Block block) {
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(CreateTrains.MOD_ID, name), block);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CreateTrains.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }
}
