package org.inspladelestany.Views;

import org.inspladelestany.Models.Professor;
import org.inspladelestany.Utils.Menu;
import java.util.List;
import java.util.Scanner;

public class ProfessorView {
    private static final Scanner scanner = new Scanner(System.in);
    private static  Menu menu;

    //Methods
    public Integer menuSecuOpc() {
        menu.menuOpcions();
        System.out.println("Elige una opc: ");
        int opc = Integer.parseInt(scanner.nextLine());

        return opc;
    }

    public Professor demanarDadesProfessor() {
        System.out.println("Introdueix el nom: ");
        String nom = scanner.nextLine();

        System.out.println("Introdueix el cognom: ");
        String cognom = scanner.nextLine();

        return new Professor(nom, cognom);
    }

    public void mostrarLlistaProfessors(List<Professor> professors) {
        System.out.println("Lista de Profesores:");
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
