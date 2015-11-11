package me.trusthage.allesch.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.trusthage.allesch.other.Main;

public class TimeCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		if(!(sender instanceof Player)) return false;
		Player player = (Player)sender;
		
		if(args.length == 0){
			if(player.hasPermission(Main.plugin.getConfig().getString("TimePermission"))){
				player.sendMessage(ChatColor.RED + "Please type a day type, for instance /time day ");
			}else{
				player.sendMessage(ChatColor.RED + "You don't have access to that command");
			}
		}else{
			if(player.hasPermission(Main.plugin.getConfig().getString("TimePermission"))){
			switch(args[0]){
			case "day":
				player.getWorld().setTime(1000);
				Bukkit.getServer().broadcastMessage(ChatColor.GOLD + "Time set to " + ChatColor.RED + "day " + ChatColor.GOLD + "by " + ChatColor.RED + player.getDisplayName());
				break;
			case "night":
				player.getWorld().setTime(14000);
				Bukkit.getServer().broadcastMessage(ChatColor.GOLD + "Time set to " + ChatColor.RED + "night " + ChatColor.GOLD + "by " + ChatColor.RED + player.getDisplayName());
				break;
			}							
		}else{
			player.sendMessage(ChatColor.RED + "You don't have access to that command");
		}
		}
		
		return false;
	}

}
