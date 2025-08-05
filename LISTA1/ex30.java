package LISTA1;


import java.util.Scanner;

public class ex30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a distância percorrida (Km): ");
        double km = input.nextDouble();

        System.out.println("Digite a quantidade de litros consumidos: ");
        double litros = input.nextDouble();

        double consumo = km / litros;
        System.out.println("Consumo: " + consumo + " Km/l");

        if (consumo < 8) {
            System.out.println("Venda o carro!");
        } else if (consumo <= 14) {
            System.out.println("Econômico!");
        } else {
            System.out.println("Super econômico!");
        }
    }
}
