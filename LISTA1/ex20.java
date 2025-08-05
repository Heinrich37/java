package LISTA1;

import java.util.Scanner;

public class ex20 {
            public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada das notas
        System.out.println("Digite a nota de laboratorio (peso 2): ");
        double nota1 = input.nextDouble();

        System.out.println("Digite a nota da avaliação semestral (peso 3): ");
        double nota2 = input.nextDouble();

        System.out.println("Digite a nota do exame final (peso 5): ");
        double nota3 = input.nextDouble();

        // Cálculo da média ponderada
        double media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / (2 + 3 + 5);

        // Exibe a média
        System.out.printf("Média final: %.2f%n", media);

        // Verifica aprovação
        if (media >= 0  && media < 2.9) {
            System.out.println("Aluno reprovado!");
        }else if (media >= 3.0 && media < 5.9){
            System.out.println("Esta de recuperação.");
        }else if (media >= 6.0 && media < 10.0){
            System.out.println("Aprovado!!");

        }

        
    }
}
