package LISTA1;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um numero inteiro: ");
        int numero1 = input.nextInt();

        if (numero1 > 10) {
            System.out.println("O numero é maior que 10 ");
        } else {
            System.out.println("O numero é menor que 10");
        }

    }
}
