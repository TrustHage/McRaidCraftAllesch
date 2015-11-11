package me.trusthage.allesch.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.trusthage.allesch.other.Main;

public class TeleportCommand implements CommandExecutor{
	
	@SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		
		if(!(sender instanceof Player)) return false;
		
		Server s = Bukkit.getServer();
		Player player = (Player)sender;
		Player tpfrom = s.getPlayer(args[0]);
		
		if(player.hasPermission(Main.plugin.getConfig().getString("TeleportPermission"))){
			if(args.length == 0){
				player.sendMessage(ChatColor.RED + "Please type /tp <teleport from> <teleport to>");
			}else{
				if(args.length == 1){
					if(tpfrom.getName() == player.getName()){
						player.sendMessage(ChatColor.RED + "You can't teleport to yourself.");
					}else{
						player.teleport(tpfrom.getLocation());
						player.sendMessage(ChatColor.GOLD + "You have been teleported to " + ChatColor.RED + tpfrom.getDisplayName() + "'s" + ChatColor.GOLD + " location.");
					}
				}else{
					if(args.length == 2){
						Player tpto = s.getPlayer(args[1]);
						if(tpfrom.getName() == player.getName()){
							tpfrom.teleport(tpto.getLocation());
							player.sendMessage(ChatColor.GOLD + "You teleported yourself to " + ChatColor.RED + tpto.getDisplayName() + "'s " + ChatColor.GOLD + "location.");
					}else{
						if(tpfrom != null && tpto != null){
							tpfrom.teleport(tpto.getLocation());
							tpfrom.sendMessage(ChatColor.GOLD + "You are teleported to " + ChatColor.RED + tpto.getDisplayName() + "'s" + ChatColor.GOLD + " location by: " + ChatColor.RED + player.getDisplayName());
						}else{
							player.sendMessage(ChatColor.RED + "One of that players is not online.");
							}
						}
					}
				}
			}
		}else{
			player.sendMessage(ChatColor.RED + "You don't have access to that Command.");
		}
		
		return false;
	}

}
