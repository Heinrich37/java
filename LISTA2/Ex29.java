package LISTA2;

import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            nums[i] = sc.nextInt();
            soma += nums[i];
        }
        System.out.println("Soma = " + soma);
        System.out.println("Números digitados:");
        for (int n : nums) System.out.println(n);
        sc.close();
    }
}

