package LISTA2;

import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menor = Integer.MAX_VALUE, maior = Integer.MIN_VALUE;
        while (true) {
            System.out.print("Digite um número (negativo para parar): ");
            int n = sc.nextInt();
            if (n < 0) break;
            if (n < menor) menor = n;
            if (n > maior) maior = n;
        }
        System.out.println("Menor = " + menor);
        System.out.println("Maior = " + maior);
        sc.close();
    }
}

