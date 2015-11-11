package me.trusthage.allesch.commands;

import java.util.List;
import java.util.Map;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.trusthage.allesch.other.Main;

public class ChangePasswordCommand implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		
		if(!(sender instanceof Player)) return false;
		Player player = (Player)sender;
		Map<String, String> login = Main.login;
		String oldpass = args[0];
		String newpass = args[1];
		String newpass2 = args[2];
		String passwordsaved = Main.plugin.getConfig().getString(player.getName());
		List<String> loggedinplayers = Main.loggedinplayers;
		
		if(loggedinplayers.contains(player)){
			if(login.containsKey(player.getName()) || passwordsaved != null){
				if(args.length != 3){
					player.sendMessage(ChatColor.RED + "please type /changepass <oldpassword> <newpassword> <newpassword>");
				}else{
					if(login.containsValue(oldpass)){
						if(newpass == newpass2){
							login.remove(player, oldpass);
							login.put(player.getName(), newpass);
							Main.plugin.getConfig().set("Player Logins", login);
							Main.plugin.saveConfig();
							}else{
								player.sendMessage(ChatColor.RED + "The entered new passwords do not match.");
							}
						}else{
							player.sendMessage(ChatColor.RED + "You typed your old password wrong.");
						}
				}
			}
		}else{
			player.sendMessage(ChatColor.RED + "You need to be logged in to change your password");
		}
 		
		return false;
	}

}
