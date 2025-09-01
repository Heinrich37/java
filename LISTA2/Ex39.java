package LISTA2;

import java.util.Scanner;
import java.util.Random; //números aleatórios.

public class Ex39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random(); //números aleatórios.
        int alvo = rand.nextInt(100) + 1;
        int tentativas = 0, chute;
        do {
            System.out.print("Tente adivinhar (1 a 100): ");
            chute = sc.nextInt();
            tentativas++;
            if (chute < alvo) System.out.println("Maior!");
            else if (chute > alvo) System.out.println("Menor!");
        } while (chute != alvo);
        System.out.println("Acertou em " + tentativas + " tentativas!");
        sc.close();
    }
}

