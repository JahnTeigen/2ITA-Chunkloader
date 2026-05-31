package no.mc2ita.chunkloader;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

import no.mc2ita.chunkloader.handlers.Mc2ITA_ChunkManager;

@Mod(Mc2ITA_Chunkloader.MOD_ID)
public class Mc2ITA_Chunkloader {

    public static final String MOD_ID = "ita_chunkloader";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static final Mc2ITA_ChunkManager chunkManager = new Mc2ITA_ChunkManager();

    public Mc2ITA_Chunkloader(IEventBus modEventBus) {
        LOGGER.info("2ITA Chunkloader loaded successfully");
    }
}