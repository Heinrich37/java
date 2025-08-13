package LISTA2;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args){    
    Scanner input = new Scanner(System.in);
    Double soma = 0.0;
    System.out.println("Digite  a quantidade de notas:");
        int notas = input.nextInt();

    int qntPositivos = 0;
    
    for (int i = 1; i <= notas; i++){
            System.out.println("Digite  "+i+"° numero:");
            int valor = input.nextInt();
        
        if (valor > 0){
            soma += valor;
            qntPositivos++;

        }
      }
      if(qntPositivos > 0){
        double media = soma / qntPositivos;
        System.out.println("a soma dos valores positivos é: "+ soma);
        System.out.println("a mèdia dos valores positivos é: "+ media);
      }
  
    }

}
