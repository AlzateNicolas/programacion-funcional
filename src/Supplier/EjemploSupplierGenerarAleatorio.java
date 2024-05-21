package Supplier;

import java.util.Random;
import java.util.function.Supplier;

public class EjemploSupplierGenerarAleatorio {

    public static void main(String[] args) {
        // Definir Supplier para generar número aleatorio
        Supplier<Integer> generarAleatorio = () -> new Random().nextInt(100) + 1;

        // Generar y mostrar 10 números aleatorios
        for (int i = 0; i < 10; i++) {
            int numeroAleatorio = generarAleatorio.get();
            System.out.println("Número aleatorio: " + numeroAleatorio);
        }
    }
}
