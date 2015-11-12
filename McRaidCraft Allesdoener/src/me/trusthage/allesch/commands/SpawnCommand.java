package me.trusthage.allesch.commands;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.trusthage.allesch.other.Main;

public class SpawnCommand implements CommandExecutor{
	
	@SuppressWarnings("null")
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		
		List<String> spawn = Main.spawn;
		List<String> spawnloaded = Main.plugin.spawnloaded;
		
		Player player = (Player)sender;
		if(!(sender instanceof Player)) return false;
		
		if(args.length == 0){
			if(spawn == null || spawnloaded == null){
				player.sendMessage(ChatColor.RED + "There is no spawn, please contact the server administrator");
			}else{
				player.teleport((Location) spawnloaded);
			}
		}else{
			if(args.length == 1){
				if(args[0].equalsIgnoreCase("set")){
					if(player.hasPermission(Main.plugin.getConfig().getString("SpawnSetPermission"))){
						if(spawn != null || spawnloaded != null){
							player.sendMessage(ChatColor.RED + "There is already a spawn set, please type /spawn remove first");
						}else{
							spawnloaded.add(player.getLocation().toString());
							spawn.add(player.getLocation().toString());
							player.sendMessage(ChatColor.GOLD + "The spawn has been set to your location.");
						}
					}else{
						player.sendMessage(ChatColor.RED + "You don't have access to that command.");
					}
				}else if(args[0].equalsIgnoreCase("remove")){
					if(player.hasPermission(Main.plugin.getConfig().getString("SpawnRemovePermission"))){	
						if(spawn != null || spawnloaded != null){
							spawn.clear();
							spawnloaded.clear();
							player.sendMessage(ChatColor.GOLD + "The spawn has been removed.");
						}else{
							player.sendMessage(ChatColor.RED + "There is no spawn yet, type /spawn set to set a spawn.");
						}		
					}else{
						player.sendMessage(ChatColor.RED + "You don't have access to that command.");
					}
				}
			}else{
				player.sendMessage(ChatColor.RED + "Please type /spawn <set/remove>.");
			}
		}
		
		return false;
	}

}
