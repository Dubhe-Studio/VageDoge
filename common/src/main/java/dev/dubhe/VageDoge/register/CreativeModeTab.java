package dev.dubhe.VageDoge.register;

import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

import static dev.dubhe.VageDoge.VageDoge.MOD_ID;

public class CreativeModeTab {
    public static final net.minecraft.world.item.CreativeModeTab EXAMPLE_TAB = CreativeTabRegistry.create(new ResourceLocation(MOD_ID, "example_tab"), () ->
            new ItemStack(Items.EXAMPLE_ITEM.get()));
}
