package LISTA1;

import java.util.Scanner;

public class ex26 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor do lado A: ");
        double a = input.nextDouble();

        System.out.println("Digite o valor do lado B: ");
        double b = input.nextDouble();

        System.out.println("Digite o valor do lado C: ");
        double c = input.nextDouble();

        // Verifica se os lados podem formar um triângulo
        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Os valores formam um triângulo.");

            // Verifica o tipo de triângulo
            if (a == b && b == c) {
                System.out.println("Tipo: Triângulo Equilátero.");
            } else if (a == b || a == c || b == c) {
                System.out.println("Tipo: Triângulo Isósceles.");
            } else {
                System.out.println("Tipo: Triângulo Escaleno.");
            }

        } else {
            System.out.println("Os valores não formam um triângulo.");
        }
    }
}



