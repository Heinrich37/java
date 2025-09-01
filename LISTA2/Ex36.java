package LISTA2;

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor inicial: ");
        int a = sc.nextInt();
        System.out.print("Digite o valor final: ");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("Intervalo inválido");
            return;
        }
        int soma = 0;
        for (int i = a; i <= b; i++) if (i % 2 != 0) soma += i;
        System.out.println("Soma dos ímpares: " + soma);
        sc.close();
    }
}
