package me.trusthage.allesch.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import me.trusthage.allesch.other.Main;

public class SetHomeCommand implements CommandExecutor{
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		
		if(!(sender instanceof Player)) return false;
		
		Player player = (Player)sender;
		FileConfiguration homes = Main.plugin.homes;
		
		if(!(player.hasPermission("mcraidcraft.sethome.else"))){
			if(args.length == 0){
				if(homes.getString(player.getName()) == null){
					homes.set(player.toString(), player.getLocation());
					player.sendMessage(ChatColor.GOLD + "Your home has been set.");
					
				}else{
					player.sendMessage(ChatColor.RED + "You already have set a home, please type /delhome to delete your home.");
				}
			}else{
				player.sendMessage(ChatColor.RED + "Please type /sethome to set a home.");
			}
		}else{
			if(args.length == 0){
				if(homes.getString(player.getName()) == null){
					homes.set(player.getName(), player.getLocation());
					player.sendMessage(ChatColor.GOLD + "Your home has been set.");
					Main.plugin.saveFiles();
				}else{
					player.sendMessage(ChatColor.RED + "You already have set a home, please type /delhome to delete your home.");
				}
			}else{
				if(args.length == 1){
					@SuppressWarnings("deprecation")
					Player target = Bukkit.getPlayer(args[0]);
					if(homes.getString(player.getName()) == null){
						homes.set(target.getName(), player.getLocation());
						Main.plugin.saveFiles();
					}
				}else{
					player.sendMessage(ChatColor.RED + "Please type /sethome <playername>.");
				}
			}
		}	
		
		return false;
	}

}
