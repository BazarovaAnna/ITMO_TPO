package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import main.dom.*;

public class TestDomain {
    @Test
    public void CheckArtur() {
        Artur art = new Artur();
        assertEquals("Артур как труп ", art.performAction());
    }
    @Test
    public void CheckTrillian() {
        Trillian tr = new Trillian();
        assertEquals("Триллиан в отчаянии схватила за руку потянула к двери ", tr.performAction());
    }
    @Test
    public void CheckHams() {
        Hamster ham = new Hamster();
        Artur art = new Artur();
        assertEquals("надвигаются воздухоплавающие грызуны загипнотизировали Артур ", ham.performAction());
    }
    @Test
    public void CheckZafod() {
        Zafod zaf=new Zafod();
        assertEquals("Зафод пытался открыть дверь ", zaf.performAction());
    }
    @Test
    public void CheckFord() {
        Ford ford = new Ford();
        assertEquals("Форд пытался открыть дверь ", ford.performAction());
    }
}
