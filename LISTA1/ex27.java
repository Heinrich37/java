package LISTA1;

import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha a opção:");
        System.out.println("1 - Soma de 2 números");
        System.out.println("2 - Diferença entre 2 números (maior pelo menor)");
        System.out.println("3 - Produto entre 2 números");
        System.out.println("4 - Divisão entre 2 números (denominador ≠ 0)");
        int opcao = input.nextInt();

        System.out.println("Digite o primeiro número: ");
        double n1 = input.nextDouble();

        System.out.println("Digite o segundo número: ");
        double n2 = input.nextDouble();

        if (opcao == 1) {
            System.out.println("Resultado da soma: " + (n1 + n2));
        } else if (opcao == 2) {
            if (n1 > n2) {
                System.out.println("Diferença: " + (n1 - n2));
            } else {
                System.out.println("Diferença: " + (n2 - n1));
            }
        } else if (opcao == 3) {
            System.out.println("Produto: " + (n1 * n2));
        } else if (opcao == 4) {
            if (n2 != 0) {
                System.out.println("Divisão: " + (n1 / n2));
            } else {
                System.out.println("Erro: divisão por zero.");
            }
        } else {
            System.out.println("Opção inválida.");
        }
    }
}

