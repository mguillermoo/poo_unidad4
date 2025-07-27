import uni1a.Pelicula;
import uni1a.Actor;


import org.junit.Assert;
import org.junit.Test;

public class PeliculaTest {
    @Test
    public void testCrearPelicula() {
        Pelicula peli = new Pelicula("Avatar", 125, "Acción", "20th Century Studios");
        Assert.assertEquals("Avatar", peli.getTitulo());
        Assert.assertEquals(125, peli.getDuracionEnMinutos());
        Assert.assertEquals("Acción", peli.getGenero());
        Assert.assertEquals("20th Century Studios", peli.getEstudio());
    }

    @Test
    public void testAgregarActor() {
        Pelicula peli = new Pelicula("Avatar", 125, "Acción", "20th Century Studios");
        Actor actor = new Actor("Emma Stone", 34, "EE.UU.", "Protagonista");
        peli.agregarActor(actor);
        Assert.assertTrue(peli.getActores().contains(actor));
    }
}
