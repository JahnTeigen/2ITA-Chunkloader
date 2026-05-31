package no.mc2ita.chunkloader.handlers;

import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.ChunkPos;

public class Mc2ITA_ChunkManager {
    public static Logger LOGGER = LogUtils.getLogger();

    // private ArrayList<String> chunks = new ArrayList<String>();

    public Mc2ITA_ChunkManager() {
        LOGGER.info("Chunk manager loaded");
    }

    public static void forceLoad(ServerLevel level, ChunkPos chunkPos) {
        level.setChunkForced(chunkPos.x, chunkPos.z, true);
    }

    public static void unload(ServerLevel level, ChunkPos chunkPos) {
        level.setChunkForced(chunkPos.x, chunkPos.z, false);
    }

    private LevelChunk getPlayerChunk(Player player) {
        LevelChunk chunk = player.level().getChunkAt(player.blockPosition());
        return chunk;
    }

    private void updateChunkStore() {

    }
}