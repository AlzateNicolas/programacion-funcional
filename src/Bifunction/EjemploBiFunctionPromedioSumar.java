package Bifunction;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class EjemploBiFunctionPromedioSumar {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 4, 9, 2, 5);

        // Definir BiFunction para calcular promedio y sumar uno
        BiFunction<Integer, Integer, Double> calcularPromedioSumar = (numero1, numero2) -> {
            double promedio = (numero1 + numero2) / 2.0;
            return promedio + 1;
        };

        // Procesar lista con BiFunction para calcular promedio y sumar uno
        List<Double> promediosSumados = numeros.stream()
                .map(numero -> numeros.stream()
                        .map(otroNumero -> calcularPromedioSumar.apply(numero, otroNumero))
                        .collect(Collectors.toList()))
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println("Promedios con uno sumado: " + promediosSumados);
    }
}

