package eu.luftiger.botanify.service.configuration;

import eu.luftiger.luftigerlib.configuration.spigot.SpigotConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class ConfigService extends SpigotConfiguration {

    public ConfigService(JavaPlugin plugin) {
        super(plugin);
    }
}
