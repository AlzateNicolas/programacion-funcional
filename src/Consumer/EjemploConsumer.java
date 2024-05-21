package Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class EjemploConsumer {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 5, 3, 7, 2);

        // Se define un Consumer para calcular la suma
        Consumer<Integer> sumar = numero -> {
            System.out.print(numero + " ");
        };

        // Se utiliza el Consumer para sumar los números
        numeros.forEach(sumar);

        // Se define otro Consumer para calcular el promedio
        Consumer<Integer> calcularPromedio = acumulador -> {
            contador++;
            sumaTotal += acumulador;
        };

        // Se utiliza el Consumer para calcular el promedio
        numeros.forEach(calcularPromedio);

        // Se calcula el promedio final
        double promedio = (double) sumaTotal / contador;

        System.out.println("\nPromedio: " + promedio);
    }

    private static int contador = 0;
    private static int sumaTotal = 0;
}
