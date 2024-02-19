import java.util.Scanner;

public class ConvertidorRomano {

    // Función para obtener la cifra de las decenas
    public static int obtenerDecenas(int numero) {
        return numero / 10;
    }

    // Función para obtener la cifra de las unidades
    public static int obtenerUnidades(int numero) {
        return numero % 10;
    }

    // Función para convertir un dígito a número romano
    public static String convertirADecimal(int digito) {
        if (digito == 0) {
            return "";
        } else if (digito == 1) {
            return "I";
        } else if (digito == 2) {
            return "II";
        } else if (digito == 3) {
            return "III";
        } else if (digito == 4) {
            return "IV";
        } else if (digito == 5) {
            return "V";
        } else if (digito == 6) {
            return "VI";
        } else if (digito == 7) {
            return "VII";
        } else if (digito == 8) {
            return "VIII";
        } else if (digito == 9) {
            return "IX";
        } else {
            return ""; // Esto no debería suceder
        }
    }

    // Función para convertir las decenas a número romano
    public static String convertirDecenasARomano(int decenas) {
        String romano = "";
        for (int i = 1; i <= decenas; i++) {
            romano += "X";
        }
        return romano;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario un número entero
        System.out.print("Ingrese un número entero entre 1 y 99: ");
        int numero = scanner.nextInt();

        // Validar si el número tiene menos de 3 cifras
        if (numero > 0 && numero < 100) {
            // Obtener las decenas y unidades del número
            int decenas = obtenerDecenas(numero);
            int unidades = obtenerUnidades(numero);

            // Convertir las unidades a romano
            String romanoUnidades = convertirADecimal(unidades);

            // Convertir las decenas a romano
            String romanoDecenas = convertirDecenasARomano(decenas);

            // Imprimir el resultado
            System.out.println("En números romanos: " + romanoDecenas + romanoUnidades);
        } else {
            System.out.println("Error: El número debe estar entre 1 y 99.");
        }
    }
}
