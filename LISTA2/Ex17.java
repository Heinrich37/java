package LISTA2;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números vai digitar? ");
        int qtd = sc.nextInt();
        int maior = Integer.MIN_VALUE;
        for (int i = 1; i <= qtd; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int n = sc.nextInt();
            if (n > maior) maior = n;
        }
        System.out.println("Maior número = " + maior);
        sc.close();
    }
}

