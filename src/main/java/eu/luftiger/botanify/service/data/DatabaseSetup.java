package eu.luftiger.botanify.service.data;

import eu.luftiger.botanify.Botanify;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseSetup {

    public static void initDatabase(Botanify plugin, DataSource dataSource) throws SQLException {
        String setup = null;

        try (InputStream in = DatabaseSetup.class.getClassLoader().getResourceAsStream("setup.sql")){
            if (in != null) {
                setup = new String(in.readAllBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(setup == null) return;

        String[] queries = setup.split(";");
        try (Connection connection = dataSource.getConnection()){
            connection.setAutoCommit(false);

            for (String query : queries) {
                if(query.isBlank()) continue;
                try (PreparedStatement statement = connection.prepareStatement(query)){
                    statement.execute();
                }
            }
            connection.commit();
        }

        plugin.getLogger().info("database setup complete!");
    }
}
