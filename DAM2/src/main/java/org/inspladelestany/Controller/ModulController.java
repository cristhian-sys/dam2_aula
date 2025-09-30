package org.inspladelestany.Controller;

import org.inspladelestany.Dao.ModulProDAO;
import org.inspladelestany.Views.ModulView;

public class ModulController {
    private final ModulView modulView;
    private final ModulProDAO modulController;

    //Constructor
    public ModulController(ModulView modulView, ModulProDAO modulController) {
        this.modulView = modulView;
        this.modulController = modulController;
    }

    //Methods
}

