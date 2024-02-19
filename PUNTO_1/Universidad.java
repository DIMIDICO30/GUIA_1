import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Clase para representar una persona
class Persona {
    private String cedula;
    private String nombre;
    private Date fechaNacimiento;
    private LugarNacimiento lugarNacimiento;

}

// Enumeración para representar el nivel de una carrera
enum NivelCarrera {
    PREGRADO, POSTGRADO
}

// Clase para representar una universidad
class Universidad {
    private String nombre;
    private String nombreRector;
    private String ciudad;
    private List<Facultad> facultades = new ArrayList<>();

}

// Clase para representar una facultad
class Facultad {
    private String nombre;
    private int codigo;
    private List<Profesor> profesores = new ArrayList<>();
    private List<Carrera> carreras = new ArrayList<>();

}

// Clase para representar un profesor
class Profesor extends Persona {
    private String profesion;
    private String nacionalidad;
    private double sueldo;
    private Facultad facultad; // Relación con la facultad a la que pertenece
}

// Clase para representar una carrera
class Carrera {
    private String nombre;
    private int creditosTotales;
    private int semestres;
    private NivelCarrera nivel;
    private Facultad facultad; // Relación con la facultad a la que pertenece
    private List<Estudiante> estudiantes = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();

}

// Clase para representar un estudiante
class Estudiante extends Persona {
    private String colegioGraduacion;
    private Date fechaIngreso;
    private List<Carrera> carreras = new ArrayList<>(); // Relación con las carreras a las que pertenece
    private List<Curso> cursosInscritos = new ArrayList<>(); // Relación con los cursos en los que está inscrito

}

// Clase para representar un curso
class Curso {
    private int codigo;
    private String nombre;
    private int creditos;
    private String numeroSalon;
    private String nombreEdificio;
    private List<Profesor> profesores = new ArrayList<>(); // Relación con los profesores que lo dictan
    private Carrera carrera; // Relación con la carrera a la que pertenece
    private List<Estudiante> estudiantesInscritos = new ArrayList<>(); // Relación con los estudiantes inscritos
}

// Clase para representar el lugar de nacimiento
class LugarNacimiento {
    private String ciudad;
    private String departamento;
    private String pais;

}
