package org.inspladelestany.Controller;

import org.inspladelestany.Dao.ProfessorDAO;
import org.inspladelestany.Models.Professor;
import org.inspladelestany.Views.ProfessorView;

import java.util.ArrayList;
import java.util.List;

public class ProfessorController {
    private final ProfessorView professorView;
    private final ProfessorDAO professorDAO;

    //constructor
    public ProfessorController(ProfessorView professorView, ProfessorDAO professorDAO) {
        this.professorView = professorView;
        this.professorDAO = professorDAO;
    }

    //Methods
    public void mostrarMenuProfessor(){
        
        int option = professorView.menuSecuOpc();

        boolean ok = false;
        do {
            switch (option){
                case 1:
                    altaProfessor();
                    ok = true;
                    break;
                case 2:
                    llistarProfessor();
                    ok = true;
                    break;
                case 3:
                    editarProfessor();
                    ok = true;
                    break;
                case 4:
                    eliminarProfessor();
                    ok = true;
                    break;

                default:
                    System.out.println("Opció no valida!");
                    break;
            }
        }while (!ok);

    }

    private void llistarProfessor() {
        List<Professor> professors = professorDAO.readDam2();
        professorView.mostrarLlistaProfessors(professors);
    }

    private void editarProfessor() {
        Professor p = professorView.demanarDadesProfessor();
        
        professorDAO.updateDam2(p);
        System.out.printf("Professor %s s'ha actualitzat!", p.getNom());
    }
}
