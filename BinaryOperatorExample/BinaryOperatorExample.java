import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
     public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;
        BinaryOperator<Integer> multiplicar = (num1, num2) -> num1 * num2;

        int resultadoS = numeros.stream()
        .reduce(0, somar);
        
        int resultadoM = numeros.stream()       
        .reduce(1, multiplicar);

        System.out.println("A soma dos numeros é: " + resultadoS);
        System.out.println("A multiplicação dos numeros é: " + resultadoM);
     }
}
