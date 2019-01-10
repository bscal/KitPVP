package me.bscal.starter.listeners;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffectType;

public class NerfListener implements Listener{

	
	  @EventHandler
	  public void dSword(EntityDamageByEntityEvent e)
	  {
	    Entity entity = e.getEntity();
	    Entity damagers = e.getDamager();
	    if (((entity instanceof Player)) && ((damagers instanceof Player)))
	    {
	      Player playerHit = (Player)entity;
	      Player damager = (Player)damagers;
	      Block b = damager.getLocation().getBlock();
	      if (damager.getItemInHand().getType() == Material.DIAMOND_SWORD) {
	        e.setDamage(e.getDamage() - 1.5D);
	      }
	      if (damager.getItemInHand().getType() == Material.IRON_SWORD) {
	        e.setDamage(e.getDamage() - 1.5D);
	      }
	      if (damager.getItemInHand().getType() == Material.STONE_SWORD) {
	        e.setDamage(e.getDamage() - 1.5D);
	      }
	      if (damager.getItemInHand().getType() == Material.GOLD_SWORD) {
	        e.setDamage(e.getDamage() - 1.5D);
	      }
	      if (damager.getItemInHand().getType() == Material.WOOD_SWORD) {
	        e.setDamage(e.getDamage() - 1.5D);
	      }
	      if ((b.getType() == Material.AIR) || (b.getRelative(BlockFace.DOWN).getType() == Material.AIR)) {
	        e.setDamage(e.getDamage() - 1.0D);
	      }
	      if (damager.hasPotionEffect(PotionEffectType.INCREASE_DAMAGE)) {
	        e.setDamage(e.getDamage() - 7.0D);
	      }
	    }
	  }
	}


