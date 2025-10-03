package org.inspladelestany.Controller;

import org.inspladelestany.Dao.ProfessorDAO;
import org.inspladelestany.Views.ProfessorView;

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
            }
        }

    }

    public void altaProfessor (){
        // Datos al professor con Professor view
        //DAO inserta a la base de dades
    }
}
