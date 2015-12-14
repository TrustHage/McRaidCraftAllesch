package me.trusthage.allesch.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import me.trusthage.allesch.other.Main;

public class DelHomeCommand implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		
		if(!(sender instanceof Player)) return false;
		
		Player player = (Player)sender;
		FileConfiguration homes = Main.plugin.homes;
		
		if(!(player.hasPermission("mcraidcraft.delhome.else"))){
			if(args.length == 0){
				if(homes.getString(player.getName()) != null){
					homes.getString(player.getName().replaceAll(null, null));
					player.sendMessage(ChatColor.GOLD + "You successfully removed your home.");
					Main.plugin.saveFiles();
				}else{
					player.sendMessage(ChatColor.RED + "You haven't set a home yet, type /sethome to set your home.");
				}
			}else{
				player.sendMessage(ChatColor.RED + "Please type /delhome to delete your home.");
			}
		}else{
			if(args.length == 0){
				if(homes.getString(player.getName()) != null){
					homes.set(player.getName(), null);
					player.sendMessage(ChatColor.GOLD + "You successfully removed your home.");
					Main.plugin.saveFiles();
				}
			}else{
				if(args.length == 1){
					@SuppressWarnings("deprecation")
					Player target = Bukkit.getPlayer(args[0]);
					if(homes.getString(target.getName()) != null){
						homes.getString(target.getName().replaceAll(null, null));
						player.sendMessage(ChatColor.GOLD + "You successfully removed " + ChatColor.RED + target.getName() + "s" + ChatColor.GOLD + " home.");
						target.sendMessage(ChatColor.GOLD + "Your home has been remove by: " + ChatColor.RED + player.getName());
						Main.plugin.saveFiles();
					}
				}else{
					player.sendMessage(ChatColor.RED + "Please type /delhome (<playername>)");
				}
			}
		}
		
		return false;
	}

}
