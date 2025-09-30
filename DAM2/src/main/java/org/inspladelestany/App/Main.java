package org.inspladelestany.App;

import org.inspladelestany.Controller.ModulController;
import org.inspladelestany.Controller.ProfessorController;
import org.inspladelestany.Dao.ModulProDAO;
import org.inspladelestany.Dao.ModulProDAOImpl;
import org.inspladelestany.Dao.ProfessorDAO;
import org.inspladelestany.Dao.ProfessorDAOImpl;
import org.inspladelestany.Utils.GestorConnexioBD;
import org.inspladelestany.Views.ModulView;
import org.inspladelestany.Views.ProfessorView;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    private static GestorConnexioBD gestorBD = new GestorConnexioBD();
    ProfessorView professorView = new ProfessorView();
    ProfessorDAO professorDAO = new ProfessorDAOImpl();
    ProfessorController profController = new ProfessorController(professorView, professorDAO);

    ModulView modelView = new ModulView();
    ModulProDAO modulDao = new ModulProDAOImpl();
    ModulController modulController = new ModulController(modelView, modulDao);

    public static void main(String[] args) {
    comprobarAccesBD();


    }

    public static void comprobarAccesBD(){
        try {
            // Establecer conexión
            Connection connection = gestorBD.obtenirConnexio();
            System.out.println("Conexión exitosa a MySQL");

            // Cerrar conexión
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
    }
}