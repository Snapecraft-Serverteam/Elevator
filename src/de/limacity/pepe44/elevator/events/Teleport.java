package de.limacity.pepe44.elevator.events;

import de.limacity.pepe44.elevator.Elevator;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;

public class Teleport implements Listener {

    @EventHandler
    private void onTeleport(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        if (player.getLocation().subtract(0, 1, 0).getBlock().getType().equals(Material.DAYLIGHT_DETECTOR)) {
            for (int i = 2; i < 10; i++) {
                if (player.getLocation().subtract(0, -i, 0).getBlock().getType().equals(Material.DAYLIGHT_DETECTOR)) {
                    Location loc = player.getLocation().subtract(0, -i - 0.5, 0);
                    player.teleport(loc);
                    return;
                }
            }
        }
    }

    @EventHandler
    private void onSneakTeleport(PlayerToggleSneakEvent event) {
        Player player = event.getPlayer();
        if (player.getLocation().subtract(0, 0, 0).getBlock().getType().equals(Material.DAYLIGHT_DETECTOR) && player.isSneaking()) {
            for (int i = 2; i < 11; i++) {
                if (player.getLocation().subtract(0, i, 0).getBlock().getType().equals(Material.DAYLIGHT_DETECTOR)) {
                    Location loc = player.getLocation().subtract(0, i, 0);
                    player.teleport(loc);
                    return;
                }
            }
        }
    }
}
