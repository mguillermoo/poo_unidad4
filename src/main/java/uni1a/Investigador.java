package uni1a;

// Representa un investigador de un documental
public class Investigador {
    private String nombre;
    private String institucion;
    private String especialidad; 
    private int aniosExperiencia; 

    public Investigador(String nombre, String institucion, String especialidad, int aniosExperiencia) {
        this.nombre = nombre;
        this.institucion = institucion;
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getInstitucion() {
        return institucion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public String toString() {
        return "Investigador: " + nombre + " | Institución: " + institucion + " | Especialidad: " + especialidad + " | Experiencia: " + aniosExperiencia + " años";
    }
}
