package poo;

import uni1a.*;
import java.util.*;

public class ControladorContenido {
    private VistaConsola vista;
    private RepositorioContenido repositorio;
    private List<ContenidoAudiovisual> contenidos;
    private List<Actor> actores;
    private List<Temporada> temporadas;
    private List<Investigador> investigadores;

    public ControladorContenido(VistaConsola vista, RepositorioContenido repositorio) {
        this.vista = vista;
        this.repositorio = repositorio;
        this.contenidos = repositorio.leerContenidos("data/contenidos.csv");
        this.actores = repositorio.leerActores("data/actores.csv");
        this.temporadas = repositorio.leerTemporadas("data/temporadas.csv");
        this.investigadores = repositorio.leerInvestigadores("data/investigadores.csv");
    }

    public void iniciar() {
        boolean salir = false;
        while (!salir) {
            vista.mostrarMenuPrincipal();
            String opcion = vista.leerLinea();
            
            switch (opcion) {
                case "1":
                    vista.mostrarContenidos(contenidos);
                    vista.mostrarActores(actores);
                    vista.mostrarTemporadas(temporadas);
                    vista.mostrarInvestigadores(investigadores);
                    break;
                case "2":
                    vista.mostrarSubmenuIngreso();
                    String subopcion = vista.leerLinea();
                    switch (subopcion) {
                        case "1":
                            contenidos.add(vista.ingresarPelicula());
                            vista.mostrarMensaje("Película agregada.");
                            break;
                        case "2":
                            contenidos.add(vista.ingresarSerieDeTV());
                            vista.mostrarMensaje("Serie de TV agregada.");
                            break;
                        case "3":
                            contenidos.add(vista.ingresarDocumental());
                            vista.mostrarMensaje("Documental agregado.");
                            break;
                        case "4":
                            actores.add(vista.ingresarActor());
                            vista.mostrarMensaje("Actor agregado.");
                            break;
                        case "5":
                            temporadas.add(vista.ingresarTemporada());
                            vista.mostrarMensaje("Temporada agregada.");
                            break;
                        case "6":
                            investigadores.add(vista.ingresarInvestigador());
                            vista.mostrarMensaje("Investigador agregado.");
                            break;
                        case "7":
                            break;
                        default:
                            vista.mostrarMensaje("Opción inválida.");
                    }
                    break;
                case "3":
                    repositorio.guardarContenidos(contenidos, "data/contenidos.csv");
                    repositorio.guardarActores(actores, "data/actores.csv");
                    repositorio.guardarTemporadas(temporadas, "data/temporadas.csv");
                    repositorio.guardarInvestigadores(investigadores, "data/investigadores.csv");
                    vista.mostrarMensaje("Datos guardados.");
                    break;
                case "4":
                    salir = true;
                    break;
                default:
                    vista.mostrarMensaje("Opción inválida.");
            }
        }
    }
}
