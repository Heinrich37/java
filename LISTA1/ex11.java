package LISTA1;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // usamos long quando a quantidades de numeros sao muitos grandes
        // e int para quantidades menores

        System.out.println("Informe um numero inteiro: ");
        long numero = input.nextLong();

        if (numero % 2 == 0) {
            System.out.println("O numero é par");

        } else {
            System.out.println("O numero é impar");
        }
    }

}
