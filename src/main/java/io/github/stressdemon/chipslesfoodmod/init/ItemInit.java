package io.github.stressdemon.chipslesfoodmod.init;

import io.github.stressdemon.chipslesfoodmod.ChipslesFoodMod;
import io.github.stressdemon.chipslesfoodmod.list.FoodList;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ItemInit {
    public  static  final Item GREEN_APPLE = register( "green_apple",
            new Item(new Item.Settings().food(FoodList.GREEN_APPLE)
            )
    );

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, ChipslesFoodMod.id(name)  , item);
    }

    public static void load() {

    }
}
