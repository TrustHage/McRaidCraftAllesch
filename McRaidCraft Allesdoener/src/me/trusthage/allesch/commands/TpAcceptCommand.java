package me.trusthage.allesch.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TpAcceptCommand implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		
		if(!(sender instanceof Player)) return false;
		Player player = (Player)sender;
		Player target = TpaCommand.teleportrequest.get(player);
		
		if(args.length > 0){
			player.sendMessage(ChatColor.RED + "Please type /tpaccept or /tpdecline.");
		}else{
			if(TpaCommand.teleportrequest.containsValue(target))
			{
				if(target != null){
					target.teleport(player.getLocation());
					player.sendMessage(ChatColor.GOLD + "You accepted the teleport request.");
					target.sendMessage(ChatColor.GOLD + "Your teleport request has been accepted.");
					TpaCommand.teleportrequest.remove(player, target);
				}else{
					player.sendMessage(ChatColor.RED + "That player is not online.");
					TpaCommand.teleportrequest.remove(player, target);
				}
			}else{
				player.sendMessage(ChatColor.RED + "There is no teleport request for you.");
			}
			
		}
		
		return false;
	}

}
