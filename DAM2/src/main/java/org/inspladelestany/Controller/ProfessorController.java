package org.inspladelestany.Controller;

import org.inspladelestany.Dao.ProfessorDAO;
import org.inspladelestany.Models.Professor;
import org.inspladelestany.Views.ProfessorView;

import java.util.Scanner;

public class ProfessorController {
    private final ProfessorView professorView;
    private final ProfessorDAO professorDAO;

    //constructor
    public ProfessorController(ProfessorView professorView, ProfessorDAO professorDAO) {
        this.professorView = professorView;
        this.professorDAO = professorDAO;
    }

    //Methods
    public void menu(){
        
        int option = professorView.menuSecuOpc();

        do {
            switch (option){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;

                default:
                    System.out.println("Opció no valida!");
                    break;
            }
        }

    }

    public void altaProfessor (){
        // Datos al professor con Professor view
       Professor prof = professorView.demanarDadesProfessor();
        //DAO inserta a la base de dades
        professorDAO.addDam2(prof);
        System.out.println("se a añadido correctamente");
    }
    public void delateProfessor(){
        Integer prof = professorView.demanaId();
        professorDAO.deleteDam2(prof);
        System.out.println("Se a eliminado correctamente");
    }

}
