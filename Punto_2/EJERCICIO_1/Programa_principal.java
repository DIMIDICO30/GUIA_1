import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario los valores de x y y
        System.out.print("Ingrese el valor de x: ");
        double x = scanner.nextDouble();

        System.out.print("Ingrese el valor de y: ");
        double y = scanner.nextDouble();

        // Calcular el valor de la función utilizando la función estática de FuncionAlgebraica
        double resultado = FuncionAlgebraica.calcularResultadoFuncion(x, y);

        // Mostrar el resultado
        System.out.println("El valor de f(x, y) es: " + resultado);
    }
}
