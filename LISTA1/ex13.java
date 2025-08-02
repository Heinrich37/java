package LISTA1;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o primeiro numero inteiro: ");
        int n1 = input.nextInt();

        System.out.println("Informe o primeiro numero inteiro: ");
        int n2 = input.nextInt();

        if (n1 > n2) {
            System.out.println("O numero " + n1 + " é maior");

        } else if (n2 > n1) {
            System.out.println("O numero " + n2 + " é maior");

        } else {
            System.out.println("Os numeros sao iguais");
        }
    }

}
