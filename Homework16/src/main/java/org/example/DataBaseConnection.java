package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    private static final String url = "jdbc:postgresql://localhost:5432/employee";
    private static final String user = "postgres";
    private static final String password = "admin";

    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        return DriverManager.getConnection(url, user, password);
    }

    public static void closeConnection(Connection connection) throws SQLException {
        connection.close();
    }
}
