package es.iesmz.ed.algoritmes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PolidivisibleTest {
    @Test
    public void testEsPolidivisible() {
        Polidivisible pol = new Polidivisible(381654729);
        assertEquals(true, pol.esPolidivisible());
    }
    @Test
    public void testEsPolidivisible1() {
        Polidivisible pol = new Polidivisible(122);
        assertEquals(false, pol.esPolidivisible());
    }
    @Test
    public void testEsPolidivisible3() {
        Polidivisible pol = new Polidivisible(121312);
        assertEquals(false, pol.esPolidivisible());
    }
}

