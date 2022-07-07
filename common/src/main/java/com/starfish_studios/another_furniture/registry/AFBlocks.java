package com.starfish_studios.another_furniture.registry;

import com.starfish_studios.another_furniture.AnotherFurniture;
import com.starfish_studios.another_furniture.block.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

import java.util.function.Supplier;

public class AFBlocks {
    // Chair
    public static final Supplier<Block> OAK_CHAIR = registerBlock("oak_chair", () -> new ChairBlock(Block.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> SPRUCE_CHAIR = registerBlock("spruce_chair", () -> new ChairBlock(Block.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> BIRCH_CHAIR = registerBlock("birch_chair", () -> new ChairBlock(Block.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> JUNGLE_CHAIR = registerBlock("jungle_chair", () -> new ChairBlock(Block.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> ACACIA_CHAIR = registerBlock("acacia_chair", () -> new ChairBlock(Block.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> DARK_OAK_CHAIR = registerBlock("dark_oak_chair", () -> new ChairBlock(Block.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> CRIMSON_CHAIR = registerBlock("crimson_chair", () -> new ChairBlock(Block.Properties.of(Material.NETHER_WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> WARPED_CHAIR = registerBlock("warped_chair", () -> new ChairBlock(Block.Properties.of(Material.NETHER_WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    // Shelf
    public static final Supplier<Block> OAK_SHELF = registerBlock("oak_shelf", () -> new ShelfBlock(Block.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final Supplier<Block> SPRUCE_SHELF = registerBlock("spruce_shelf", () -> new ShelfBlock(Block.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final Supplier<Block> BIRCH_SHELF = registerBlock("birch_shelf", () -> new ShelfBlock(Block.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final Supplier<Block> JUNGLE_SHELF = registerBlock("jungle_shelf", () -> new ShelfBlock(Block.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final Supplier<Block> ACACIA_SHELF = registerBlock("acacia_shelf", () -> new ShelfBlock(Block.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final Supplier<Block> DARK_OAK_SHELF = registerBlock("dark_oak_shelf", () -> new ShelfBlock(Block.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final Supplier<Block> CRIMSON_SHELF = registerBlock("crimson_shelf", () -> new ShelfBlock(Block.Properties.of(Material.NETHER_WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final Supplier<Block> WARPED_SHELF = registerBlock("warped_shelf", () -> new ShelfBlock(Block.Properties.of(Material.NETHER_WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD).noOcclusion()));

    // Table
    public static final Supplier<Block> OAK_TABLE = registerBlock("oak_table", () -> new TableBlock(Block.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> SPRUCE_TABLE = registerBlock("spruce_table", () -> new TableBlock(Block.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> BIRCH_TABLE = registerBlock("birch_table", () -> new TableBlock(Block.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> JUNGLE_TABLE = registerBlock("jungle_table", () -> new TableBlock(Block.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> ACACIA_TABLE = registerBlock("acacia_table", () -> new TableBlock(Block.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> DARK_OAK_TABLE = registerBlock("dark_oak_table", () -> new TableBlock(Block.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> CRIMSON_TABLE = registerBlock("crimson_table", () -> new TableBlock(Block.Properties.of(Material.NETHER_WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> WARPED_TABLE = registerBlock("warped_table", () -> new TableBlock(Block.Properties.of(Material.NETHER_WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    // Bench
    //public static final Supplier<Block> OAK_BENCH = registerBlock("oak_bench", () -> new BenchBlock(Block.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    // Shutter
    public static final Supplier<Block> OAK_SHUTTER = registerBlock("oak_shutter", () -> new ShutterBlock(Block.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final Supplier<Block> SPRUCE_SHUTTER = registerBlock("spruce_shutter", () -> new ShutterBlock(Block.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final Supplier<Block> BIRCH_SHUTTER = registerBlock("birch_shutter", () -> new ShutterBlock(Block.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final Supplier<Block> JUNGLE_SHUTTER = registerBlock("jungle_shutter", () -> new ShutterBlock(Block.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final Supplier<Block> ACACIA_SHUTTER = registerBlock("acacia_shutter", () -> new ShutterBlock(Block.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final Supplier<Block> DARK_OAK_SHUTTER = registerBlock("dark_oak_shutter", () -> new ShutterBlock(Block.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final Supplier<Block> CRIMSON_SHUTTER = registerBlock("crimson_shutter", () -> new ShutterBlock(Block.Properties.of(Material.NETHER_WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final Supplier<Block> WARPED_SHUTTER = registerBlock("warped_shutter", () -> new ShutterBlock(Block.Properties.of(Material.NETHER_WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD).noOcclusion()));

    // Box
    public static final Supplier<Block> OAK_PLANTER_BOX = registerBlock("oak_planter_box", () -> new PlanterBoxBlock(Block.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> SPRUCE_PLANTER_BOX = registerBlock("spruce_planter_box", () -> new PlanterBoxBlock(Block.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> BIRCH_PLANTER_BOX = registerBlock("birch_planter_box", () -> new PlanterBoxBlock(Block.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> JUNGLE_PLANTER_BOX = registerBlock("jungle_planter_box", () -> new PlanterBoxBlock(Block.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> ACACIA_PLANTER_BOX = registerBlock("acacia_planter_box", () -> new PlanterBoxBlock(Block.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> DARK_OAK_PLANTER_BOX = registerBlock("dark_oak_planter_box", () -> new PlanterBoxBlock(Block.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> CRIMSON_PLANTER_BOX = registerBlock("crimson_planter_box", () -> new PlanterBoxBlock(Block.Properties.of(Material.NETHER_WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> WARPED_PLANTER_BOX = registerBlock("warped_planter_box", () -> new PlanterBoxBlock(Block.Properties.of(Material.NETHER_WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    // Stool
    public static final Supplier<Block> WHITE_STOOL = registerBlock("white_stool", () -> new StoolBlock(Block.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> ORANGE_STOOL = registerBlock("orange_stool", () -> new StoolBlock(Block.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> MAGENTA_STOOL = registerBlock("magenta_stool", () -> new StoolBlock(Block.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> LIGHT_BLUE_STOOL = registerBlock("light_blue_stool", () -> new StoolBlock(Block.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> YELLOW_STOOL = registerBlock("yellow_stool", () -> new StoolBlock(Block.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> LIME_STOOL = registerBlock("lime_stool", () -> new StoolBlock(Block.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> PINK_STOOL = registerBlock("pink_stool", () -> new StoolBlock(Block.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> GRAY_STOOL = registerBlock("gray_stool", () -> new StoolBlock(Block.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> LIGHT_GRAY_STOOL = registerBlock("light_gray_stool", () -> new StoolBlock(Block.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> CYAN_STOOL = registerBlock("cyan_stool", () -> new StoolBlock(Block.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> PURPLE_STOOL = registerBlock("purple_stool", () -> new StoolBlock(Block.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> BLUE_STOOL = registerBlock("blue_stool", () -> new StoolBlock(Block.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> BROWN_STOOL = registerBlock("brown_stool", () -> new StoolBlock(Block.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> GREEN_STOOL = registerBlock("green_stool", () -> new StoolBlock(Block.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> RED_STOOL = registerBlock("red_stool", () -> new StoolBlock(Block.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> BLACK_STOOL = registerBlock("black_stool", () -> new StoolBlock(Block.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD)));

    // Bell
    public static final Supplier<Block> SERVICE_BELL = registerBlock("service_bell", () -> new ServiceBellBlock(Block.Properties.of(Material.METAL).strength(2.0F, 3.0F).sound(SoundType.METAL)));
    //public static final Supplier<Block> LAMP = registerBlock("lamp", () -> new LampBlock(Block.Properties.of(Material.METAL).lightLevel((blockState) -> blockState.getValue(BlockStateProperties.LIT) ? (blockState.getValue(ModBlockStateProperties.LEVEL_1_4) * 4) - 1 : 0).strength(2.0F, 3.0F).sound(SoundType.METAL)));

    // Curtain
    public static final Supplier<Block> WHITE_CURTAIN = registerBlock("white_curtain", () -> new CurtainBlock(DyeColor.WHITE, Block.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion()));
    public static final Supplier<Block> ORANGE_CURTAIN = registerBlock("orange_curtain", () -> new CurtainBlock(DyeColor.ORANGE, Block.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion()));
    public static final Supplier<Block> MAGENTA_CURTAIN = registerBlock("magenta_curtain", () -> new CurtainBlock(DyeColor.MAGENTA, Block.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion()));
    public static final Supplier<Block> LIGHT_BLUE_CURTAIN = registerBlock("light_blue_curtain", () -> new CurtainBlock(DyeColor.LIGHT_BLUE, Block.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion()));
    public static final Supplier<Block> YELLOW_CURTAIN = registerBlock("yellow_curtain", () -> new CurtainBlock(DyeColor.YELLOW, Block.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion()));
    public static final Supplier<Block> LIME_CURTAIN = registerBlock("lime_curtain", () -> new CurtainBlock(DyeColor.LIME, Block.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion()));
    public static final Supplier<Block> PINK_CURTAIN = registerBlock("pink_curtain", () -> new CurtainBlock(DyeColor.PINK, Block.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion()));
    public static final Supplier<Block> GRAY_CURTAIN = registerBlock("gray_curtain", () -> new CurtainBlock(DyeColor.GRAY, Block.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion()));
    public static final Supplier<Block> LIGHT_GRAY_CURTAIN = registerBlock("light_gray_curtain", () -> new CurtainBlock(DyeColor.LIGHT_GRAY, Block.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion()));
    public static final Supplier<Block> CYAN_CURTAIN = registerBlock("cyan_curtain", () -> new CurtainBlock(DyeColor.CYAN, Block.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion()));
    public static final Supplier<Block> PURPLE_CURTAIN = registerBlock("purple_curtain", () -> new CurtainBlock(DyeColor.PURPLE, Block.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion()));
    public static final Supplier<Block> BLUE_CURTAIN = registerBlock("blue_curtain", () -> new CurtainBlock(DyeColor.BLUE, Block.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion()));
    public static final Supplier<Block> BROWN_CURTAIN = registerBlock("brown_curtain", () -> new CurtainBlock(DyeColor.BROWN, Block.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion()));
    public static final Supplier<Block> GREEN_CURTAIN = registerBlock("green_curtain", () -> new CurtainBlock(DyeColor.GREEN, Block.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion()));
    public static final Supplier<Block> RED_CURTAIN = registerBlock("red_curtain", () -> new CurtainBlock(DyeColor.RED, Block.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion()));
    public static final Supplier<Block> BLACK_CURTAIN = registerBlock("black_curtain", () -> new CurtainBlock(DyeColor.BLACK, Block.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion()));

    // Sofa
    //public static final Supplier<Block> WHITE_SOFA = registerBlock("white_sofa", () -> new SofaBlock(Block.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD)));
    //public static final Supplier<Block> ORANGE_SOFA = registerBlock("orange_sofa", () -> new SofaBlock(Block.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD)));

    public static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> block) {
        Supplier<T> supplier = AFRegistry.registerBlock(name, block);
        AFRegistry.registerItem(name, () -> new BlockItem(supplier.get(), new Item.Properties().tab(AnotherFurniture.TAB)));
        return supplier;
    }

    public static void init() {}
}
