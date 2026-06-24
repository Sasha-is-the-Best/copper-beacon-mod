package com.copperbeacon;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CopperBeaconBlock extends BlockWithEntity {
    public static final MapCodec<CopperBeaconBlock> CODEC = createCodec(CopperBeaconBlock::new);

    public CopperBeaconBlock(Settings settings) { super(settings); }

    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() { return CODEC; }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new CopperBeaconBlockEntity(pos, state);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) { return BlockRenderType.MODEL; }
}