package me.trusthage.allesch.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor{
	
	@SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		
		Player player = (Player)sender;
		
		if(args.length == 0){
			if(player.hasPermission("mcraidcraft.heal") || player.hasPermission("mcraidcraft.heal.else")){
				player.setHealth(20);
				player.sendMessage(ChatColor.GOLD + "You have been healed.");
			}else{
				player.sendMessage(ChatColor.RED + "You don't have access to that command.");
			}
		}else{
			if(args.length == 1){
				if(player.hasPermission("mcraidcraft.heal.else")){
					Player target = Bukkit.getServer().getPlayer(args[0]);
					if(target != null){
						target.setHealth(20);
						player.sendMessage(ChatColor.GOLD + "You have healed the player: " + ChatColor.RED + target.getDisplayName());
						target.sendMessage(ChatColor.GOLD + "Your health has been reset by: " + ChatColor.RED + player.getDisplayName());
					}else{
						player.sendMessage(ChatColor.RED + "That player is not online.");
					}
				}else{
					player.sendMessage(ChatColor.RED + "You don't have access to that command.");
				}
			}
		}
		
		return false;
	}

}
