package me.trusthage.allesch.commands;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import me.trusthage.allesch.other.Main;

public class RegisterCommand implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		
		FileConfiguration logins = Main.plugin.logins;
		
		if(!(sender instanceof Player)) return false;
		Player player = (Player)sender;
		String password1 = args[0];
		String password2 = args[1];
		List<String> loggedinplayers = Main.loggedinplayers;
		
		if(!(loggedinplayers.contains(player.getName()))){
			if(!(logins.contains(player.getName()))){
				if(args.length != 2){
					player.sendMessage(ChatColor.RED + "Please type /register <password> <password>");
				}else{
					if(password1.equals(password2)){
						logins.set(player.getName(), password1);
						player.sendMessage(ChatColor.GOLD + "Registration Succeeded.");
						Main.plugin.saveFiles();
						loggedinplayers.add(player.getName());
					}else{
						player.sendMessage(ChatColor.RED + "You've entered an invalid password, please try again.");
					}
				}
			}else{
				player.sendMessage(ChatColor.RED + "You are already registered, please login.");
			}
		}else{
			player.sendMessage(ChatColor.RED + "You are already logged in.");
		}
		
		return false;
	}

}
