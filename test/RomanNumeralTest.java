import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralTest {

    RomanNumeral rn = new RomanNumeral();

    @Test
    void testSingleLetters() {
        assertEquals(1, rn.romanToInt("I"));
        assertEquals(5, rn.romanToInt("V"));
        assertEquals(10, rn.romanToInt("X"));
        assertEquals(50, rn.romanToInt("L"));
        assertEquals(100, rn.romanToInt("C"));
        assertEquals(500, rn.romanToInt("D"));
        assertEquals(1000, rn.romanToInt("M"));
    }

    @Test
    void testRepetition() {
        assertEquals(2, rn.romanToInt("II"));
        assertEquals(20, rn.romanToInt("XX"));
    }

    @Test
    void testSubtractiveNotation() {
        assertEquals(4, rn.romanToInt("IV"));
        assertEquals(9, rn.romanToInt("IX"));
        assertEquals(90, rn.romanToInt("XC"));
    }

    @Test
    void testCombined() {
        assertEquals(14, rn.romanToInt("XIV"));
        assertEquals(1987, rn.romanToInt("MCMLXXXVII"));
    }

    @Test
    void testInvalid() {
        assertThrows(IllegalArgumentException.class, () -> rn.romanToInt("ABC"));
    }

    @Test
    void testEmpty() {
        assertEquals(0, rn.romanToInt(""));
        assertEquals(0, rn.romanToInt(null));
    }
}
