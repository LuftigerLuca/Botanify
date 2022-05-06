package eu.luftiger.botanify;

import eu.luftiger.botanify.service.configuration.ConfigService;
import eu.luftiger.botanify.service.data.DataSourceProvider;
import eu.luftiger.botanify.service.data.Database;
import eu.luftiger.botanify.service.data.DatabaseSetup;
import org.bukkit.plugin.java.JavaPlugin;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.logging.Logger;

public class Botanify extends JavaPlugin {

    private ConfigService configService;
    private DataSource dataSource;

    @Override
    public void onEnable() {
        Logger logger = getLogger();

        logger.info("enabling the plugin...");
        logger.info("loading services...");

        configService = new ConfigService(this);
        configService.createDefaults("config.yml", true, true);

        try {
            dataSource = DataSourceProvider.initMySQLDataSource(this, Database.getDatabaseFromConfig(this));
            DatabaseSetup.initDatabase(this, dataSource);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onDisable() {
        //TODO: implement
    }

    public ConfigService getConfigService() {
        return configService;
    }

    public DataSource getDataSource() {
        return dataSource;
    }
}
