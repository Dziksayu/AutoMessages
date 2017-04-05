package pl.mcdev.automessages.tasks;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.scheduler.BukkitTask;

import pl.mcdev.automessages.Main;
import pl.mcdev.automessages.managers.Config;

public class AutoMessagesTask implements Runnable{
	
	private static AutoMessagesTask inst;
	private List<String> autoMessages = Config.AUTOMESSAGES$LIST;
	private int interval = Config.AUTOMESSAGES$RUN$INTERVAL;
	private BukkitTask task;
	private int index;

	public void start(){
		task = Bukkit.getScheduler().runTaskTimerAsynchronously(Main.getInst(), this, 20*interval, 20*interval);
	}
	@Override
	public void run() {
		if(index == autoMessages.size()) index = 0;
		Bukkit.broadcastMessage(colorize(Config.AUTOMESSAGES$PREFIX + autoMessages.get(index)));
		index++;
	}
	public static AutoMessagesTask getInst(){
		if(inst == null) inst = new AutoMessagesTask();
		return inst;
	}
	private String colorize(String s){
		if(s == null) return "wartosc pusta";
		return ChatColor.translateAlternateColorCodes('&', s);
	}
}
