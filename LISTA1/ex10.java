package LISTA1;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um numero inteiro: ");
        int numero = input.nextInt();

        if (numero < 0) {
            System.out.println("Erro, numero digitado tem que ser positivo");
        } else {

            double expoente = Math.pow(numero, 2);
            System.out.println("O numero digitado ao quadrado é: " + expoente);

            double raiz = Math.sqrt(numero);
            System.out.println("A raiz quadrada do numero digitado é: " + raiz);
        }
    }

}
