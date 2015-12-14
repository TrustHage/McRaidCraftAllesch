package me.trusthage.allesch.commands;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GodCommand implements CommandExecutor{
	
	public static ArrayList<String> godmode = new ArrayList<>();
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		
		if(!(sender instanceof Player)) return false;
		Player player = (Player)sender;
		@SuppressWarnings("deprecation")
		Player target = Bukkit.getPlayer(args[0]);
		
		if(args.length == 0){
			if(player.hasPermission("mcraidcraft.god")){
				if(godmode.contains(player.getName())){
					godmode.remove(player.getName());
					player.sendMessage(ChatColor.RED + "GodMode " + ChatColor.GOLD + "has been " + ChatColor.RED + "disabled");
				}else{
					godmode.add(player.getName());
					player.setFoodLevel(20);
					player.sendMessage(ChatColor.RED + "GodMode " + ChatColor.GOLD + "has been " + ChatColor.RED + "enabled");
				}
			}
		}else{
			if(args.length == 1){
				if(player.hasPermission("mcraidcraft.god.else")){
					if(!(player.getName() == target.getName())){
						if(godmode.contains(target.getName())){
							godmode.remove(target.getName());
							player.sendMessage(ChatColor.GOLD + "GodMode has been disabled for the player: " + ChatColor.RED + target.getDisplayName());
							target.sendMessage(ChatColor.GOLD + "GodMode has been disabled by: " + ChatColor.RED + player.getDisplayName());
						}else{
							godmode.add(target.getName());
							player.sendMessage(ChatColor.GOLD + "GodMode has been enabled for the player: " + ChatColor.RED + target.getDisplayName());
							target.sendMessage(ChatColor.GOLD + "GodMode has been enabled by: " + ChatColor.RED + player.getDisplayName());
						}
					}else{
						player.sendMessage(ChatColor.RED + "If you want to enable/disable your GodMode please type /god.");
					}
				}
			}
		}
		
		return false;
	}
		
	
}
