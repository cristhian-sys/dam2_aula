package org.inspladelestany.Views;

import org.inspladelestany.Models.ModulProfessional;
import org.inspladelestany.Models.Professor;

import java.util.Scanner;

public class ModulView {
    private static final Scanner scanner = new Scanner(System.in);

    //Methods
    public ModulProfessional demanarDadesModul(){
        System.out.println("Introdueix el nom del modul: ");
        String nom = scanner.nextLine();

        return new ModulProfessional(nom);
    }

    public void mostrarDetallsModul(ModulProfessional modul){
        System.out.println("Detalls Modul Professional:");
        System.out.println("Id: " + modul.getId());
        System.out.println("Nom: " + modul.getNom());
    }
}
