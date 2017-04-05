package pl.mcdev.automessages.managers;

import java.util.Arrays;
import java.util.List;

import org.bukkit.plugin.java.JavaPlugin;

public class Config extends ConfigManager{
	
	public static List<String> AUTOMESSAGES$LIST;
	
	public static String AUTOMESSAGES$PREFIX;
	
	public static int AUTOMESSAGES$RUN$INTERVAL;
	public static boolean AUTOMESSAGES$STATUS;
	
	static{
		AUTOMESSAGES$LIST = Arrays.asList("&7Automatyczna wiadomosc do skonfigurowania numer &31", "&7Automatyczna wiadomosc do skonfigurowania numer &32", "&7Automatyczna wiadomosc do skonfigurowania numer &33");
		AUTOMESSAGES$RUN$INTERVAL = 30;
		AUTOMESSAGES$PREFIX = "&2[IziHace] ";
		AUTOMESSAGES$STATUS = true;
	}
	public Config(JavaPlugin plugin) {
        super(plugin, "config.yml", "ustawienia.");
	}
	public void reload(){
		super.reloadConfiguration();
	}
}
