package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PianoTest {

    @Test
    public void testAddPiano() {    // Comprueba el constructor de la clase
        Piano piano = new Piano("2501A", "Yamaha", "Vertical", 1299, 88, 569,
                "Madera", 4, "No", true, 3);

        assertEquals(1299, piano.getPrecio());
        assertEquals("Yamaha", piano.getMarca());
        assertEquals("No", piano.getDesperfectos());
        assertNotEquals(73, piano.getNumTeclas());
        assertNotEquals(false, piano.isAfinado());
    }

    @Test
    public void testEqualsPiano() { // Comprueba el método equals de la clase
        Piano p1 = new Piano("2501A", "Yamaha", "Vertical", 1299, 88, 569,
                "Madera", 4, "No", true, 3);
        Piano p2 = new Piano("2501A", "Nord", "Eléctrico", 1400, 73, 10,
                "Metal", 0, "Ninguno", true, 1);
        Piano p3 = new Piano("2991E", "Yamaha", "De cola", 21000, 88, 890,
                "Madera", 5, "Pequeños roces", false, 3);
        Piano p4 = new Piano("2501A", "Nord", "Eléctrico", 1400, 73, 10,
                "Metal", 0, "Ninguno", true, 1);

        assertEquals(p1, p2);
        assertEquals(p2, p4);
        assertNotEquals(p1, p3);
    }
}
