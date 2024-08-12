package io.github.stressdemon.chipslesfoodmod.init;

import io.github.stressdemon.chipslesfoodmod.ChipslesFoodMod;
import io.github.stressdemon.chipslesfoodmod.list.FoodList;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    public static final List<ItemConvertible> BLACKLIST = new ArrayList<>();

    public  static  final Item GREEN_APPLE = register( "green_apple",
            new Item(new Item.Settings().food(FoodList.GREEN_APPLE)
        )
    );

    public static final Item OREO = register("oreo",
            new Item(new Item.Settings().food(FoodList.OREO)
        )
    );

    public static final Item FRIED_EGG = register("fried_egg",
            new Item(new Item.Settings().food(FoodList.FRIED_EGG)
            )
    );

    public static final Item CHEESE = register("cheese",
            new Item(new Item.Settings().food(FoodList.CHEESE)
            )
    );

    public static final Item TOAST = register("toast",
            new Item(new Item.Settings().food(FoodList.TOAST)
            )
    );

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, ChipslesFoodMod.id(name)  , item);
    }

    public static void load() {
        //BLACKLIST.add();
    }

}
