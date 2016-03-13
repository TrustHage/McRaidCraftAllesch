package me.trusthage.allesch.other;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerTeleportEvent;

@SuppressWarnings("deprecation")
public class LoginListener implements Listener{
	
	List<String> loggedinplayers = Main.loggedinplayers;
	List<String> loadedloggedin = Main.plugin.loadedloggedin;
	FileConfiguration logins = Main.plugin.logins;
	
	
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent e){
		if(logins.getString("enabled").equals("true")){
			Player player = e.getPlayer();
			if(!(loggedinplayers.contains(player.getName()) || loadedloggedin.contains(player.getName()))){
				if(!(logins.contains(player.getName()))){
					e.setCancelled(true);
					player.sendMessage(ChatColor.RED + "Please register with, /register <password> <password>");
				}else{
					e.setCancelled(true);
					player.sendMessage(ChatColor.RED + "Please Login with, /login <password>");
				}
			}
		}else{
			if(logins.getString("enabled").equals("false")){
				
			}else{
				Player player = e.getPlayer();
				if(!(loggedinplayers.contains(player.getName()) || loadedloggedin.contains(player.getName()))){
					if(!(logins.contains(player.getName()))){
						e.setCancelled(true);
						player.sendMessage(ChatColor.RED + "Please register with, /register <password> <password>");
					}else{
						e.setCancelled(true);
						player.sendMessage(ChatColor.RED + "Please Login with, /login <password>");
					}
				}
			}
		}
	}
	
	@EventHandler
	public void onPlayerMove(PlayerMoveEvent e){
		if(logins.getString("enabled").equals("true")){
			Player player = e.getPlayer();
			if(!(loggedinplayers.contains(player.getName()) || loadedloggedin.contains(player.getName()))){
				if(!(logins.contains(player.getName()))){
					e.setCancelled(true);
					
				}else{
					e.setCancelled(true);
					
				}
			}
		}else{
			if(logins.getString("enabled").equals("false")){
				
			}else{
				Player player = e.getPlayer();
				if(!(loggedinplayers.contains(player.getName()) || loadedloggedin.contains(player.getName()))){
					if(!(logins.contains(player.getName()))){
						e.setCancelled(true);
						
					}else{
						e.setCancelled(true);
						
					}
				}
			}
		}
		
	}
	
	@EventHandler
	public void onPlayerChat(PlayerChatEvent e){
		if(logins.getString("enabled").equals("true")){
			Player player = e.getPlayer();
			if(!(loggedinplayers.contains(player.getName()) || loadedloggedin.contains(player.getName()))){
				if(!(logins.contains(player.getName()))){
					e.setCancelled(true);
					player.sendMessage(ChatColor.RED + "Please register with, /register <password> <password>");
				}else{
					e.setCancelled(true);
					player.sendMessage(ChatColor.RED + "Please Login with, /login <password>");
				}
			}
		}else{
			if(logins.getString("enabled").equals("false")){
				
			}else{
				Player player = e.getPlayer();
				if(!(loggedinplayers.contains(player.getName()) || loadedloggedin.contains(player.getName()))){
					if(!(logins.contains(player.getName()))){
						e.setCancelled(true);
						player.sendMessage(ChatColor.RED + "Please register with, /register <password> <password>");
					}else{
						e.setCancelled(true);
						player.sendMessage(ChatColor.RED + "Please Login with, /login <password>");
					}
				}
			}
		}
		
	}
	
	@EventHandler
	public void onPlayerCommand(PlayerTeleportEvent e){
		if(logins.getString("enabled").equals("true")){
			Player player = e.getPlayer();
			if(!(loggedinplayers.contains(player.getName()) || loadedloggedin.contains(player.getName()))){
				if(!(logins.contains(player.getName()))){
					e.setCancelled(true);
					player.sendMessage(ChatColor.RED + "Please register with, /register <password> <password>");
				}else{
					e.setCancelled(true);
					player.sendMessage(ChatColor.RED + "Please Login with, /login <password>");
				}
			}
		}else{
			if(logins.getString("enabled").equals("false")){
				
			}else{
				Player player = e.getPlayer();
				if(!(loggedinplayers.contains(player.getName()) || loadedloggedin.contains(player.getName()))){
					if(!(logins.contains(player.getName()))){
						e.setCancelled(true);
						player.sendMessage(ChatColor.RED + "Please register with, /register <password> <password>");
					}else{
						e.setCancelled(true);
						player.sendMessage(ChatColor.RED + "Please Login with, /login <password>");
					}
				}
			}
		}
		
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerQuitEvent e){
		if(logins.getString("enabled").equals("true")){
			Player player = e.getPlayer();
			if(loggedinplayers.contains(player.getName()) || loadedloggedin.contains(player.getName())){
				loggedinplayers.remove(player.getName()); loadedloggedin.remove(player.getName());
			}
		}else{
			if(logins.getString("enabled").equals("false")){
				
			}else{
				Player player = e.getPlayer();
				if(loggedinplayers.contains(player.getName()) || loadedloggedin.contains(player.getName())){
					loggedinplayers.remove(player.getName()); loadedloggedin.remove(player.getName());
				}
			}
		}
	}
}
