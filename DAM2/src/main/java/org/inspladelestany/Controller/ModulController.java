package org.inspladelestany.Controller;

import org.inspladelestany.Dao.ModulProDAO;
import org.inspladelestany.Views.ModulView;

public class ModulController {
    private final ModulView modulView;
    private final ModulProDAO modulDAO;

    //Constructor
    public ModulController(ModulView modulView, ModulProDAO modulDAO) {
        this.modulView = modulView;
        this.modulDAO = modulDAO;
    }

    //Methods
    public void mostrarMenuProfessor(){

        int option = modulView.menuSecuOpc();

        boolean ok = false;
        do {
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

                default:
                    System.out.println("Opció no valida!");
                    break;
            }
        }while (!ok);

    }

    private void eliminarModul() {
    }

    private void editarModul() {
    }

    private void llistarModul() {
    }

    private void altaModul() {
    }
}

