package org.inspladelestany.App;

import org.inspladelestany.Utils.GestorConnexioBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    private static GestorConnexioBD gestorBD = new GestorConnexioBD();

    public static void main(String[] args) {

        try {
            // Establecer conexión
            Connection connection = gestorBD.obtenirConnexio();
            System.out.println("✅ Conexión exitosa a MySQL");

            // Cerrar conexión
            connection.close();
        } catch (SQLException e) {
            System.out.println("❌ Error al conectar: " + e.getMessage());
        }

    }
}