package eu.luftiger.botanify.service.configuration;

import eu.luftiger.luftigerlib.configuration.spigot.SpigotConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class MessageService extends SpigotConfiguration {

    public MessageService(JavaPlugin plugin) {
        super(plugin);
    }

    public String getPrefix(){
        return getConverted("messages.prefix");
    }

    public String getMessage(String path, boolean withPrefix){
        if(withPrefix) return getPrefix() + " " + getConverted(path);
        return getConverted(path);
    }
}
