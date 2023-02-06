package net.tyler.superitalianman.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tyler.superitalianman.SuperItalianMan;
import net.tyler.superitalianman.entity.custom.GoombaEntity;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, SuperItalianMan.MOD_ID);

    public static final RegistryObject<EntityType<GoombaEntity>> GOOMBA =
            ENTITIES.register("goomba",
                    () -> EntityType.Builder.of(GoombaEntity::new, MobCategory.MONSTER)
                            .sized(0.8f, 0.6f)
                            .build(new ResourceLocation(SuperItalianMan.MOD_ID, "goomba").toString()));


    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }

}
