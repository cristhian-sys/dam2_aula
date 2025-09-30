package org.inspladelestany.Views;

import org.inspladelestany.Models.Professor;
import org.inspladelestany.Utils.Menu;

import java.util.Scanner;

public class ProfessorView {
    private static final Scanner scanner = new Scanner(System.in);

    //Constructor
    public ProfessorView() {
    }

    //Methods
    public Professor demanarDadesProfessor(){
        System.out.println("Introdueix el teu nom");
        String nom = scanner.nextLine();

        System.out.println("Introdueix el cognom");
        String cognom = scanner.nextLine();

        return new Professor(nom,cognom);
    }

    public void mostrarDetallsProfessor(Professor prof){
        System.out.println("Detalls del Professsor:");
        System.out.println("id: " + prof.getId());
        System.out.println("Nom: " + prof.getNom());
        System.out.println("Cognom: "+ prof.getCognom());
    }
}
