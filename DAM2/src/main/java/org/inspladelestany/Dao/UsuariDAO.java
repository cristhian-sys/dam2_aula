package org.inspladelestany.Dao;

import org.inspladelestany.Models.Usuari;

import java.util.List;

public interface UsuariDAO {
    void afegirUsuari(Usuari usuari);
    void editarUsuari(Usuari usuari);
    void eliminarUsuari(Usuari usuari);
    List<Usuari> llistarUsuaris();

}
