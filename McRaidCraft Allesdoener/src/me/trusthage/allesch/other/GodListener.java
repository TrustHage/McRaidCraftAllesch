package me.trusthage.allesch.other;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;

import me.trusthage.allesch.commands.GodCommand;

public class GodListener implements Listener{

	@EventHandler
	public void onGodDamage(EntityDamageEvent e){
		if(e.getEntity() instanceof Player){
			Player p = (Player) e.getEntity();
			if(GodCommand.godmode.contains(p.getName())){
				e.setCancelled(true);					
				}
			}
	}
	
	@EventHandler
	public void onGodFood(FoodLevelChangeEvent e){
		if(e.getEntity() instanceof Player){
			Player p = (Player) e.getEntity();
			if(GodCommand.godmode.contains(p.getName())){
				e.setCancelled(true);
			}
		}
	}
}
