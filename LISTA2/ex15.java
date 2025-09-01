package LISTA2;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite N (ímpar): ");
        int N = sc.nextInt();
        for (int i = 1; i <= N; i += 2) {
            System.out.print(i + " ");

        }

    }
}
