package io.github.fallOut015.norsecraft.client.renderer;

import io.github.fallOut015.norsecraft.block.BlocksNorsecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class RenderTypeLookupNorsecraft {
    public static void doClientStuff(final FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(BlocksNorsecraft.FROSTBARK_SAPLING.get(), RenderType.cutout());

        RenderTypeLookup.setRenderLayer(BlocksNorsecraft.STARSTONE_TORCH.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlocksNorsecraft.STARSTONE_WALL_TORCH.get(), RenderType.cutout());
    }
}
