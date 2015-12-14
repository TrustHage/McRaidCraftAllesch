package me.trusthage.allesch.commands;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import me.trusthage.allesch.other.Main;

public class ChangePasswordCommand implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		
		FileConfiguration logins = Main.plugin.logins;
		
		if(!(sender instanceof Player)) return false;
		Player player = (Player)sender;
		
		List<String> loggedinplayers = Main.loggedinplayers;
		
		if(loggedinplayers.contains(player.getName())){
			if(logins.getString(player.getName()) != null){
				if(args.length != 3){
					player.sendMessage(ChatColor.RED + "please type /changepass <oldpassword> <newpassword> <newpassword>");
				}else{
					String oldpass = args[0];
					String newpass = args[1];
					String newpass2 = args[2];
					if(logins.getString(player.getName()).equals(oldpass)){
						if(newpass.equals(newpass2)){
							logins.set(player.getName(), newpass);
							Main.plugin.saveFiles();
							player.sendMessage(ChatColor.GOLD + "You've successfully changed your password to: " + ChatColor.RED + newpass);
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
