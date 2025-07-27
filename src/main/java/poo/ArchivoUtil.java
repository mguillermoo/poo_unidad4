package poo;

import uni1a.*;
import java.io.*;
import java.util.*;

public class ArchivoUtil implements RepositorioContenido {

    @Override
    public List<ContenidoAudiovisual> leerContenidos(String rutaArchivo) {
        List<ContenidoAudiovisual> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                String tipo = datos[0];
                if ("Pelicula".equalsIgnoreCase(tipo)) {
                    lista.add(new Pelicula(datos[1], Integer.parseInt(datos[2]), datos[3], datos[4]));
                } else if ("SerieDeTV".equalsIgnoreCase(tipo)) {
                    lista.add(new SerieDeTV(datos[1], Integer.parseInt(datos[2]), datos[3], Integer.parseInt(datos[4])));
                } else if ("Documental".equalsIgnoreCase(tipo)) {
                    lista.add(new Documental(datos[1], Integer.parseInt(datos[2]), datos[3], datos[4]));
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer contenidos: " + e.getMessage());
        }
        return lista;
    }

    @Override
    public void guardarContenidos(List<ContenidoAudiovisual> lista, String rutaArchivo) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(rutaArchivo))) {
            for (ContenidoAudiovisual c : lista) {
                if (c instanceof Pelicula) {
                    Pelicula p = (Pelicula) c;
                    pw.println("Pelicula," + p.getTitulo() + "," + p.getDuracionEnMinutos() + "," + p.getGenero() + "," + p.getEstudio());
                } else if (c instanceof SerieDeTV) {
                    SerieDeTV s = (SerieDeTV) c;
                    pw.println("SerieDeTV," + s.getTitulo() + "," + s.getDuracionEnMinutos() + "," + s.getGenero() + "," + s.getTemporadas());
                } else if (c instanceof Documental) {
                    Documental d = (Documental) c;
                    pw.println("Documental," + d.getTitulo() + "," + d.getDuracionEnMinutos() + "," + d.getGenero() + "," + d.getTema());
                }
            }
        } catch (IOException e) {
            System.out.println("Error al guardar contenidos: " + e.getMessage());
        }
    }

    @Override
    public List<Actor> leerActores(String rutaArchivo) {
        List<Actor> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                lista.add(new Actor(datos[0], Integer.parseInt(datos[1]), datos[2], datos[3]));
            }
        } catch (IOException e) {
            System.out.println("Error al leer actores: " + e.getMessage());
        }
        return lista;
    }

    @Override
    public void guardarActores(List<Actor> lista, String rutaArchivo) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(rutaArchivo))) {
            for (Actor a : lista) {
                pw.println(a.getNombre() + "," + a.getEdad() + "," + a.getNacionalidad() + "," + a.getPersonaje());
            }
        } catch (IOException e) {
            System.out.println("Error al guardar actores: " + e.getMessage());
        }
    }

    @Override
    public List<Temporada> leerTemporadas(String rutaArchivo) {
        List<Temporada> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                lista.add(new Temporada(Integer.parseInt(datos[0]), Integer.parseInt(datos[1]), Integer.parseInt(datos[2]), datos[3]));
            }
        } catch (IOException e) {
            System.out.println("Error al leer temporadas: " + e.getMessage());
        }
        return lista;
    }

    @Override
    public void guardarTemporadas(List<Temporada> lista, String rutaArchivo) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(rutaArchivo))) {
            for (Temporada t : lista) {
                pw.println(t.getNumero() + "," + t.getCapitulos() + "," + t.getAnio() + "," + t.getDescripcion());
            }
        } catch (IOException e) {
            System.out.println("Error al guardar temporadas: " + e.getMessage());
        }
    }

    @Override
    public List<Investigador> leerInvestigadores(String rutaArchivo) {
        List<Investigador> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                lista.add(new Investigador(datos[0], datos[1], datos[2], Integer.parseInt(datos[3])));
            }
        } catch (IOException e) {
            System.out.println("Error al leer investigadores: " + e.getMessage());
        }
        return lista;
    }

    @Override
    public void guardarInvestigadores(List<Investigador> lista, String rutaArchivo) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(rutaArchivo))) {
            for (Investigador i : lista) {
                pw.println(i.getNombre() + "," + i.getInstitucion() + "," + i.getEspecialidad() + "," + i.getAniosExperiencia());
            }
        } catch (IOException e) {
            System.out.println("Error al guardar investigadores: " + e.getMessage());
        }
    }
}
