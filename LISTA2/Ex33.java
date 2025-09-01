package LISTA2;

import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aprovados = 0;
        for (int i = 1; i <= 10; i++) {
            double soma = 0;
            for (int j = 1; j <= 4; j++) {
                System.out.print("Aluno " + i + " - Nota " + j + ": ");
                soma += sc.nextDouble();
            }
            double media = soma / 4;
            if (media >= 7.0) aprovados++;
        }
        System.out.println("Alunos com média >= 7: " + aprovados);
        sc.close();
    }
}

