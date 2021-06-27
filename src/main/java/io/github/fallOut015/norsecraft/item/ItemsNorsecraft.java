package io.github.fallOut015.norsecraft.item;

import io.github.fallOut015.norsecraft.MainNorsecraft;
import io.github.fallOut015.norsecraft.block.BlocksNorsecraft;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.WallOrFloorItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemsNorsecraft {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MainNorsecraft.MODID);



    // Building Blocks
    public static final RegistryObject<Item> FROSTBARK_PLANKS = ITEMS.register("frostbark_planks", () -> new BlockItem(BlocksNorsecraft.FROSTBARK_PLANKS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> FROSTBARK_LOG = ITEMS.register("frostbark_log", () -> new BlockItem(BlocksNorsecraft.FROSTBARK_LOG.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> STRIPPED_FROSTBARK_LOG = ITEMS.register("stripped_frostbark_log", () -> new BlockItem(BlocksNorsecraft.STRIPPED_FROSTBARK_LOG.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> FROSTBARK_WOOD = ITEMS.register("frostbark_wood", () -> new BlockItem(BlocksNorsecraft.FROSTBARK_WOOD.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> STRIPPED_FROSTBARK_WOOD = ITEMS.register("stripped_frostbark_wood", () -> new BlockItem(BlocksNorsecraft.STRIPPED_FROSTBARK_WOOD.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> FROSTBARK_SLAB = ITEMS.register("frostbark_slab", () -> new BlockItem(BlocksNorsecraft.FROSTBARK_SLAB.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> FROSTBARK_STAIRS = ITEMS.register("frostbark_stairs", () -> new BlockItem(BlocksNorsecraft.FROSTBARK_STAIRS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> REGOLITH = ITEMS.register("regolith", () -> new BlockItem(BlocksNorsecraft.REGOLITH.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> MYRKYLITE = ITEMS.register("myrkylite", () -> new BlockItem(BlocksNorsecraft.MYRKYLITE.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> MYRKYLITE_SLAB = ITEMS.register("myrkylite_slab", () -> new BlockItem(BlocksNorsecraft.MYRKYLITE_SLAB.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> MYRKYLITE_STAIRS = ITEMS.register("myrkylite_stairs", () -> new BlockItem(BlocksNorsecraft.MYRKYLITE_STAIRS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> POLISHED_MYRKYLITE = ITEMS.register("polished_myrkylite", () -> new BlockItem(BlocksNorsecraft.POLISHED_MYRKYLITE.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> POLISHED_MYRKYLITE_SLAB = ITEMS.register("polished_myrkylite_slab", () -> new BlockItem(BlocksNorsecraft.POLISHED_MYRKYLITE_SLAB.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> POLISHED_MYRKYLITE_STAIRS = ITEMS.register("polished_myrkylite_stairs", () -> new BlockItem(BlocksNorsecraft.POLISHED_MYRKYLITE_STAIRS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> POLISHED_MYRKYLITE_BRICKS = ITEMS.register("polished_myrkylite_bricks", () -> new BlockItem(BlocksNorsecraft.POLISHED_MYRKYLITE_BRICKS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> POLISHED_MYRKYLITE_BRICK_SLAB = ITEMS.register("polished_myrkylite_brick_slab", () -> new BlockItem(BlocksNorsecraft.POLISHED_MYRKYLITE_BRICK_SLAB.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> POLISHED_MYRKYLITE_BRICK_STAIRS = ITEMS.register("polished_myrkylite_brick_stairs", () -> new BlockItem(BlocksNorsecraft.POLISHED_MYRKYLITE_BRICK_STAIRS.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> PERMAFROST_GRASS_BLOCK = ITEMS.register("permafrost_grass_block", () -> new BlockItem(BlocksNorsecraft.PERMAFROST_GRASS_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> PERMAFROST_DIRT = ITEMS.register("permafrost_dirt", () -> new BlockItem(BlocksNorsecraft.PERMAFROST_DIRT.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> NIDAVELLIR_STARSTONE_ORE = ITEMS.register("nidavellir_starstone_ore", () -> new BlockItem(BlocksNorsecraft.NIDAVELLIR_STARSTONE_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
	public static final RegistryObject<Item> NIDAVELLIR_CELESTIUM_ORE = ITEMS.register("nidavellir_celestium_ore", () -> new BlockItem(BlocksNorsecraft.NIDAVELLIR_CELESTIUM_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
	public static final RegistryObject<Item> NIDAVELLIR_URU_ORE = ITEMS.register("nidavellir_uru_ore", () -> new BlockItem(BlocksNorsecraft.NIDAVELLIR_URU_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

	public static final RegistryObject<Item> STARSTONE_BLOCK = ITEMS.register("starstone_block", () -> new BlockItem(BlocksNorsecraft.STARSTONE_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
	public static final RegistryObject<Item> CELESTIUM_BLOCK = ITEMS.register("celestium_block", () -> new BlockItem(BlocksNorsecraft.CELESTIUM_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
	public static final RegistryObject<Item> URU_BLOCK = ITEMS.register("uru_block", () -> new BlockItem(BlocksNorsecraft.URU_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    // TAB_DECORATIONS
    public static final RegistryObject<Item> FROSTBARK_SAPLING = ITEMS.register("frostbark_sapling", () -> new BlockItem(BlocksNorsecraft.FROSTBARK_SAPLING.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

    public static final RegistryObject<Item> FROSTBARK_LEAVES = ITEMS.register("frostbark_leaves", () -> new BlockItem(BlocksNorsecraft.FROSTBARK_LEAVES.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

    public static final RegistryObject<Item> FROSTBARK_FENCE = ITEMS.register("frostbark_fence", () -> new BlockItem(BlocksNorsecraft.FROSTBARK_FENCE.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

    public static final RegistryObject<Item> FROSTBARK_SIGN = ITEMS.register("frostbark_sign", () -> new BlockItem(BlocksNorsecraft.FROSTBARK_SIGN.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

    public static final RegistryObject<Item> MYRKYLITE_WALL = ITEMS.register("myrkylite_wall", () -> new BlockItem(BlocksNorsecraft.MYRKYLITE_WALL.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
    public static final RegistryObject<Item> POLISHED_MYRKYLITE_WALL = ITEMS.register("polished_myrkylite_wall", () -> new BlockItem(BlocksNorsecraft.POLISHED_MYRKYLITE_WALL.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
    public static final RegistryObject<Item> POLISHED_MYRKYLITE_BRICK_WALL = ITEMS.register("polished_myrkylite_brick_wall", () -> new BlockItem(BlocksNorsecraft.POLISHED_MYRKYLITE_BRICK_WALL.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

    public static final RegistryObject<Item> STARSTONE_TORCH = ITEMS.register("starstone_torch", () -> new WallOrFloorItem(BlocksNorsecraft.STARSTONE_TORCH.get(), BlocksNorsecraft.STARSTONE_WALL_TORCH.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

    // Redstone
    public static final RegistryObject<Item> FROSTBARK_PRESSURE_PLATE = ITEMS.register("frostbark_pressure_plate", () -> new BlockItem(BlocksNorsecraft.FROSTBARK_PRESSURE_PLATE.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));

    public static final RegistryObject<Item> FROSTBARK_TRAPDOOR = ITEMS.register("frostbark_trapdoor", () -> new BlockItem(BlocksNorsecraft.FROSTBARK_TRAPDOOR.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));

    public static final RegistryObject<Item> FROSTBARK_FENCE_GATE = ITEMS.register("frostbark_fence_gate", () -> new BlockItem(BlocksNorsecraft.FROSTBARK_FENCE_GATE.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));

    public static final RegistryObject<Item> FROSTBARK_BUTTON = ITEMS.register("frostbark_button", () -> new BlockItem(BlocksNorsecraft.FROSTBARK_BUTTON.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));

    public static final RegistryObject<Item> FROSTBARK_DOOR = ITEMS.register("frostbark_door", () -> new BlockItem(BlocksNorsecraft.FROSTBARK_DOOR.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));

    // Transportation
    public static final RegistryObject<Item> FROSTBARK_BOAT = ITEMS.register("frostbark_boat", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_TRANSPORTATION)));

    // Misc
    public static final RegistryObject<Item> REGOLITH_DUST = ITEMS.register("regolith_dust", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));

    //public static final RegistryObject<Item> MUSIC_DISC_REALM_NINE = ITEMS.register("music_disc_realm_nine", () -> new MusicDiscItem(14, SoundEventsNorsecraft.MUSIC_REALM_NINE, new Item.Properties().tab(ItemGroup.TAB_MISC).stacksTo(1).rarity(Rarity.RARE)));



    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}