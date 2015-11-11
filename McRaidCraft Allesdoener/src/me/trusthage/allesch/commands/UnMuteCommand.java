package me.trusthage.allesch.commands;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.trusthage.allesch.other.Main;

public class UnMuteCommand implements CommandExecutor{

	@SuppressWarnings("unused")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		List<String> mute = Main.mute;
		List<String> loaded = Main.plugin.loaded;
		if(!(sender instanceof Player)) return false;
		Player player = (Player)sender;
		
		if(player.hasPermission(Main.plugin.getConfig().getString("MutePermission"))){
			if(args.length == 0){
				player.sendMessage(ChatColor.RED + "Please type /unmute <playername>");
			}else{
				if(args.length == 1){
					@SuppressWarnings("deprecation")
					Player target = Bukkit.getServer().getPlayer(args[0]);
					
					if(target.getName() != player.getName()){
						if(target != null){
							if(mute.contains(target.getName()) || loaded.contains(target.getName())){
								loaded.remove(target.getName());
								mute.remove(target.getName());
								player.sendMessage(ChatColor.GOLD + "You've unmuted " + ChatColor.RED + target.getDisplayName());
								target.sendMessage(ChatColor.GOLD + "You have been unmuted by " + ChatColor.RED + player.getDisplayName());	
								Main.plugin.getConfig().set("Muted", mute);
								Main.plugin.saveConfig();
								Main.plugin.getConfig();
							}else{
								player.sendMessage(ChatColor.RED + "That player is not muted");
							}			
						}else{
							player.sendMessage(ChatColor.RED + "That player is not online.");
						}
					}else{
						player.sendMessage(ChatColor.RED + "You can't unmute yourself");
					}
					
				}
			}
		}else{
			player.sendMessage(ChatColor.RED + "You don't have access to that command.");
		}
		
		return false;
	}

}
