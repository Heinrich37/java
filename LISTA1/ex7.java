package LISTA1;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor pago no produto: ");
        double valor_bruto = input.nextDouble();

        if (valor_bruto <= 50) {
            double valor_venda45 = valor_bruto + valor_bruto * 0.45;
            System.out.println("O valor de venda é: " + valor_venda45);
        } else if (valor_bruto > 50) {
            double valor_venda30 = valor_bruto + valor_bruto * 0.30;
            System.out.println("O valor de venda é: " + valor_venda30);

        }

    }
}
