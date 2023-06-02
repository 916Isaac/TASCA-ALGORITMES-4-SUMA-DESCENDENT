package es.iesmz.ed.algoritmes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * Esta clase realiza los test para las comprobaciones de que el metodo en cuestion funciona
 * */
public class PolidivisibleTest {
    /**
     * Esto es un test que crea un objeto suma pasandole un valor y
     * luego usando el asserst para ver si nos devuelve true o false
     * */
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

