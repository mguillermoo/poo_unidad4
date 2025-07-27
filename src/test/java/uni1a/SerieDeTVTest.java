import uni1a.SerieDeTV;
import uni1a.Temporada;
import org.junit.Assert;
import org.junit.Test;

public class SerieDeTVTest {
    @Test
    public void testCrearSerieDeTV() {
        SerieDeTV serie = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
        Assert.assertEquals("Game of Thrones", serie.getTitulo());
        Assert.assertEquals(60, serie.getDuracionEnMinutos());
        Assert.assertEquals("Fantasy", serie.getGenero());
        Assert.assertEquals(8, serie.getTemporadas());
    }

    @Test
    public void testAgregarTemporada() {
        SerieDeTV serie = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
        Temporada temp = new Temporada(1, 10, 2011, "La guerra comienza");
        serie.agregarTemporada(temp);
        Assert.assertTrue(serie.getTemporadasLista().contains(temp));
    }
}