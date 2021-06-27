package io.github.fallOut015.norsecraft;

import io.github.fallOut015.norsecraft.block.BlocksNorsecraft;
import io.github.fallOut015.norsecraft.client.particle.ParticleManagerNorsecraft;
import io.github.fallOut015.norsecraft.item.ItemsNorsecraft;
import io.github.fallOut015.norsecraft.particles.ParticleTypesNorsecraft;
import io.github.fallOut015.norsecraft.util.SoundEventsNorsecraft;
import io.github.fallOut015.norsecraft.world.biome.BiomesNorsecraft;
import io.github.fallOut015.norsecraft.world.gen.surfacebuilders.SurfaceBuildersNorsecraft;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Mod(MainNorsecraft.MODID)
public class MainNorsecraft  {
    public static final String MODID = "norsecraft";

    public MainNorsecraft() {
        BlocksNorsecraft.register(FMLJavaModLoadingContext.get().getModEventBus());
        ItemsNorsecraft.register(FMLJavaModLoadingContext.get().getModEventBus());
        BiomesNorsecraft.register(FMLJavaModLoadingContext.get().getModEventBus());
        ParticleTypesNorsecraft.register(FMLJavaModLoadingContext.get().getModEventBus());
        SoundEventsNorsecraft.register(FMLJavaModLoadingContext.get().getModEventBus());
        SurfaceBuildersNorsecraft.register(FMLJavaModLoadingContext.get().getModEventBus());

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        /*String[] paths = {
                "../src/main/resources/assets/norsecraft/blockstates",
                "../src/main/resources/assets/norsecraft/models/block",
                "../src/main/resources/assets/norsecraft/models/item",
        };
        for(String path : paths) {
            try {
                Files.walk(Paths.get(path)).filter(Files::isRegularFile).forEach(file -> {
                    try {
                        List<String> lines = Files.readAllLines(file.toAbsolutePath(), Charset.defaultCharset());
                        for(int i = 0; i < lines.size(); ++ i) {
                            lines.set(i, lines.get(i).replace("two", "norsecraft"));
                        }
                        Files.write(file.toAbsolutePath(), lines);
                    } catch (IOException exception) {
                        exception.printStackTrace();
                    }
                });
            } catch(final IOException exception) {
                exception.printStackTrace();
            }
        }*/
    }
    private void doClientStuff(final FMLClientSetupEvent event) {
    }
    private void enqueueIMC(final InterModEnqueueEvent event) {
    }
    private void processIMC(final InterModProcessEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onParticleFactoryRegistry(final ParticleFactoryRegisterEvent event) {
            ParticleManagerNorsecraft.onParticleFactoryRegistry(event);
        }
    }
}