package Predicate;
import java.util.function.Predicate;

public class EjemploPredicateValidarEmail {

    public static void main(String[] args) {
        String[] emails = new String[]{"correo@ejemplo.com", "usuario123@dominio.net", "micorreo@gmail.com", "emailinvalido.com"};

        // Definir Predicate para validar email
        Predicate<String> esEmailValido = email -> {
            String regex = "^[\\w-\\.+]+@[\\w-]+\\.[\\w-]{2,}$";
            return email.matches(regex);
        };

        // Validar emails y mostrar resultados
        for (String email : emails) {
            boolean valido = esEmailValido.test(email);
            System.out.println(email + " - ¿Válido?: " + valido);
        }
    }
}
