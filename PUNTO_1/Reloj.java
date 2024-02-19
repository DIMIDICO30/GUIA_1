public class Reloj {
    private int horas;
    private int minutos;
    private int segundos;

    // Constructor recibe horas, minutos y segundos 
    public Reloj(int horas, int minutos, int segundos) {
        // Asignamos los valores proporcionados a nuestros atributos
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    //Obtener las horas
    public int obtenerHoras() {
        return horas;
    }

    //Obtener los minutos
    public int obtenerMinutos() {
        return minutos;
    }

    //Obtener los segundos
    public int obtenerSegundos() {
        return segundos;
    }
}
