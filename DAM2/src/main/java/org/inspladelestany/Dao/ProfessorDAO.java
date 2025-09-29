package org.inspladelestany.Dao;

import org.inspladelestany.Models.Professor;

import java.util.List;

public interface ProfessorDAO {
    void afegirProfessor(Professor professor);

    void editarProfessor(Professor professor);

    void deleteDam2(int id);

    void updateDam2(Professor professor);

    List<Professor> readDam2 ();

}
