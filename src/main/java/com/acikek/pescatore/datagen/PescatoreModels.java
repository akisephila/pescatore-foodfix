package com.acikek.pescatore.datagen;

import com.acikek.pescatore.item.PescatoreItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class PescatoreModels extends FabricModelProvider {

    public PescatoreModels(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(PescatoreItems.ROOKIE_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(PescatoreItems.ADEPT_ROD, Models.HANDHELD_ROD);
        itemModelGenerator.register(PescatoreItems.EXPERT_ROD, Models.HANDHELD_ROD);
    }
}