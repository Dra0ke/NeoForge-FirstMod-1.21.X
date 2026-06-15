package net.dra0ke.dra0kessupermod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties BETTER_BREAD = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6f)
            .effect(() -> new MobEffectInstance(MobEffects.POISON, 160, 2), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.WEAKNESS, 240, 2), 1.0F).build();
}
