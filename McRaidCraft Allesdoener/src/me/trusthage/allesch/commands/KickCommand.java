package me.trusthage.allesch.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.trusthage.allesch.other.Main;

public class KickCommand implements CommandExecutor
{
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
	{
		
		if(!(sender instanceof Player)) return false;
		Player player = (Player)sender;
		
		if(args.length == 0){
			if (player.hasPermission(Main.plugin.getConfig().getString("KickBanPermission"))){
				player.sendMessage(ChatColor.RED + "Please type /kick <playername> and if you want you can add a ban reason");
			}else {
				player.sendMessage(ChatColor.RED + "You don't have access to that command");
			}
			
		}
		
		if(args.length == 1){
			@SuppressWarnings("deprecation")
			Player target = Bukkit.getServer().getPlayer(args[0]);
			if(player.hasPermission(Main.plugin.getConfig().getString("KickBanPermission"))){
				if(target != null){
					player.sendMessage(ChatColor.GOLD + "You've kicked: " + ChatColor.RED + target.getName());
					target.kickPlayer("You're kicked by an admin");
				}else{
					player.sendMessage(ChatColor.RED + "That player is not online");
				}
			}else{
				player.sendMessage("You don't have access to that command");
			}
		}else{
			if(args.length >= 2){
				Server s = Bukkit.getServer();
				@SuppressWarnings("deprecation")
				Player target = s.getPlayer(args[0]);
				if(player.hasPermission(Main.plugin.getConfig().getString("KickBanPermission"))){
					if(target != null){
						player.sendMessage(ChatColor.GOLD + "You've kicked: " + ChatColor.RED + target.getName() + ChatColor.GOLD + "reason: " + ChatColor.RED + args[1]);
						target.kickPlayer(args[1]);
						s.broadcastMessage(ChatColor.GOLD + "The player: " + ChatColor.RED + target.getName() + ChatColor.GOLD + "has been kicked, reason: " + ChatColor.RED + args[1]);
					}else{
						player.sendMessage(ChatColor.RED + "That player is not online");
					}
				}else{
					player.sendMessage(ChatColor.RED + "You don't have access to that command");
				}
			}
		}
			
		
		return false;
	}
}
