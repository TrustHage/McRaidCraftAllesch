package me.trusthage.allesch.commands;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.trusthage.allesch.other.Main;

public class GodCommand implements CommandExecutor{
	
	public static ArrayList<String> godmode = new ArrayList<>();
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		
		if(!(sender instanceof Player)) return false;
		Player player = (Player)sender;
		
		if(args.length == 0){
			if(player.hasPermission(Main.plugin.getConfig().getString("GodPermission"))){
				if(godmode.contains(player.getName())){
					godmode.remove(player.getName());
					player.sendMessage(ChatColor.RED + "GodMode " + ChatColor.GOLD + "has been " + ChatColor.RED + "disabled");
				}else{
					godmode.add(player.getName());
					player.setFoodLevel(20);
					player.sendMessage(ChatColor.RED + "GodMode " + ChatColor.GOLD + "has been " + ChatColor.RED + "enabled");
				}
			}
		}
		
		return false;
	}
		
	
}
