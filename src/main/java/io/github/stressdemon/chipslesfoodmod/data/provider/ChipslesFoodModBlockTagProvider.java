package io.github.stressdemon.chipslesfoodmod.data.provider;

import io.github.stressdemon.chipslesfoodmod.ChipslesFoodMod;
import io.github.stressdemon.chipslesfoodmod.init.BlockInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.concurrent.CompletableFuture;

public class ChipslesFoodModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public ChipslesFoodModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    public static final TagKey<Block> CHIPSLES_FOOD_TAG = TagKey.of(RegistryKeys.BLOCK, ChipslesFoodMod.id("chipsles_food"));

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(BlockInit.LOLKYL_BLOCK);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(BlockInit.LOLKYL_BLOCK);

        getOrCreateTagBuilder(CHIPSLES_FOOD_TAG)
                .add(BlockInit.LOLKYL_BLOCK)
                //.add(Blocks.ENCHANTING_TABLE)
        ;
    }
}
