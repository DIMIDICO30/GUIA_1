public class Fraccionario {
    private int numerador;
    private int denominador;

    // Constructor recibe el numerador y el denominador 
    public Fraccionario(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    //Obtener el numerador
    public int obtenerNumerador() {
        return numerador;
    }

    //Obtener el denominador
    public int obtenerDenominador() {
        return denominador;
    }
}
