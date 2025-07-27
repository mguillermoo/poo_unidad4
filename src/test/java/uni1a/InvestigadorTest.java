import uni1a.Investigador;
import org.junit.Assert;
import org.junit.Test;

public class InvestigadorTest {
    @Test
    public void testCrearInvestigador() {
        Investigador inv = new Investigador("Carl Sagan", "NASA", "Astronomía", 20);
        Assert.assertEquals("Carl Sagan", inv.getNombre());
        Assert.assertEquals("NASA", inv.getInstitucion());
        Assert.assertEquals("Astronomía", inv.getEspecialidad());
        Assert.assertEquals(20, inv.getAniosExperiencia());
    }
}