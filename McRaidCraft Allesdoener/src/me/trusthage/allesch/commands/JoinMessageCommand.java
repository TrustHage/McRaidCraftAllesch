package me.trusthage.allesch.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import me.trusthage.allesch.other.Main;
import net.md_5.bungee.api.ChatColor;

public class JoinMessageCommand implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		
		FileConfiguration jmessage = Main.plugin.jmessage;
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i < args.length; i++){
			sb.append(args[i]).append(" ");			
		
		}
		
		if(!(sender instanceof Player)){
			if(args.length == 0){
				sender.sendMessage(ChatColor.RED + "please type /jm set <message>, /jm disable or /jm enable.");
			}else{
				if(args.length == 1){
					if(args[0].equalsIgnoreCase("disable")){
						if(!jmessage.getString("jmenabled").equals("false")){
							jmessage.set("jmenabled", "false");
							Main.plugin.saveFiles();
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "reload");
							sender.sendMessage(ChatColor.GOLD + "Join Message has been disabled, to re-enable it type /jm enable");
						}else{
							sender.sendMessage(ChatColor.RED + "Join Message was already disabled.");
						}
					}else{
						if(args[0].equalsIgnoreCase("enable")){
							if(!jmessage.getString("jmenabled").equals("true")){
								jmessage.set("jmenabled", "true");
								Main.plugin.saveFiles();
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "reload");
								sender.sendMessage(ChatColor.GOLD + "Join Message has been enabled.");
							}else{
								sender.sendMessage(ChatColor.RED + "Join Message was already enabled.");
							}
						}else{
							if(args[0].equalsIgnoreCase("set")){
								sender.sendMessage(ChatColor.RED + "Please type /jm set <message>.");
							}else{
								sender.sendMessage(ChatColor.RED + "please type /jm set <message>, /jm disable or /jm enable.");
							}
						}
					}
				}else{
					if(args.length >= 2){
						if(args[0].equalsIgnoreCase("set")){
							String message = sb.toString().trim();
							jmessage.set("jmenabled", "true");
							jmessage.set("JoinMessage", message);
							Main.plugin.saveFiles();
							Bukkit.getServer().reload();
							sender.sendMessage(ChatColor.GOLD + "Join Message has been set to: " + ChatColor.RED + message);
						}else{
							sender.sendMessage(ChatColor.RED + "please type /jm set <message>, /jm disable or /jm enable.");
						}
					}
				}
			}
		}else{
			Player player = (Player)sender;
			if(args.length == 0){
				player.sendMessage(ChatColor.RED + "please type /jm set <message>, /jm disable or /jm enable.");
			}else{
				if(args.length == 1){
					if(args[0].equalsIgnoreCase("disable")){
						if(!jmessage.getString("jmenabled").equals("false")){
							jmessage.set("jmenabled", "false");
							Main.plugin.saveFiles();
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "reload");
							player.sendMessage(ChatColor.GOLD + "Join Message has been disabled.");
						}else{
							player.sendMessage(ChatColor.RED + "Join Message was already disabled.");
						}
					}else{
						if(args[0].equalsIgnoreCase("enable")){
							if(!jmessage.getString("jmenabled").equals("true")){
								jmessage.set("jmenabled", "true");
								Main.plugin.saveFiles();
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "reload");
								player.sendMessage(ChatColor.GOLD + "Join Message has been enabled.");
							}else{
								player.sendMessage(ChatColor.RED + "Join Message was already enabled.");
							}
						}else{
							if(args[0].equalsIgnoreCase("set")){
								player.sendMessage(ChatColor.RED + "Please type /jm set <message>.");
							}else{
								player.sendMessage(ChatColor.RED + "please type /jm set <message>, /jm disable or /jm enable.");
							}
						}
					}
				}else{
					if(args.length >= 2){
						if(args[0].equalsIgnoreCase("set")){
							String message = sb.toString().trim();
							jmessage.set("jmenabled", "true");
							jmessage.set("JoinMessage", message);
							Main.plugin.saveFiles();
							Bukkit.getServer().reload();
							player.sendMessage(ChatColor.GOLD + "Join Message has been set to: " + ChatColor.RED + message);
						}else{
							player.sendMessage(ChatColor.RED + "please type /jm set <message>, /jm disable or /jm enable.");
						}
					}
				}
			}
		}
		
		return false;
	}

}
