import java.util.Scanner;

public class CalculadoraEdificioUniversitario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número de estudiantes
        System.out.print("Ingrese el número de estudiantes en la universidad: ");
        int numeroEstudiantes = scanner.nextInt();

        // Solicitar al usuario la capacidad de un salón
        System.out.print("Ingrese la capacidad de un salón: ");
        int capacidadSalon = scanner.nextInt();

        // Solicitar al usuario el número de salones por piso
        System.out.print("Ingrese el número de salones por piso: ");
        int salonesPorPiso = scanner.nextInt();

        // Calcular y mostrar el número de salones
        int numeroSalones = calcularNumeroSalones(numeroEstudiantes, capacidadSalon);
        System.out.println("El número de salones necesario es: " + numeroSalones);

        // Calcular y mostrar el número de pisos
        int numeroPisos = calcularNumeroPisos(numeroSalones, salonesPorPiso);
        System.out.println("El número de pisos necesario es: " + numeroPisos);
    }

    // Función para calcular el número de salones necesario
    public static int calcularNumeroSalones(int numeroEstudiantes, int capacidadSalon) {
        return (int) Math.ceil((double) numeroEstudiantes / capacidadSalon);
    }

    // Función para calcular el número de pisos necesario
    public static int calcularNumeroPisos(int numeroSalones, int salonesPorPiso) {
        return (int) Math.ceil((double) numeroSalones / salonesPorPiso);
    }
}
