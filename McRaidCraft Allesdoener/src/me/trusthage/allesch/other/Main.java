package me.trusthage.allesch.other;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.trusthage.allesch.commands.BanCommand;
import me.trusthage.allesch.commands.ChangePasswordCommand;
import me.trusthage.allesch.commands.ClearInvCommand;
import me.trusthage.allesch.commands.DelHomeCommand;
import me.trusthage.allesch.commands.EnchantCommand;
import me.trusthage.allesch.commands.EnderChestCommand;
import me.trusthage.allesch.commands.FeedCommand;
import me.trusthage.allesch.commands.FirstJoinMessageCommand;
import me.trusthage.allesch.commands.FlyCommand;
import me.trusthage.allesch.commands.FuryCommand;
import me.trusthage.allesch.commands.GMCommand;
import me.trusthage.allesch.commands.GiveCommand;
import me.trusthage.allesch.commands.GodCommand;
import me.trusthage.allesch.commands.HealCommand;
import me.trusthage.allesch.commands.HomeCommand;
import me.trusthage.allesch.commands.InfoCommand;
import me.trusthage.allesch.commands.InvisibleCommand;
import me.trusthage.allesch.commands.JoinMessageCommand;
import me.trusthage.allesch.commands.KickCommand;
import me.trusthage.allesch.commands.LoginCommand;
import me.trusthage.allesch.commands.MSGCommand;
import me.trusthage.allesch.commands.MSGReplyCommand;
import me.trusthage.allesch.commands.MuteCommand;
import me.trusthage.allesch.commands.NickCommand;
import me.trusthage.allesch.commands.OpenInvCommand;
import me.trusthage.allesch.commands.RageCommand;
import me.trusthage.allesch.commands.RegenCommand;
import me.trusthage.allesch.commands.RegisterCommand;
import me.trusthage.allesch.commands.SetHomeCommand;
import me.trusthage.allesch.commands.ShoutCommand;
import me.trusthage.allesch.commands.TNTCommand;
import me.trusthage.allesch.commands.TeleportCommand;
import me.trusthage.allesch.commands.TimeCommand;
import me.trusthage.allesch.commands.TpAcceptCommand;
import me.trusthage.allesch.commands.TpDenyCommand;
import me.trusthage.allesch.commands.TpaCommand;
import me.trusthage.allesch.commands.UnBanCommand;
import me.trusthage.allesch.commands.UnMuteCommand;

public class Main extends JavaPlugin
{
	
	public File homesFile = new File(getDataFolder()+"/data/homes.yml");
	public File loginFile = new File(getDataFolder()+"/data/playerlogins.yml");
	public File joinMessageFile = new File(getDataFolder()+"/data/joinmessage.yml");
	public FileConfiguration homes = YamlConfiguration.loadConfiguration(homesFile);
	public FileConfiguration logins = YamlConfiguration.loadConfiguration(loginFile);
	public FileConfiguration jmessage = YamlConfiguration.loadConfiguration(joinMessageFile);
	
	public static List<String> mute = new ArrayList<String>();
	public static Main plugin;
	public List<String> loaded = getConfig().getStringList("Muted");
	public List<String> loadedloggedin = getConfig().getStringList("Loggedin Players");
	public static Map<String, String> login = new HashMap<String, String>();
	public static List<String> loggedinplayers = new ArrayList<String>();
	
	
	public Logger logger = Logger.getLogger("Minecraft");
	public PluginDescriptionFile pdfFile = getDescription();

	
	
