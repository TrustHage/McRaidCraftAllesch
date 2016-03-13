package me.trusthage.allesch.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import me.trusthage.allesch.other.Main;

public class HomeCommand implements CommandExecutor{
	
	FileConfiguration homes = Main.plugin.homes;
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		
		if(!(sender instanceof Player)) return false;
		
		Player player = (Player)sender;
		
		if(homes.getString(player.getName()) == null){
			player.sendMessage(ChatColor.RED + "You don't have any homes set, type /sethome to set a home.");
		}else{
		}
		
		return false;
	}

}
