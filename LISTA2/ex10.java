package LISTA2;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros a serem digitados: ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite o 1º número: ");
        double num = scanner.nextDouble();



        for (int i = 2; i <= quantidade; i++) {
            System.out.print("Digite o " + i + "º número: ");
            num = scanner.nextDouble();



        }




    }
}
