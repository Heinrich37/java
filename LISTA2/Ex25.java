package LISTA2;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a base: ");
        int x = sc.nextInt();
        System.out.print("Digite o expoente: ");
        int y = sc.nextInt();
        int resultado = 1;
        for (int i = 0; i < y; i++) resultado *= x;
        System.out.println(x + "^" + y + " = " + resultado);
        sc.close();
    }
}
