package org.inspladelestany.Utils;

import java.util.Scanner;

public class Menu {

    //Constructor
    public Menu() {}

    public void menuopcions(Scanner scanner, int opc) {
        System.out.println("============MENU==============");
        System.out.println("1- ALTA");
        System.out.println("2- LlISTA");
        System.out.println("3- Actualizar");
        System.out.println("4- Eliminar");
        System.out.println("==============================");
        System.out.println("Elige una opc: ");
        opc = Integer.parseInt(scanner.nextLine());
    }
}
