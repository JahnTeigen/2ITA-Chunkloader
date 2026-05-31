package no.mc2ita.chunkloader;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(ChunkloaderMod.MOD_ID)
public class Mc2ITA_Chunkloader {
    public static final String MOD_ID = "2ita-chunkloader";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Mc2ITA_Chunkloader(IEventBus modEventBus) {
        LOGGER.info("2ITA Chunkloader loaded successfully");
    }
}
