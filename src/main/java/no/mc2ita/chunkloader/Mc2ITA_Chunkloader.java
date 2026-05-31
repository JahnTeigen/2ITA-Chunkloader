package no.mc2ita.chunkloader;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

@Mod(Mc2ITA_Chunkloader.MOD_ID)
public class Mc2ITA_Chunkloader {

    // When changing the mod ID, make sure to update it
    // in the 'gradle.properties' file as well!
    // Locate the 'mod_id' variable
    public static final String MOD_ID = "ita_chunkloader";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Mc2ITA_Chunkloader(IEventBus modEventBus) {
        LOGGER.info("2ITA Chunkloader loaded successfully");
    }
}