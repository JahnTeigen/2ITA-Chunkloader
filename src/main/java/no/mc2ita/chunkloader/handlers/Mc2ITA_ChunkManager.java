package no.mc2ita.chunkloader.handlers;

import org.slf4j.Logger;
import java.util.ArrayList;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

public class Mc2ITA_ChunkManager {
    public static Logger LOGGER = LogUtils.getLogger();

    private ArrayList<String> chunks = new ArrayList<String>();

    public Mc2ITA_ChunkManager() {
        LOGGER.info("Chunk manager loaded");
    }

    public void Load() {
        
    }

    public void Unload() {

    }

    private void GetChunk() {

    }

    private void UpdateChunkStore() {

    }
}