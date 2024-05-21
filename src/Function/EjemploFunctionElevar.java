package Function;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EjemploFunctionElevar {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Definir Function para elevar al cuadrado
        Function<Integer, Integer> elevarCuadrado = numero -> numero * numero;

        // Procesar lista con Function para elevar al cuadrado
        List<Integer> cuadrados = numeros.stream()
                .map(elevarCuadrado)
                .collect(Collectors.toList());

        System.out.println("Cuadrados: " + cuadrados);
    }
}
