package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class OrganoTest {

    @Test
    public void testAddOrgano() {
        Organo organo = new Organo("2203B", "Hammond", "Electromagnético", 6500, 63,
                120, "Estudio de grabación", 2, 0, true, true);

        assertEquals("Hammond", organo.getMarca());
        assertEquals("2203B", organo.getNumeroSerie());
        assertEquals(true, organo.isPedalera());
        assertNotEquals(false, organo.isReparado());
        assertNotEquals("Iglesia", organo.getLugarInstalacion());
    }
}
