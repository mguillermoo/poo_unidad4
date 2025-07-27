package uni1a;

import org.junit.Assert;
import org.junit.Test;

public class ActorTest {
    @Test
    public void testCrearActor() {
        Actor actor = new Actor("Sam Worthington", 45, "Australia", "Jake Sully");
        Assert.assertEquals("Sam Worthington", actor.getNombre());
        Assert.assertEquals(45, actor.getEdad());
        Assert.assertEquals("Australia", actor.getNacionalidad());
        Assert.assertEquals("Jake Sully", actor.getPersonaje());
    }
}