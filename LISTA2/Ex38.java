package LISTA2;

import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Digite um número (<=0 para sair): ");
            int n = sc.nextInt();
            if (n <= 0) break;
            System.out.println("Quadrado = " + (n * n));
            System.out.println("Cubo = " + (n * n * n));
            System.out.println("Raiz = " + Math.sqrt(n));
        }
        sc.close();
    }
}
