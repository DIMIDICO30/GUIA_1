public class Fecha {
    private int año;
    private int mes;
    private int dia;

    // Constructor recibe año, mes y día 
    public Fecha(int año, int mes, int dia) {
        // Asignamos los valores proporcionados a nuestros atributos
        this.año = año;
        this.mes = mes;
        this.dia = dia;
    }

    // Obtener el año
    public int obtenerAño() {
        return año;
    }

    //Obtener el mes
    public int obtenerMes() {
        return mes;
    }

    //Obtener el día
    public int obtenerDia() {
        return dia;
    }
}
