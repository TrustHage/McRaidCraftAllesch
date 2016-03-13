package me.trusthage.allesch.commands;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class InvisibleCommand implements CommandExecutor{
	
	public static ArrayList<String> invisible = new ArrayList<>();
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		
		if(!(sender instanceof Player)){
			Player target = Bukkit.getPlayer(args[0]);
			if(args.length != 1){
				sender.sendMessage(ChatColor.RED + "Please type /invis <playername>");
			}else{
				if(!(invisible.contains(target.getName()))){
					invisible.add(target.getName());
					target.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, Integer.MAX_VALUE, 0), true);
					target.sendMessage(ChatColor.GOLD + "Invisibiliy has been enabled by the console.");
					sender.sendMessage(ChatColor.GOLD + "You have enabled " + target.getName() + "'s invisibility.");
				}else{
					invisible.remove(target.getName());
					target.sendMessage(ChatColor.GOLD + "Invisibiliy has been disabled by the console.");
					sender.sendMessage(ChatColor.GOLD + "You have disabled " + target.getName() + "'s invisibility.");
					target.removePotionEffect(PotionEffectType.INVISIBILITY);
				}
			}
		}
		
			Player player = (Player)sender;
			if(player.hasPermission("mcraidcraft.invisible")){
				if(!(invisible.contains(player.getName()))){
					invisible.add(player.getName());
					player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, Integer.MAX_VALUE, 0));
					player.sendMessage(ChatColor.GOLD + "Invisibility has been enabled, type /invis to disable.");
				}else{
					invisible.remove(player.getName());
					player.removePotionEffect(PotionEffectType.INVISIBILITY);
					player.sendMessage(ChatColor.GOLD + "Invisibility has been disabled.");
				}
				
			}
		
		return false;
	}

}
