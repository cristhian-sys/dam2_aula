package org.inspladelestany.Dao;

import org.inspladelestany.Models.Professor;

import java.util.List;

public interface ProfessorDAO {
    void addDam2(Professor professor);
    void updateDam2 (Professor professor);
    void deleteDam2(int id);
    List<Professor> readDam2 ();

}
