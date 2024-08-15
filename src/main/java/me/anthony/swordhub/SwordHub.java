package me.anthony.swordhub;

import me.anthony.swordhub.listeners.BlockBreakListener;
import me.anthony.swordhub.listeners.ItemDropListener;
import me.anthony.swordhub.listeners.PlayerInteractListener;
import me.anthony.swordhub.listeners.PlayerJoinListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class SwordHub extends JavaPlugin {

    private static SwordHub instance;

    @Override
    public void onEnable() {
        instance = this;

        registerEvents();
        getConfig().options().copyDefaults();
        saveDefaultConfig();
    }

    private void registerEvents() {
        getServer().getPluginManager().registerEvents(new PlayerInteractListener(), this);
        getServer().getPluginManager().registerEvents(new BlockBreakListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerInteractListener(), this);
        getServer().getPluginManager().registerEvents(new ItemDropListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
    }

    public static SwordHub getInstance() {
        return instance;
    }
}
