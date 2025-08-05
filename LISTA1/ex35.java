package LISTA1;


import java.util.Scanner;

public class ex35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o salário atual: ");
        double salario = input.nextDouble();

        System.out.println("Digite o tempo de serviço (anos): ");
        int tempo = input.nextInt();

        double reajuste = 0;
        double bonus = 0;

        if (salario <= 500) {
            reajuste = salario * 0.25;
        } else if (salario <= 1000) {
            reajuste = salario * 0.20;
        } else if (salario <= 1500) {
            reajuste = salario * 0.15;
        } else if (salario <= 2000) {
            reajuste = salario * 0.10;
        } else {
            reajuste = 0;
        }

        if (tempo < 1) {
            bonus = 0;
        } else if (tempo >= 1 && tempo <= 3) {
            bonus = 100;
        } else if (tempo >= 4 && tempo <= 6) {
            bonus = 200;
        } else if (tempo >= 7 && tempo <= 10) {
            bonus = 300;
        } else {
            bonus = 500;
        }

        if (reajuste == 0 && bonus == 0) {
            System.out.println("O funcionário não tem direito a aumento.");
        } else {
            double salarioFinal = salario + reajuste + bonus;
            System.out.println("Salário reajustado: R$ " + salarioFinal);
        }
    }
}
