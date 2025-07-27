package uni1a;

// Representa una temporada de una serie de TV
public class Temporada {
    private int numero;
    private int episodios;
    private int anioEstreno;     
    private String sinopsis;   

    public Temporada(int numero, int episodios, int anioEstreno, String sinopsis) {
        this.numero = numero;
        this.episodios = episodios;
        this.anioEstreno = anioEstreno;
        this.sinopsis = sinopsis;
    }

    public int getNumero() {
        return numero;
    }

    public int getEpisodios() {
        return episodios;
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public void setAnioEstreno(int anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getCapitulos() {
        return episodios;
    }

    public int getAnio() {
        return anioEstreno;
    }

    public String getDescripcion() {
        return sinopsis;
    }

    @Override
    public String toString() {
        return "Temporada: " + numero + " | Capítulos: " + getCapitulos() + " | Año: " + getAnio() + " | Descripción: " + getDescripcion();
    }
}
