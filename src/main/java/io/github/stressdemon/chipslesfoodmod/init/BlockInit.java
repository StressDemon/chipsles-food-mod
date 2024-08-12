package io.github.stressdemon.chipslesfoodmod.init;

import io.github.stressdemon.chipslesfoodmod.ChipslesFoodMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class BlockInit {
    public static final Block LOLKYL_BLOCK = registerWithItem("lolkyl_block", new Block(AbstractBlock.Settings.create()
            .strength(1.5F, 6.0F)
            .requiresTool()
            .luminance((state)-> {return 24;})
        )
    );

    public static <T extends Block> T register(String name, T block) {
        return Registry.register(Registries.BLOCK, ChipslesFoodMod.id(name), block);
    }

    public static <T extends Block> T registerWithItem(String name, T block, Item.Settings settings) {
        T registered = register(name, block);
        ItemInit.register(name, new BlockItem(registered, settings));
        return registered;
    }

    public static <T extends Block> T registerWithItem(String name, T block) {
        return registerWithItem(name, block, new Item.Settings());
    }

    public static void load() {

    }
}
