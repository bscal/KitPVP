package me.bscal.starter.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ItemSpawnEvent;


import me.bscal.starter.Main;

public class ItemDropListener implements Listener{
	
	  public final Main plugin;
	  
	  public ItemDropListener(Main instance)
	  {
	    this.plugin = instance;
	  }
	  
	  @EventHandler
	  public void onItemSpawn(final ItemSpawnEvent e)
	  {
	    this.plugin.getServer().getScheduler().runTaskLater(this.plugin, new Runnable()
	    {
	      public void run()
	      {
	        e.getEntity().remove();
	      }
	    }, 60L);
	  }

}
