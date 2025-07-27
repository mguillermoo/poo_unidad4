package uni1a;

import java.util.ArrayList;
import java.util.List;

// Representa una película y sus actores
public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    private List<Actor> actores = new ArrayList<>();

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("---- Película ----");
        mostrarDetallesGenerico();
        System.out.println("Estudio: " + estudio);
        System.out.println("Actores:");
        for (Actor a : actores) {
            System.out.println("  - " + a);
        }
        System.out.println();
    }

    private void mostrarDetallesGenerico() {
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + getGenero());
    }

    // Asociación
    public void agregarActor(Actor actor) {
        actores.add(actor);
    }

    public List<Actor> getActores() {
        return actores;
    }

    @Override
    public String toString() {
        return "Película: " + getTitulo() + " | Duración: " + getDuracionEnMinutos() + " min | Género: " + getGenero() + " | Estudio: " + estudio;
    }
}