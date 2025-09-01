package LISTA2;

public class ex11 {
    public static void main(String[] args) {
        int soma = 0;
        int num = 0;
        int count = 0;
        while (count < 50) {
            soma += num;
            num += 2;
            count++;
        }
        System.out.println("Soma = " + soma);
    }
}
