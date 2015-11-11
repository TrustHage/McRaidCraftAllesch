package me.trusthage.allesch.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.trusthage.allesch.other.Main;

public class ClearInvCommand implements CommandExecutor{

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
	{
		
		if(!(sender instanceof Player)) return false;
		Player player = (Player)sender;
		if(args.length == 0){
			if(player.hasPermission(Main.plugin.getConfig().getString("ClearInvPermission")) || player.isOp()){
				player.getInventory().clear();
				player.sendMessage(ChatColor.GOLD + "You cleared your inventory");				
			}else{
				player.sendMessage(ChatColor.RED + "You don't have access to that command");
			}
		}else{
			if(player.hasPermission(Main.plugin.getConfig().getString("ClearInvPermission2"))){
				@SuppressWarnings("deprecation")
				Player target = Bukkit.getServer().getPlayer(args[0]);
				if(target != null && args.length == 1){
					 player.sendMessage(ChatColor.GOLD + "You cleared " + ChatColor.RED + target.getDisplayName() + "'s " + ChatColor.GOLD + "inventory ");
		             target.getInventory().clear();
		             target.sendMessage(ChatColor.GOLD + "Your inventory has been cleared by " + ChatColor.RED + player.getDisplayName());
				}else {
					player.sendMessage(ChatColor.RED + "The player is not online");
				}
			}else {
				player.sendMessage(ChatColor.RED + "You don't have access to that command");
			}
		}
		
	return false;
	}

}
