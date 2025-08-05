package LISTA1;

import java.util.Scanner;

public class ex23 {
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);

        System.out.println("Informe a base maior (> 0): ");
        double baseMaior = input.nextDouble();

        System.out.println("Informe a base menor (> 0): ");
        double baseMenor = input.nextDouble();

        System.out.println("Informe a altura: ");
        double altura = input.nextDouble();

        if (baseMaior > 0 && baseMenor > 0) {
            double area = ((baseMaior + baseMenor) * altura) / 2;
            System.out.println("A área do trapézio é: " + area);
        } else {
            System.out.println("Erro: as bases devem ser maiores que zero.");
        }


    }

    
}
