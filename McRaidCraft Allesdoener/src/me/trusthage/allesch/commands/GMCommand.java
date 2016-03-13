package me.trusthage.allesch.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.trusthage.allesch.other.Main;

public class GMCommand implements CommandExecutor{
		
	 @Override
	   public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
	     if (!(sender instanceof Player)) return false;
	     Player player = (Player)sender;
	     if(args.length == 1) {
	    	 if(player.hasPermission("mcraidcraft.gm") || player.isOp()) {
	         switch(args[0]) {
	         case "0":
	           player.setGameMode(GameMode.SURVIVAL);
	           player.sendMessage(ChatColor.GOLD + "Your gamemode has been changed to " + ChatColor.RED + "Survival");
	           break;
	         case "1":
	           player.setGameMode(GameMode.CREATIVE);
	           player.sendMessage(ChatColor.GOLD + "Your gamemode has been changed to " + ChatColor.RED + "Creative");
	           break;
	         case "2":
	           player.setGameMode(GameMode.ADVENTURE);
	           player.sendMessage(ChatColor.GOLD + "Your gamemode has been changed to " + ChatColor.RED + "Adventure");
	           break;
	         case "3":
	           player.setGameMode(GameMode.SPECTATOR);
	           player.sendMessage(ChatColor.GOLD + "Your gamemode has been changed to " + ChatColor.RED + "Spectator");
	           break;
	         default:
	           player.sendMessage(ChatColor.RED + "That is not a valid number. Please pick a number between 0 and 3.");
	           break;
	         }
	       }
	       else {
	         player.sendMessage(ChatColor.RED + "You don't have access to that command.");
	       }
	     }else if (args.length == 0 && player.hasPermission(Main.plugin.getConfig().getString("GMPermission"))){
	    	 player.sendMessage(ChatColor.RED + "That is not a valid number");
	     }else if (args.length == 0 && !(player.hasPermission(Main.plugin.getConfig().getString("GMPermission")))){
	    	 player.sendMessage(ChatColor.RED + "You don't have access to that command.");
	     }
	     else {
	       if(player.hasPermission("mcraidcraft.gm.else") || player.isOp()) {
	         Player target = Bukkit.getServer().getPlayer(args[1]);
	         if(target != null && args.length == 2) {
	           switch(args[0]) {
	           case "0":
	        	 player.sendMessage(ChatColor.GOLD + "You changed " + ChatColor.RED + target.getDisplayName() + "'s " + ChatColor.GOLD + "gamemode to " + ChatColor.RED + "Survival");
	             target.setGameMode(GameMode.SURVIVAL);
	             target.sendMessage(ChatColor.GOLD + "Your gamemode has been changed to " + ChatColor.RED + "Survival " + ChatColor.GOLD + "by " + ChatColor.RED + player.getDisplayName());
	             break;
	           case "1":
	        	 player.sendMessage(ChatColor.GOLD + "You changed " + ChatColor.RED + target.getDisplayName() + "'s " + ChatColor.GOLD + "gamemode to " + ChatColor.RED + "Creative");
	             target.setGameMode(GameMode.CREATIVE);
	             target.sendMessage(ChatColor.GOLD + "Your gamemode has been changed to " + ChatColor.RED + "Creative " + ChatColor.GOLD + "by " + ChatColor.RED + player.getDisplayName());
	             break;
	           case "2":
	        	 player.sendMessage(ChatColor.GOLD + "You changed " + ChatColor.RED + target.getDisplayName() + "'s " + ChatColor.GOLD + "gamemode to " + ChatColor.RED + "Adventure");
	             target.setGameMode(GameMode.ADVENTURE);
	             target.sendMessage(ChatColor.GOLD + "Your gamemode has been changed to " + ChatColor.RED + "Adventure " + ChatColor.GOLD + "by " + ChatColor.RED + player.getDisplayName());
	             break;
	           case "3":
	        	 player.sendMessage(ChatColor.GOLD + "You changed " + ChatColor.RED + target.getDisplayName() + "'s " + ChatColor.GOLD + "gamemode to " + ChatColor.RED + "Spectator");
	             target.setGameMode(GameMode.SPECTATOR);
	             target.sendMessage(ChatColor.GOLD + "Your gamemode has been changed to " + ChatColor.RED + "Spectator " + ChatColor.GOLD + "by " + ChatColor.RED + player.getDisplayName());
	             break;
	           default:
	             player.sendMessage(ChatColor.RED + "That is not a valid number. Please pick a number between 0 and 3.");
	             break;
	           }
	         }
	         else if (target == null){
	           player.sendMessage(ChatColor.RED + "That player is not online.");
	         }
	        	 
	       }
	       else {
	         player.sendMessage(ChatColor.RED + "You don't have access to that command.");
	       }
	     }
	     return false;
	   }

}
