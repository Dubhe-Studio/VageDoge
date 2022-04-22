package dev.dubhe.VageDoge.forge;

import dev.architectury.platform.forge.EventBuses;
import dev.dubhe.VageDoge.VageDoge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(VageDoge.MOD_ID)
public class VageDogeForge {
    public VageDogeForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(VageDoge.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        VageDoge.init();
    }
}