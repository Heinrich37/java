package LISTA1;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("EMPRÉSTIMOS BANCO ");

        System.out.println("Informe qual o seu salario atual: ");
        Double salario = input.nextDouble();

        System.out.println("Informe o valor do empréstimo desejado: ");
        Double emprestimo = input.nextDouble();

        Double condicao = salario * 0.20;

        if (emprestimo > condicao) {
            System.out.println("Empréstimo não concedido!!!");
        } else {
            System.out.println("Empréstimo concedido");
        }

    }

}
