package poo;

import uni1a.*;
import java.util.*;

public class VistaConsola {
    private Scanner scanner = new Scanner(System.in);

    public void mostrarMenuPrincipal() {
        System.out.println("\n=== Menú Principal ===");
        System.out.println("1. Ver contenidos");
        System.out.println("2. Ingresar nuevo contenido");
        System.out.println("3. Guardar contenidos en archivo CSV");
        System.out.println("4. Salir");
        System.out.println("Seleccione una opción:");
    }

    public void mostrarSubmenuIngreso() {
        System.out.println("\n=== Ingresar Nuevo Contenido ===");
        System.out.println("1. Película");
        System.out.println("2. Serie de TV");
        System.out.println("3. Documental");
        System.out.println("4. Actor");
        System.out.println("5. Temporada");
        System.out.println("6. Investigador");
        System.out.println("7. Volver");
        System.out.println("Seleccione una opción:");
    }

    // Métodos para ingresar cada tipo de contenido
    public Pelicula ingresarPelicula() {
        System.out.println("Título:");
        String titulo = scanner.nextLine();
        System.out.println("Duración (min):");
        int duracion = Integer.parseInt(scanner.nextLine());
        System.out.println("Género:");
        String genero = scanner.nextLine();
        System.out.println("Estudio:");
        String estudio = scanner.nextLine();
        return new Pelicula(titulo, duracion, genero, estudio);
    }

    public SerieDeTV ingresarSerieDeTV() {
        System.out.println("Título:");
        String titulo = scanner.nextLine();
        System.out.println("Duración (min):");
        int duracion = Integer.parseInt(scanner.nextLine());
        System.out.println("Género:");
        String genero = scanner.nextLine();
        System.out.println("Temporadas:");
        int temporadas = Integer.parseInt(scanner.nextLine());
        return new SerieDeTV(titulo, duracion, genero, temporadas);
    }

    public Documental ingresarDocumental() {
        System.out.println("Título:");
        String titulo = scanner.nextLine();
        System.out.println("Duración (min):");
        int duracion = Integer.parseInt(scanner.nextLine());
        System.out.println("Género:");
        String genero = scanner.nextLine();
        System.out.println("Tema:");
        String tema = scanner.nextLine();
        return new Documental(titulo, duracion, genero, tema);
    }

    public Actor ingresarActor() {
        System.out.println("Nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Edad:");
        int edad = Integer.parseInt(scanner.nextLine());
        System.out.println("Nacionalidad:");
        String nacionalidad = scanner.nextLine();
        System.out.println("Personaje:");
        String personaje = scanner.nextLine();
        return new Actor(nombre, edad, nacionalidad, personaje);
    }

    public Temporada ingresarTemporada() {
        System.out.println("Número:");
        int numero = Integer.parseInt(scanner.nextLine());
        System.out.println("Capítulos:");
        int capitulos = Integer.parseInt(scanner.nextLine());
        System.out.println("Año:");
        int anio = Integer.parseInt(scanner.nextLine());
        System.out.println("Descripción:");
        String descripcion = scanner.nextLine();
        return new Temporada(numero, capitulos, anio, descripcion);
    }

    public Investigador ingresarInvestigador() {
        System.out.println("Nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Institución:");
        String institucion = scanner.nextLine();
        System.out.println("Especialidad:");
        String especialidad = scanner.nextLine();
        System.out.println("Años de experiencia:");
        int aniosExperiencia = Integer.parseInt(scanner.nextLine());
        return new Investigador(nombre, institucion, especialidad, aniosExperiencia);
    }

    public void mostrarContenidos(List<ContenidoAudiovisual> lista) {
        System.out.println("\n=== Lista de Contenidos ===");
        for (ContenidoAudiovisual c : lista) {
            System.out.println(c);
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarActores(List<Actor> lista) {
        System.out.println("\n=== Lista de Actores ===");
        for (Actor a : lista) {
            System.out.println(a);
        }
    }

    public void mostrarTemporadas(List<Temporada> lista) {
        System.out.println("\n=== Lista de Temporadas ===");
        for (Temporada t : lista) {
            System.out.println(t);
        }
    }

    public void mostrarInvestigadores(List<Investigador> lista) {
        System.out.println("\n=== Lista de Investigadores ===");
        for (Investigador i : lista) {
            System.out.println(i);
        }
    }

    public String leerLinea() {
        String input = scanner.nextLine().trim();
        while (input.isEmpty()) {
            input = scanner.nextLine().trim();
        }
        return input;
    }
}
