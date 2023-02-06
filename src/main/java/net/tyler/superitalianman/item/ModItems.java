package net.tyler.superitalianman.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tyler.superitalianman.SuperItalianMan;
import net.tyler.superitalianman.entity.ModEntityTypes;
import net.tyler.superitalianman.item.custom.Mega_Mushroom;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SuperItalianMan.MOD_ID);

    public static final RegistryObject<Item> MEGA_MUSHROOM = ITEMS.register("mega_mushroom",
            () -> new Mega_Mushroom(new Item.Properties()
                    .tab(ModCreativeModeTab.POWER_UPS)
                    .food(Eatables.MEGA_MUSHROOM)));

    public static final RegistryObject<Item> GOOMBA_SPAWN_EGG = ITEMS.register("goomba_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.GOOMBA,0x948e8d, 0x3b3635,
                    new Item.Properties().tab(ModCreativeModeTab.POWER_UPS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static class Eatables {
        public static final FoodProperties MEGA_MUSHROOM = new FoodProperties.Builder()
                .nutrition(20)
                .fast()
                .build();
    }
}
