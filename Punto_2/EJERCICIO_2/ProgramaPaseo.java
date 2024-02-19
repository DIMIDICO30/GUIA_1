import java.util.Scanner;

public class ProgramaPaseo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cantidad de sillas por bus
        System.out.print("Ingrese la cantidad de sillas por bus: ");
        int sillasPorBus = scanner.nextInt();

        // Solicitar al usuario la cantidad de estudiantes gordos
        System.out.print("Ingrese la cantidad de estudiantes gordos: ");
        int estudiantesGordos = scanner.nextInt();

        // Solicitar al usuario la cantidad de estudiantes flacos
        System.out.print("Ingrese la cantidad de estudiantes flacos: ");
        int estudiantesFlacos = scanner.nextInt();

        // Calcular el número de buses necesarios
        int busesNecesarios = OrganizadorPaseo.calcularBusesNecesarios(sillasPorBus, estudiantesGordos, estudiantesFlacos);

        // Mostrar información detallada
        System.out.println("\nInformación del Paseo:");
        System.out.println("Sillas por bus: " + sillasPorBus);
        System.out.println("Estudiantes gordos: " + estudiantesGordos);
        System.out.println("Estudiantes flacos: " + estudiantesFlacos);
        System.out.println("Sillas necesarias: " + ((estudiantesGordos * 2) + estudiantesFlacos));
        System.out.println("Buses necesarios: " + busesNecesarios);
    }
}
