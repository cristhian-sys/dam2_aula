package org.inspladelestany.App;

import com.sun.jdi.connect.spi.Connection;
import org.inspladelestany.Utils.GestorConnexioBD;
import java.sql.SQLException;

public class Main {
    public static GestorConnexioBD gestordb = new GestorConnexioBD();

    public static void main(String[] args) {

        try {
            Connection connection = (Connection) gestordb.obtenirConnexio();
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            System.out.println("Error a la connexió de la base de dades!");
        }
    }


}