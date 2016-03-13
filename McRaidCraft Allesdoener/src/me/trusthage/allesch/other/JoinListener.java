package me.trusthage.allesch.other;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import net.md_5.bungee.api.ChatColor;

public class JoinListener implements Listener{
	
	FileConfiguration jmessage = Main.plugin.jmessage;
	
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e){
		Player player = e.getPlayer();
		
		if(!jmessage.contains("fjmenabled")){
			jmessage.set("fjmenabled", "true");
			if(!player.hasPlayedBefore()){
				if(!jmessage.contains("FirstJoinMessage")){
					player.sendMessage(ChatColor.RED + "There is no First Join Message set, to setup the first join message type /fjm set <text>, type /mcraidcraft colors to see the list of color codes to use.");
				}else{
					String lines = jmessage.getString("FirstJoinMessage");
					String lines1 = lines.replaceAll("&0", ChatColor.BLACK + "");
					String lines2 = lines1.replaceAll("&1", ChatColor.DARK_BLUE + "");
					String lines3 = lines2.replaceAll("&2", ChatColor.DARK_GREEN + "");
					String lines4 = lines3.replaceAll("&3", ChatColor.DARK_AQUA + "");
					String lines5 = lines4.replaceAll("&4", ChatColor.DARK_RED + "");
					String lines6 = lines5.replaceAll("&5", ChatColor.DARK_PURPLE + "");
					String lines7 = lines6.replaceAll("&6", ChatColor.GOLD + "");
					String lines8 = lines7.replaceAll("&7", ChatColor.GRAY + "");
					String lines9 = lines8.replaceAll("&8", ChatColor.DARK_GRAY+ "");
					String lines10 = lines9.replaceAll("&9", ChatColor.BLUE + "");
					String lines11 = lines10.replaceAll("&a", ChatColor.GREEN + "");
					String lines12 = lines11.replaceAll("&b", ChatColor.AQUA + "");
					String lines13 = lines12.replaceAll("&c", ChatColor.RED + "");
					String lines14 = lines13.replaceAll("&d", ChatColor.LIGHT_PURPLE + "");
					String lines15 = lines14.replaceAll("&e", ChatColor.YELLOW + "");
					String lines16 = lines15.replaceAll("&f", ChatColor.WHITE + "");
					String lines17 = lines16.replaceAll("&g", ChatColor.MAGIC + "");
					String fjmessage = lines17.replaceAll("@player", e.getPlayer().getName());
					
					Bukkit.getServer().broadcastMessage(fjmessage);
			    }
			}else{
				
			}
		}else{
			if(jmessage.getString("fjmenabled").equals("true")){
				if(!player.hasPlayedBefore()){
					if(!jmessage.contains("FirstJoinMessage")){
						player.sendMessage(ChatColor.RED + "There is no First Join Message set, to setup the first join message type /fjm set <text>, type /mcraidcraft colors to see the list of color codes to use.");
					}else{
						String lines = jmessage.getString("FirstJoinMessage");
						String lines1 = lines.replaceAll("&0", ChatColor.BLACK + "");
						String lines2 = lines1.replaceAll("&1", ChatColor.DARK_BLUE + "");
						String lines3 = lines2.replaceAll("&2", ChatColor.DARK_GREEN + "");
						String lines4 = lines3.replaceAll("&3", ChatColor.DARK_AQUA + "");
						String lines5 = lines4.replaceAll("&4", ChatColor.DARK_RED + "");
						String lines6 = lines5.replaceAll("&5", ChatColor.DARK_PURPLE + "");
						String lines7 = lines6.replaceAll("&6", ChatColor.GOLD + "");
						String lines8 = lines7.replaceAll("&7", ChatColor.GRAY + "");
						String lines9 = lines8.replaceAll("&8", ChatColor.DARK_GRAY+ "");
						String lines10 = lines9.replaceAll("&9", ChatColor.BLUE + "");
						String lines11 = lines10.replaceAll("&a", ChatColor.GREEN + "");
						String lines12 = lines11.replaceAll("&b", ChatColor.AQUA + "");
						String lines13 = lines12.replaceAll("&c", ChatColor.RED + "");
						String lines14 = lines13.replaceAll("&d", ChatColor.LIGHT_PURPLE + "");
						String lines15 = lines14.replaceAll("&e", ChatColor.YELLOW + "");
						String lines16 = lines15.replaceAll("&f", ChatColor.WHITE + "");
						String lines17 = lines16.replaceAll("&g", ChatColor.MAGIC + "");
						String fjmessage = lines17.replaceAll("@player", e.getPlayer().getName());
						
						Bukkit.getServer().broadcastMessage(fjmessage);
				    }
				}else{
					
				}
			}else{
				
			}
		}
		
		if(!jmessage.contains("jmenabled")){
			jmessage.set("jmenabled", "true");
			if(!player.hasPlayedBefore()){
				
			}else{
				if(!jmessage.contains("JoinMessage")){
					player.sendMessage(ChatColor.RED + "There is no Join Message set, to setup the join message type /jm set <text>, type /mcraidcraft colors to see the list of color codes to use.");
				}else{
					String line = jmessage.getString("JoinMessage");
					String line1 = line.replaceAll("&0", ChatColor.BLACK + "");
				    String line2 = line1.replaceAll("&1", ChatColor.DARK_BLUE + "");
				    String line3 = line2.replaceAll("&2", ChatColor.DARK_GREEN + "");
				    String line4 = line3.replaceAll("&3", ChatColor.DARK_AQUA + "");
				    String line5 = line4.replaceAll("&4", ChatColor.DARK_RED + "");
				    String line6 = line5.replaceAll("&5", ChatColor.DARK_PURPLE + "");
				    String line7 = line6.replaceAll("&6", ChatColor.GOLD + "");
				    String line8 = line7.replaceAll("&7", ChatColor.GRAY + "");
				    String line9 = line8.replaceAll("&8", ChatColor.DARK_GRAY+ "");
				    String line10 = line9.replaceAll("&9", ChatColor.BLUE + "");
				    String line11 = line10.replaceAll("&a", ChatColor.GREEN + "");
				    String line12 = line11.replaceAll("&b", ChatColor.AQUA + "");
				    String line13 = line12.replaceAll("&c", ChatColor.RED + "");
				    String line14 = line13.replaceAll("&d", ChatColor.LIGHT_PURPLE + "");
				    String line15 = line14.replaceAll("&e", ChatColor.YELLOW + "");
				    String line16 = line15.replaceAll("&f", ChatColor.WHITE + "");
				    String line17 = line16.replaceAll("&g", ChatColor.MAGIC + "");
				    String message = line17.replaceAll("@player", e.getPlayer().getName());
				    
				    player.sendMessage(message);
				}
			}
		}else{
			if(jmessage.getString("jmenabled").equals("true")){
				if(!player.hasPlayedBefore()){
					
				}else{
					if(!jmessage.contains("JoinMessage")){
						player.sendMessage(ChatColor.RED + "There is no Join Message set, to setup the join message type /jm set <text>, type /mcraidcraft colors to see the list of color codes to use.");
					}else{
						String line = jmessage.getString("JoinMessage");
						String line1 = line.replaceAll("&0", ChatColor.BLACK + "");
					    String line2 = line1.replaceAll("&1", ChatColor.DARK_BLUE + "");
					    String line3 = line2.replaceAll("&2", ChatColor.DARK_GREEN + "");
					    String line4 = line3.replaceAll("&3", ChatColor.DARK_AQUA + "");
					    String line5 = line4.replaceAll("&4", ChatColor.DARK_RED + "");
					    String line6 = line5.replaceAll("&5", ChatColor.DARK_PURPLE + "");
					    String line7 = line6.replaceAll("&6", ChatColor.GOLD + "");
					    String line8 = line7.replaceAll("&7", ChatColor.GRAY + "");
					    String line9 = line8.replaceAll("&8", ChatColor.DARK_GRAY+ "");
					    String line10 = line9.replaceAll("&9", ChatColor.BLUE + "");
					    String line11 = line10.replaceAll("&a", ChatColor.GREEN + "");
					    String line12 = line11.replaceAll("&b", ChatColor.AQUA + "");
					    String line13 = line12.replaceAll("&c", ChatColor.RED + "");
					    String line14 = line13.replaceAll("&d", ChatColor.LIGHT_PURPLE + "");
					    String line15 = line14.replaceAll("&e", ChatColor.YELLOW + "");
					    String line16 = line15.replaceAll("&f", ChatColor.WHITE + "");
					    String line17 = line16.replaceAll("&g", ChatColor.MAGIC + "");
					    String message = line17.replaceAll("@player", e.getPlayer().getName());
					    
					    player.sendMessage(message);
					}
				}
			}else{
				
			}
		}
	}
}
