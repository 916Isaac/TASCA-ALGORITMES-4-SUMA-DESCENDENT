package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumaDescendentTest {
    @Test
    public void testSumaDescendent() {
        SumaDescendent suma = new SumaDescendent(4578);
        assertEquals(5242, suma.suma());
    }
    @Test
    public void testSumaDescendent1() {
        SumaDescendent suma = new SumaDescendent(362);
        assertEquals(426, suma.suma());
    }
    @Test
    public void testSumaDescendent3() {
        SumaDescendent suma = new SumaDescendent(311313);
        assertEquals(324268, suma.suma());
    }
}
