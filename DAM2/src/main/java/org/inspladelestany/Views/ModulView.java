package org.inspladelestany.Views;

import org.inspladelestany.Models.ModulProfessional;
import org.inspladelestany.Models.Professor;
import org.inspladelestany.Utils.Menu;

import java.util.List;
import java.util.Scanner;

public class ModulView {
    private static final Scanner scanner = new Scanner(System.in);
    private static  Menu menu;

    //Methods
    public Integer menuSecuOpc() {
        menu.menuOpcions();
        System.out.println("Elige una opc: ");
        int option = Integer.parseInt(scanner.nextLine());

        return option;
    }
    public ModulProfessional demanarDadesModul(){
        System.out.println("Introdueix el nom del modul: ");
        String nom = scanner.nextLine();

        return new ModulProfessional(nom);
    }

    public int idModul() {
        System.out.print("Introdueix la ID del Modul Professional que vols eliminar:");
        int option = Integer.parseInt(scanner.nextLine());

        return option;
    }

    public void mostrarLlistaModul(List<ModulProfessional> modul) {
        System.out.println("Lista de Profesores:");
        for (ModulProfessional m : modul) {
            System.out.println(m.toString());
        }
    }

    public void mostrarDetallsModul(ModulProfessional modul){
        System.out.println("Detalls Modul Professional:");
        System.out.println("Id: " + modul.getId());
        System.out.println("Nom: " + modul.getNom());
    }
}
