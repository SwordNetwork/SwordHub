package me.anthony.swordhub;

import me.anthony.swordhub.listeners.BlockBreakListener;
import me.anthony.swordhub.listeners.PlayerInteractListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class SwordHub extends JavaPlugin {

    private static SwordHub instance;

    @Override
    public void onEnable() {
        instance = this;

        registerEvents();
    }

    private void registerEvents() {
        getServer().getPluginManager().registerEvents(new PlayerInteractListener(), this);
        getServer().getPluginManager().registerEvents(new BlockBreakListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerInteractListener(), this);
    }

    public static SwordHub getInstance() {
        return instance;
    }
}
