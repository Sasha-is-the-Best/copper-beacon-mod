package com.copperbeacon;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class CopperBeaconMod implements ModInitializer {
    public static final String MOD_ID = "copper-beacon-mod";
    
    public static final CopperBeaconBlock COPPER_BEACON = new CopperBeaconBlock(
        Block.Settings.create().strength(3.0f).requiresTool().luminance(s -> 15)
    );

    @Override
    public void onInitialize() {
        Registry.register(Registries.BLOCK, Identifier.of(MOD_ID, "copper_beacon"), COPPER_BEACON);
    }
}
