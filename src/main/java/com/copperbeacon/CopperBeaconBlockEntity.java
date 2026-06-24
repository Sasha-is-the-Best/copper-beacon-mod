package com.copperbeacon;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;

public class CopperBeaconBlockEntity extends BlockEntity {
    public CopperBeaconBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.COPPER_BEACON_BE, pos, state);
    }
}
