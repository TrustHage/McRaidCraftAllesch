package me.trusthage.allesch.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BanCommand implements CommandExecutor{
	@SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
	{
		
		if(!(sender instanceof Player)) return false;
		String reason = args[1];
		Player player = (Player)sender;
		Server s = Bukkit.getServer(); 
		
		if(args.length == 0){
			if (player.hasPermission("mcraidcraft.ban")){
				player.sendMessage(ChatColor.RED + "Please type /ban <playername> and if you want you can add a ban reason");
			}else {
				player.sendMessage(ChatColor.RED + "You don't have access to that command");
			}
			
		}
		
		if(args.length == 1){
			Player target = s.getPlayer(args[0]);
			OfflinePlayer otarget = s.getOfflinePlayer(args[0]);
			if(player.hasPermission("mcraidcraft.ban")){
				if(target != null){
					player.sendMessage(ChatColor.GOLD + "You've banned: " + ChatColor.RED + target.getName());
					s.broadcastMessage(ChatColor.GOLD + "The player: " + ChatColor.RED + target.getName() + ChatColor.GOLD + " has been banned");
					target.kickPlayer("You're banned by an admin");
					target.setBanned(true);
				}else{
					player.sendMessage(ChatColor.GOLD + "You've banned: " + ChatColor.RED + otarget.getName());
					s.broadcastMessage(ChatColor.GOLD + "The player: " + ChatColor.RED + otarget.getName() + ChatColor.GOLD + " has been banned");
					otarget.setBanned(true);
				}
			}else{
				player.sendMessage("You don't have access to that command");
			}
		}else{
			if(args.length >= 2){	
				Player target = s.getPlayer(args[0]);
				OfflinePlayer otarget = s.getOfflinePlayer(args[0]);
				if(player.hasPermission("mcraidcraft.ban")){
					if(target != null){
						player.sendMessage(ChatColor.GOLD + "You've banned: " + ChatColor.RED + target.getName() + ChatColor.GOLD + " reason: " + ChatColor.RED + reason);
						s.broadcastMessage(ChatColor.GOLD + "The player: " + ChatColor.RED + target + ChatColor.GOLD + " has been banned, reason: " + ChatColor.RED + reason);
						target.setBanned(true);
						target.kickPlayer(reason);
					}else{
						player.sendMessage(ChatColor.GOLD + "You've banned: " + ChatColor.RED + otarget.getName() + ChatColor.GOLD + " reason: " + ChatColor.RED + reason);
						s.broadcastMessage(ChatColor.GOLD + "The player: " + ChatColor.RED + otarget.getName() + ChatColor.GOLD + " has been banned, reason: " + ChatColor.RED + reason);
						otarget.setBanned(true);
					}
				}else{
					player.sendMessage(ChatColor.RED + "You don't have access to that command");
				}
			}
		}
			
		
		return false;
	}
}
