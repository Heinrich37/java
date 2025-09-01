
import java.util.Scanner;

public class carro {    
        private int portas;
        private String placa;

        public String getPlaca(){
            return placa;
        }
        public int getPortas(){
            return portas;
        }
        public void setPlaca(String placa){
            this.placa = placa;
        }
        public void setPortas(int portas){
            this.portas = portas;
        }
public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    carro car1 = new carro();
    carro car2 = new carro();



    System.out.println("Digite a quantidade de portas: ");
    car1.placa = input.next();
    System.out.println("Digite a placa do carro: ");
    car1.placa = input.next();
    System.out.println(car1.placa);

    System.out.println("Digite a quantidade de portas: ");
    car2.placa = input.next();
    System.out.println("Digite a placa do carro: ");
    car2.placa = input.next();
    System.out.println(car2.placa);

   }
}
  