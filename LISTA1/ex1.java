package LISTA1;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro numero inteiro: ");
        int num1 = input.nextInt();

        System.out.println("Informe o segundo numero inteiro: ");
        int num2 = input.nextInt();

        System.out.println("Informe um numero real: ");
        double num3 = input.nextDouble();

        double result1 = num1 + (num2 / 2);

        double result2 = num3 + (num1 * 3);

        double result3 = Math.pow(num3, 3); // no java nao tem como usar ** para expoente, entao usamos Match.pow(base ,
                                            // expoente)

        System.out.println("O resultado de (produto do primeiro com a metade do segundo) é: " + result1);
        System.out.println("O resuldado de (soma do triplo do primeiro com o terceiro) é: " + result2);
        System.out.println("O resultado de (terceiro número ao cubo) é: " + result3);
    }

}
