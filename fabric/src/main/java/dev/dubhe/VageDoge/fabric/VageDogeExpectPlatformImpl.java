package dev.dubhe.VageDoge.fabric;
import dev.dubhe.VageDoge.VageDogeExpectPlatform;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class VageDogeExpectPlatformImpl {

    /**
     * This is our actual method to {@link VageDogeExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
}
