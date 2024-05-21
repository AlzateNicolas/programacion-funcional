package Predicate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EjemploPredicateFiltrarParesImpares {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Definir Predicate para números pares
        Predicate<Integer> esPar = numero -> numero % 2 == 0;

        // Definir Predicate para números impares
        Predicate<Integer> esImpar = numero -> !esPar.test(numero); // Inverso de esPar

        // Filtrar pares e impares
        List<Integer> pares = numeros.stream().filter(esPar).collect(Collectors.toList());
        List<Integer> impares = numeros.stream().filter(esImpar).collect(Collectors.toList());

        System.out.println("Números pares: " + pares);
        System.out.println("Números impares: " + impares);
    }
}
