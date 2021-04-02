package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PianoTest {

    @Test
    public void testAddPiano() {
        Piano piano = new Piano("2501A", "Yamaha", "Vertical", 1299, 88, 569,
                "Madera", 4, "No", true, 3);

        assertEquals(1299, piano.getPrecio());
        assertEquals("Yamaha", piano.getMarca());
        assertEquals("No", piano.getDesperfectos());
        assertNotEquals(73, piano.getNumTeclas());
        assertNotEquals(false, piano.isAfinado());
    }
}
