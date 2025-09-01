package LISTA2;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0, qtd = 0;
        while (true) {
            System.out.print("Digite uma nota (0 a 10, outro valor para parar): ");
            int nota = sc.nextInt();
            if (nota < 0 || nota > 10) break;
            soma += nota;
            qtd++;
        }
        if (qtd > 0) System.out.println("Média = " + (soma / (double) qtd));
        else System.out.println("Nenhuma nota válida digitada.");
        sc.close();
    }
}
