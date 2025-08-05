package LISTA1;

import java.util.Scanner;

public class ex33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o preço antigo do produto: ");
        double precoAntigo = input.nextDouble();
        double novoPreco = 0;

        if (precoAntigo <= 50) {
            novoPreco = precoAntigo * 1.05;
        } else if (precoAntigo <= 100) {
            novoPreco = precoAntigo * 1.10;
        } else {
            novoPreco = precoAntigo * 1.15;
        }

        System.out.println("Preço novo: R$ " + novoPreco);
    }
}
