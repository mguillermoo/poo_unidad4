import uni1a.Temporada;
import org.junit.Assert;
import org.junit.Test;

public class TemporadaTest {
    @Test
    public void testCrearTemporada() {
        Temporada temp = new Temporada(1, 10, 2011, "La guerra comienza");
        Assert.assertEquals(1, temp.getNumero());
        Assert.assertEquals(10, temp.getCapitulos());
        Assert.assertEquals(2011, temp.getAnio());
        Assert.assertEquals("La guerra comienza", temp.getDescripcion());
    }
}