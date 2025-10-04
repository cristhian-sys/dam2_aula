package org.inspladelestany.App;

import org.inspladelestany.Controller.ModulController;
import org.inspladelestany.Controller.ProfessorController;
import org.inspladelestany.Dao.ModulProDAO;
import org.inspladelestany.Dao.ModulProDAOImpl;
import org.inspladelestany.Dao.ProfessorDAO;
import org.inspladelestany.Dao.ProfessorDAOImpl;
import org.inspladelestany.Utils.GestorConnexioBD;
import org.inspladelestany.Utils.Menu;
import org.inspladelestany.Views.ModulView;
import org.inspladelestany.Views.ProfessorView;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    private static final GestorConnexioBD gestorBD = new GestorConnexioBD();
    private static final Menu menu = new Menu();

    private static final ProfessorView professorView = new ProfessorView();
    private static final ProfessorDAO professorDAO = new ProfessorDAOImpl();
    private static final ProfessorController profController = new ProfessorController(professorView, professorDAO);

    private static final ModulView modelView = new ModulView();
    private static final ModulProDAO modulDao = new ModulProDAOImpl();
    private static final ModulController modulController = new ModulController(modelView, modulDao);

    public static void main(String[] args) {
        comprobarAccesBD();

        int option;
        do {
            option = askOptionMenu();

            switch (option){
                case 1:
                    profController.mostrarMenuProfessor();
                    break;

                case 2:
                    System.out.println("Menu Modul");
                    break;

                case 0:
                    System.out.println("Adeu!");
                    break;

                default:
                    System.out.println("Opció no valida!");
                    break;
            }

        } while (!(option == 0));

    }

    /**Comprovar la conexió a la Base de Dades
     *
     */
    public static void comprobarAccesBD(){
        try {
            // Establecer conexión
            Connection connection = gestorBD.obtenirConnexio();
            System.out.println("Conexión exitosa a Base de Dades!");

            // Cerrar conexión
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
    }

    private static Integer askOptionMenu(){
        Scanner scanner = new Scanner(System.in);
        menu.menuPrincipal();

        System.out.print("Introdueix la opció: ");
        int opc = Integer.parseInt(scanner.nextLine());

        return opc;

    }
}