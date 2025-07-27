package poo;

import java.util.List;

import uni1a.*;

public class PruebaAudioVisual {

    public static void main(String[] args) {
        RepositorioContenido repo = new ArchivoUtil();
        VistaConsola vista = new VistaConsola();
        ControladorContenido controlador = new ControladorContenido(vista, repo);
        controlador.iniciar();
    }

    public static void mostrarDetalles(ContenidoAudiovisual contenido) {
        if (contenido instanceof Pelicula) {
            mostrarDetallesPelicula((Pelicula) contenido);
        } else if (contenido instanceof SerieDeTV) {
            mostrarDetallesSerie((SerieDeTV) contenido);
        } else if (contenido instanceof Documental) {
            mostrarDetallesDocumental((Documental) contenido);
        } else {
            mostrarDetallesGenerico(contenido);
        }
    }

    private static void mostrarDetallesPelicula(Pelicula peli) {
        System.out.println("---- Película ----");
        mostrarDetallesGenerico(peli);
        System.out.println("Estudio: " + peli.getEstudio());
        System.out.println("Actores:");
        for (Actor a : peli.getActores()) {
            System.out.println("  - " + a);
        }
        System.out.println();
    }

    private static void mostrarDetallesSerie(SerieDeTV serie) {
        System.out.println("---- Serie de TV ----");
        mostrarDetallesGenerico(serie);
        System.out.println("Temporadas (cantidad): " + serie.getTemporadas());
        System.out.println("Detalles de temporadas:");
        for (Temporada t : serie.getTemporadasLista()) {
            System.out.println("  - " + t);
        }
        System.out.println();
    }

    private static void mostrarDetallesDocumental(Documental doc) {
        System.out.println("---- Documental ----");
        mostrarDetallesGenerico(doc);
        System.out.println("Tema: " + doc.getTema());
        if (doc.getInvestigador() != null) {
            System.out.println("Investigador: " + doc.getInvestigador());
        }
        System.out.println();
    }

    private static void mostrarDetallesGenerico(ContenidoAudiovisual contenido) {
        System.out.println("ID: " + contenido.getId());
        System.out.println("Título: " + contenido.getTitulo());
        System.out.println("Duración: " + contenido.getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + contenido.getGenero());
    }
}
