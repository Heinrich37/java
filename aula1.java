
import java.util.Scanner;

// PRINTAR INTEIROS %d
// PRINTAR STRING %S
// PRINTAR DOUBLE %f
public class aula1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Olá, " + nome);
        sc.close();
    }
}
