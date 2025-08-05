

import java.util.Scanner;

public class b {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int num = input.nextInt();

        int[] vet = new int[num];

        for (int i = 0; i < num; i++) {

            System.out.printf("Informe o %d° número : ", i + 1);
            int numero = input.nextInt();

            vet[i] = numero;
        }

        // Mostra o vetor na tela
        System.out.println("Vetor preenchido:");
        for (int i = 0; i < num; i++) {
            System.out.print(vet[i] + " ");
        }

    }
}
