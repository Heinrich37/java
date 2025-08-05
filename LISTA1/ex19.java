package LISTA1;

import java.util.Scanner;

public class ex19 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada das notas
        System.out.println("Digite a nota da primeira prova (peso 2): ");
        double nota1 = input.nextDouble();

        System.out.println("Digite a nota da segunda prova (peso 1): ");
        double nota2 = input.nextDouble();

        System.out.println("Digite a nota da terceira prova (peso 2): ");
        double nota3 = input.nextDouble();

        // Cálculo da média ponderada
        double media = (nota1 * 1 + nota2 * 1 + nota3 * 2) / (1 + 1 + 2);

        // Exibe a média
        System.out.printf("Média final: %.2f%n", media);

        // Verifica aprovação
        if (media >= 60) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado.");
        }

        
    }
}

