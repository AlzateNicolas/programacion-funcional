package BiConsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class EjemploBiConsumerCombinar {

    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Juan", "María", "Pedro");
        List<String> apellidos = Arrays.asList("Pérez", "Gómez", "López");

        // Definir BiConsumer para combinar nombre y apellido
        BiConsumer<String, String> combinar = (nombre, apellido) -> {
            System.out.println(nombre + " " + apellido);
        };

        // Procesar listas con BiConsumer para combinar
        nombres.forEach(nombre -> apellidos.forEach(apellido -> combinar.accept(nombre, apellido)));
    }
}
