package LISTA2;

import java.util.Scanner;

public class ex7 {
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int soma = 0;

        for (int i = 1; i <= 10; i++){
            System.out.println("Digite o "+i+"° numero:");
            int valor = input.nextInt();
            soma += valor;


        }
    Double media;
    media = soma/10.0;  
    System.out.println("A soma dos valores é: "+media);

    }
    
}
