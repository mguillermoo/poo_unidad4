import uni1a.Documental;
import uni1a.Investigador;
import org.junit.Assert;
import org.junit.Test;

public class DocumentalTest {
    @Test
    public void testCrearDocumental() {
        Documental doc = new Documental("Cosmos", 45, "Science", "Astronomy");
        Assert.assertEquals("Cosmos", doc.getTitulo());
        Assert.assertEquals(45, doc.getDuracionEnMinutos());
        Assert.assertEquals("Science", doc.getGenero());
        Assert.assertEquals("Astronomy", doc.getTema());
    }

    @Test
    public void testAgregarInvestigador() {
        Documental doc = new Documental("Cosmos", 45, "Science", "Astronomy");
        Investigador inv = new Investigador("Carl Sagan", "NASA", "Astronomía", 20);
        doc.setInvestigador(inv);
        Assert.assertEquals(inv, doc.getInvestigador());
    }
}