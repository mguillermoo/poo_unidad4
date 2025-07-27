package poo;

import uni1a.ContenidoAudiovisual;
import uni1a.Actor;
import uni1a.Temporada;
import uni1a.Investigador;
import java.util.List;

public interface RepositorioContenido {
    List<ContenidoAudiovisual> leerContenidos(String rutaArchivo);
    void guardarContenidos(List<ContenidoAudiovisual> lista, String rutaArchivo);

    List<Actor> leerActores(String rutaArchivo);
    void guardarActores(List<Actor> lista, String rutaArchivo);

    List<Temporada> leerTemporadas(String rutaArchivo);
    void guardarTemporadas(List<Temporada> lista, String rutaArchivo);

    List<Investigador> leerInvestigadores(String rutaArchivo);
    void guardarInvestigadores(List<Investigador> lista, String rutaArchivo);
}
