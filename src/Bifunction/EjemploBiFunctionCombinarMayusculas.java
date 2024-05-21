package Bifunction;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class EjemploBiFunctionCombinarMayusculas {

    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Juan", "María", "Pedro");
        List<String> apellidos = Arrays.asList("Pérez", "Gómez", "López");

        // Definir BiFunction para combinar, separar y convertir a mayúsculas
        BiFunction<String, String, String> combinarMayusculas = (nombre, apellido) -> {
            String nombreCompleto = nombre + " " + apellido;
            return nombreCompleto.toUpperCase();
        };

        // Procesar listas con BiFunction para combinar y convertir a mayúsculas
        List<String> nombresCompletosMayusculas = nombres.stream()
                .map(nombre -> apellidos.stream()
                        .map(apellido -> combinarMayusculas.apply(nombre, apellido))
                        .collect(Collectors.toList()))
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println("Nombres completos en mayúsculas: " + nombresCompletosMayusculas);
    }
}
