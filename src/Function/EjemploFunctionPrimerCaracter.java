package Function;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EjemploFunctionPrimerCaracter {

    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("Hola", "Mundo", "Java");

        // Definir Function para obtener primer carácter
        Function<String, Character> primerCaracter = palabra -> palabra.charAt(0);

        // Procesar lista con Function para obtener primer carácter
        List<Character> primerosCaracteres = palabras.stream()
                .map(primerCaracter)
                .collect(Collectors.toList());

        System.out.println("Primeros caracteres: " + primerosCaracteres);
    }
}
