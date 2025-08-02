package LISTA1;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class ex14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Informe o primeiro numero: ");
        Double nota1 = input.nextDouble();

        System.out.println("Informe o primeiro numero: ");
        Double nota2 = input.nextDouble();

        if ((nota1 >= 0.0 && nota1 <= 10.0) && (nota2 >= 0.0 && nota2 <= 10.0)) {
            System.out.println("Notas validas");
            Double media = (nota1 + nota2) / 2;
            System.out.println("A media é: " + media);
        } else {
            System.out.println("Informe uma nota valida");
        }

    }
}
