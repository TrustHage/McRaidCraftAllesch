package me.trusthage.allesch.commands;

import java.util.List;
import java.util.Map;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.trusthage.allesch.other.Main;

public class LoginCommand implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		
		if(!(sender instanceof Player)) return false;
		Player player = (Player)sender;
		Map<String, String> login = Main.login;
		String password = login.get(player.getName());
		String passwordsaved = Main.plugin.getConfig().getString(player.getName());
		List<String> loggedinplayers = Main.loggedinplayers;
		
		if(!(loggedinplayers.contains(player))){
			if(login.containsKey(player.getName()) || passwordsaved != null)
			{
				if(args.length != 1){
					player.sendMessage(ChatColor.RED + "Please type /login <password>");
				}else{
					if (password == args[0] || passwordsaved == args[0]){
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
