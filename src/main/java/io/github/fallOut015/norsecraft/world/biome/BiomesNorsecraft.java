package io.github.fallOut015.norsecraft.world.biome;

import io.github.fallOut015.norsecraft.MainNorsecraft;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomesNorsecraft {
    private static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, MainNorsecraft.MODID);



    public static final RegistryObject<Biome> LUNAR_PLAINS = BIOMES.register("lunar_plains", () -> new Biome.Builder().biomeCategory(Biome.Category.NONE).generationSettings(BiomeGenerationSettings.EMPTY).precipitation(Biome.RainType.NONE).depth(1.0f).scale(1.0f).temperature(1.0f).downfall(1.0f).specialEffects(new BiomeAmbience.Builder().fogColor(0xFFFFFF).waterColor(0xFFFFFF).waterFogColor(0xFFFFFFF).skyColor(0xFFFFFFF).build()).mobSpawnSettings(MobSpawnInfo.EMPTY).build());



    public static void register(IEventBus bus) {
        BIOMES.register(bus);
    }
}