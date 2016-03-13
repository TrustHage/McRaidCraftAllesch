package me.trusthage.allesch.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class InfoCommand implements CommandExecutor{
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
	{
		if(!(sender instanceof Player)){
			if(args.length == 0){
				sender.sendMessage(ChatColor.GOLD + "Plugin developed by: TrustHage");
				sender.sendMessage(ChatColor.GOLD + "GitHub: www.github.com/trusthage");
				sender.sendMessage(ChatColor.GOLD + "/mcraidcraft colors: " + ChatColor.RED + "the color list for the plugin.");
			}else{
				if(args.length == 1){
					if(args[0].equalsIgnoreCase("jm")){
						sender.sendMessage(ChatColor.GOLD + "===========[" + ChatColor.RED + " Join Message Help " + ChatColor.GOLD + "]===========");
						sender.sendMessage("&0 = " + ChatColor.BLACK + "Black");
						sender.sendMessage("&1 = " + ChatColor.DARK_BLUE + "Dark Blue");
						sender.sendMessage("&2 = " + ChatColor.DARK_GREEN + "Dark Green");
						sender.sendMessage("&3 = " + ChatColor.DARK_AQUA + "Dark Aqua");
						sender.sendMessage("&4 = " + ChatColor.DARK_RED + "Dark Red");
						sender.sendMessage("&5 = " + ChatColor.DARK_PURPLE + "Dark Purple");
						sender.sendMessage("&6 = " + ChatColor.GOLD + "Gold");
						sender.sendMessage("&7 = " + ChatColor.GRAY + "Gray");
						sender.sendMessage("&8 = " + ChatColor.DARK_GRAY + "Dark Gray");
						sender.sendMessage("&9 = " + ChatColor.BLUE + "Blue");
						sender.sendMessage("&a = " + ChatColor.GREEN + "Green");
						sender.sendMessage("&b = " + ChatColor.AQUA + "Aqua");
						sender.sendMessage("&c = " + ChatColor.RED + "Red");
						sender.sendMessage("&d = " + ChatColor.LIGHT_PURPLE + "Light Purple");
						sender.sendMessage("&e = " + ChatColor.YELLOW + "Yellow");
						sender.sendMessage("&f = " + ChatColor.WHITE + "White");
						sender.sendMessage("&g = " + ChatColor.MAGIC + "Magic");
						sender.sendMessage("@player = " + ChatColor.GOLD + "The players' name.");
					}
				}
			}
		}else{
			Player player = (Player)sender;
			if(args.length == 0){
				player.sendMessage(ChatColor.GOLD + "Plugin developed by: TrustHage");
				player.sendMessage(ChatColor.GOLD + "GitHub: www.github.com/trusthage");
				player.sendMessage(ChatColor.GOLD + "/mcraidcraft colors: " + ChatColor.RED + "the color list for the plugin.");
			}else{
				if(args.length == 1){
					if(args[0].equalsIgnoreCase("jm")){
						player.sendMessage(ChatColor.GOLD + "===========[" + ChatColor.RED + " Join Message Help " + ChatColor.GOLD + "]===========");
						player.sendMessage("&0 = " + ChatColor.BLACK + "Black");
						player.sendMessage("&1 = " + ChatColor.DARK_BLUE + "Dark Blue");
						player.sendMessage("&2 = " + ChatColor.DARK_GREEN + "Dark Green");
						player.sendMessage("&3 = " + ChatColor.DARK_AQUA + "Dark Aqua");
						player.sendMessage("&4 = " + ChatColor.DARK_RED + "Dark Red");
						player.sendMessage("&5 = " + ChatColor.DARK_PURPLE + "Dark Purple");
						player.sendMessage("&6 = " + ChatColor.GOLD + "Gold");
						player.sendMessage("&7 = " + ChatColor.GRAY + "Gray");
						player.sendMessage("&8 = " + ChatColor.DARK_GRAY + "Dark Gray");
						player.sendMessage("&9 = " + ChatColor.BLUE + "Blue");
						player.sendMessage("&a = " + ChatColor.GREEN + "Green");
						player.sendMessage("&b = " + ChatColor.AQUA + "Aqua");
						player.sendMessage("&c = " + ChatColor.RED + "Red");
						player.sendMessage("&d = " + ChatColor.LIGHT_PURPLE + "Light Purple");
						player.sendMessage("&e = " + ChatColor.YELLOW + "Yellow");
						player.sendMessage("&f = " + ChatColor.WHITE + "White");
						player.sendMessage("&g = " + ChatColor.MAGIC + "Magic");
						player.sendMessage("@player = " + ChatColor.GOLD + "The players' name.");
					}
				}
			}
		}
		return false;
	}

}
