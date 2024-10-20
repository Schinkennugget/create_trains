package com.schinkennugget.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.VoxelShape;

public class DB423Block extends Block {

    private static final VoxelShape SHAPE = Block.box(0,0,0,16,16,16);
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public DB423Block(Properties properties) {
        super(properties);
    }
}
