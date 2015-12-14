package me.trusthage.allesch.commands;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.trusthage.allesch.other.Main;

public class MuteCommand implements CommandExecutor{
	
	@SuppressWarnings("unused")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		List<String> mute = Main.mute;
		List<String> loaded = Main.plugin.loaded;
		
		if(!(sender instanceof Player)) {
			@SuppressWarnings("deprecation")
			Player target = Bukkit.getServer().getPlayer(args[0]);
				if(target != null){
					if(loaded.contains(target.getName()) || mute.contains(target.getName())){
						sender.sendMessage(ChatColor.RED + "The player is already muted, type /unmute <playername> to unmute the player.");
					}else{
						if(!(mute.contains(target.getName())) || !(loaded.contains(target.getName()))){
							mute.add(target.getName());
							loaded.add(target.getName());
							sender.sendMessage(ChatColor.GOLD + "You've muted " + ChatColor.RED + target.getDisplayName());
							target.sendMessage(ChatColor.GOLD + "You have been muted by " + ChatColor.RED + "a admin.");
							Main.plugin.getConfig().set("Muted", mute);
							Main.plugin.saveConfig();
						}
						
					}
				}else{
					sender.sendMessage(ChatColor.RED + "That player is not online.");
				}
		}else{
			Player player = (Player)sender;
			
			if(player.hasPermission("mcraidcraft.mute")){
			if(args.length == 0){
				player.sendMessage(ChatColor.RED + "Please type /mute <playername>");
			}else{
				if(args.length == 1){
					@SuppressWarnings("deprecation")
					Player target = Bukkit.getServer().getPlayer(args[0]);
					if(target.getName() != player.getName()){
						if(target != null){
							if(loaded.contains(target.getName()) || mute.contains(target.getName())){
								player.sendMessage(ChatColor.RED + "The player is already muted, type /unmute <playername> to unmute the player.");
							}else{
								if(!(mute.contains(player.getName())) || !(loaded.contains(player.getName()))){
									mute.add(target.getName());
									loaded.add(target.getName());
									player.sendMessage(ChatColor.GOLD + "You've muted " + ChatColor.RED + target.getDisplayName());
									target.sendMessage(ChatColor.GOLD + "You have been muted by " + ChatColor.RED + player.getDisplayName());
									Main.plugin.getConfig().set("Muted", mute);
									Main.plugin.saveConfig();
								}
								
							}
						}else{
							player.sendMessage(ChatColor.RED + "That player is not online.");
						}			
					}else{
						player.sendMessage(ChatColor.RED + "You can't mute yourself.");
					}
					
				}
			}
			}else{
				player.sendMessage(ChatColor.RED + "You don't have acces to that command.");
			}
		}
						
		return false;
	}
	
}
