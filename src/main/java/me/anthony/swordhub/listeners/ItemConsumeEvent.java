package me.anthony.swordhub.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;

public class ItemConsumeEvent implements Listener {
    @EventHandler
    public void onItemUse(PlayerItemConsumeEvent event) {
        Player player = event.getPlayer();

        //TODO - set up menus for lobby items
    }
}
