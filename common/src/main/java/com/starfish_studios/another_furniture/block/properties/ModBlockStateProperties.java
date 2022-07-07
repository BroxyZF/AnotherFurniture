package com.starfish_studios.another_furniture.block.properties;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class ModBlockStateProperties {
    public static final EnumProperty<HorizontalConnectionType> HORIZONTAL_CONNECTION_TYPE = EnumProperty.create("type", HorizontalConnectionType.class);
    public static final EnumProperty<ShutterType> SHUTTER_TYPE = EnumProperty.create("type", ShutterType.class);
    public static final EnumProperty<CurtainType> CURTAIN_TYPE = EnumProperty.create("type", CurtainType.class);
    public static final DirectionProperty FACING_EXCEPT_DOWN = DirectionProperty.create("facing", (direction) -> direction != Direction.DOWN);
    public static final IntegerProperty LEVEL_1_4 = IntegerProperty.create("level", 1, 4);
    public static final IntegerProperty LEVEL_0_15 = IntegerProperty.create("level", 0, 15);
}