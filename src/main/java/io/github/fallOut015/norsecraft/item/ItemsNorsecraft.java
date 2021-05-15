package io.github.fallOut015.norsecraft.item;

import io.github.fallOut015.norsecraft.MainNorsecraft;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemsNorsecraft {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MainNorsecraft.MODID);



    // Building Blocks
    public static final RegistryObject<Item> FROSTBARK_PLANKS = ITEMS.register(BlocksTwo.FROSTBARK_PLANKS, new Item.Properties()/*.group(ItemGroup.BUILDING_BLOCKS)*/); // TODO norsecraft

    public static final RegistryObject<Item> FROSTBARK_LOG = ITEMS.register(BlocksTwo.FROSTBARK_LOG, new Item.Properties()/*.group(ItemGroup.BUILDING_BLOCKS)*/); // TODO norsecraft

    public static final RegistryObject<Item> STRIPPED_FROSTBARK_LOG = ITEMS.register(BlocksTwo.STRIPPED_FROSTBARK_LOG, new Item.Properties()/*.group(ItemGroup.BUILDING_BLOCKS)*/); // TODO norsecraft

    public static final RegistryObject<Item> FROSTBARK_WOOD = ITEMS.register(BlocksTwo.FROSTBARK_WOOD, new Item.Properties()/*.group(ItemGroup.BUILDING_BLOCKS)*/); // TODO norsecraft

    public static final RegistryObject<Item> STRIPPED_FROSTBARK_WOOD = ITEMS.register(BlocksTwo.STRIPPED_FROSTBARK_WOOD, new Item.Properties()/*.group(ItemGroup.BUILDING_BLOCKS)*/); // TODO norsecraft

    public static final RegistryObject<Item> FROSTBARK_SLAB = ITEMS.register(BlocksTwo.FROSTBARK_SLAB, new Item.Properties()/*.group(ItemGroup.BUILDING_BLOCKS)*/); // TODO norsecraft

    public static final RegistryObject<Item> FROSTBARK_STAIRS = ITEMS.register(BlocksTwo.FROSTBARK_STAIRS, new Item.Properties()/*.group(ItemGroup.BUILDING_BLOCKS)*/); // TODO norsecraft

    public static final RegistryObject<Item> REGOLITH = ITEMS.register(BlocksTwo.REGOLITH, new Item.Properties()/*.group(ItemGroup.BUILDING_BLOCKS)*/); // TODO norsecraft

    public static final RegistryObject<Item> MYRKYLITE = ITEMS.register(BlocksTwo.MYRKYLITE, new Item.Properties()/*.group(ItemGroup.BUILDING_BLOCKS)*/); // TODO norsecraft
    public static final RegistryObject<Item> MYRKYLITE_SLAB = ITEMS.register(BlocksTwo.MYRKYLITE_SLAB, new Item.Properties()/*.group(ItemGroup.BUILDING_BLOCKS)*/); // TODO norsecraft
    public static final RegistryObject<Item> MYRKYLITE_STAIRS = ITEMS.register(BlocksTwo.MYRKYLITE_STAIRS, new Item.Properties()/*.group(ItemGroup.BUILDING_BLOCKS)*/); // TODO norsecraft

    public static final RegistryObject<Item> POLISHED_MYRKYLITE = ITEMS.register(BlocksTwo.POLISHED_MYRKYLITE, new Item.Properties()/*.group(ItemGroup.BUILDING_BLOCKS)*/); // TODO norsecraft
    public static final RegistryObject<Item> POLISHED_MYRKYLITE_SLAB = ITEMS.register(BlocksTwo.POLISHED_MYRKYLITE_SLAB, new Item.Properties()/*.group(ItemGroup.BUILDING_BLOCKS)*/); // TODO norsecraft
    public static final RegistryObject<Item> POLISHED_MYRKYLITE_STAIRS = ITEMS.register(BlocksTwo.POLISHED_MYRKYLITE_STAIRS, new Item.Properties()/*.group(ItemGroup.BUILDING_BLOCKS)*/); // TODO norsecraft

    public static final RegistryObject<Item> POLISHED_MYRKYLITE_BRICKS = ITEMS.register(BlocksTwo.POLISHED_MYRKYLITE_BRICKS, new Item.Properties()/*.group(ItemGroup.BUILDING_BLOCKS)*/); // TODO norsecraft
    public static final RegistryObject<Item> POLISHED_MYRKYLITE_BRICK_SLAB = ITEMS.register(BlocksTwo.POLISHED_MYRKYLITE_BRICK_SLAB, new Item.Properties()/*.group(ItemGroup.BUILDING_BLOCKS)*/); // TODO norsecraft
    public static final RegistryObject<Item> POLISHED_MYRKYLITE_BRICK_STAIRS = ITEMS.register(BlocksTwo.POLISHED_MYRKYLITE_BRICK_STAIRS, new Item.Properties()/*.group(ItemGroup.BUILDING_BLOCKS)*/); // TODO norsecraft

    public static final RegistryObject<Item> PERMAFROST_GRASS_BLOCK = ITEMS.register(BlocksTwo.PERMAFROST_GRASS_BLOCK, new Item.Properties()/*.group(ItemGroup.BUILDING_BLOCKS)*/); // TODO norsecraft
    public static final RegistryObject<Item> PERMAFROST_DIRT = ITEMS.register(BlocksTwo.PERMAFROST_DIRT, new Item.Properties()/*.group(ItemGroup.BUILDING_BLOCKS)*/); // TODO norsecraft

    public static final RegistryObject<Item> NIDAVELLIR_STARSTONE_ORE = ITEMS.register(BlocksTwo.NIDAVELLIR_STARSTONE_ORE, new Item.Properties()/*.group(ItemGroup.BUILDING_BLOCKS)*/); // TODO norsecraft
	public static final RegistryObject<Item> NIDAVELLIR_CELESTIUM_ORE = ITEMS.register(BlocksTwo.NIDAVELLIR_CELESTIUM_ORE, new Item.Properties()/*.group(ItemGroup.BUILDING_BLOCKS)*/); // TODO norsecraft
	public static final RegistryObject<Item> NIDAVELLIR_URU_ORE = ITEMS.register(BlocksTwo.NIDAVELLIR_URU_ORE, new Item.Properties()/*.group(ItemGroup.BUILDING_BLOCKS)*/); // TODO norsecraft

	public static final RegistryObject<Item> STARSTONE_BLOCK = ITEMS.register(BlocksTwo.STARSTONE_BLOCK, new Item.Properties()/*.group(ItemGroup.BUILDING_BLOCKS)*/);
	public static final RegistryObject<Item> CELESTIUM_BLOCK = ITEMS.register(BlocksTwo.CELESTIUM_BLOCK, new Item.Properties()/*.group(ItemGroup.BUILDING_BLOCKS)*/);
	public static final RegistryObject<Item> URU_BLOCK = ITEMS.register(BlocksTwo.URU_BLOCK, new Item.Properties()/*.group(ItemGroup.BUILDING_BLOCKS)*/);

    // Decorations
    public static final RegistryObject<Item> FROSTBARK_SAPLING = ITEMS.register(BlocksTwo.FROSTBARK_SAPLING, new Item.Properties()/*.group(ItemGroup.DECORATIONS)*/);

    public static final RegistryObject<Item> FROSTBARK_LEAVES = ITEMS.register(BlocksTwo.FROSTBARK_LEAVES, new Item.Properties()/*.group(ItemGroup.DECORATIONS)*/);

    public static final RegistryObject<Item> FROSTBARK_FENCE = ITEMS.register(BlocksTwo.FROSTBARK_FENCE, new Item.Properties()/*.group(ItemGroup.DECORATIONS)*/);

    public static final RegistryObject<Item> FROSTBARK_SIGN = ITEMS.register(BlocksTwo.FROSTBARK_SIGN, new Item.Properties()/*.group(ItemGroup.DECORATIONS)*/);

    public static final RegistryObject<Item> MYRKYLITE_WALL = ITEMS.register(BlocksTwo.MYRKYLITE_WALL, new Item.Properties()/*.group(ItemGroup.DECORATIONS)*/);
    public static final RegistryObject<Item> POLISHED_MYRKYLITE_WALL = ITEMS.register(BlocksTwo.POLISHED_MYRKYLITE_WALL, new Item.Properties()/*.group(ItemGroup.DECORATIONS)*/);
    public static final RegistryObject<Item> POLISHED_MYRKYLITE_BRICK_WALL = ITEMS.register(BlocksTwo.POLISHED_MYRKYLITE_BRICK_WALL, new Item.Properties()/*.group(ItemGroup.DECORATIONS)*/);

    public static final RegistryObject<Item> STARSTONE_TORCH = ITEMS.register(new WallOrFloorItem(BlocksTwo.STARSTONE_TORCH, BlocksTwo.STARSTONE_WALL_TORCH, new Item.Properties()/*.group(ItemGroup.DECORATIONS)*/));

    // Redstone
    public static final RegistryObject<Item> FROSTBARK_PRESSURE_PLATE = ITEMS.register(BlocksTwo.FROSTBARK_PRESSURE_PLATE, new Item.Properties()/*.group(ItemGroup.REDSTONE)*/);

    public static final RegistryObject<Item> FROSTBARK_TRAPDOOR = ITEMS.register(BlocksTwo.FROSTBARK_TRAPDOOR, new Item.Properties()/*.group(ItemGroup.REDSTONE)*/);

    public static final RegistryObject<Item> FROSTBARK_FENCE_GATE = ITEMS.register(BlocksTwo.FROSTBARK_FENCE_GATE, new Item.Properties()/*.group(ItemGroup.REDSTONE)*/);

    public static final RegistryObject<Item> FROSTBARK_BUTTON = ITEMS.register(BlocksTwo.FROSTBARK_BUTTON, new Item.Properties()/*.group(ItemGroup.REDSTONE)*/);

    public static final RegistryObject<Item> FROSTBARK_DOOR = ITEMS.register(BlocksTwo.FROSTBARK_DOOR, new Item.Properties()/*.group(ItemGroup.REDSTONE)*/);

    // Transporation
    public static final RegistryObject<Item> FROSTBARK_BOAT = ITEMS.register("frostbark_boat", () -> new Item(new Item.Properties().group(ItemGroup.TRANSPORTATION)));

    // Misc
    public static final RegistryObject<Item> REGOLITH_DUST = ITEMS.register("regolith_dust", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));

    public static final RegistryObject<Item> MUSIC_DISC_REALM_NINE = ITEMS.register("music_disc_realm_nine", () -> new MusicDiscItem(14, SoundEventsTwo.MUSIC_REALM_NINE, new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE)));



    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}