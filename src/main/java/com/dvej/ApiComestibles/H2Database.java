package com.dvej.ApiComestibles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class H2Database {

    private Connection conn;

    public void createDatabase() throws SQLException {
        conn = DriverManager.getConnection("jdbc:h2:mem:test");
        // Aquí puedes crear tablas y realizar otras operaciones en la base de datos
    }

    public Connection getConnection() {
        return conn;
    }

    public void closeConnection() throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }
}
