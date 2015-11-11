package me.trusthage.allesch.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.trusthage.allesch.other.Main;

public class NickCommand implements CommandExecutor
{

	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		if(!(sender instanceof Player)) return false;
		Player player = (Player)sender;
		if(args.length == 0){
			if(player.hasPermission(Main.plugin.getConfig().getString("NickPermission"))){
				if(player.getName() != player.getDisplayName()){
					player.setDisplayName(player.getName());
					player.sendMessage(ChatColor.GOLD + "Your Nickname has been disabled.");
				}else		
				player.sendMessage(ChatColor.RED + "Please type /nick <nickname>");
			}else{
				player.sendMessage(ChatColor.RED + "You don't have access to that command");
			}
		}else if (args.length == 1){
				if(player.hasPermission(Main.plugin.getConfig().getString("NickPermission"))){
					player.sendMessage(ChatColor.GOLD + "Youre nickname has been set to: " + ChatColor.RED + args[0]);
					player.sendMessage(ChatColor.GOLD + "To disable your nickname please type: " + ChatColor.RED + "/nick");
					player.setDisplayName(args[0]);
				}else{
					player.sendMessage(ChatColor.RED + "You don't have access to that command");
				}
		}
		else if (args.length == 2){
			@SuppressWarnings("deprecation")
			Player target = Bukkit.getServer().getPlayer(args[1]);
			if(target != null){
				if(player.hasPermission(Main.plugin.getConfig().getString("NickPermission2"))){
					target.setDisplayName(args[0]);
					target.sendMessage(ChatColor.GOLD + "Your nickname has been changed to: " + ChatColor.RED + args[0] + ChatColor.GOLD + " by " + ChatColor.RED + player.getDisplayName());
					player.sendMessage(ChatColor.GOLD + "You changed " + ChatColor.RED + args[1] + ChatColor.RED + "'s" + ChatColor.GOLD + " nickname to: " + ChatColor.RED + args[0]);
				}else{
					player.sendMessage(ChatColor.RED + "You don't have access to that command");
				}
		}else{
			player.sendMessage(ChatColor.RED + "Player is not online");
		}
		}
		return false;
	}

}
