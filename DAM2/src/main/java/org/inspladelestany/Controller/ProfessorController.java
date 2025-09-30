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

    }
}
