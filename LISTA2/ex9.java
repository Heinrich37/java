package LISTA2;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        double num = scanner.nextDouble();

        double menor = num;
        double maior = num;

        for (int i = 2; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            num = scanner.nextDouble();

            if (num < menor) {
                menor = num;
            }
            if (num > maior) {
                maior = num;
            }
        }
    System.out.println("O menor numero é:"+menor);
    System.out.println("O maior numero é:"+maior);
    System.out.println("");
    }

}

