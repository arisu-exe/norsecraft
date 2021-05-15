package io.github.fallOut015.norsecraft.particles;

import io.github.fallOut015.norsecraft.MainNorsecraft;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.ParticleType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ParticleTypesNorsecraft {
    private static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, MainNorsecraft.MODID);



    public static final RegistryObject<BasicParticleType> TWINKLE = PARTICLE_TYPES.register("twinkle", () -> new BasicParticleType(false));



    public static void register(IEventBus bus) {
        PARTICLE_TYPES.register(bus);
    }
}
