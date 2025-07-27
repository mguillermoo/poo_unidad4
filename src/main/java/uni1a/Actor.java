package uni1a;

// Representa un actor y su personaje
public class Actor {
    private String nombre;
    private int edad;
    private String nacionalidad; 
    private String personaje;    

    public Actor(String nombre, int edad, String nacionalidad, String personaje) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.personaje = personaje;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    @Override
    public String toString() {
        return "Actor: " + nombre + " | Edad: " + edad + " | Nacionalidad: " + nacionalidad + " | Personaje: " + personaje;
    }
}
