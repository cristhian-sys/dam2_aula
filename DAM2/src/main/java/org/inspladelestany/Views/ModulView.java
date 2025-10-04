package org.inspladelestany.Views;

import org.inspladelestany.Models.ModulProfessional;
import org.inspladelestany.Utils.Menu;
import java.util.List;
import java.util.Scanner;

public class ModulView {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Menu menu = new Menu();

    //Methods
    public Integer menuSecuOpc() {
        menu.menuOpcions();

        int option = -1;
        boolean ok = false;

        scanner.next();
        do {
            System.out.print("Introdueix la opció: ");
            if (scanner.hasNextInt()) {
                option = Integer.parseInt(scanner.nextLine());
                ok = true;

            } else {
                System.out.println("Entrada invàlida. Heu d'introduir un nombre enter.");
                scanner.next();
            }
        } while (!ok);

        return option;
    }

    public ModulProfessional demanarDadesModul(){
        System.out.println("Introdueix el nom del modul: ");
        String nom = scanner.nextLine();

        return new ModulProfessional(nom);
    }

    public int idModul() {
        int option = 0;
        boolean ok = false;

        do {
            System.out.print("Introdueix la ID del Modul Professional que vols eliminar:");
            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                ok = true;

            } else {
                System.out.println("Entrada invàlida. Heu d'introduir un nombre enter.");
                scanner.next(); // descarta la entrada incorrecta
            }
        } while (!ok);

        return option;
    }

    public void mostrarLlistaModul(List<ModulProfessional> modul) {
        System.out.println("\nLlista de Moduls:");
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