	public void onEnable()
	{	
		loadFiles();
		getConfig().getStringList("Muted");
		plugin = this;
		getConfig().options().copyDefaults(true);
		saveDefaultConfig();
		logger.info("McRaidCraft Allesch has been enabled!");
		getCommand("tnt").setExecutor(new TNTCommand());
		getCommand("jm").setExecutor(new JoinMessageCommand());
		getCommand("fjm").setExecutor(new FirstJoinMessageCommand());
		getCommand("rage").setExecutor(new RageCommand());
		getCommand("regen").setExecutor(new RegenCommand());
		getCommand("fury").setExecutor(new FuryCommand());
		getCommand("mcraidcraft").setExecutor(new InfoCommand());
		getCommand("openinv").setExecutor(new OpenInvCommand());
		getCommand("clearinv").setExecutor(new ClearInvCommand());
		getCommand("ci").setExecutor(new ClearInvCommand());
		getCommand("fly").setExecutor(new FlyCommand());
		getCommand("nickname").setExecutor(new NickCommand());
		getCommand("nick").setExecutor(new NickCommand());
		getCommand("gm").setExecutor(new GMCommand());
		getCommand("gamemode").setExecutor(new GMCommand());
		getCommand("time").setExecutor(new TimeCommand());
		getCommand("kick").setExecutor(new KickCommand());
		getCommand("ban").setExecutor(new BanCommand());
		getCommand("unban").setExecutor(new UnBanCommand());
		getCommand("give").setExecutor(new GiveCommand());
		getCommand("god").setExecutor(new GodCommand());
		getCommand("msg").setExecutor(new MSGCommand());
		getCommand("r").setExecutor(new MSGReplyCommand());
		getCommand("feed").setExecutor(new FeedCommand());
		getCommand("mute").setExecutor(new MuteCommand());
		getCommand("unmute").setExecutor(new UnMuteCommand());
		getCommand("tp").setExecutor(new TeleportCommand());
		getCommand("tpa").setExecutor(new TpaCommand());
		getCommand("tpaccept").setExecutor(new TpAcceptCommand());
		getCommand("tpdeny").setExecutor(new TpDenyCommand());
		getCommand("register").setExecutor(new RegisterCommand());
		getCommand("login").setExecutor(new LoginCommand());
		getCommand("changepass").setExecutor(new ChangePasswordCommand());
		getCommand("enderchest").setExecutor(new EnderChestCommand());
		getCommand("echest").setExecutor(new EnderChestCommand());
		getCommand("heal").setExecutor(new HealCommand());
		getCommand("shout").setExecutor(new ShoutCommand());
		getCommand("sethome").setExecutor(new SetHomeCommand());
		getCommand("delhome").setExecutor(new DelHomeCommand());
		getCommand("home").setExecutor(new HomeCommand());
		getCommand("enchant").setExecutor(new EnchantCommand());
		getCommand("invis").setExecutor(new InvisibleCommand());
		PluginManager pm = Bukkit.getServer().getPluginManager();
		//pm.registerEvents(new LoginListener(), this);
		pm.registerEvents(new GodListener(), this);
		pm.registerEvents(new ChatListener(), this);
		pm.registerEvents(new JoinListener(), this);
	}
	
	public void onDisable()
	{	
		saveFiles();
		getConfig().set("Player Logins", login);
		getConfig().set("Muted", mute);
		saveDefaultConfig();
		logger.info("McRaidCraft Allesch has been disabled!");
	}
	
	public void saveFiles(){
		try{
			logins.save(loginFile);
			homes.save(homesFile);
			jmessage.save(joinMessageFile);
		}catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public void loadFiles(){
		if(homesFile.exists()){
			try{
				homes.load(homesFile);
				logger.info("homes.yml has been loaded.");
			}catch (IOException | InvalidConfigurationException e){
				e.printStackTrace();
			}
		}else{
			try{
				homes.save(homesFile);
				logger.info("homes.yml has been created, path: /data/homes.yml");
			}catch (IOException e){
				e.printStackTrace();
			}
		}
		
		if(!loginFile.exists()){
			try{
				logins.save(loginFile);
				logger.info("playerlogins.yml has been created, path: /data/playerlogins.yml");
			}catch (IOException e){
				e.printStackTrace();
			}
		}else{
			try{
				logins.load(loginFile);
				logger.info("playerlogins.yml has been loaded.");
			}catch (IOException | InvalidConfigurationException e){
				e.printStackTrace();
			}
		}
		if(joinMessageFile.exists()){
			try{
				jmessage.load(joinMessageFile);
				logger.info("joinmessage.yml has been loaded.");
			}catch (IOException | InvalidConfigurationException e){
				e.printStackTrace();
			}
		}else{
			try{
				jmessage.save(joinMessageFile);
				logger.info("joinmessage.yml has been created, path: /data/joinmessage.yml");
			}catch (IOException e){
				e.printStackTrace();
			}
		}
	}
}	
