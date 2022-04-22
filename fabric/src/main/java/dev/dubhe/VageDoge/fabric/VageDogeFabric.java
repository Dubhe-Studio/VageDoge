package dev.dubhe.VageDoge.fabric;

import dev.dubhe.VageDoge.VageDoge;
import net.fabricmc.api.ModInitializer;

public class VageDogeFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        VageDoge.init();
    }
}