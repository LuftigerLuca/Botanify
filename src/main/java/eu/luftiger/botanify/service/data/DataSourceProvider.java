package eu.luftiger.botanify.service.data;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;
import com.mysql.cj.jdbc.MysqlDataSource;
import eu.luftiger.botanify.Botanify;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class DataSourceProvider {

    public static DataSource initMySQLDataSource(Botanify plugin, Database database) throws SQLException {

        MysqlDataSource dataSource = new MysqlConnectionPoolDataSource();
        dataSource.setUrl("jdbc:mysql://" +  database.user() +":" + database.password() + "@" + database.host() + ":" + database.port() + "/" + database.database());

        testDataSource(plugin, dataSource);
        return dataSource;
    }

    private static void testDataSource(Botanify plugin, DataSource dataSource) throws SQLException {
        try (Connection connection = dataSource.getConnection()) {
            if (!connection.isValid(1000)) {
                throw new SQLException("Could not establish database connection.");
            }
        }
        if (plugin != null) {
            plugin.getLogger().info("database connection established!");
        }
    }
}
