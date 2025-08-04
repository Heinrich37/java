package LISTA1;

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um numero :");
        int numero = input.nextInt();

        if (numero <= 0) {
            System.out.println("Numero invalido!!!");
        } else {
            int soma = 0;
            int temp = numero;

            while (temp > 0) {
                soma += temp % 10;
                temp = temp / 10;
            }

            System.out.println("A soma dos algarismos é: " + soma);
        }

    }
}
