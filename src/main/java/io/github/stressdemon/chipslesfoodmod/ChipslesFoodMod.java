package io.github.stressdemon.chipslesfoodmod;

import io.github.stressdemon.chipslesfoodmod.init.BlockInit;
import io.github.stressdemon.chipslesfoodmod.init.ItemGroupInit;
import io.github.stressdemon.chipslesfoodmod.init.ItemInit;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChipslesFoodMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("chipsles-food-mod");
	public static final String MOD_ID = "chipsles-food-mod";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ItemInit.load();
		BlockInit.load();
		ItemGroupInit.load();

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
			entries.addAfter(Items.COOKIE, ItemInit.OREO);
			entries.addAfter(Items.APPLE, ItemInit.GREEN_APPLE);
			entries.addAfter(Items.EGG, ItemInit.FRIED_EGG);
			entries.addAfter(Items.BREAD, ItemInit.TOAST);
		});

		LOGGER.info("Snevira smells like cheese...");
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}