package Consumer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjemploAceptarEntradaUsuario {

    public static void main(String[] args) throws IOException {
        // Crear BufferedReader para leer la entrada del usuario
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        // Aceptar entrada del usuario
        System.out.print("Ingrese su nombre: ");
        String nombre = lector.readLine();

        // Mostrar el nombre ingresado
        System.out.println("¡Hola " + nombre + "!");

        // Cerrar BufferedReader
        lector.close();
    }
}
