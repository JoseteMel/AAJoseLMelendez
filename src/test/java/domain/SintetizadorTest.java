package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SintetizadorTest {

    @Test
    public void testAddSintetizador() {
        Sintetizador sintetizador = new Sintetizador("2407B", "Moog", "Analógico", 3600, 36,
                14, 4, 31, true, "Led", false);

        assertEquals("Moog", sintetizador.getMarca());
        assertEquals(3600, sintetizador.getPrecio());
        assertEquals(false, sintetizador.isMonofonico());
        assertNotEquals(false, sintetizador.isEfectos());
        assertNotEquals(15, sintetizador.getPeso());
    }
}
