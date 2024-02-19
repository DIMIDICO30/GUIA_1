import java.util.Scanner;

public class AumentoSueldo {

    // Función para calcular el valor del aumento
    public static double calcularAumento(double sueldoActual) {
        if (sueldoActual <= 800000) {
            return sueldoActual * 0.10;
        } else if (sueldoActual <= 1200000) {
            return sueldoActual * 0.08;
        } else {
            return sueldoActual * 0.05;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el sueldo actual del empleado
        System.out.print("Ingrese el sueldo actual del empleado: $");
        double sueldoActual = scanner.nextDouble();

        // Calcular el valor del aumento usando la función
        double aumento = calcularAumento(sueldoActual);

        // Calcular el nuevo salario sumando el aumento al sueldo actual
        double nuevoSalario = sueldoActual + aumento;

        // Mostrar el resultado
        System.out.println("El aumento es de: $" + aumento);
        System.out.println("El nuevo salario del empleado es: $" + nuevoSalario);
    }
}
