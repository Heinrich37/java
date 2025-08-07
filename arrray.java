import java.util.ArrayList;
import java.util.List;

public class arrray {
    public static void main(String[] args){
        List<String> variavel = new ArrayList<>();
        
        variavel.add("Heinrich");
        variavel.add("nana");
        variavel.add("jean");
        variavel.add("cleo");
        variavel.add("mae");
        variavel.add("pai");
        System.out.println(variavel.size());
        variavel.remove(2);
        System.out.println(variavel.size());
        System.out.println(variavel);
        variavel.set(3, "Jean"); //substitui a posiçao pelo texto que colocar 
        System.out.println(variavel);


        String novo_nome = variavel.get(2);// joga o nome de posiçao 2 na variavel novo_nome
        System.out.println(novo_nome);
    }
    
}
