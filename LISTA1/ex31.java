package LISTA1;

import java.util.Scanner;

public class ex31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a idade do nadador: ");
        int idade = input.nextInt();

        if (idade >= 5 && idade <= 12) {
            System.out.println("Categoria: Infantil");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Categoria: Juvenil");
        } else if (idade >= 18) {
            System.out.println("Categoria: Sênior");
        } else {
            System.out.println("Idade fora das categorias.");
        }
    }
}
