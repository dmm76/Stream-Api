import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        //Criar uma lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //Usar Consumer com expressão lambda para imprimir nº pares
        Consumer<Integer> imprimirNumerosPares = numero -> {
            if(numero % 2 == 0){
                System.out.println(numero);
            }
        };

        //Usar o Consumer para imprimir numero pare no Stream
        numeros.stream().forEach(imprimirNumerosPares);


    }
}
