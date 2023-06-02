package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * Esta clase realiza los test para las comprobaciones de que el metodo en cuestion funciona
 * */
public class CablejatTest {
    /**
     * Esto es un test que crea un objeto suma pasandole un valor y
     * luego usando el asserst para ver si nos devuelve true o false
     * */
    @Test
    public void testEsPotConnectar() {
        Cablejat cable = new Cablejat(new String[]{"HM"});
        assertEquals(true, cable.esPotConnectar());

    }
    @Test
    public void testEsPotConnectar2() {
        Cablejat cable = new Cablejat(new String[]{"HH"});
        assertEquals(false, cable.esPotConnectar());
    }
    @Test
    public void testEsPotConnectar3() {
        Cablejat cable = new Cablejat(new String[]{"HM", "HH", "MM"});
        assertEquals(true, cable.esPotConnectar());
    }


}
