package LISTA2;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] v = new char[10];
        String consoantes = "";
        int qtd = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite uma letra: ");
            v[i] = sc.next().toLowerCase().charAt(0);
            if ("aeiou".indexOf(v[i]) == -1) {
                consoantes += v[i] + " ";
                qtd++;
            }
        }
        System.out.println("Consoantes: " + consoantes);
        System.out.println("Quantidade = " + qtd);
        sc.close();
    }
}

