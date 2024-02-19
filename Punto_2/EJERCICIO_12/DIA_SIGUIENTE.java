import java.util.Scanner;

public class DiaSiguiente {

    // Función para obtener el nombre del día siguiente
    public static String obtenerDiaSiguiente(String dia) {
        // Convertir el nombre del día a minúsculas para hacer la comparación más flexible
        dia = dia.toLowerCase();

        // Array con los nombres de los días de la semana
        String[] diasSemana = {"lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"};

        // Buscar el índice del día en el array
        int indiceDia = -1;
        for (int i = 0; i < diasSemana.length; i++) {
            if (dia.equals(diasSemana[i])) {
                indiceDia = i;
                break;
            }
        }

        // Verificar si el día es válido
        if (indiceDia != -1) {
            // Calcular el índice del día siguiente
            int indiceDiaSiguiente = (indiceDia + 1) % diasSemana.length;

            // Obtener el nombre del día siguiente
            return diasSemana[indiceDiaSiguiente];
        } else {
            return "Día no válido";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el nombre de un día
        System.out.print("Ingrese el nombre de un día de la semana: ");
        String diaActual = scanner.nextLine();

        // Obtener el nombre del día siguiente usando la función
        String diaSiguiente = obtenerDiaSiguiente(diaActual);

        // Mostrar el resultado
        System.out.println("El día siguiente a " + diaActual + " es " + diaSiguiente);
    }
}
