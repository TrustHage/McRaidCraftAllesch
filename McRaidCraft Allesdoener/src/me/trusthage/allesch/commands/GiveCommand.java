package me.trusthage.allesch.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class GiveCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		if(!(sender instanceof Player)) return false;
		
		Player player = (Player)sender;
		
		if(player.hasPermission("mcraidcraft.give"))
		{
			if(args.length == 0 || args.length == 1){
				player.sendMessage(ChatColor.RED + "please type /give <player> <item> (<amount>)");
			}else{
				if(args.length == 2){
					Player target = Bukkit.getServer().getPlayer(args[0]);
					switch (args[1]){
					case "stone":
						target.getInventory().addItem(new ItemStack(Material.STONE, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Stone");
						break;
					case "granite":
						target.getInventory().addItem(new ItemStack(Material.STONE, 1, (short)1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Granite");
						break;
					case "granite_polished":
						target.getInventory().addItem(new ItemStack(Material.STONE,1, (short)2));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Polished Granite");
						break;
					case "diorite":
						target.getInventory().addItem(new ItemStack(Material.STONE, 1, (short)3));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Diorite");
						break;
					case "diorite_polished":
						target.getInventory().addItem(new ItemStack(Material.STONE, 1, (short)4));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Polished Diorite");
						break;
					case "andesite":
						target.getInventory().addItem(new ItemStack(Material.STONE, 1, (short)5));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Andesite");
						break;
					case "andesite_polished":
						target.getInventory().addItem(new ItemStack(Material.STONE, 1, (short)6));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Polished Andesite");
						break;
					case "grass":
						target.getInventory().addItem(new ItemStack(Material.GRASS, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Grass");
						break;
					case "dirt":
						target.getInventory().addItem(new ItemStack(Material.DIRT, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Dirt");
						break;
					case "dirt_coarse":
						target.getInventory().addItem(new ItemStack(Material.DIRT, 1, (short)1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Coarse Dirt");
						break;
					case "dirt_podzol":
						target.getInventory().addItem(new ItemStack(Material.DIRT, 1, (short)2));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Podzol");
						break;
					case "cobblestone":
						target.getInventory().addItem(new ItemStack(Material.COBBLESTONE, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Cobblestone");
						break;
					case "planks":
						target.getInventory().addItem(new ItemStack(Material.WOOD, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Oak wooden planks");
						break;
					case "planks_spruce":
						target.getInventory().addItem(new ItemStack(Material.STONE, 1, (short)1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Spruce wooden planks");
						break;
					case "planks_birch":
						target.getInventory().addItem(new ItemStack(Material.STONE, 1, (short)2));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Birch wooden planks");
						break;
					case "planks_jungle":
						target.getInventory().addItem(new ItemStack(Material.STONE, 1, (short)3));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Jungle wooden planks");
						break;
					case "planks_acacia":
						target.getInventory().addItem(new ItemStack(Material.STONE, 1, (short)4));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Acacia wooden planks");
						break;
					case "planks_darkoak":
						target.getInventory().addItem(new ItemStack(Material.STONE, 1, (short)5));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Dark Oak wooden planks");
						break;
					case "sapling":
						target.getInventory().addItem(new ItemStack(Material.SAPLING, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Oak Sapling");
						break;
					case "sapling_spruce":
						target.getInventory().addItem(new ItemStack(Material.SAPLING, 1, (short)1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Spruce Sapling");
						break;
					case "sapling_birch":
						target.getInventory().addItem(new ItemStack(Material.SAPLING, 1, (short)2));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Birch Sapling");
						break;
					case "sapling_jungle":
						target.getInventory().addItem(new ItemStack(Material.SAPLING, 1, (short)3));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Jungle Sapling");
						break;
					case "sapling_acacia":
						target.getInventory().addItem(new ItemStack(Material.SAPLING, 1, (short)4));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Acacia Sapling");
						break;
					case "sapling_darkoak":
						target.getInventory().addItem(new ItemStack(Material.SAPLING, 1, (short)5));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Dark Oak Sapling");
						break;
					case "bedrock":
						target.getInventory().addItem(new ItemStack(Material.BEDROCK, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Bedrock");
						break;
					case "sand":
						target.getInventory().addItem(new ItemStack(Material.SAND, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Sand");
						break;
					case "sand_red":
						target.getInventory().addItem(new ItemStack(Material.SAND, 1, (short)1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Red Sand");
						break;
					case "gravel":
						target.getInventory().addItem(new ItemStack(Material.GRAVEL, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Gravel");
						break;
					case "goldore":
						target.getInventory().addItem(new ItemStack(Material.GOLD_ORE, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Gold Ore");
						break;
					case "ironore":
						target.getInventory().addItem(new ItemStack(Material.IRON_ORE, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Iron Ore");
						break;
					case "coalore":
						target.getInventory().addItem(new ItemStack(Material.COAL_ORE, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Coal Ore");
						break;
					case "log_oak":
						target.getInventory().addItem(new ItemStack(Material.LOG, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Oak Log");
						break;
					case "log_spruce":
						target.getInventory().addItem(new ItemStack(Material.LOG, 1, (short)1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Spruce Log");
						break;
					case "log_birch":
						target.getInventory().addItem(new ItemStack(Material.LOG, 1, (short)2));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Birch Log");
						break;
					case "log_jungle":
						target.getInventory().addItem(new ItemStack(Material.LOG, 1, (short)3));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Jungle Log");
						break;
					case "leaves_oak":
						target.getInventory().addItem(new ItemStack(Material.LEAVES, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Oak Leaves");
						break;
					case "leaves_spruce":
						target.getInventory().addItem(new ItemStack(Material.LEAVES, 1, (short)1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Spruce Leaves");
						break;
					case "leaves_birch":
						target.getInventory().addItem(new ItemStack(Material.LEAVES, 1, (short)2));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Birch Leaves");
						break;
					case "leaves_jungle":
						target.getInventory().addItem(new ItemStack(Material.LEAVES, 1, (short)3));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Jungle Leaves");
						break;
					case "sponge":
						target.getInventory().addItem(new ItemStack(Material.SPONGE, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Sponge");
						break;
					case "sponge_wet":
						target.getInventory().addItem(new ItemStack(Material.SPONGE, 1, (short)1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Wet Sponge");
						break;
					case "glass":
						target.getInventory().addItem(new ItemStack(Material.GLASS, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Glass");
						break;
					case "lapisore":
						target.getInventory().addItem(new ItemStack(Material.LAPIS_ORE, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Lapis Lazuli Ore");
						break;
					case "lapisblock":
						target.getInventory().addItem(new ItemStack(Material.LAPIS_BLOCK, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Lapis Lazuli Block");
						break;
					case "dispenser":
						target.getInventory().addItem(new ItemStack(Material.DISPENSER, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Dispenser");
						break;
					case "sandstone":
						target.getInventory().addItem(new ItemStack(Material.SANDSTONE, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 SandStone");
						break;
					case "sandstone_chiseled":
						target.getInventory().addItem(new ItemStack(Material.SANDSTONE, 1, (short)1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Chiseled Sandstone");
						break;
					case "sandstone_smooth":
						target.getInventory().addItem(new ItemStack(Material.SANDSTONE, 1, (short)2));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Smooth Sandstone");
						break;
					case "noteblock":
						target.getInventory().addItem(new ItemStack(Material.NOTE_BLOCK, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Note Block");
						break;
					case "bed":
						target.getInventory().addItem(new ItemStack(Material.BED, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Bed");
						break;
					case "rail":
						target.getInventory().addItem(new ItemStack(Material.RAILS, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Rail");
						break;
					case "rail_powered":
						target.getInventory().addItem(new ItemStack(Material.POWERED_RAIL, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Powered Rail");
						break;
					case "rail_detector":
						target.getInventory().addItem(new ItemStack(Material.DETECTOR_RAIL, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Detector Rail");
						break;
					case "piston":
						target.getInventory().addItem(new ItemStack(Material.PISTON_BASE, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Piston");
						break;
					case "piston_sticky":
						target.getInventory().addItem(new ItemStack(Material.PISTON_STICKY_BASE, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Sticky Piston");
						break;
					case "cobweb":
						target.getInventory().addItem(new ItemStack(Material.WEB, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Cobweb");
						break;
					case "deadshrub":
						target.getInventory().addItem(new ItemStack(Material.LONG_GRASS, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Dead Shrub");
						break;
					case "grass_tall":
						target.getInventory().addItem(new ItemStack(Material.LONG_GRASS, 1, (short)1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Grass");
						break;
					case "fern":
						target.getInventory().addItem(new ItemStack(Material.LONG_GRASS, 1, (short)2));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Fern");
						break;
					case "deadbush":
						target.getInventory().addItem(new ItemStack(Material.DEAD_BUSH, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Dead Bush");
						break;
					case "wool":
						target.getInventory().addItem(new ItemStack(Material.WOOL, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Wool");
						break;
					case "wool_orange":
						target.getInventory().addItem(new ItemStack(Material.WOOL, 1, (short)1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Orange Wool");
						break;
					case "wool_magenta":
						target.getInventory().addItem(new ItemStack(Material.WOOL, 1, (short)2));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Magenta Wool");
						break;
					case "wool_lightblue":
						target.getInventory().addItem(new ItemStack(Material.WOOL, 1, (short)3));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Light Blue Wool");
						break;
					case "wool_yellow":
						target.getInventory().addItem(new ItemStack(Material.WOOL, 1, (short)4));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Yellow Wool");
						break;
					case "wool_lime":
						target.getInventory().addItem(new ItemStack(Material.WOOL, 1, (short)5));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Lime Wool");
						break;
					case "wool_pink":
						target.getInventory().addItem(new ItemStack(Material.WOOL, 1, (short)6));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Pink Wool");
						break;
					case "wool_gray":
						target.getInventory().addItem(new ItemStack(Material.WOOL, 1, (short)7));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Gray Wool");
						break;
					case "wool_lightgray":
						target.getInventory().addItem(new ItemStack(Material.WOOL, 1, (short)8));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Light Gray Wool");
						break;
					case "wool_cyan":
						target.getInventory().addItem(new ItemStack(Material.WOOL, 1, (short)9));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Cyan Wool");
						break;
					case "wool_purple":
						target.getInventory().addItem(new ItemStack(Material.WOOL, 1, (short)10));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Purple Wool");
						break;
					case "wool_blue":
						target.getInventory().addItem(new ItemStack(Material.WOOL, 1, (short)11));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Blue Wool");
						break;
					case "wool_brown":
						target.getInventory().addItem(new ItemStack(Material.WOOL, 1, (short)12));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Brown Wool");
						break;
					case "wool_green":
						target.getInventory().addItem(new ItemStack(Material.WOOL, 1, (short)13));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Green Wool");
						break;
					case "wool_red":
						target.getInventory().addItem(new ItemStack(Material.WOOL, 1, (short)14));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Red Wool");
						break;
					case "wool_black":
						target.getInventory().addItem(new ItemStack(Material.WOOL, 1, (short)15));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Orange Wool");
						break;
					case "dandelion":
						target.getInventory().addItem(new ItemStack(Material.YELLOW_FLOWER, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Dandelion");
						break;
					case "poppy":
						target.getInventory().addItem(new ItemStack(Material.RED_ROSE, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Poppy");
						break;
					case "blueorchid":
						target.getInventory().addItem(new ItemStack(Material.RED_ROSE, 1, (short)1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Orchid");
						break;
					case "allium":
						target.getInventory().addItem(new ItemStack(Material.RED_ROSE, 1, (short)2));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Allium");
						break;
					case "azurebluet":
						target.getInventory().addItem(new ItemStack(Material.RED_ROSE, 1, (short)3));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Azure Bluet");
						break;
					case "redtulip":
						target.getInventory().addItem(new ItemStack(Material.RED_ROSE, 1, (short)4));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Red Tulip");
						break;
					case "orangetulip":
						target.getInventory().addItem(new ItemStack(Material.RED_ROSE, 1, (short)5));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Orange Tulip");
						break;
					case "whitetulip":
						target.getInventory().addItem(new ItemStack(Material.RED_ROSE, 1, (short)6));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 White Tulip");
						break;
					case "pinktulip":
						target.getInventory().addItem(new ItemStack(Material.RED_ROSE, 1, (short)7));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Pink Tulip");
						break;
					case "oxeyedaisy":
						target.getInventory().addItem(new ItemStack(Material.RED_ROSE, 1, (short)8));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Oxeye Daisy");
						break;
					case "mushroom_brown":
						target.getInventory().addItem(new ItemStack(Material.BROWN_MUSHROOM, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Brown Mushroom");
						break;
					case "mushroom_red":
						target.getInventory().addItem(new ItemStack(Material.RED_MUSHROOM, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Red Mushroom");
						break;
					case "goldblock":
						target.getInventory().addItem(new ItemStack(Material.GOLD_BLOCK, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Gold Block");
						break;
					case "ironblock":
						target.getInventory().addItem(new ItemStack(Material.IRON_BLOCK, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Iron Block");
						break;
					case "slab_stone":
						target.getInventory().addItem(new ItemStack(Material.STEP, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Stone Slab");
						break;
					case "slab_sandstone":
						target.getInventory().addItem(new ItemStack(Material.STEP, 1, (short)1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Sandstone Slab");
						break;
					case "slab_cobblestone":
						target.getInventory().addItem(new ItemStack(Material.STEP, 1, (short)3));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Cobblestone Slab");
						break;
					case "slab_brick":
						target.getInventory().addItem(new ItemStack(Material.STEP, 1, (short)4));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Brick Slab");
						break;
					case "slab_stonebrick":
						target.getInventory().addItem(new ItemStack(Material.STEP, 1, (short)5));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Stone Brick Slab");
						break;
					case "slab_netherbrick":
						target.getInventory().addItem(new ItemStack(Material.STEP, 1, (short)6));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Nether Brick Slab");
						break;
					case "slab_quartz":
						target.getInventory().addItem(new ItemStack(Material.STEP, 1, (short)7));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1Quartz Slab");
						break;
					case "slab_oak":
						target.getInventory().addItem(new ItemStack(Material.WOOD_STEP, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Oak Slab");
						break;
					case "slab_spruce":
						target.getInventory().addItem(new ItemStack(Material.WOOD_STEP, 1, (short)1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Spruce Slab");
						break;
					case "slab_birch":
						target.getInventory().addItem(new ItemStack(Material.WOOD_STEP, 1, (short)2));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Birch Slab");
						break;
					case "slab_jungle":
						target.getInventory().addItem(new ItemStack(Material.WOOD_STEP, 1, (short)3));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Jungle Slab");
						break;
					case "slab_acacia":
						target.getInventory().addItem(new ItemStack(Material.WOOD_STEP, 1, (short)4));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Acacia Slab");
						break;
					case "slab_darkoak":
						target.getInventory().addItem(new ItemStack(Material.WOOD_STEP, 1, (short)5));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Dark Oak Slab");
						break;
					case "bricks":
						target.getInventory().addItem(new ItemStack(Material.BRICK, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Brick");
						break;
					case "tnt":
						target.getInventory().addItem(new ItemStack(Material.TNT, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 TNT");
						break;
					case "bookshelf":
						target.getInventory().addItem(new ItemStack(Material.BOOKSHELF, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Bookshelf");
						break;
					case "moss_stone":
						target.getInventory().addItem(new ItemStack(Material.MOSSY_COBBLESTONE, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Moss Stone");
						break;
					case "obsidian":
						target.getInventory().addItem(new ItemStack(Material.OBSIDIAN, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Obsidian");
						break;
					case "torches":
						target.getInventory().addItem(new ItemStack(Material.TORCH, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Torch");
						break;
					case "mobspawner":
						target.getInventory().addItem(new ItemStack(Material.MOB_SPAWNER, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Pig Spawner");
						break;
					case "stairs_oak":
						target.getInventory().addItem(new ItemStack(Material.WOOD_STAIRS, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Oak Wood Stairs");
						break;
					case "stairs_birch":
						target.getInventory().addItem(new ItemStack(Material.BIRCH_WOOD_STAIRS, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Birch Wood Stairs");
						break;
					case "stairs_darkoak":
						target.getInventory().addItem(new ItemStack(Material.DARK_OAK_STAIRS, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Dark Oak Wood Stairs");
						break;
					case "stairs_jungle":
						target.getInventory().addItem(new ItemStack(Material.JUNGLE_WOOD_STAIRS, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Jungle Wood Stairs");
						break;
					case "stairs_acacia":
						target.getInventory().addItem(new ItemStack(Material.ACACIA_STAIRS, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Acacia Wood Stairs");
						break;
					case "stairs_spruce":
						target.getInventory().addItem(new ItemStack(Material.SPRUCE_WOOD_STAIRS, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Spruce Wood Stairs");
						break;
					case "chest":
						target.getInventory().addItem(new ItemStack(Material.CHEST, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Chest");
						break;
					case "diamondore":
						target.getInventory().addItem(new ItemStack(Material.DIAMOND_ORE, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Diamond Ore");
						break;
					case "diamondblock":
						target.getInventory().addItem(new ItemStack(Material.DIAMOND_BLOCK, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Diamond Block");
						break;
					case "craftingtable":
						target.getInventory().addItem(new ItemStack(Material.WORKBENCH, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Crafting Table");
						break;
					case "wheat":
						target.getInventory().addItem(new ItemStack(Material.WHEAT, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Wheat");
						break;
					case "furnace":
						target.getInventory().addItem(new ItemStack(Material.FURNACE, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Furnace");
						break;
					case "sign":
						target.getInventory().addItem(new ItemStack(Material.SIGN, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Sign");
						break;
					case "Ladder":
						target.getInventory().addItem(new ItemStack(Material.LADDER, 1));
						player.sendMessage(ChatColor.GOLD + "You gave " + ChatColor.RED + args[0] + " 1 Ladder");
						break;
					default:
						player.sendMessage(ChatColor.RED + "please type /give <playername> <item> (<amount>), type /idlist for the item id list");
						break;
					}
						
			
				}
			}
		}else{
			player.sendMessage(ChatColor.RED + "You don't have access to that command");
		}
		
		return false;
	}

}
