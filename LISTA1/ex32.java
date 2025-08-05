package LISTA1;


import java.util.Scanner;

public class ex32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("CARDÁPIO:");
        System.out.println("100 - Hot Dog           - R$ 12.00");
        System.out.println("101 - X-Salada          - R$ 18.50");
        System.out.println("102 - X-Bacon           - R$ 25.50");
        System.out.println("103 - X-Burguer         - R$ 17.00");
        System.out.println("104 - Suco de Laranja   - R$ 9.50");
        System.out.println("105 - Refrigerante      - R$ 6.00");

        System.out.println("Digite o código do produto: ");
        int codigo = input.nextInt();

        System.out.println("Digite a quantidade: ");
        int qtd = input.nextInt();

        double preco = 0;

        if (codigo == 100) {
            preco = 12.00;
        } else if (codigo == 101) {
            preco = 18.50;
        } else if (codigo == 102) {
            preco = 25.50;
        } else if (codigo == 103) {
            preco = 17.00;
        } else if (codigo == 104) {
            preco = 9.50;
        } else if (codigo == 105) {
            preco = 6.00;
        } else {
            System.out.println("Código inválido.");
            return;
        }

        double total = preco * qtd;
        System.out.println("Total a pagar: R$ " + total);
    }
}

