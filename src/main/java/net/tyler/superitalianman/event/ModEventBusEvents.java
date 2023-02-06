package net.tyler.superitalianman.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.tyler.superitalianman.SuperItalianMan;
import net.tyler.superitalianman.entity.ModEntityTypes;
import net.tyler.superitalianman.entity.custom.GoombaEntity;

@Mod.EventBusSubscriber(modid = SuperItalianMan.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.GOOMBA.get(), GoombaEntity.setAttributes());
    }

}
