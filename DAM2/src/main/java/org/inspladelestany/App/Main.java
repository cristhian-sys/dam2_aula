package org.inspladelestany.App;

import com.sun.jdi.connect.spi.Connection;
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

import java.sql.SQLException;

public class Main {
    public static GestorConnexioBD gestordb = new GestorConnexioBD();
    ProfessorView professorView = new ProfessorView();
    ProfessorDAO professorDAO = new ProfessorDAOImpl();
    ProfessorController profController = new ProfessorController(professorView,professorDAO);

    ModulView modulView = new ModulView();
    ModulProDAO modulProDAO = new ModulProDAOImpl();
    ModulController modulController = new ModulController(modulView,modulProDAO);



    public static void main(String[] args) {

    //    try {
    //        Connection connection = (Connection) gestordb.obtenirConnexio();
    //    } catch (SQLException e) {
    //        //throw new RuntimeException(e);
    //        System.out.println("Error a la connexió de la base de dades!");
    //    }




    }


}