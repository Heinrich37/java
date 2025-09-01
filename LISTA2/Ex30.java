package LISTA2;

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            v[i] = sc.nextInt();
        }
        System.out.print("Digite um valor para procurar: ");
        int x = sc.nextInt();
        boolean achou = false;
        for (int n : v) if (n == x) achou = true;
        System.out.println(achou ? "Está no vetor." : "Não está no vetor.");
        sc.close();
    }
}
