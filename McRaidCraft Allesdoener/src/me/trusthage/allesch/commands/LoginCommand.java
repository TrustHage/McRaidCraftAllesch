package me.trusthage.allesch.commands;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import me.trusthage.allesch.other.Main;

public class LoginCommand implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		
		FileConfiguration logins = Main.plugin.logins;
		
		if(!(sender instanceof Player)) return false;
		Player player = (Player)sender;
		List<String> loggedinplayers = Main.loggedinplayers;
		String password = args[0];
		
		if(!(loggedinplayers.contains(player))){
			if(logins.contains(player.getName()))
			{
				if(args.length != 1){
					player.sendMessage(ChatColor.RED + "Please type /login <password>");
				}else{
					if (logins.getString(player.getName()).equals(password)){
						player.sendMessage(ChatColor.GOLD + "You've succesfully logged in.");
						loggedinplayers.add(player.getName());
					}else{
						player.sendMessage(ChatColor.RED + "You've entered an invalid password.");
					}
					
				}
			}else{
				player.sendMessage(ChatColor.RED + "You haven't registered yet, please type /register <password> <password>");
			}
		}else{
			player.sendMessage(ChatColor.RED + "You are already logged in.");
		}	
		
		return false;
	}

}
