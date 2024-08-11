package io.github.stressdemon.chipslesfoodmod.list;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;

public class FoodList {
    public static final FoodComponent GREEN_APPLE = new FoodComponent.Builder()
            .nutrition(4).
            saturationModifier(0.3F)
            .build();
}
