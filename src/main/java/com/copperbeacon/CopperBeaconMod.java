package com.copperbeacon;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class CopperBeaconMod implements ModInitializer {
    public static final CopperBeaconBlock COPPER_BEACON = new CopperBeaconBlock(net.minecraft.block.Block.Settings.create().strength(3.0f).requiresTool().luminance(15));
    public static BlockEntityType<CopperBeaconBlockEntity> COPPER_BEACON_ENTITY;

    @Override
    public void onInitialize() {
        COPPER_BEACON_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE,
            Identifier.of("copper-beacon-mod", "copper_beacon_entity"),
            BlockEntityType.Builder.create(CopperBeaconBlockEntity::new, COPPER_BEACON).build());

        Registry.register(Registries.BLOCK, Identifier.of("copper-beacon-mod", "copper_beacon"), COPPER_BEACON);
        Registry.register(Registries.ITEM, Identifier.of("copper-beacon-mod", "copper_beacon"), 
            new net.minecraft.item.BlockItem(COPPER_BEACON, new net.minecraft.item.Item.Settings()));
    }
}