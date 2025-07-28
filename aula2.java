public class aula2 {
    public static void main(String[] args) {
        int x, y, z; // Aqui eu declarei 3 variaveis na mesma linha
        x = 10;
        y = 50;
        z = x * y;

        System.out.print("O resultado de " + x + " x " + y + " é: " + z);
        if (x > y) {
            System.out.println("x é menor que y");

        } else {
            System.out.println("Voce errou!!");
        }
    }
}
