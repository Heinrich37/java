package LISTA2;

import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[20];
        String pares = "", impares = "";
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            v[i] = sc.nextInt();
            if (v[i] % 2 == 0) pares += v[i] + " ";
            else impares += v[i] + " ";
        }
        System.out.println("Todos:");
        for (int n : v) System.out.print(n + " ");
        System.out.println("\nPares: " + pares);
        System.out.println("Ímpares: " + impares);
        sc.close();
    }
}

