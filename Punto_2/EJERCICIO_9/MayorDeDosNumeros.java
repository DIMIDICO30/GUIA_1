import java.util.Scanner;

public class MayorDeDosNumeros {

    // Función para encontrar el mayor de dos números enteros
    public static int encontrarMayor(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario dos números enteros
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        // Llamar a la función para encontrar el mayor e imprimir el resultado
        int mayor = encontrarMayor(numero1, numero2);
        System.out.println("El mayor de los dos números es: " + mayor);
    }
}
