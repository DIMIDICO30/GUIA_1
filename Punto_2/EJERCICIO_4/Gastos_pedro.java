import java.util.Scanner;

public class GastosPedro {

    // Función para calcular el gasto en arriendo (40% del sueldo)
    public static double calcularGastoArriendo(double sueldo) {
        return sueldo * 0.40;
    }

    // Función para calcular el gasto en comida (15% del sueldo)
    public static double calcularGastoComida(double sueldo) {
        return sueldo * 0.15;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el sueldo de Pedro
        System.out.print("Ingrese el sueldo de Pedro: ");
        double sueldo = scanner.nextDouble();

        // Calcular el gasto en arriendo usando la función
        double gastoArriendo = calcularGastoArriendo(sueldo);

        // Calcular el gasto en comida usando la función
        double gastoComida = calcularGastoComida(sueldo);

        // Calcular el dinero restante después del arriendo y la comida
        double dineroRestante = sueldo - gastoArriendo - gastoComida;

        // Mostrar los resultados
        System.out.println("Gasto en arriendo: " + gastoArriendo);
        System.out.println("Gasto en comida: " + gastoComida);
        System.out.println("Dinero restante: " + dineroRestante);
    }
}
