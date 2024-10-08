import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //Usar a funcao com expressao lambda para dobrar todos os numeros
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        //Usar a funcao para dobrar todos os numero no Stream e armazena-lois em outra lista
        List<Integer> numerosDobrados = numeros.stream()
        .map(dobrar)
        .collect(Collectors.toList());

        //imprimir a lista de numeros dobrados
        numerosDobrados.forEach(System.out::println);
    }
}
