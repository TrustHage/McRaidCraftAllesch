package me.trusthage.allesch.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.trusthage.allesch.other.Main;

public class FlyCommand implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		if(!(sender instanceof Player)) return false;
		Player player = (Player)sender;
		
		if(args.length == 0){
			if(player.hasPermission(Main.plugin.getConfig().getString("FlyPermission"))){
				if(player.getAllowFlight() == false){
				player.setAllowFlight(true);
				player.sendMessage(ChatColor.GOLD + "Fly has been enabled.");
				}else if (player.getAllowFlight() == true){
					player.setAllowFlight(false);
					player.sendMessage(ChatColor.GOLD + "Fly has been disabled.");
			}else{
				player.sendMessage(ChatColor.RED + "You don't have access to that command");
				
			}
		
			}
	}else{
		if(player.hasPermission(Main.plugin.getConfig().getString("FlyPermission2"))){
			
		@SuppressWarnings("deprecation")
		Player target = Bukkit.getServer().getPlayer(args[0]);
		if(target != null && args.length == 1){
			if(target.getAllowFlight() == false){
				target.sendMessage(ChatColor.GOLD + "Fly has been enabled by " + ChatColor.RED + player.getDisplayName());
				target.setAllowFlight(true);
				player.sendMessage(ChatColor.GOLD + "You enabled fly for " + ChatColor.RED + target.getDisplayName());
			}else {
				target.sendMessage(ChatColor.GOLD + "Fly has been disabled by " + ChatColor.RED + player.getDisplayName());
				target.setAllowFlight(false);
				player.sendMessage(ChatColor.GOLD + "You disabled fly for " + ChatColor.RED + target.getDisplayName());
			}
		}else{
			player.sendMessage(ChatColor.GOLD + "Player is not online.");
		}
	}else{
		player.sendMessage(ChatColor.RED + "You don't have access to that command.");
	}
	}
		return false;

	}
	
}
