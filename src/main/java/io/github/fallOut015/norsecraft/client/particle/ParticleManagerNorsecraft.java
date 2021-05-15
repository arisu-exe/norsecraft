package io.github.fallOut015.norsecraft.client.particle;

import io.github.fallOut015.norsecraft.particles.ParticleTypesNorsecraft;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;

public class ParticleManagerNorsecraft {
    public static void onParticleFactoryRegistry(final ParticleFactoryRegisterEvent event) {
        Minecraft.getInstance().particleEngine.register(ParticleTypesNorsecraft.TWINKLE.get(), TwinkleParticle.Factory::new);
    }
}