package BiConsumer;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class EjemploBiConsumerDistancia {

    public static void main(String[] args) {
        List<Punto> puntos = Arrays.asList(new Punto(1, 2), new Punto(4, 5), new Punto(3, 6));

        // Definir BiConsumer para calcular distancia
        BiConsumer<Punto, Punto> calcularDistancia = (punto1, punto2) -> {
            double distancia = Math.sqrt(Math.pow(punto1.getX() - punto2.getX(), 2) + Math.pow(punto1.getY() - punto2.getY(), 2));
            System.out.println("Distancia entre " + punto1 + " y " + punto2 + ": " + distancia);
        };

        // Procesar lista con BiConsumer para calcular distancias
        puntos.forEach(punto -> puntos.forEach(otroPunto -> calcularDistancia.accept(punto, otroPunto)));
    }
}

class Punto {
    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
