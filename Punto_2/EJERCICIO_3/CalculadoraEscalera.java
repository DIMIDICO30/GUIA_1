public class CalculadoraEscalera {

    // Función que calcula la longitud de la escalera (y) dado el ángulo (alpha) y la altura (x)
    public static double calcularLongitudEscalera(double altura, double angulo) {
        // Convertir el ángulo de grados a radianes
        double anguloRadianes = Math.toRadians(angulo);

        // Calcular la longitud de la escalera usando la fórmula: y = x / cos(alpha)
        double longitudEscalera = altura / Math.cos(anguloRadianes);

        return longitudEscalera;
    }
}
