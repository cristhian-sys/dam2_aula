package org.inspladelestany.Controller;

import org.inspladelestany.Dao.ModulProDAO;
import org.inspladelestany.Models.ModulProfessional;
import org.inspladelestany.Views.ModulView;
import java.util.List;

public class ModulController {
    private final ModulView modulView;
    private final ModulProDAO modulDAO;

    //Constructor
    public ModulController(ModulView modulView, ModulProDAO modulDAO) {
        this.modulView = modulView;
        this.modulDAO = modulDAO;
    }

    //Methods
    public void mostrarMenuModul(){

        boolean ok = false;

        do {
            int option = modulView.menuSecuOpc();

            switch (option){
                case 1:
                    altaModul();
                    ok = true;
                    break;
                case 2:
                    llistarModul();
                    ok = true;
                    break;
                case 3:
                    editarModul();
                    ok = true;
                    break;
                case 4:
                    eliminarModul();
                    ok = true;
                    break;
                case 0:
                    return;

                default:
                    System.out.println("Opció no valida!");
                    break;
            }
        }while (!ok);

    }

    private void altaModul() {
        ModulProfessional m = modulView.demanarDadesModul();

        modulDAO.addDam2(m);
    }

    private void llistarModul() {
        List<ModulProfessional> moduls = modulDAO.readDam2();
        modulView.mostrarLlistaModul(moduls);
    }

    private void editarModul() {
        ModulProfessional m = modulView.demanarDadesModul();
        modulDAO.updateDam2(m);
    }

    private void eliminarModul() {
        int idModul = modulView.idModul();
        modulDAO.deleteDam2(idModul);

    }
}

