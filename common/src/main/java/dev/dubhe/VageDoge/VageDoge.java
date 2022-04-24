package dev.dubhe.VageDoge;

import com.google.common.base.Suppliers;
import dev.architectury.registry.registries.Registries;

import java.util.function.Supplier;

import static dev.dubhe.VageDoge.register.Items.ITEMS;


public class VageDoge {
    public static final String MOD_ID = "VageDoge";
    // We can use this if we don't want to use DeferredRegister
    public static final Supplier<Registries> REGISTRIES = Suppliers.memoize(() -> Registries.get(MOD_ID));
    public static void init() {
        ITEMS.register();
        System.out.println(VageDogeExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
    }
}