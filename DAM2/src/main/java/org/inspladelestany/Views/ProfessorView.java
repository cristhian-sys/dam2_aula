package org.inspladelestany.Views;

import org.inspladelestany.Models.Professor;
import org.inspladelestany.Utils.Menu;
import java.util.List;
import java.util.Scanner;

public class ProfessorView {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Menu menu = new Menu();

    //Methods
    public Integer menuSecuOpc() {
        menu.menuOpcions();

        int option = 0;
        boolean ok = false;

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

    public Professor demanarDadesProfessor() {

        System.out.print("Introdueix el nom: ");
        String nom = scanner.nextLine();

        System.out.print("Introdueix el cognom: ");
        String cognom = scanner.nextLine();

        return new Professor(nom, cognom);
    }

    public int idProfessor() {
        int option = 0;
        boolean ok = false;

        do {
            System.out.print("Introdueix la ID del Professor que vols eliminar:");
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

    public void mostrarLlistaProfessors(List<Professor> professors) {
        System.out.println("Llista de Professors:");
        for (Professor p : professors) {
            System.out.println(p.toString());
        }
    }

    public void mostrarDetallsProfessor(Professor prof) {
        System.out.println("Detalls del Professsor:");
        System.out.println("Id: " + prof.getId());
        System.out.println("Nom: " + prof.getNom());
        System.out.println("Cognom: " + prof.getCognom());
    }
}
