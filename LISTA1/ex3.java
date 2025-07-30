package LISTA1;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        double num1 = input.nextDouble();

        System.out.println("Informe um numero: ");
        double num2 = input.nextDouble();

        if (num1 > num2) {
            System.out.println("Numero 1 é maior");
        } else if (num2 > num1) {
            System.out.println("Numero 2 é maior");
        }

    }

}
