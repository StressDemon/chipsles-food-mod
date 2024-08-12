package io.github.stressdemon.chipslesfoodmod.list;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;

public class FoodList {
    public static final FoodComponent GREEN_APPLE = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(0.3F)
            .build();

    public static final FoodComponent OREO = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.1F)
            .build();

    public static final FoodComponent FRIED_EGG = new FoodComponent.Builder()
            .nutrition(6)
            .saturationModifier(0.5F)
            .build();

    public static final FoodComponent CHEESE = new FoodComponent.Builder()
            .nutrition(6)
            .saturationModifier(0.6F)
            .build();

    public static final FoodComponent TOAST = new FoodComponent.Builder()
            .nutrition(6)
            .saturationModifier(0.6F)
            .build();
}
