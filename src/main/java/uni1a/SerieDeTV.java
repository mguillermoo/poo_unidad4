package uni1a;

import java.util.ArrayList;
import java.util.List;

// Representa una serie de TV y sus temporadas
public class SerieDeTV extends ContenidoAudiovisual {
    private int temporadas;
    private List<Temporada> temporadasLista = new ArrayList<>();

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("---- Serie de TV ----");
        mostrarDetallesGenerico();
        System.out.println("Temporadas (cantidad): " + temporadas);
        System.out.println("Detalles de temporadas:");
        for (Temporada t : temporadasLista) {
            System.out.println("  - " + t);
        }
        System.out.println();
    }

    private void mostrarDetallesGenerico() {
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + getGenero());
    }

    //Composición
    public void agregarTemporada(Temporada temp) {
        temporadasLista.add(temp);
    }

    public List<Temporada> getTemporadasLista() {
        return temporadasLista;
    }

    @Override
    public String toString() {
        return "Serie de TV: " + getTitulo() + " | Duración: " + getDuracionEnMinutos() + " min | Género: " + getGenero() + " | Temporadas: " + temporadas;
    }
}