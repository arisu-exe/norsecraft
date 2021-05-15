package io.github.fallOut015.norsecraft.util;

import io.github.fallOut015.norsecraft.MainNorsecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundEventsNorsecraft {
    private static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MainNorsecraft.MODID);



    public static final RegistryObject<SoundEvent> ITEM_ARMOR_EQUIP_MYRKYLITE = SOUND_EVENTS.register("item_armor_equip_myrkylite", () -> new SoundEvent(new ResourceLocation(MainNorsecraft.MODID, "item.armor.equip_myrkylite")));



    public static void register(IEventBus bus) {
        SOUND_EVENTS.register(bus);
    }
}
