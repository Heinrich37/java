package LISTA2;

public class Ex41 {
    public static void main(String[] args) {
        int soma = 0, somaQuadrados = 0;
        for (int i = 1; i <= 100; i++) {
            soma += i;
            somaQuadrados += i * i;
        }
        int quadradoSoma = soma * soma;
        System.out.println("Diferença = " + (quadradoSoma - somaQuadrados));
    }
}

