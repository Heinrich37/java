package LISTA2;

import java.util.Scanner;

public class Ex43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do atleta: ");
        String nome = sc.nextLine();
        double[] notas = new double[7];
        double soma = 0, min = 11, max = -1;
        for (int i = 0; i < 7; i++) {
            System.out.print("Nota " + (i+1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
            if (notas[i] < min) min = notas[i];
            if (notas[i] > max) max = notas[i];
        }
        double media = (soma - min - max) / 5;
        System.out.println("Atleta: " + nome);
        System.out.println("Melhor nota: " + max);
        System.out.println("Pior nota: " + min);
        System.out.println("Média: " + media);
        sc.close();
    }
}

