package LISTA2;

import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0, pares = 0;
        while (true) {
            System.out.print("Digite um número (0 para parar): ");
            int n = sc.nextInt();
            if (n == 0) break;
            count++;
            if (n % 2 == 0) pares++;
        }
        System.out.println("Total lidos: " + count);
        System.out.println("Total pares: " + pares);
        sc.close();
    }
}

