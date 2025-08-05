package LISTA1;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Informe sua altura: ");
        Double h = input.nextDouble();
        input.nextLine(); //tive que colocar esse nextline para poder consumir
        // a quebra de linha que sobrou no buffer

        System.out.print("Informe o sexo\nMaculino / Feminino: ");
        String sexo = input.nextLine();

        if (sexo.equalsIgnoreCase("masculino")){
            Double peso_idealm = (72.7*h)-58;
            System.out.println("O seu peso ideal é: "+peso_idealm);
        }else if (sexo.equalsIgnoreCase("feminino")){
            Double peso_idealf = (62.1*h)-44.7;
            System.out.println("O seu peso ideal é: "+peso_idealf);
        }


    }
    
}
