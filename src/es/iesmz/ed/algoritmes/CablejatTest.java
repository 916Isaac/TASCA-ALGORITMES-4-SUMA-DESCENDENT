package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CablejatTest {
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
