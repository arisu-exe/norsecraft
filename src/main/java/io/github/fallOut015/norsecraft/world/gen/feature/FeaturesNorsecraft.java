package io.github.fallOut015.norsecraft.world.gen.feature;

import io.github.fallOut015.norsecraft.block.BlocksNorsecraft;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureSpread;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.TwoLayerFeature;
import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;
import net.minecraftforge.registries.ForgeRegistries;

public class FeaturesNorsecraft {
    public static final class Features {
    	public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> FROSTBARK = Feature.TREE.configured((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.FROSTBARK_LOG), new SimpleBlockStateProvider(States.FROSTBARK_LEAVES), new BlobFoliagePlacer(FeatureSpread.fixed(2), FeatureSpread.fixed(0), 3), new StraightTrunkPlacer(4, 2, 0), new TwoLayerFeature(1, 0, 1))).ignoreVines().build());

    	public static final ConfiguredFeature<?, ?> ORE_NIDAVELLIR_CELESTIUM = Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, States.NIDAVELLIR_CELESTIUM_ORE, 17)).range(128).squared().count(20);
	    public static final ConfiguredFeature<?, ?> ORE_NIDAVELLIR_STARSTONE = Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, States.NIDAVELLIR_STARSTONE_ORE, 17)).range(128).squared().count(20);
    	public static final ConfiguredFeature<?, ?> ORE_NIDAVELLIR_URU = Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, States.NIDAVELLIR_URU_ORE, 17)).range(128).squared().count(20);
    }

    public static final class Configs {
    }

    public static final class Placements {
    }

    public static final class States {
		protected static final BlockState FROSTBARK_LOG = BlocksNorsecraft.FROSTBARK_LOG.get().defaultBlockState();
		protected static final BlockState FROSTBARK_LEAVES = BlocksNorsecraft.FROSTBARK_LEAVES.get().defaultBlockState();

		protected static final BlockState NIDAVELLIR_CELESTIUM_ORE = BlocksNorsecraft.NIDAVELLIR_CELESTIUM_ORE.get().defaultBlockState();
		protected static final BlockState NIDAVELLIR_STARSTONE_ORE = BlocksNorsecraft.NIDAVELLIR_STARSTONE_ORE.get().defaultBlockState();
		protected static final BlockState NIDAVELLIR_URU_ORE = BlocksNorsecraft.NIDAVELLIR_URU_ORE.get().defaultBlockState();
    }

    public static final class RuleTests {
        public static final RuleTest MYRKYLITE = new BlockMatchRuleTest(BlocksNorsecraft.MYRKYLITE.get());
    }
}