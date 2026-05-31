package no.mc2ita.chunkloader.handlers;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.minecraft.world.entity.player.Player;

import no.mc2ita.chunkloader.Mc2ITA_Chunkloader;

@EventBusSubscriber(modid = Mc2ITA_Chunkloader.MOD_ID)
public class Mc2ITA_PlayerHandler {
    @SubscribeEvent
    public static Player getPlayer(PlayerTickEvent.Post event) {
        Player player = event.getEntity();
        return player;
    }
}
