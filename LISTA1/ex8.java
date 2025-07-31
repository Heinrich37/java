package LISTA1;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        double numero = input.nextDouble();

        if (numero < 0) {
            System.out.println("Numero invalido");
        } else {
            double raiz = Math.sqrt(numero);
            System.out.println("A raiz quadrada de " + numero + " é: " + raiz);
        }

    }

}
