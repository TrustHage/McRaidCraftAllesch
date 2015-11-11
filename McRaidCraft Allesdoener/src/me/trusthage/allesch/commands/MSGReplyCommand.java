package me.trusthage.allesch.commands;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.trusthage.allesch.other.Main;

public class MSGReplyCommand implements CommandExecutor{
	
	List<String> loaded = Main.plugin.loaded;

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		if(!(sender instanceof Player)) return false;
		Player player = (Player)sender;
		Player target = MSGCommand.previousMessagedUsers.get(player);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < args.length; i++){
			sb.append(args[i]).append(" ");
		}
		
		List<String> mute = Main.mute;
		
		if(!(mute.contains(player.getName())) || !(loaded.contains(player.getName()))){
			if(args.length < 1){
				player.sendMessage(ChatColor.RED + "Please type /r <message>");
			}else
					if(target != null){
						String message = sb.toString().trim();
						player.sendMessage(ChatColor.GOLD + "[you" + " -> " + target.getDisplayName() + "] " + ChatColor.WHITE + message);
						target.sendMessage(ChatColor.GOLD + "[" + player.getDisplayName() + " -> " + "you] " + ChatColor.WHITE + message);
						MSGCommand.previousMessagedUsers.put(target, player);
					}else{
						player.sendMessage(ChatColor.RED + "Player not found.");
					}			
		}else{
			player.sendMessage(ChatColor.RED + "You can't reply to messages while muted.");
		}	
		
		return false;
	}

}
