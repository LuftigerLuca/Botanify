package eu.luftiger.botanify.service.data;

import eu.luftiger.botanify.Botanify;
import org.bukkit.configuration.file.YamlConfiguration;

public record Database(String host, int port, String database, String user, String password) {

    public static Database getDatabaseFromConfig(Botanify plugin){
        YamlConfiguration config = plugin.getConfigService().getConfig();

        return new Database(
                config.getString("database.host"),
                config.getInt("database.port"),
                config.getString("database.database"),
                config.getString("database.user"),
                config.getString("database.password")
        );
    }
}
