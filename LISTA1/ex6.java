package LISTA1;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("M - Matutino\nV - Verpertino\nN - Noturno");

        System.out.print("Informe o turno em que estuda: ");
        String turno = input.nextLine();

        if (turno.equalsIgnoreCase("M")) {
            System.out.println("Bom Dia!!!");
        } else if (turno.equalsIgnoreCase("V")) {
            System.out.println("Boa Tarde!!!");
        } else if (turno.equalsIgnoreCase("N")) {
            System.out.println("Boa Noite!!!");
        } else {
            System.out.println("Opção invalida");
        }

    }

}
