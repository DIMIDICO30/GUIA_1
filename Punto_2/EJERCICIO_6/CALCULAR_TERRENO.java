import java.util.Scanner;

public class CalculadoraTerreno {

    // Función para calcular el área de un rectángulo
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    // Función para calcular la hipotenusa de un triángulo rectángulo
    public static double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
    }

    // Función para calcular el área de un triángulo
    public static double calcularAreaTriangulo(double base, double altura) {
        return 0.5 * base * altura;
    }

    // Función para calcular el perímetro del terreno
    public static double calcularPerimetroTerreno(double ladoA, double ladoB, double ladoC) {
        double hipotenusa = calcularHipotenusa(ladoA, ladoB);
        return ladoA + ladoB + hipotenusa;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario las dimensiones de los lados del terreno
        System.out.print("Ingrese la longitud del lado A del terreno: ");
        double ladoA = scanner.nextDouble();

        System.out.print("Ingrese la longitud del lado B del terreno: ");
        double ladoB = scanner.nextDouble();

        System.out.print("Ingrese la longitud del lado C del terreno: ");
        double ladoC = scanner.nextDouble();

        // Calcular el área del rectángulo (base y altura son los lados A y B)
        double areaRectangulo = calcularAreaRectangulo(ladoA, ladoB);

        // Calcular la hipotenusa (lados A y B son los catetos del triángulo rectángulo)
        double hipotenusa = calcularHipotenusa(ladoA, ladoB);

        // Calcular el área del triángulo (base es la hipotenusa y altura es el lado C)
        double areaTriangulo = calcularAreaTriangulo(hipotenusa, ladoC);

        // Calcular el perímetro del terreno
        double perimetroTerreno = calcularPerimetroTerreno(ladoA, ladoB, ladoC);

        // Mostrar los resultados
        System.out.println("El área del rectángulo es: " + areaRectangulo);
        System.out.println("El área del triángulo es: " + areaTriangulo);
        System.out.println("El perímetro del terreno es: " + perimetroTerreno);
    }
}
