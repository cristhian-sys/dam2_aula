package org.inspladelestany.Dao;

import org.inspladelestany.Models.Professor;
import org.inspladelestany.Models.Usuari;

import java.util.List;

public interface UsuariDAO {
    void afegirProfessor(Professor professor);
    void editarProfessor(Professor professor);
    void deleteDam2(int id);
    void updateDam2(Professor professor);
    List<Professor> readDam2 ();

}
