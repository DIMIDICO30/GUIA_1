import java.util.Scanner;

public class OperacionesAritmeticas {

    // Función para realizar operaciones aritméticas
    public static int realizarOperacion(int num1, int num2, String operador) {
        int resultado = 0;
        switch (operador) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("¡Verga! No se puede dividir por cero, socio.");
                }
                break;
            case "%":
                resultado = num1 % num2;
                break;
            case "**":
                resultado = (int) Math.pow(num1, num2);
                break;
            default:
                System.out.println("¡Verga! Operador no reconocido, pana.");
        }
        
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario dos números
        System.out.print("Dame un número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Dame otro número entero: ");
        int numero2 = scanner.nextInt();

        // Pedir al usuario la operación deseada
        System.out.print("Escribe la operación que quieres hacer (+, -, *, /, %, **): ");
        String operador = scanner.next();

        // Calcular y mostrar el resultado de la operación
        int resultado = realizarOperacion(numero1, numero2, operador);
        System.out.println("¡Pana! El resultado de la operación es: " + resultado);
    }
}
