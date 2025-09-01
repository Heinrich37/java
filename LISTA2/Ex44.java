package LISTA2;

import java.util.Scanner;

public class Ex44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maisVelho = 0;
        double maisAlto = 0, maiorPeso = 0, somaAltura = 0, somaIMC = 0;
        int masc = 0, fem = 0;
        for (int i = 1; i <= 25; i++) {
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Sexo (M/F): ");
            char sexo = sc.next().toUpperCase().charAt(0);
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            System.out.print("Peso: ");
            double peso = sc.nextDouble();

            if (idade > maisVelho) maisVelho = idade;
            if (altura > maisAlto) maisAlto = altura;
            if (peso > maiorPeso) maiorPeso = peso;

            somaAltura += altura;
            somaIMC += peso / (altura*altura);

            if (sexo == 'M') masc++;
            else fem++;
        }
        System.out.println("Mais velho: " + maisVelho);
        System.out.println("Mais alto: " + maisAlto);
        System.out.println("Maior peso: " + maiorPeso);
        System.out.println("Média altura: " + (somaAltura/25));
        System.out.println("Média IMC: " + (somaIMC/25));
        System.out.println("% Masculino: " + (100.0*masc/25));
        System.out.println("% Feminino: " + (100.0*fem/25));
        sc.close();
    }
}

