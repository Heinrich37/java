package LISTA2;
import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite N (par): ");
        int N = sc.nextInt();
        for (int i = 0; i <= N; i += 2) {
            System.out.print(i + " ");
        }
    }
}
