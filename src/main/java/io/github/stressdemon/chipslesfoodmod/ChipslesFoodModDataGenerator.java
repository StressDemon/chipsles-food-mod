package io.github.stressdemon.chipslesfoodmod;

import io.github.stressdemon.chipslesfoodmod.data.provider.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ChipslesFoodModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(ChipslesFoodModModelProvider::new);
		pack.addProvider(ChipslesFoodModEnglishLangProvider::new);
		pack.addProvider(ChipslesFoodModBlockLootTableProvider::new);
		pack.addProvider(ChipslesFoodModBlockTagProvider::new);
		pack.addProvider(ChipslesFoodModRecipeProvider::new);
	}
}
