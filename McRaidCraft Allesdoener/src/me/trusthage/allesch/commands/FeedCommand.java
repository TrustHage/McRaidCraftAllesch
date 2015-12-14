package me.trusthage.allesch.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class FeedCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		if(!(sender instanceof Player)) return false;
		
		Player player = (Player)sender;
		
		if(player.hasPermission("mcraidcraft.feed") || player.hasPermission("mcraidcraft.feed.else")){
			if(args.length == 0){
				if(player.getFoodLevel() >= 20){
					player.sendMessage(ChatColor.RED + "Your food is already full.");
				}else{
					player.sendMessage(ChatColor.GOLD + "Your food has been refreshed.");
					player.setFoodLevel(20);
				}			
			}else{
				if(args.length == 1){	
					@SuppressWarnings("deprecation")
					Player target = Bukkit.getServer().getPlayer(args[0]);
					switch(args[0]){			
					case "1":
						if(player.getFoodLevel() >= 1){
							player.sendMessage(ChatColor.RED + "You can't set your food to a lower level");
						}else{					
						player.sendMessage(ChatColor.GOLD + "Your food has been set to 1");
						player.setFoodLevel(1);
						}				
						break;
					case "2":
						if(player.getFoodLevel() >= 2){
							player.sendMessage(ChatColor.RED + "You can't set your food to a lower level");
						}else{					
						player.sendMessage(ChatColor.GOLD + "Your food has been set to 2");
						player.setFoodLevel(2);
						}				
						break;
					case "3":
						if(player.getFoodLevel() >= 3){
							player.sendMessage(ChatColor.RED + "You can't set your food to a lower level");
						}else{					
						player.sendMessage(ChatColor.GOLD + "Your food has been set to 3");
						player.setFoodLevel(3);
						}				
						break;
					case "4":
						if(player.getFoodLevel() >= 4){
							player.sendMessage(ChatColor.RED + "You can't set your food to a lower level");
						}else{					
						player.sendMessage(ChatColor.GOLD + "Your food has been set to 4");
						player.setFoodLevel(4);
						}				
						break;
					case "5":
						if(player.getFoodLevel() >= 5){
							player.sendMessage(ChatColor.RED + "You can't set your food to a lower level");
						}else{					
						player.sendMessage(ChatColor.GOLD + "Your food has been set to 5");
						player.setFoodLevel(5);
						}				
						break;
					case "6":
						if(player.getFoodLevel() >= 6){
							player.sendMessage(ChatColor.RED + "You can't set your food to a lower level");
						}else{					
						player.sendMessage(ChatColor.GOLD + "Your food has been set to 6");
						player.setFoodLevel(6);
						}				
						break;
					case "7":
						if(player.getFoodLevel() >= 7){
							player.sendMessage(ChatColor.RED + "You can't set your food to a lower level");
						}else{					
						player.sendMessage(ChatColor.GOLD + "Your food has been set to 7");
						player.setFoodLevel(7);
						}				
						break;
					case "8":
						if(player.getFoodLevel() >= 8){
							player.sendMessage(ChatColor.RED + "You can't set your food to a lower level");
						}else{					
						player.sendMessage(ChatColor.GOLD + "Your food has been set to 8");
						player.setFoodLevel(8);
						}				
						break;
					case "9":
						if(player.getFoodLevel() >= 9){
							player.sendMessage(ChatColor.RED + "You can't set your food to a lower level");
						}else{					
						player.sendMessage(ChatColor.GOLD + "Your food has been set to 9");
						player.setFoodLevel(9);
						}				
						break;
					case "10":
						if(player.getFoodLevel() >= 10){
							player.sendMessage(ChatColor.RED + "You can't set your food to a lower level");
						}else{					
						player.sendMessage(ChatColor.GOLD + "Your food has been set to 10");
						player.setFoodLevel(10);
						}				
						break;
					case "11":
						if(player.getFoodLevel() >= 11){
							player.sendMessage(ChatColor.RED + "You can't set your food to a lower level");
						}else{					
						player.sendMessage(ChatColor.GOLD + "Your food has been set to 11");
						player.setFoodLevel(11);
						}				
						break;
					case "12":
						if(player.getFoodLevel() >= 12){
							player.sendMessage(ChatColor.RED + "You can't set your food to a lower level");
						}else{					
						player.sendMessage(ChatColor.GOLD + "Your food has been set to 12");
						player.setFoodLevel(12);
						}				
						break;
					case "13":
						if(player.getFoodLevel() >= 13){
							player.sendMessage(ChatColor.RED + "You can't set your food to a lower level");
						}else{					
						player.sendMessage(ChatColor.GOLD + "Your food has been set to 13");
						player.setFoodLevel(13);
						}				
						break;
					case "14":
						if(player.getFoodLevel() >= 14){
							player.sendMessage(ChatColor.RED + "You can't set your food to a lower level");
						}else{					
						player.sendMessage(ChatColor.GOLD + "Your food has been set to 14");
						player.setFoodLevel(14);
						}				
						break;
					case "15":
						if(player.getFoodLevel() >= 15){
							player.sendMessage(ChatColor.RED + "You can't set your food to a lower level");
						}else{					
						player.sendMessage(ChatColor.GOLD + "Your food has been set to 15");
						player.setFoodLevel(15);
						}				
						break;
					case "16":
						if(player.getFoodLevel() >= 16){
							player.sendMessage(ChatColor.RED + "You can't set your food to a lower level");
						}else{					
						player.sendMessage(ChatColor.GOLD + "Your food has been set to 16");
						player.setFoodLevel(16);
						}				
						break;
					case "17":
						if(player.getFoodLevel() >= 17){
							player.sendMessage(ChatColor.RED + "You can't set your food to a lower level");
						}else{					
						player.sendMessage(ChatColor.GOLD + "Your food has been set to 17");
						player.setFoodLevel(17);
						}				
						break;
					case "18":
						if(player.getFoodLevel() >= 18){
							player.sendMessage(ChatColor.RED + "You can't set your food to a lower level");
						}else{					
						player.sendMessage(ChatColor.GOLD + "Your food has been set to 18");
						player.setFoodLevel(18);
						}				
						break;
					case "19":
						if(player.getFoodLevel() >= 19){
							player.sendMessage(ChatColor.RED + "You can't set your food to a lower level");
						}else{					
						player.sendMessage(ChatColor.GOLD + "Your food has been set to 19");
						player.setFoodLevel(19);
						}				
						break;
					default:
						if(target.getName() == player.getName()){
							if(player.getFoodLevel() >= 20){
								player.sendMessage(ChatColor.RED + "Your food is already full");
							}else{
								player.sendMessage(ChatColor.GOLD + "Your food has been refreshed");
								player.setFoodLevel(20);
							}		
						}else{
							if(target != null){
								target.sendMessage(ChatColor.GOLD + "Your food has been refreshed by:" + ChatColor.RED + player.getDisplayName());
								target.setFoodLevel(20);
							}
						}
						break;
					}	
				}else{
					if(player.hasPermission("mcraidcraft.feed.else")){
						if(args.length == 2){
							@SuppressWarnings("deprecation")
							Player target = Bukkit.getServer().getPlayer(args[0]);
							switch(args[1]){
							case "1":
								if(target.getFoodLevel() >= 1){
									player.sendMessage(ChatColor.RED + "You can't set that player's food to a lower level");
								}else{					
								target.sendMessage(ChatColor.GOLD + "Your food has been set to 1");
								target.setFoodLevel(1);
								}				
								break;
							case "2":
								if(target.getFoodLevel() >= 2){
									player.sendMessage(ChatColor.RED + "You can't set that player's food to a lower level");
								}else{					
								target.sendMessage(ChatColor.GOLD + "Your food has been set to 2");
								target.setFoodLevel(2);
								}				
								break;
							case "3":
								if(target.getFoodLevel() >= 3){
									player.sendMessage(ChatColor.RED + "You can't set that player's food to a lower level");
								}else{					
								target.sendMessage(ChatColor.GOLD + "Your food has been set to 3");
								target.setFoodLevel(3);
								}				
								break;
							case "4":
								if(target.getFoodLevel() >= 4){
									player.sendMessage(ChatColor.RED + "You can't set that player's food to a lower level");
								}else{					
								target.sendMessage(ChatColor.GOLD + "Your food has been set to 4");
								target.setFoodLevel(4);
								}				
								break;
							case "5":
								if(target.getFoodLevel() >= 5){
									player.sendMessage(ChatColor.RED + "You can't set that player's food to a lower level");
								}else{					
								target.sendMessage(ChatColor.GOLD + "Your food has been set to 5");
								target.setFoodLevel(5);
								}				
								break;
							case "6":
								if(target.getFoodLevel() >= 6){
									player.sendMessage(ChatColor.RED + "You can't set that player's food to a lower level");
								}else{					
								target.sendMessage(ChatColor.GOLD + "Your food has been set to 6");
								target.setFoodLevel(6);
								}				
								break;
							case "7":
								if(target.getFoodLevel() >= 7){
									player.sendMessage(ChatColor.RED + "You can't set that player's food to a lower level");
								}else{					
								target.sendMessage(ChatColor.GOLD + "Your food has been set to 7");
								target.setFoodLevel(7);
								}				
								break;
							case "8":
								if(target.getFoodLevel() >= 8){
									player.sendMessage(ChatColor.RED + "You can't set that player's food to a lower level");
								}else{					
								target.sendMessage(ChatColor.GOLD + "Your food has been set to 8");
								target.setFoodLevel(8);
								}				
								break;
							case "9":
								if(target.getFoodLevel() >= 9){
									player.sendMessage(ChatColor.RED + "You can't set that player's food to a lower level");
								}else{					
								target.sendMessage(ChatColor.GOLD + "Your food has been set to 9");
								target.setFoodLevel(9);
								}				
								break;
							case "10":
								if(target.getFoodLevel() >= 10){
									player.sendMessage(ChatColor.RED + "You can't set that player's food to a lower level");
								}else{					
								target.sendMessage(ChatColor.GOLD + "Your food has been set to 10");
								target.setFoodLevel(10);
								}				
								break;
							case "11":
								if(target.getFoodLevel() >= 11){
									player.sendMessage(ChatColor.RED + "You can't set that player's food to a lower level");
								}else{					
								target.sendMessage(ChatColor.GOLD + "Your food has been set to 11");
								target.setFoodLevel(11);
								}				
								break;
							case "12":
								if(target.getFoodLevel() >= 12){
									player.sendMessage(ChatColor.RED + "You can't set that player's food to a lower level");
								}else{					
								target.sendMessage(ChatColor.GOLD + "Your food has been set to 12");
								target.setFoodLevel(12);
								}				
								break;
							case "13":
								if(target.getFoodLevel() >= 13){
									player.sendMessage(ChatColor.RED + "You can't set that player's food to a lower level");
								}else{					
								target.sendMessage(ChatColor.GOLD + "Your food has been set to 13");
								target.setFoodLevel(13);
								}				
								break;
							case "14":
								if(target.getFoodLevel() >= 14){
									player.sendMessage(ChatColor.RED + "You can't set that player's food to a lower level");
								}else{					
								target.sendMessage(ChatColor.GOLD + "Your food has been set to 14");
								target.setFoodLevel(14);
								}				
								break;
							case "15":
								if(target.getFoodLevel() >= 15){
									player.sendMessage(ChatColor.RED + "You can't set that player's food to a lower level");
								}else{					
								target.sendMessage(ChatColor.GOLD + "Your food has been set to 15");
								target.setFoodLevel(15);
								}				
								break;
							case "16":
								if(target.getFoodLevel() >= 16){
									player.sendMessage(ChatColor.RED + "You can't set that player's food to a lower level");
								}else{					
								target.sendMessage(ChatColor.GOLD + "Your food has been set to 16");
								target.setFoodLevel(16);
								}				
								break;
							case "17":
								if(target.getFoodLevel() >= 17){
									player.sendMessage(ChatColor.RED + "You can't set that player's food to a lower level");
								}else{					
								target.sendMessage(ChatColor.GOLD + "Your food has been set to 17");
								target.setFoodLevel(17);
								}				
								break;
							case "18":
								if(target.getFoodLevel() >= 18){
									player.sendMessage(ChatColor.RED + "You can't set that player's food to a lower level");
								}else{					
								target.sendMessage(ChatColor.GOLD + "Your food has been set to 18");
								target.setFoodLevel(18);
								}				
								break;
							case "19":
								if(target.getFoodLevel() >= 19){
									player.sendMessage(ChatColor.RED + "You can't set that player's food to a lower level");
								}else{					
								target.sendMessage(ChatColor.GOLD + "Your food has been set to 19");
								target.setFoodLevel(19);
								}				
								break;
							default:
								player.sendMessage(ChatColor.RED + "Please type /feed <playername> (<1 - 19>)");
							}
						}else{
							player.sendMessage(ChatColor.RED + "Please type /feed <playername> (<foodlevel>)");
						}
					}else{
						player.sendMessage(ChatColor.RED + "You don't have access to that command.");
					}
					
				}
			}
			}else{
				player.sendMessage(ChatColor.RED + "You don't have access to that command.");
			}
			
		
		return false;
	}

}
