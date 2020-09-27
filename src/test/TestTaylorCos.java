package test;

import main.function.TaylorCos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTaylorCos {

    @Test
    public void ReturnsCorrect() {
        assertEquals(Math.cos(Math.PI), TaylorCos.cos(Math.PI), TaylorCos.ep);
        assertEquals(Math.cos(5*Math.PI), TaylorCos.cos(5*Math.PI), TaylorCos.ep);
        assertEquals(Math.cos(Math.PI/4), TaylorCos.cos(Math.PI/4), TaylorCos.ep);
        assertEquals(Math.cos(-Math.PI/2), TaylorCos.cos(-Math.PI/2), TaylorCos.ep);
        assertEquals(Math.cos(3.14159265), TaylorCos.cos(3.14159265), TaylorCos.ep);
    }

    @Test
    public void YAxisInterceptionReturnsCorrect() {
        assertEquals(Math.cos(0), TaylorCos.cos(0), TaylorCos.ep);
    }

}