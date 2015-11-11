package me.trusthage.allesch.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.trusthage.allesch.other.Main;

public class EnderChestCommand implements CommandExecutor{
	
	@SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		
		if(!(sender instanceof Player)) return false;
		
		Player player = (Player)sender;
		
		if(args.length == 0){
			if(player.hasPermission(Main.plugin.getConfig().getString("EnderchestPermission")) || player.hasPermission(Main.plugin.getConfig().getString("EnderchestPermission2"))){
				player.openInventory(player.getEnderChest());
			}else{
				player.sendMessage(ChatColor.RED + "You don't have access to that command.");
			}
		}else{
			if(args.length == 1){
				if(player.hasPermission(Main.plugin.getConfig().getString("EnderchestPermission2"))){
					Player target = Bukkit.getPlayer(args[0]);
					if(target != null){
						player.openInventory(target.getEnderChest());
						player.sendMessage(ChatColor.GOLD + "You've opened " + ChatColor.RED + target.getName() + "'s" + " enderchest");
					}else{
						player.sendMessage(ChatColor.RED + "That player is not online.");
					}
				}else{
					player.sendMessage(ChatColor.RED + "You don't have access to that command.");
				}
			}
		}
		return false;
	}

}
