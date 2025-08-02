package LISTA1;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro numero inteiro: ");
        int n1 = input.nextInt();

        System.out.println("Informe o segundo numero inteiro: ");
        int n2 = input.nextInt();

        System.out.println("N1 = " + n1 + "\nN2 = " + n2);

        int n3 = n1;
        n1 = n2;
        n2 = n3;
        System.out.println("\n");
        System.out.println("Troca de lados ");
        System.out.println("N1 = " + n1 + "\nN2 = " + n2);

    }
}
