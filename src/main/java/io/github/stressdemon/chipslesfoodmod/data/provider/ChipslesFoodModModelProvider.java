package io.github.stressdemon.chipslesfoodmod.data.provider;

import io.github.stressdemon.chipslesfoodmod.init.BlockInit;
import io.github.stressdemon.chipslesfoodmod.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ChipslesFoodModModelProvider extends FabricModelProvider {


    public ChipslesFoodModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.LOLKYL_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ItemInit.GREEN_APPLE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.OREO, Models.GENERATED);
        itemModelGenerator.register(ItemInit.FRIED_EGG, Models.GENERATED);
        itemModelGenerator.register(ItemInit.CHEESE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.TOAST, Models.GENERATED);
    }
}
