package com.criliscraft.RandomThings.handler;

import com.criliscraft.RandomThings.reference.Reference;
import com.google.common.eventbus.Subscribe;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import java.io.File;

public class ConfigurationHandler {

    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile) {

        if (configuration == null) {

            Configuration configuration = new Configuration(configFile);
        }

    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {

            loadConfiguration();
        }
    }

    public void loadConfiguration(){
        testValue = configuration.getBoolean("configValue", configuration.CATEGORY_GENERAL, false, "Test");

        if (configuration.hasChanged()) {
            configuration.save();
        }
    }
}
