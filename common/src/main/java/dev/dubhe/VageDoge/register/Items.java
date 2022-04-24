package dev.dubhe.VageDoge.register;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.dubhe.VageDoge.VageDoge;
import net.minecraft.core.Registry;
import net.minecraft.world.item.Item;


import static dev.dubhe.VageDoge.VageDoge.MOD_ID;

public class Items {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_REGISTRY);
    public static final RegistrySupplier<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.EXAMPLE_TAB)));
}
