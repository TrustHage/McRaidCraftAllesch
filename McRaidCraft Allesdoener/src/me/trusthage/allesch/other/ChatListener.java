package me.trusthage.allesch.other;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

@SuppressWarnings("deprecation")
public class ChatListener implements Listener{
	
	List<String> loaded = Main.plugin.loaded;
	List<String> mute = Main.mute;
	
	@EventHandler
	public void onChat(PlayerChatEvent e){
		if(e.getPlayer() instanceof Player){
			Player player = (Player)e.getPlayer();
			if(loaded.contains(player.getName()) || mute.contains(player.getName())){
				e.setCancelled(true);
				player.sendMessage(ChatColor.RED + "You cannot chat while muted");
			}
		}
	}

}
