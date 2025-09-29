package org.inspladelestany.Controller;


import org.inspladelestany.Dao.ProfessorDAO;
import org.inspladelestany.Views.ProfessorView;

public class ProfessorController {
    private ProfessorView professorView;
    private ProfessorDAO professorDAO;

    public ProfessorController(ProfessorView professorView, ProfessorDAO professorDAO) {
        this.professorView = professorView;
        this.professorDAO = professorDAO;
    }
}
