import java.util.Scanner;

public class ProgramaEscalera {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la altura de la escalera
        System.out.print("Ingrese la altura de la escalera (x): ");
        double alturaEscalera = scanner.nextDouble();

        // Solicitar al usuario el ángulo de inclinación
        System.out.print("Ingrese el ángulo de inclinación (alpha) en grados: ");
        double anguloInclinacion = scanner.nextDouble();

        // Calcular la longitud de la escalera utilizando la función estática
        double longitudEscalera = CalculadoraEscalera.calcularLongitudEscalera(alturaEscalera, anguloInclinacion);

        // Mostrar el resultado
        System.out.println("La longitud de la escalera es: " + longitudEscalera);
    }
}
