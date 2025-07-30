package LISTA1;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe F ou M: ");
        String sexo = input.nextLine();

        if (sexo.equalsIgnoreCase("F")) {
            System.out.println("F = Feminino");
        } else if (sexo.equalsIgnoreCase("M")) {
            System.out.println("M = Masculino");
        } else {
            System.out.println("Sexo invalido");
        }

    }

}
