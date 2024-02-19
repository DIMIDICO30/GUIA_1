public class Proyectil {
    private double velocidad;
    private double angulo;

    // Constructor que recibe velocidad y ángulo 
    public Proyectil(double velocidad, double angulo) {
        // Asignamos los valores proporcionados a nuestros atributos
        this.velocidad = velocidad;
        this.angulo = angulo;
    }
    // Obtener la velocidad
    public double obtenerVelocidad() {
        return velocidad;
    }

    //Obtener el ángulo
    public double obtenerAngulo() {
        return angulo;
    }
}
