package org.inspladelestany.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GestorConnexioBD {
    private static final String URL = "jdbc:mysql://localhost:3306/baseDades";
    private static final String USUARI = "usuari";
    private static final String CONTRASENYA = "contrasenya";

    public Connection obtenirConnexio() throws SQLException {
        return DriverManager.getConnection(URL, USUARI, CONTRASENYA);
    }
}
