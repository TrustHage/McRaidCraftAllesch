package me.trusthage.allesch.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class OpenInvCommand implements CommandExecutor
{
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
	{
		if (!(sender instanceof Player)) return false;
		Player player = (Player)sender;
		if(args.length == 0){
			if(player.hasPermission("mcraidcraft.openinv")){
				player.sendMessage(ChatColor.RED + "Please type /openinv <playername>");
			}else{
				player.sendMessage(ChatColor.RED + "You don't have access to that command");
			}
		}else{
			if (player.hasPermission("mcraidcraft.openinv")){
				Player target = Bukkit.getServer().getPlayer(args[0]);
				if(target != null && args.length == 1){
					player.openInventory(target.getInventory());
					player.sendMessage(ChatColor.GOLD + "You are now watching in " + ChatColor.RED + target.getDisplayName() + "'s " + ChatColor.GOLD + "inventory");
				}else{
					player.sendMessage(ChatColor.RED + "Player is not online");
				}
			}else{
				player.sendMessage(ChatColor.RED + "You don't have access to that command");
			}
		}
		return false;
	}
}
