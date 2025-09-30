package org.inspladelestany.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GestorConnexioBD {

    //Canviar para base de datos personal
    private static final String URL = "jdbc:mysql://localhost:3306/dam2";
    private static final String USER = "root";
    private static final String PASSWORD = "190283Cn";
    private static Connection CONNECTION = null;

    public Connection obtenirConnexio() throws SQLException {
        if (CONNECTION == null || CONNECTION.isClosed()) {
            CONNECTION = DriverManager.getConnection(URL, USER, PASSWORD);
        }
        return CONNECTION;
    }
}
