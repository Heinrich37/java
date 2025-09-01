package LISTA2;

public class Ex28 {
    public static void main(String[] args) {
        double salario = 4000;
        double aumento = 0.015; // 1,5%
        for (int ano = 2020; ano <= 2025; ano++) {
            salario += salario * aumento;
            aumento *= 2; // dobra a cada ano
        }
        System.out.println("Salário atual = " + salario);
    }
}

