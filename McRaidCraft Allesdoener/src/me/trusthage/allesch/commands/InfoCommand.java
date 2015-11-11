package me.trusthage.allesch.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.trusthage.allesch.other.Main;

public class InfoCommand implements CommandExecutor{
	
	
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3)
	{
		Player player = (Player)arg0;
		if (!(arg0 instanceof Player))
			{
			return false;
			}
		else if (!(arg0 instanceof Player) && arg3[0].equalsIgnoreCase("reload"))
		{
			Main.plugin.getServer().reload();
			Main.plugin.logger.info("MCRaidCraft Allesch has been reloaded by server");
		}		
		
		if (arg3.length == 0)
		{
			player.sendMessage(ChatColor.GOLD + "type /mcraidcraft info or /mcraidcraft help");
		}
		
		if (arg0 instanceof Player && arg3[0].equalsIgnoreCase("info"))
		{
			player.sendMessage(ChatColor.GOLD + "Plugin developed by TrustHage");
			player.sendMessage("GitHub:" + ChatColor.GOLD + " http://github.com/trusthage");
		}
		
		if (arg3[0].equalsIgnoreCase("help"))
		{
			player.sendMessage(ChatColor.GOLD + "Het werkt!");
		}
		
		if (arg3[0].equalsIgnoreCase("reload") && player.hasPermission(Main.plugin.getConfig().getString("ReloadPermission")))
		{
			Main.plugin.getServer().reload();
			player.sendMessage(ChatColor.GREEN + "You have reloaded the plugin.");
		}else if (arg3[0].equalsIgnoreCase("reload") && !(player.hasPermission(Main.plugin.getConfig().getString("ReloadPermission")))){
			player.sendMessage(ChatColor.RED + "You don't have access to that command.");
		}
		return false;
	}

}
