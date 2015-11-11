package me.trusthage.allesch.commands;

import java.util.HashMap;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.trusthage.allesch.other.Main;

public class MSGCommand implements CommandExecutor{
	
	public static MSGCommand msg;
	List<String> loaded = Main.plugin.loaded;
	
	public static HashMap<Player, Player> previousMessagedUsers = new HashMap<Player, Player>();
	@SuppressWarnings({ "deprecation", "unused" })
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		
		msg = this;
		Player target = Bukkit.getServer().getPlayer(args[0]);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i < args.length; i++){
			sb.append(args[i]).append(" ");
		}
		
		if(!(sender instanceof Player)) return false;
		Player player = (Player)sender;
		List<String> mute = Main.mute;
		
		if(!(mute.contains(player.getName())) || !(loaded.contains(player.getName()))){
			if (args.length < 2){
				player.sendMessage(ChatColor.RED + "Please type /msg <playername> <message>");
			}else{
				if(target.getName() != player.getName()){
					if(target != null){
						if(player.getName() == args[0]){
							player.sendMessage(ChatColor.RED + "You can't send a message to yourself.");
						}else{
							String message = sb.toString().trim();
							player.sendMessage(ChatColor.GOLD + "[you" + " -> " + target.getDisplayName() + "] " + ChatColor.WHITE + message);
							target.sendMessage(ChatColor.GOLD + "[" + player.getDisplayName() + " -> " + "you] " + ChatColor.WHITE + message);
							previousMessagedUsers.put(target, player);
						}
						}else{
						player.sendMessage(ChatColor.RED + "Player is not online.");
					}
				}else{
					player.sendMessage(ChatColor.RED + "You can't send a message to yourself.");
				}
				}
		}else{
			player.sendMessage(ChatColor.RED + "You can't send a message while muted.");
		}
			
		
		
		return false;
	}

}
