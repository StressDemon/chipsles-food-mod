package io.github.stressdemon.chipslesfoodmod.data.provider;

import io.github.stressdemon.chipslesfoodmod.ChipslesFoodMod;
import io.github.stressdemon.chipslesfoodmod.init.BlockInit;
import io.github.stressdemon.chipslesfoodmod.init.ItemGroupInit;
import io.github.stressdemon.chipslesfoodmod.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ChipslesFoodModEnglishLangProvider extends FabricLanguageProvider {

    public ChipslesFoodModEnglishLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    private static void addText(@NotNull TranslationBuilder builder, @NotNull Text text, @NotNull String value) {
        if (text.getContent() instanceof TranslatableTextContent translatableTextContent) {
            builder.add(translatableTextContent.getKey(), value);
        } else {
            ChipslesFoodMod.LOGGER.warn("Failed to add translation to text: {}", text.getString());
        }
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ItemInit.GREEN_APPLE, "Green Apple");
        translationBuilder.add(ItemInit.OREO, "Oreo");
        translationBuilder.add(ItemInit.FRIED_EGG, "Fried Egg");
        translationBuilder.add(ItemInit.CHEESE, "Cheese");
        translationBuilder.add(ItemInit.TOAST, "Toast");
        translationBuilder.add(BlockInit.LOLKYL_BLOCK, "Lolkyl Block");
        addText(translationBuilder, ItemGroupInit.CHIPSLES_FOOD_TITLE, "Chipsles Food Mod");
    }
}
