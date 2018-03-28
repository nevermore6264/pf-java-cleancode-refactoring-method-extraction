import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {
    @Test
    @DisplayName("Testing getVolume(0, 0)")
    void testGetVolume0And0() {
        int radius = 0;
        int height = 0;
        final double EXPECTED = 0;

        double result = Cylinder.getArea(radius, height);
        assertEquals(EXPECTED, result);
    }

    @Test
    @DisplayName("Testing getVolume(1, 2)")
    void testGetVolume1And2() {
        int radius = 1;
        int height = 2;
        final double EXPECTED = 18.84955592153876;

        double result = Cylinder.getArea(radius, height);
        assertEquals(EXPECTED, result);
    }

}