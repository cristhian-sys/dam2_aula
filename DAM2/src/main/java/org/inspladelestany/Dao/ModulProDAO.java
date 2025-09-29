package org.inspladelestany.Dao;

import org.inspladelestany.Models.ModulProfessional;

import java.util.List;

public interface ModulProDAO {
    void addDam2(ModulProfessional modul);
    void deleteDam2(Integer id);
    void updateDam2(ModulProfessional modul);
    List<ModulProfessional> readDam2 ();
}
