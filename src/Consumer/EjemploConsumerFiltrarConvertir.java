package Consumer;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class EjemploConsumerFiltrarConvertir {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 5, 3, 7, 2);

        // Definir Consumer para filtrar números pares
        Consumer<Integer> filtrarPares = numero -> {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
                convertirABinario(numero);
            }
        };

        // Procesar lista con Consumer para filtrar y convertir
        numeros.forEach(filtrarPares);
    }

    private static void convertirABinario(int numero) {
        System.out.print(" (Binario: " + Integer.toBinaryString(numero) + ") ");
    }
}
