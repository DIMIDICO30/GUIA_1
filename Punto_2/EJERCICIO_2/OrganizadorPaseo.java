public class OrganizadorPaseo {

    // Función que calcula el número de buses necesarios
    public static int calcularBusesNecesarios(int sillasPorBus, int estudiantesGordos, int estudiantesFlacos) {
        // Cada estudiante gordo ocupa 2 sillas, cada estudiante flaco ocupa 1 silla
        int sillasNecesarias = (estudiantesGordos * 2) + estudiantesFlacos;

        // Calcular el número de buses necesarios redondeando hacia arriba
        int busesNecesarios = (int) Math.ceil((double) sillasNecesarias / sillasPorBus);

        return busesNecesarios;
    }
}
