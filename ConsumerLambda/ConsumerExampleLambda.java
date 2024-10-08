package ConsumerLambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExampleLambda {
    public static void main(String[] args) {
        //Criar uma lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

       //Usar o Consumer para imprimir numero pare no Stream
        numeros.stream().forEach(n -> {
            if(n % 2 == 0){
                System.out.println(n);
            }
        });
    }
}