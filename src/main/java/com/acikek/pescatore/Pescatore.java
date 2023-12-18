package com.acikek.pescatore;

import com.acikek.pescatore.entity.MinigameFishEntity;
import com.acikek.pescatore.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pescatore implements ModInitializer {

    public static final String ID = "pescatore";

    public static final Logger LOGGER = LoggerFactory.getLogger(ID);

    public static Identifier id(String path) {
        return new Identifier(ID, path);
    }

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Pescatore...");
        MinigameFishEntity.register();
        ModItems.register();
    }
}
