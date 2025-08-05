package LISTA1;

import java.util.Scanner;

public class ex29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double valor = input.nextDouble();

        System.out.println("Digite o estado de destino (MG, SP, RJ, MS): ");
        String estado = input.next().toUpperCase();

        double imposto = 0;

        if (estado.equals("MG")) {
            imposto = 0.07;
        } else if (estado.equals("SP")) {
            imposto = 0.12;
        } else if (estado.equals("RJ")) {
            imposto = 0.15;
        } else if (estado.equals("MS")) {
            imposto = 0.08;
        } else {
            System.out.println("Estado inválido.");
            return;
        }

        double precoFinal = valor + (valor * imposto);
        System.out.println("Preço final com imposto: " + precoFinal);
    }
}
