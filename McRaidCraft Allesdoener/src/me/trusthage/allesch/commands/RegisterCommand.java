package me.trusthage.allesch.commands;

import java.util.List;
import java.util.Map;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.trusthage.allesch.other.Main;

public class RegisterCommand implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		
		if(!(sender instanceof Player)) return false;
		Map<String, String> login = Main.login;
		Player player = (Player)sender;
		String password1 = args[0];
		String password2 = args[1];
		String passwordsaved = Main.plugin.getConfig().getString(player.getName());
		List<String> loggedinplayers = Main.loggedinplayers;
		List<String> loadedloggedin = Main.plugin.loadedloggedin;
		
		if(!(loggedinplayers.contains(player.getName()))){
			if(!(login.containsKey(player.getName()) || loadedloggedin.contains(player.getName())) || passwordsaved == null){
				if(args.length != 2){
					player.sendMessage(ChatColor.RED + "Please type /register <password> <password>");
				}else{
						loggedinplayers.add(player.getName());
						login.put(player.getName(), password1);
						player.sendMessage(ChatColor.GOLD + "Registration Succeeded.");
						Main.plugin.getConfig().set("Player Logins", login);
						Main.plugin.saveConfig();
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
