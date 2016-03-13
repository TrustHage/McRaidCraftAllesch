package me.trusthage.allesch.commands;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TpaCommand implements CommandExecutor{
	
	public static HashMap<Player, Player> teleportrequest = new HashMap<Player, Player>();
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		
		if(!(sender instanceof Player)) return false;
		Player player = (Player)sender;
		Player target = Bukkit.getServer().getPlayer(args[0]);
		
		if(args.length < 1 || args.length > 1){
			player.sendMessage(ChatColor.RED + "Please type /tpa <playername>");
		}else{
			if(target != null){
				if(target.getName() == player.getName()){
					player.sendMessage(ChatColor.RED + "You can't teleport to yourself.");
				}else{
					player.sendMessage(ChatColor.GOLD + "Your teleport request has been send to " + ChatColor.RED + target.getDisplayName());
					target.sendMessage(ChatColor.GOLD + "The player " + ChatColor.RED + player.getDisplayName() + ChatColor.GOLD + " wants to teleport to you, type /tpaccept or /tpdeny");
					teleportrequest.put(target, player);
				}
			}else{
				player.sendMessage(ChatColor.RED + "That player is not online.");
			}
			
		}
		
		return false;
	}

}
