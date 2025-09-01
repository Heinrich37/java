package LISTA2;

import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Digite R1 (0 para sair): ");
            double R1 = sc.nextDouble();
            if (R1 == 0) break;
            System.out.print("Digite R2: ");
            double R2 = sc.nextDouble();
            if (R2 == 0) break;
            double Req = (R1 * R2) / (R1 + R2);
            System.out.println("Resistência equivalente = " + Req);
        }
        sc.close();
    }
}

