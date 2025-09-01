package LISTA2;

import java.util.Scanner;

public class Ex42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] votos = new int[7];
        while (true) {
            System.out.print("Digite voto (1-4 candidatos, 5 nulo, 6 branco, 0 fim): ");
            int v = sc.nextInt();
            if (v == 0) break;
            if (v >= 1 && v <= 6) votos[v]++;
        }
        for (int i = 1; i <= 4; i++) System.out.println("Candidato " + i + ": " + votos[i]);
        System.out.println("Nulos: " + votos[5]);
        System.out.println("Brancos: " + votos[6]);
        int total = votos[1]+votos[2]+votos[3]+votos[4]+votos[5]+votos[6];
        System.out.println("% Nulos = " + (100.0*votos[5]/total));
        System.out.println("% Brancos = " + (100.0*votos[6]/total));
        sc.close();
    }
}
