package io.github.stressdemon.chipslesfoodmod.data.provider;

import io.github.stressdemon.chipslesfoodmod.init.BlockInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ChipslesFoodModBlockLootTableProvider extends FabricBlockLootTableProvider {

    public ChipslesFoodModBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(BlockInit.LOLKYL_BLOCK);
    }
}
