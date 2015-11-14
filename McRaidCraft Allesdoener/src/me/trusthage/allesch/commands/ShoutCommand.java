package me.trusthage.allesch.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.trusthage.allesch.other.Main;

public class ShoutCommand implements CommandExecutor{
	
	public static ShoutCommand msg;
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		
		
		
		msg = this;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < args.length; i++){
			sb.append(args[i]).append(" ");
		}
		
		if(!(sender instanceof Player)){
			if(args.length < 1){
				sender.sendMessage(ChatColor.RED + "please type /shout <message>");
			}else{
				String message = sb.toString().trim();
				Bukkit.getServer().broadcastMessage(ChatColor.RED + "[" + Main.plugin.getConfig().getString("ServerName") + "] " + ChatColor.GOLD + message);
			}
		}else{
			Player player = (Player)sender;
			if(player.hasPermission(Main.plugin.getConfig().getString("ShoutPermission"))){
				if(args.length < 1){
					player.sendMessage(ChatColor.RED + "please type /shout <message>");
				}else{
					String message = sb.toString().trim();
					Bukkit.getServer().broadcastMessage(ChatColor.RED + "[" + Main.plugin.getConfig().getString("ServerName") + "] " + ChatColor.GOLD + message);
				}
			}
		}			
		return false;
	}

}
