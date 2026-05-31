package no.mc2ita.chunkloader.handlers;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.ChunkPos;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.RegisterCommandsEvent;

import no.mc2ita.chunkloader.Mc2ITA_Chunkloader;

@EventBusSubscriber(modid = Mc2ITA_Chunkloader.MOD_ID)
public class Mc2ITA_CommandHandler {

    @SubscribeEvent
    public static void onRegisterCommands(RegisterCommandsEvent event) {
        CommandDispatcher<CommandSourceStack> dispatcher = event.getDispatcher();

        dispatcher.register(
            Commands.literal("chunkloader")
                .requires(source -> source.hasPermission(2)) // op level 2
                .then(Commands.literal("load")
                    .executes(ctx -> {
                        ServerPlayer player = ctx.getSource().getPlayerOrException();
                        ServerLevel level = ctx.getSource().getLevel();
                        ChunkPos chunkPos = new ChunkPos(player.blockPosition());
                        Mc2ITA_ChunkManager.forceLoad(level, chunkPos);

                        ctx.getSource().sendSuccess(() -> 
                            Component.literal("Forceloaded current chunk"), true);
                        return 1;
                    })
                )
                .then(Commands.literal("unload")
                    .executes(ctx -> {
                        ServerPlayer player = ctx.getSource().getPlayerOrException();
                        ServerLevel level = ctx.getSource().getLevel();
                        ChunkPos chunkPos = new ChunkPos(player.blockPosition());
                        Mc2ITA_ChunkManager.unload(level, chunkPos);

                        ctx.getSource().sendSuccess(() -> 
                            Component.literal("Unloaded current chunk"), true);
                        return 1;
                    })
                )
        );
    }
}
