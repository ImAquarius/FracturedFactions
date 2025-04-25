package io.github.imaquarius.fracturedFactions;

import io.github.imaquarius.fracturedFactions.listeners.FactionsCreateEventListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class FracturedFactions extends JavaPlugin {
    private PluginManager pluginManager;

    @Override
    public void onEnable() {

        pluginManager = getServer().getPluginManager();

        if (!initializeMedievalFactions()) {
            pluginManager.disablePlugin(this);
            return;
        }

        pluginManager.registerEvents(new FactionsCreateEventListener(), this);

        printStartupMessage();
    }

    private boolean initializeMedievalFactions() {
        getLogger().info("Initializing Medieval Factions...");

        Plugin medievalFactions = pluginManager.getPlugin("MedievalFactions");

        if (medievalFactions == null || !medievalFactions.isEnabled()) {
            getLogger().severe("Medieval Factions Not Found!");
            return false;
        }

        getLogger().info("Medieval Factions Found!");
        return true;
    }

    private void printStartupMessage(){
        getLogger().info("==============================");
        getLogger().info("Enabled Successfully");
        getLogger().info("Running on " + Bukkit.getVersion());
        getLogger().info("==============================");
    }
}