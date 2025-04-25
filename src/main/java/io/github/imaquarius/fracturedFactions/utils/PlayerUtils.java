package io.github.imaquarius.fracturedFactions.utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.UUID;

public class PlayerUtils {

    public static void messagePlayerByUUID(UUID playerUUID, String message){
        Player player = Bukkit.getPlayer(playerUUID);

        if (player != null) {
            player.sendMessage(message);
        }
    }
}
