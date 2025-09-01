package LISTA2;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();
        int soma = 0, mult = 1;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) soma += i;
            else mult *= i;
        }
        System.out.println("Soma dos pares: " + soma);
        System.out.println("Multiplicação dos ímpares: " + mult);
        sc.close();
    }
}
