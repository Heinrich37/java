package LISTA2;

import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("1-Adição, 2-Subtração, 3-Multiplicação, 4-Divisão, 5-Sair");
            opcao = sc.nextInt();
            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite A: ");
                double a = sc.nextDouble();
                System.out.print("Digite B: ");
                double b = sc.nextDouble();
                switch (opcao) {
                    case 1: System.out.println("Resultado = " + (a + b)); break;
                    case 2: System.out.println("Resultado = " + (a - b)); break;
                    case 3: System.out.println("Resultado = " + (a * b)); break;
                    case 4: System.out.println("Resultado = " + (a / b)); break;
                }
            }
        } while (opcao != 5);
        sc.close();
    }
}

