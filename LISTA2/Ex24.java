package LISTA2;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0, qtd = 0;
        while (true) {
            System.out.print("Digite uma idade (0 para parar): ");
            int idade = sc.nextInt();
            if (idade == 0) break;
            soma += idade;
            qtd++;
        }
        if (qtd > 0) System.out.println("Média = " + (soma / (double) qtd));
        else System.out.println("Nenhuma idade digitada.");
        sc.close();
    }
}

