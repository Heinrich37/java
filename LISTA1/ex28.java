package LISTA1;

import java.util.Scanner;

public class ex28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        System.out.println("Digite seu tempo de serviço (anos): ");
        int tempo = input.nextInt();

        if (idade >= 65 || tempo >= 30 || (idade >= 60 && tempo >= 25)) {
            System.out.println("Pode se aposentar.");
        } else {
            System.out.println("Não pode se aposentar.");
        }
    }
}
