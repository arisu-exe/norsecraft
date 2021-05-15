package io.github.fallOut015.norsecraft.block;

import io.github.fallOut015.norsecraft.MainNorsecraft;
import io.github.fallOut015.norsecraft.block.material.MaterialNorsecraft;
import io.github.fallOut015.norsecraft.block.trees.FrostbarkTree;
import io.github.fallOut015.norsecraft.particles.ParticleTypesNorsecraft;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.util.Direction;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlocksNorsecraft {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MainNorsecraft.MODID);



    public static final RegistryObject<Block> FROSTBARK_PLANKS = BLOCKS.register("frostbark_planks", () -> new Block(Block.Properties.of(Material.WOOD, MaterialColor.ICE).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> FROSTBARK_SAPLING = BLOCKS.register("frostbark_sapling", () -> new SaplingBlock(new FrostbarkTree(), Block.Properties.of(Material.PLANT).noCollission().randomTicks().strength(0).sound(SoundType.GRASS)));

    public static final RegistryObject<Block> POTTED_FROSTBARK_SAPLING = BLOCKS.register("potted_frostbark_sapling", () -> new FlowerPotBlock(null, FROSTBARK_SAPLING, Block.Properties.of(Material.DECORATION).strength(0).noOcclusion()));

    public static final RegistryObject<Block> FROSTBARK_LOG = BLOCKS.register("frostbark_log", () -> log(MaterialColor.TERRACOTTA_WHITE, MaterialColor.ICE));

    public static final RegistryObject<Block> STRIPPED_FROSTBARK_LOG = BLOCKS.register("stripped_frostbark_log", () -> log(MaterialColor.TERRACOTTA_WHITE, MaterialColor.TERRACOTTA_WHITE)); // TODO more parity, thanks for teaching me that word, @Mojang

    public static final RegistryObject<Block> STRIPPED_FROSTBARK_WOOD = BLOCKS.register("stripped_frostbark_wood", () -> new RotatedPillarBlock(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE).strength(2.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> FROSTBARK_WOOD = BLOCKS.register("frostbark_wood", () -> new RotatedPillarBlock(Block.Properties.of(Material.WOOD, MaterialColor.ICE).strength(2.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> FROSTBARK_LEAVES = BLOCKS.register("frostbark_leaves", () -> new LeavesBlock(Block.Properties.of(Material.LEAVES).strength(0.2f).randomTicks().sound(SoundType.GRASS).noOcclusion()));

    public static final RegistryObject<Block> FROSTBARK_SLAB = BLOCKS.register("frostbark_slab", () -> new SlabBlock(Block.Properties.of(Material.WOOD, MaterialColor.ICE).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> FROSTBARK_PRESSURE_PLATE = BLOCKS.register("frostbark_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.of(Material.WOOD, MaterialColor.ICE).noCollission().strength(0.5F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> FROSTBARK_FENCE = BLOCKS.register("frostbark_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.ICE).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> FROSTBARK_TRAPDOOR = BLOCKS.register("frostbark_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.ICE).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

    public static final RegistryObject<Block> FROSTBARK_FENCE_GATE = BLOCKS.register("frostbark_fence_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.ICE).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> FROSTBARK_STAIRS = BLOCKS.register("frostbark_stairs", () -> new StairsBlock(FROSTBARK_PLANKS.get()::defaultBlockState, Block.Properties.copy(FROSTBARK_PLANKS.get())));

    public static final RegistryObject<Block> FROSTBARK_BUTTON = BLOCKS.register("frostbark_button", () -> new WoodButtonBlock(Block.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> FROSTBARK_DOOR = BLOCKS.register("frostbark_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.ICE).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

    public static final RegistryObject<Block> FROSTBARK_SIGN = BLOCKS.register("frostbark_sign", () -> new StandingSignBlock(Block.Properties.of(Material.WOOD, MaterialColor.ICE).noCollission().strength(1.0F).sound(SoundType.WOOD), WoodTypeNorsecraft.FROSTBARK));

    public static final RegistryObject<Block> FROSTBARK_WALL_SIGN = BLOCKS.register("frostbark_wall_sign", () -> new WallSignBlock(Block.Properties.of(Material.WOOD, MaterialColor.ICE).noCollission().strength(1.0F).sound(SoundType.WOOD).lootFrom(FROSTBARK_SIGN), WoodTypeNorsecraft.FROSTBARK));

    public static final RegistryObject<Block> NIDAVELLIR_STARSTONE_ORE = BLOCKS.register("nidavellir_starstone_ore", () -> new OreBlock(Block.Properties.of(Material.STONE).strength(3.0f, 3.0f).harvestLevel(6).harvestTool(ToolType.PICKAXE).lightLevel(state -> 10)));
    public static final RegistryObject<Block> NIDAVELLIR_CELESTIUM_ORE = BLOCKS.register("nidavellir_celestium_ore", () -> new OreBlock(Block.Properties.of(Material.STONE).strength(3.0f, 3.0f).harvestLevel(8).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> NIDAVELLIR_URU_ORE = BLOCKS.register("nidavellir_uru_ore", () -> new OreBlock(Block.Properties.of(Material.STONE).strength(3.0f, 3.0f).harvestLevel(9).harvestTool(ToolType.PICKAXE)));

    public static final RegistryObject<Block> STARSTONE_BLOCK = BLOCKS.register("starstone_block", () -> new Block(Block.Properties.of(Material.METAL, MaterialColor.GOLD).strength(5.0f, 6.0f).sound(SoundType.METAL).lightLevel(state -> 15)));
    public static final RegistryObject<Block> CELESTIUM_BLOCK = BLOCKS.register("celestium_block", () -> new Block(Block.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_BLUE).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> URU_BLOCK = BLOCKS.register("uru_block", () -> new Block(Block.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0f, 6.0f).sound(SoundType.METAL)));

    public static final RegistryObject<Block> STARSTONE_TORCH = BLOCKS.register("starstone_torch", () -> new TorchBlock(Block.Properties.of(Material.DECORATION).lightLevel(state -> 16).noCollission().strength(0), ParticleTypesNorsecraft.TWINKLE.get())); // TODO fix?
    public static final RegistryObject<Block> STARSTONE_WALL_TORCH = BLOCKS.register("starstone_wall_torch", () -> new WallTorchBlock(Block.Properties.of(Material.DECORATION).lightLevel(state -> 16).noCollission().strength(0), ParticleTypesNorsecraft.TWINKLE.get()));

    // Nidavellir
    public static final RegistryObject<Block> REGOLITH = BLOCKS.register("regolith", () -> new Block(Block.Properties.of(MaterialNorsecraft.REGOLITH).strength(1.0f)));

    public static final RegistryObject<Block> MYRKYLITE = BLOCKS.register("myrkylite", () -> new Block(Block.Properties.of(MaterialNorsecraft.MYRKYLITE).strength(2.0f).harvestTool(ToolType.PICKAXE).harvestLevel(5)));
    public static final RegistryObject<Block> MYRKYLITE_SLAB = BLOCKS.register("myrkylite_slab", () -> new SlabBlock(Block.Properties.of(MaterialNorsecraft.MYRKYLITE).strength(2.0f).harvestTool(ToolType.PICKAXE).harvestLevel(5)));
    public static final RegistryObject<Block> MYRKYLITE_STAIRS = BLOCKS.register("myrkylite_stairs", () -> new StairsBlock(MYRKYLITE.get()::defaultBlockState, Block.Properties.of(MaterialNorsecraft.MYRKYLITE).strength(2.0f).harvestTool(ToolType.PICKAXE).harvestLevel(5)));
    public static final RegistryObject<Block> MYRKYLITE_WALL = BLOCKS.register("myrkylite_wall", () -> new WallBlock(Block.Properties.of(MaterialNorsecraft.MYRKYLITE).strength(2.0f).harvestTool(ToolType.PICKAXE).harvestLevel(5)));

    public static final RegistryObject<Block> POLISHED_MYRKYLITE = BLOCKS.register("polished_myrkylite", () -> new Block(Block.Properties.of(MaterialNorsecraft.MYRKYLITE).strength(2.0f).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> POLISHED_MYRKYLITE_SLAB = BLOCKS.register("polished_myrkylite_slab", () -> new SlabBlock(Block.Properties.of(MaterialNorsecraft.MYRKYLITE).strength(2.0f).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> POLISHED_MYRKYLITE_STAIRS = BLOCKS.register("polished_myrkylite_stairs", () -> new StairsBlock(POLISHED_MYRKYLITE.get()::defaultBlockState, Block.Properties.of(MaterialNorsecraft.MYRKYLITE).strength(2.0f).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> POLISHED_MYRKYLITE_WALL = BLOCKS.register("polished_myrkylite_wall", () -> new WallBlock(Block.Properties.of(MaterialNorsecraft.MYRKYLITE).strength(2.0f).harvestTool(ToolType.PICKAXE)));

    public static final RegistryObject<Block> POLISHED_MYRKYLITE_BRICKS = BLOCKS.register("polished_myrkylite_bricks", () -> new Block(Block.Properties.of(MaterialNorsecraft.MYRKYLITE).strength(4.0f)));
    public static final RegistryObject<Block> POLISHED_MYRKYLITE_BRICK_SLAB = BLOCKS.register("polished_myrkylite_brick_slab", () -> new SlabBlock(Block.Properties.of(MaterialNorsecraft.MYRKYLITE).strength(4.0f)));
    public static final RegistryObject<Block> POLISHED_MYRKYLITE_BRICK_STAIRS = BLOCKS.register("polished_myrkylite_brick_stairs", () -> new StairsBlock(POLISHED_MYRKYLITE_BRICKS.get()::defaultBlockState, Block.Properties.of(MaterialNorsecraft.MYRKYLITE).strength(4.0f)));
    public static final RegistryObject<Block> POLISHED_MYRKYLITE_BRICK_WALL = BLOCKS.register("polished_myrkylite_brick_wall", () -> new WallBlock(Block.Properties.of(MaterialNorsecraft.MYRKYLITE).strength(4.0f)));

    // Niflheim
    public static final RegistryObject<Block> PERMAFROST_GRASS_BLOCK = BLOCKS.register("permafrost_grass_block", () -> new PermafrostBlock(Block.Properties.of(Material.GRASS)));
    public static final RegistryObject<Block> PERMAFROST_DIRT = BLOCKS.register("permafrost_dirt", () -> new Block(Block.Properties.of(Material.GRASS)));



    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }

    private static RotatedPillarBlock log(MaterialColor p_235430_0_, MaterialColor p_235430_1_) {
        return new RotatedPillarBlock(AbstractBlock.Properties.of(Material.WOOD, (p_235431_2_) -> {
            return p_235431_2_.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? p_235430_0_ : p_235430_1_;
        }).strength(2.0F).sound(SoundType.WOOD));
    }
}