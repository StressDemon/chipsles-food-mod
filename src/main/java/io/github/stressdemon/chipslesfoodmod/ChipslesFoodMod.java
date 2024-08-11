package io.github.stressdemon.chipslesfoodmod;

import io.github.stressdemon.chipslesfoodmod.init.ItemInit;
import net.fabricmc.api.ModInitializer;

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
		LOGGER.info("Snevira smells like cheese...");
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}