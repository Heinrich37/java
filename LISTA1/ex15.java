package LISTA1;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe quantas horas trabalhou: ");
        Double horas = input.nextDouble();

        Double valor_sem_desconto = (horas * 40.5);
        if (valor_sem_desconto > 2500) {
            Double valor_com_desconto = valor_sem_desconto - (valor_sem_desconto * 0.11);
            System.out.println("O valor para receber com desconto de 11% é: " + valor_com_desconto);
        } else {
            System.out.println("O salario sem desconto é: " + valor_sem_desconto);
        }
    }

}
