package LISTA2;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número entre 100 e 9999: ");
        String num = sc.next();
        for (int i = 0; i < num.length(); i++) {
            System.out.println(num.charAt(i));
        }
        sc.close();
    }
}
