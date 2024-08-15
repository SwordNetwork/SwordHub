package me.anthony.swordhub.listeners;

import me.anthony.swordhub.util.item.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class PlayerJoinListener implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        player.teleport(Bukkit.getWorld("world").getSpawnLocation());

        //TODO -set up inventory
        player.getInventory().setItem(1, new ItemBuilder(Material.DIAMOND_SWORD).setItemName("Game Selector").build());
        player.getInventory().setItem(8, new ItemBuilder(Material.LIME_DYE).setItemName("Toggle Hidden Players").build());
        player.getInventory().setItem(2, new ItemBuilder(Material.NETHER_STAR).build());

        ItemStack playerHead = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta meta = (SkullMeta) playerHead.getItemMeta();
        meta.setOwnerProfile(player.getPlayerProfile());
        meta.setDisplayName("View Profile");
        playerHead.setItemMeta(meta);

        player.getInventory().setItem(9, playerHead);
    }
}
