package no.mc2ita.chunkloader.handlers;

import org.slf4j.Logger;
import java.util.ArrayList;
import com.mojang.logging.LogUtils;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.chunk.LevelChunk;

public class Mc2ITA_ChunkManager {
    public static Logger LOGGER = LogUtils.getLogger();

    private ArrayList<String> chunks = new ArrayList<String>();

    public Mc2ITA_ChunkManager() {
        LOGGER.info("Chunk manager loaded");
    }

    public void Load() {
        Player player = Mc2ITA_PlayerHandler.getPlayer(null);
        LevelChunk chunk = player.level().getChunkAt(player.blockPosition());
        System.out.println("Chunk: " + chunk.getPos().toString());
    }

    public void Unload() {

    }

    private void GetChunk() {
        
    }

    private void UpdateChunkStore() {

    }
}