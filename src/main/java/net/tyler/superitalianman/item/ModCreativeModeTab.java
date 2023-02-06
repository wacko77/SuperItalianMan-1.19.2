package net.tyler.superitalianman.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab POWER_UPS = new CreativeModeTab("power-ups") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MEGA_MUSHROOM.get());
        }
    };
}
