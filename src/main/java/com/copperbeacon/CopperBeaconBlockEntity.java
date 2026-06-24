package com.copperbeacon;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BeaconBlockEntity;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CopperBeaconBlockEntity extends BeaconBlockEntity {
    public CopperBeaconBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }

    @Override
    public boolean isValidBlock(World world, int x, int y, int z) {
        BlockState state = world.getBlockState(pos.add(x, y, z));
        
        // Accetta tutti i tipi di rame + varianti ossidate + cerate
        if (state.getBlock().getName().getString().toLowerCase().contains("copper")) return true;
        
        // Fallback: accetta anche ferro, oro, smeraldo, diamante, netherite come vanilla
        return state.isIn(BlockTags.BEACON_BASE_BLOCKS);
    }
}