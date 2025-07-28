import java.util.Scanner;

public class CNH {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Passou no teste?? ");
        String teste = scan.nextLine();

        if (teste.equalsIgnoreCase("SIM")) { // para fazer comparaçao nao é igual o python, tem que usar o equals
            System.out.println("Ok");
        } else {
            System.out.println("Nao passou");
        }
    }
}
