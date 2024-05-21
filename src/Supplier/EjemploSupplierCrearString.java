package Supplier;

import java.util.function.Supplier;

public class EjemploSupplierCrearString {

    public static void main(String[] args) {
        // Definir Supplier para crear String con mensaje personalizado
        Supplier<String> crearString = () -> {
            String nombre = "Juan Pérez";
            String fecha = "2024-05-21";
            return "Hola " + nombre + ". Hoy es " + fecha;
        };

        // Obtener y mostrar el String creado
        String mensaje = crearString.get();
        System.out.println(mensaje);
    }
}
