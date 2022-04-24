package dev.dubhe.VageDoge.forge;

import dev.dubhe.VageDoge.VageDogeExpectPlatform;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class VageDogeExpectPlatformImpl {
    /**
     * This is our actual method to {@link VageDogeExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}
