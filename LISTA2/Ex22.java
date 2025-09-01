package LISTA2;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        int soma = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) soma += i;
        System.out.println("Soma dos divisores = " + soma);
        sc.close();
    }
}

