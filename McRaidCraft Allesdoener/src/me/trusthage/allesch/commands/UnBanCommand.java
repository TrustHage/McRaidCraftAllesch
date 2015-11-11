package me.trusthage.allesch.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.trusthage.allesch.other.Main;

public class UnBanCommand implements CommandExecutor{
	@SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
	{
		
		if(!(sender instanceof Player)) return false;
		Player player = (Player)sender;
		
		if(args.length == 0){
			if (player.hasPermission(Main.plugin.getConfig().getString("KickBanPermission"))){
				player.sendMessage(ChatColor.RED + "Please type /unban <playername> and if you want you can add a ban reason");
			}else {
				player.sendMessage(ChatColor.RED + "You don't have access to that command");
			}
			
		}
		
		if(args.length == 1){
			Server s = Bukkit.getServer();
			OfflinePlayer otarget = s.getOfflinePlayer(args[0]);
			if(player.hasPermission(Main.plugin.getConfig().getString("KickBanPermission"))){
				if(!(otarget.isBanned())){
					player.sendMessage(ChatColor.RED + "That player is not banned");
				}else{
					player.sendMessage(ChatColor.GOLD + "You've unbanned: " + ChatColor.RED + args[0]);
					otarget.setBanned(false);
					Bukkit.getBannedPlayers().remove(otarget);
					s.broadcastMessage(ChatColor.GOLD + "The player: " + ChatColor.RED + otarget.getName() + ChatColor.GOLD + " has been unbanned");
				}		
				}else{
				player.sendMessage("You don't have access to that command");
			}
		}
		return false;
	}
}
