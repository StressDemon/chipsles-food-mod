package io.github.stressdemon.chipslesfoodmod.init;

import io.github.stressdemon.chipslesfoodmod.ChipslesFoodMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

import java.util.Optional;

public class ItemGroupInit {
    public static final Text CHIPSLES_FOOD_TITLE = Text.translatable("itemGroup" + ChipslesFoodMod.MOD_ID + "chipsles_food_group");
    public static final ItemGroup CHIPSLES_FOOD_GROUP = register("chipsles_food_group", FabricItemGroup.builder()
            .displayName(CHIPSLES_FOOD_TITLE)
            .icon(ItemInit.GREEN_APPLE::getDefaultStack)
            .entries((displayContext, entries) -> Registries.ITEM.getIds()
                .stream()
                .filter(key -> key.getNamespace().equals(ChipslesFoodMod.MOD_ID))
                .map(Registries.ITEM::getOrEmpty)
                .map(Optional::orElseThrow)
                .filter(item -> !ItemInit.BLACKLIST.contains(item))
                .forEach(entries::add))
            .build());

    public static <T extends ItemGroup> T register(String name, T itemGroup) {
        return Registry.register(Registries.ITEM_GROUP, ChipslesFoodMod.id(name), itemGroup);
    }

    public static void load() {}
}
