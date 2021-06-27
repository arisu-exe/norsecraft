package io.github.fallOut015.norsecraft.world.gen.surfacebuilders;

import io.github.fallOut015.norsecraft.MainNorsecraft;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SurfaceBuildersNorsecraft {
    private static final DeferredRegister<SurfaceBuilder<?>> SURFACE_BUILDERS = DeferredRegister.create(ForgeRegistries.SURFACE_BUILDERS, MainNorsecraft.MODID);



    public static final RegistryObject<SurfaceBuilder<SurfaceBuilderConfig>> NIDAVELLIR = SURFACE_BUILDERS.register("nidavellir", () -> new NidavellirSurfaceBuilder(SurfaceBuilderConfig.CODEC));
    public static final RegistryObject<SurfaceBuilder<SurfaceBuilderConfig>> NIFLHEIM = SURFACE_BUILDERS.register("niflheim", () -> new NiflheimSurfaceBuilder(SurfaceBuilderConfig.CODEC));



    public static void register(IEventBus bus) {
        SURFACE_BUILDERS.register(bus);
    }
}