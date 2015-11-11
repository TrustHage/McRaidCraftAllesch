package me.trusthage.allesch.commands;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;

import me.trusthage.allesch.other.Main;

public class TNTCommand implements CommandExecutor
{
private Map<String, Long> lastUsage = new HashMap<String, Long>();
private final int cdtime = Main.plugin.getConfig().getInt("TNTCooldown");
  

  public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3)
  {
  if (!(arg0 instanceof Player))
    {
    return false;
    }
    
  Player player = (Player) arg0;
    
  if (player.hasPermission(Main.plugin.getConfig().getString("TNTPermission")))
    {
    long lastUsed = 0L;
    if (this.lastUsage.containsKey(player.getName()))
      {
       lastUsed = ((Long)this.lastUsage.get(player.getName())).longValue();
      }
      
    int cdmillis = this.cdtime * 1000;
    int timeLeft = (int)(this.cdtime - (System.currentTimeMillis() - lastUsed) / 1000L);
    int seconds = (int) timeLeft % 60;
    int minutes = (int) ((timeLeft - seconds) / 60);
      
    if (System.currentTimeMillis() - lastUsed >= cdmillis)
      { 
      player.sendMessage(ChatColor.GREEN + "You used your TNT Command!");
      this.lastUsage.put(player.getName(), Long.valueOf(System.currentTimeMillis()));
      Entity tnt = player.getPlayer().getWorld().spawn(player.getPlayer().getEyeLocation(), TNTPrimed.class);
      ((TNTPrimed)tnt).setFuseTicks(40);
      tnt.setVelocity(player.getPlayer().getLocation().getDirection());
      }
      else if (minutes == 1 && seconds == 1)
      {
      player.sendMessage(ChatColor.RED + "You need to wait " + ChatColor.GOLD + minutes + ChatColor.GOLD + " minute and " + ChatColor.GOLD + seconds + ChatColor.GOLD + " second" + ChatColor.RED + " before you can throw some TNT again");
      }else if (minutes == 1 && seconds != 1)
      {
   	   player.sendMessage(ChatColor.RED + "You need to wait " + ChatColor.GOLD + minutes + ChatColor.GOLD + " minute and " + ChatColor.GOLD + seconds + ChatColor.GOLD + " seconds" + ChatColor.RED + " before you can throw some TNT again");
      }else if (minutes != 1 && seconds == 1)
      {
   	   player.sendMessage(ChatColor.RED + "You need to wait " + ChatColor.GOLD + minutes + ChatColor.GOLD + " minutes and " + ChatColor.GOLD + seconds + ChatColor.GOLD + " second" + ChatColor.RED + " before you can throw some TNT again");
      }else if (minutes != 1 && seconds != 1)
      {
   	   player.sendMessage(ChatColor.RED + "You need to wait " + ChatColor.GOLD + minutes + ChatColor.GOLD + " minutes and " + ChatColor.GOLD + seconds + ChatColor.GOLD + " seconds" + ChatColor.RED + " before you can throw some TNT again");
      }
    }
    else {
    player.sendMessage(ChatColor.RED + "You don't have access to that command.");
    }
    
  return false;
  }
}
