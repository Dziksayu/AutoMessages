package pl.mcdev.automessages;

import org.bukkit.plugin.java.JavaPlugin;

import pl.mcdev.automessages.managers.Config;
import pl.mcdev.automessages.tasks.AutoMessagesTask;

public class Main extends JavaPlugin{
	
	private static Main inst;
	private Config config;
	
	@Override
	public void onLoad(){
		inst = this;
		config = new Config(this);
	}
	@Override
	public void onEnable(){
		AutoMessagesTask.getInst().start();
	}
	@Override
	public void onDisable(){
		inst = null;
	}
	public static Main getInst(){
		return inst;
	}
	public void reloadConfig(){
		config.reloadConfiguration();
	}
}
