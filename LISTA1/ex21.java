package LISTA1;

import java.util.Scanner;

public class ex21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um numero inteiro de (1 a 7): ");
        int dia = input.nextInt();

        if (dia == 1){
            System.out.println("Segunda - Feira");
        }else if (dia == 2){
            System.out.println("Terça - Feira");
        }else if (dia == 3){
            System.out.println("Quarta - Feira");
        }else if (dia == 4){
            System.out.println("Quinta - Feira");
        }else if (dia == 5){
            System.out.println("Sexta - Feira");
        }else if (dia == 6){
            System.out.println("Sabado");
        }else if (dia == 7){
            System.out.println("Domingo");
        }



    }

    
    
}
