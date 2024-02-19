public class Tienda {
    private String nombre;
    private String direccion;
    private String telefono;

    // Constructor que recibe nombre, dirección y teléfono 
    public Tienda(String nombre, String direccion, String telefono) {
        // Asignamos los valores proporcionados a nuestros atributos
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    //Obtener el nombre de la tienda
    public String obtenerNombre() {
        return nombre;
    }

    //Obtener la dirección de la tienda
    public String obtenerDireccion() {
        return direccion;
    }

    // Obtener el teléfono de la tienda
    public String obtenerTelefono() {
        return telefono;
    }
}
