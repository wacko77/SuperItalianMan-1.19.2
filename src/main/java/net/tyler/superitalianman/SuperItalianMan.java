package net.tyler.superitalianman;

import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.tyler.superitalianman.entity.ModEntityTypes;
import net.tyler.superitalianman.entity.client.GoombaRenderer;
import net.tyler.superitalianman.item.ModItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(SuperItalianMan.MOD_ID)
public class SuperItalianMan {
    public static final String MOD_ID = "superitalianman";
    private static final Logger LOGGER = LogUtils.getLogger();

    public SuperItalianMan() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModEntityTypes.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    public void Client(final FMLClientSetupEvent event) {

        EntityRenderers.register(ModEntityTypes.GOOMBA.get(), GoombaRenderer::new);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

}


