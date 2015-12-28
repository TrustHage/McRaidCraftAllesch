package me.trusthage.allesch.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;

public class EnchantCommand implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		
		if(!(sender instanceof Player)) return false;
		
		Player player = (Player)sender;
		
		
		if(player.hasPermission("mcraidcraft.enchant")){
		if(args.length == 1){
			player.sendMessage(ChatColor.RED + "Please type /enchant <enchant> <level>");
		}else{
			if(args.length == 2){
					int level = Integer.parseInt(args[1]);
				if(player.getItemInHand().getType().equals(Material.BOW)){
					if(args[0].equalsIgnoreCase("flame")){
						player.getItemInHand().addEnchantment(Enchantment.ARROW_FIRE, level);
						player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your bow.");
					}else{
						if(args[0].equalsIgnoreCase("power")){
							player.getItemInHand().addEnchantment(Enchantment.ARROW_DAMAGE, level);
							player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your bow.");
						}else{
							if(args[0].equalsIgnoreCase("punch")){
								player.getItemInHand().addEnchantment(Enchantment.ARROW_KNOCKBACK, level);
								player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your bow.");
							}else{
								if(args[0].equalsIgnoreCase("infinity")){
									player.getItemInHand().addEnchantment(Enchantment.ARROW_INFINITE, level);
									player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your bow.");
								}else{
										if(args[0].equalsIgnoreCase("unbreaking")){
											player.getItemInHand().addEnchantment(Enchantment.DURABILITY, level);
											player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your bow.");
									}else{
										player.sendMessage(ChatColor.RED + "That enchantment does not excists for this item.");
									}
								}
							}
						}
					}
				}else{
					if(player.getItemInHand().getType().equals(Material.DIAMOND_SWORD) || player.getItemInHand().getType().equals(Material.GOLD_SWORD) || player.getItemInHand().getType().equals(Material.IRON_SWORD) || player.getItemInHand().getType().equals(Material.STONE_SWORD) || player.getItemInHand().getType().equals(Material.WOOD_SWORD)){
						if(args[0].equalsIgnoreCase("sharpness")){
							player.getItemInHand().addEnchantment(Enchantment.DAMAGE_ALL, level);
							player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your sword.");
						}else{
							if(args[0].equalsIgnoreCase("baneofarthropods")){
								player.getItemInHand().addEnchantment(Enchantment.DAMAGE_ARTHROPODS, level);
								player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your sword.");
							}else{
								if(args[0].equalsIgnoreCase("smite")){
									player.getItemInHand().addEnchantment(Enchantment.DAMAGE_UNDEAD, level);
									player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your sword.");
								}else{
									if(args[0].equalsIgnoreCase("unbreaking")){
										player.getItemInHand().addEnchantment(Enchantment.DURABILITY, level);
										player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your sword.");
									}else{
										if(args[0].equalsIgnoreCase("looting")){
											player.getItemInHand().addEnchantment(Enchantment.LOOT_BONUS_MOBS, level);
											player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your sword.");
										}else{
											if(args[0].equalsIgnoreCase("fireaspect")){
												player.getItemInHand().addEnchantment(Enchantment.FIRE_ASPECT, level);
												player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your sword.");
											}else{
												if(args[0].equalsIgnoreCase("knockback")){
													player.getItemInHand().addEnchantment(Enchantment.KNOCKBACK, level);
													player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your sword.");
												}else{
													player.sendMessage(ChatColor.RED + "That enchantment does not excists for this item.");
												}
											}
										}
									}
								}
							}
						}
					}else{
						if(player.getItemInHand().getType().equals(Material.DIAMOND_PICKAXE) || player.getItemInHand().getType().equals(Material.GOLD_PICKAXE) || player.getItemInHand().getType().equals(Material.IRON_PICKAXE) || player.getItemInHand().getType().equals(Material.STONE_PICKAXE) || player.getItemInHand().getType().equals(Material.WOOD_PICKAXE)){
							if(args[0].equalsIgnoreCase("silktouch")){
								player.getItemInHand().addEnchantment(Enchantment.SILK_TOUCH, level);
								player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your pickaxe.");
							}else{
								if(args[0].equalsIgnoreCase("efficiency")){
									player.getItemInHand().addEnchantment(Enchantment.DIG_SPEED, level);
									player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your pickaxe.");
								}else{
									if(args[0].equalsIgnoreCase("unbreaking")){
										player.getItemInHand().addEnchantment(Enchantment.DURABILITY, level);
										player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your pickaxe.");
									}else{
										if(args[0].equalsIgnoreCase("fortune")){
											player.getItemInHand().addEnchantment(Enchantment.LOOT_BONUS_BLOCKS, level);
											player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your pickaxe.");
										}else{
											player.sendMessage(ChatColor.RED + "That enchantment does not excists for this item.");
										}
									}
								}
							}
						}else{
							if(player.getItemInHand().getType().equals(Material.DIAMOND_AXE) || player.getItemInHand().getType().equals(Material.GOLD_AXE) || player.getItemInHand().getType().equals(Material.IRON_AXE) || player.getItemInHand().getType().equals(Material.STONE_AXE) || player.getItemInHand().getType().equals(Material.WOOD_AXE)){
								if(args[0].equalsIgnoreCase("fortune")){
									player.getItemInHand().addEnchantment(Enchantment.LOOT_BONUS_BLOCKS, level);
									player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your axe.");
								}else{
									if(args[0].equalsIgnoreCase("silktouch")){
										player.getItemInHand().addEnchantment(Enchantment.SILK_TOUCH, level);
										player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your axe.");
									}else{
										if(args[0].equalsIgnoreCase("efficiency")){
											player.getItemInHand().addEnchantment(Enchantment.DIG_SPEED, level);
											player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your axe.");
										}else{
											if(args[0].equalsIgnoreCase("unbreaking")){
												player.getItemInHand().addEnchantment(Enchantment.DURABILITY, level);
												player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your axe.");
											}else{
												if(args[0].equalsIgnoreCase("sharpness")){
													player.getItemInHand().addEnchantment(Enchantment.DAMAGE_ALL, level);
													player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your axe.");
												}else{
													if(args[0].equalsIgnoreCase("smite")){
														player.getItemInHand().addEnchantment(Enchantment.DAMAGE_UNDEAD, level);
														player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your axe.");
													}else{
														if(args[0].equalsIgnoreCase("baneofarthropods")){
															player.getItemInHand().addEnchantment(Enchantment.DAMAGE_ARTHROPODS, level);
															player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your axe.");
														}else{
															player.sendMessage(ChatColor.RED + "That enchantment does not excists for this item.");
														}
													}
												}
											}
										}
									}
								}
							}else{
								if(player.getItemInHand().getType().equals(Material.DIAMOND_HOE) || player.getItemInHand().getType().equals(Material.GOLD_HOE) || player.getItemInHand().getType().equals(Material.IRON_HOE) || player.getItemInHand().getType().equals(Material.STONE_HOE) || player.getItemInHand().getType().equals(Material.WOOD_HOE)){
									if(args[0].equalsIgnoreCase("unbreaking")){
										player.getItemInHand().addEnchantment(Enchantment.DURABILITY, level);
										player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your hoe.");
									}
								}else{
									if(player.getItemInHand().getType().equals(Material.DIAMOND_SPADE) || player.getItemInHand().getType().equals(Material.GOLD_SPADE) || player.getItemInHand().getType().equals(Material.IRON_SPADE) || player.getItemInHand().getType().equals(Material.STONE_SPADE) || player.getItemInHand().getType().equals(Material.WOOD_SPADE)){
										if(args[0].equalsIgnoreCase("efficiency")){
											player.getItemInHand().addEnchantment(Enchantment.DIG_SPEED, level);
											player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your spade.");
										}else{
											if(args[0].equalsIgnoreCase("silktouch")){
												player.getItemInHand().addEnchantment(Enchantment.SILK_TOUCH, level);
												player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your spade.");
											}else{
												if(args[0].equalsIgnoreCase("fortune")){
													player.getItemInHand().addEnchantment(Enchantment.LOOT_BONUS_BLOCKS, level);
													player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your spade.");
												}else{
													if(args[0].equalsIgnoreCase("unbreaking")){
														player.getItemInHand().addEnchantment(Enchantment.DURABILITY, level);
														player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your spade.");
													}else{
														player.sendMessage(ChatColor.RED + "That enchantment does not excists for this item.");
													}
												}
											}
										}
									}else{
										if(player.getItemInHand().getType().equals(Material.DIAMOND_BOOTS) || player.getItemInHand().getType().equals(Material.GOLD_BOOTS) || player.getItemInHand().getType().equals(Material.IRON_BOOTS) || player.getItemInHand().getType().equals(Material.LEATHER_BOOTS) || player.getItemInHand().getType().equals(Material.CHAINMAIL_BOOTS)){
											if(args[0].equalsIgnoreCase("featherfalling")){
												player.getItemInHand().addEnchantment(Enchantment.PROTECTION_FALL, level);
												player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your boots.");
											}else{
												if(args[0].equalsIgnoreCase("depthstrider")){
													player.getItemInHand().addEnchantment(Enchantment.DEPTH_STRIDER, level);
													player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your boots.");
												}else{
													if(args[0].equalsIgnoreCase("fireprotection")){
														player.getItemInHand().addEnchantment(Enchantment.PROTECTION_FIRE, level);
														player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your boots.");
													}else{
														if(args[0].equalsIgnoreCase("projectileprotection")){
															player.getItemInHand().addEnchantment(Enchantment.PROTECTION_PROJECTILE, level);
															player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your boots.");
														}else{
															if(args[0].equalsIgnoreCase("blastprotection")){
																player.getItemInHand().addEnchantment(Enchantment.PROTECTION_EXPLOSIONS, level);
																player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your boots.");
															}else{
																if(args[0].equalsIgnoreCase("protection")){
																	player.getItemInHand().addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, level);
																	player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your boots.");
																}else{
																	if(args[0].equalsIgnoreCase("unbreaking")){
																		player.getItemInHand().addEnchantment(Enchantment.DURABILITY, level);
																		player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your boots.");
																	}else{
																		if(args[0].equalsIgnoreCase("thorns")){
																			player.getItemInHand().addEnchantment(Enchantment.THORNS, level);
																			player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your boots.");
																		}else{
																			player.sendMessage(ChatColor.RED + "That enchantment does not excists for this item.");
																		}
																	}
																}
															}
														}
													}
												}
											}
										}else{
											if(player.getItemInHand().getType().equals(Material.DIAMOND_LEGGINGS) || player.getItemInHand().getType().equals(Material.GOLD_LEGGINGS) || player.getItemInHand().getType().equals(Material.IRON_LEGGINGS) || player.getItemInHand().getType().equals(Material.LEATHER_LEGGINGS) || player.getItemInHand().getType().equals(Material.CHAINMAIL_LEGGINGS)){
												if(args[0].equalsIgnoreCase("fireprotection")){
													player.getItemInHand().addEnchantment(Enchantment.PROTECTION_FIRE, level);
													player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your leggings.");
												}else{
													if(args[0].equalsIgnoreCase("projectileprotection")){
														player.getItemInHand().addEnchantment(Enchantment.PROTECTION_PROJECTILE, level);
														player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your leggings.");
													}else{
														if(args[0].equalsIgnoreCase("blastprotection")){
															player.getItemInHand().addEnchantment(Enchantment.PROTECTION_EXPLOSIONS, level);
															player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your leggings.");
														}else{
															if(args[0].equalsIgnoreCase("protection")){
																player.getItemInHand().addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, level);
																player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your leggings.");
															}else{
																if(args[0].equalsIgnoreCase("unbreaking")){
																	player.getItemInHand().addEnchantment(Enchantment.DURABILITY, level);
																	player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your leggings.");
																}else{
																	if(args[0].equalsIgnoreCase("thorns")){
																		player.getItemInHand().addEnchantment(Enchantment.THORNS, level);
																		player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your leggings.");
																	}else{
																		player.sendMessage(ChatColor.RED + "That enchantment does not excists for this item.");
																	}
																}
															}
														}
													}
												}
											}else{
												if(player.getItemInHand().getType().equals(Material.DIAMOND_CHESTPLATE) || player.getItemInHand().getType().equals(Material.GOLD_CHESTPLATE) || player.getItemInHand().getType().equals(Material.IRON_CHESTPLATE) || player.getItemInHand().getType().equals(Material.LEATHER_CHESTPLATE) || player.getItemInHand().getType().equals(Material.CHAINMAIL_CHESTPLATE)){
													if(args[0].equalsIgnoreCase("fireprotection")){
														player.getItemInHand().addEnchantment(Enchantment.PROTECTION_FIRE, level);
														player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your chestplate.");
													}else{
														if(args[0].equalsIgnoreCase("projectileprotection")){
															player.getItemInHand().addEnchantment(Enchantment.PROTECTION_PROJECTILE, level);
															player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your chestplate.");
														}else{
															if(args[0].equalsIgnoreCase("blastprotection")){
																player.getItemInHand().addEnchantment(Enchantment.PROTECTION_EXPLOSIONS, level);
																player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your chestplate.");
															}else{
																if(args[0].equalsIgnoreCase("protection")){
																	player.getItemInHand().addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, level);
																	player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your chestplate.");
																}else{
																	if(args[0].equalsIgnoreCase("unbreaking")){
																		player.getItemInHand().addEnchantment(Enchantment.DURABILITY, level);
																		player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your chestplate.");
																	}else{
																		if(args[0].equalsIgnoreCase("thorns")){
																			player.getItemInHand().addEnchantment(Enchantment.THORNS, level);
																			player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your chestplate.");
																		}else{
																			player.sendMessage(ChatColor.RED + "That enchantment does not excists for this item.");
																		}
																	}
																}
															}
														}
													}
												}else{
													if(player.getItemInHand().getType().equals(Material.DIAMOND_HELMET) || player.getItemInHand().getType().equals(Material.GOLD_HELMET) || player.getItemInHand().getType().equals(Material.IRON_HELMET) || player.getItemInHand().getType().equals(Material.LEATHER_HELMET) || player.getItemInHand().getType().equals(Material.CHAINMAIL_HELMET)){
														if(args[0].equalsIgnoreCase("fireprotection")){
															player.getItemInHand().addEnchantment(Enchantment.PROTECTION_FIRE, level);
															player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your helmet.");
														}else{
															if(args[0].equalsIgnoreCase("projectileprotection")){
																player.getItemInHand().addEnchantment(Enchantment.PROTECTION_PROJECTILE, level);
																player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your helmet.");
															}else{
																if(args[0].equalsIgnoreCase("blastprotection")){
																	player.getItemInHand().addEnchantment(Enchantment.PROTECTION_EXPLOSIONS, level);
																	player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your helmet.");
																}else{
																	if(args[0].equalsIgnoreCase("protection")){
																		player.getItemInHand().addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, level);
																		player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your helmet.");
																	}else{
																		if(args[0].equalsIgnoreCase("unbreaking")){
																			player.getItemInHand().addEnchantment(Enchantment.DURABILITY, level);
																			player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your helmet.");
																		}else{
																			if(args[0].equalsIgnoreCase("thorns")){
																				player.getItemInHand().addEnchantment(Enchantment.THORNS, level);
																				player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your helmet.");
																			}else{
																				if(args[0].equalsIgnoreCase("respiration")){
																					player.getItemInHand().addEnchantment(Enchantment.OXYGEN, level);
																					player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your helmet.");
																				}else{
																					if(args[0].equalsIgnoreCase("aquaaffinity")){
																						player.getItemInHand().addEnchantment(Enchantment.WATER_WORKER, level);
																						player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your helmet.");
																					}else{
																						player.sendMessage(ChatColor.RED + "That enchantment does not excists for this item.");
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}else{
														if(player.getItemInHand().getType().equals(Material.FISHING_ROD)){
															if(args[0].equalsIgnoreCase("lure")){
																player.getItemInHand().addEnchantment(Enchantment.LURE, level);
																player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your fishing rod.");
															}else{
																if(args[0].equalsIgnoreCase("luckofthesea")){
																	player.getItemInHand().addEnchantment(Enchantment.LUCK, level);
																	player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your fishing rod.");
																}else{
																	if(args[0].equalsIgnoreCase("unbreaking")){
																		player.getItemInHand().addEnchantment(Enchantment.DURABILITY, level);
																		player.sendMessage(ChatColor.GOLD + "You've successfully enchanted your fishing rod.");
																	}else{
																		player.sendMessage(ChatColor.RED + "That enchantment does not excists for this item.");
																	}
																}
															}
														}else{
															player.sendMessage(ChatColor.RED + "It is not possible to enchant that item.");
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}else{
		player.sendMessage(ChatColor.RED + "You don't have access to that command.");
	}
		return false;
	}

}
