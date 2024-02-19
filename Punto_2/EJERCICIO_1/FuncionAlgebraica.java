public class FuncionAlgebraica {
    // Función que calcula el valor de f(x, y) = x^2 + 2xy + y^2
    public static double calcularResultadoFuncion(double x, double y) {
        double parte1 = Math.pow(x, 2);
        double parte2 = 2 * x * y;
        double parte3 = Math.pow(y, 2);

        return parte1 + parte2 + parte3;
    }
}
