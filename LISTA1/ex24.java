package LISTA1;

import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("MENU:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("Escolha uma opção: ");
        int opcao = input.nextInt();

        System.out.println("Digite o primeiro número: ");
        double n1 = input.nextDouble();

        System.out.println("Digite o segundo número: ");
        double n2 = input.nextDouble();

        if (opcao == 1) {
            System.out.println("Resultado: " + (n1 + n2));
        } else if (opcao == 2) {
            System.out.println("Resultado: " + (n1 - n2));
        } else if (opcao == 3) {
            System.out.println("Resultado: " + (n1 * n2));
        } else if (opcao == 4) {
            if (n2 != 0) {
                System.out.println("Resultado: " + (n1 / n2));
            } else {
                System.out.println("Erro: divisão por zero.");
            }
        } else {
            System.out.println("Opção inválida.");
        }
    }
}