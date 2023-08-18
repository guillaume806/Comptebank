package org.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Databasemanager {
    private static final String URI = "jdbc:postgresql://localhost:5432/exercice2JDBC";
    private static final String USER = "postgres";
    private static final String PASSWORD = "Superadmin";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URI,USER,PASSWORD);
    }

}
