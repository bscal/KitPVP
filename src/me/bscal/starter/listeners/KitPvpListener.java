package me.bscal.starter.listeners;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class KitPvpListener implements Listener {

	public void onEntityDropEvent(PlayerDropItemEvent e) {
		if (e.getItemDrop().getItemStack().getType() != Material.BOWL) {
			e.setCancelled(true);
		}
	}
	
}
