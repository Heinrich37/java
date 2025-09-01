package LISTA2;

import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite n: ");
        int n = sc.nextInt();
        int soma = 0, count = 0, num = 2;
        while (count < n) {
            boolean primo = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) { primo = false; break; }
            }
            if (primo) {
                soma += num;
                count++;
            }
            num++;
        }
        System.out.println("Soma = " + soma);
        sc.close();
    }
}

