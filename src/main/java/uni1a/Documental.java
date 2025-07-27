package uni1a;

// Representa un documental y su investigador
public class Documental extends ContenidoAudiovisual {
    private String tema;
    private Investigador investigador;

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("---- Documental ----");
        mostrarDetallesGenerico();
        System.out.println("Tema: " + tema);
        if (investigador != null) {
            System.out.println("Investigador: " + investigador);
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
    public void setInvestigador(Investigador investigador) {
        this.investigador = investigador;
    }

    public Investigador getInvestigador() {
        return investigador;
    }

    @Override
    public String toString() {
        return "Documental: " + getTitulo() + " | Duración: " + getDuracionEnMinutos() + " min | Género: " + getGenero() + " | Tema: " + tema;
    }
}