import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class StringTest {
    @Test
    void Length() {
        int actualLength = "ABCD".length();
        int expectedLength = 4;
        assertEquals(expectedLength, actualLength);
    }

    @Test
    void toUpperCase_basic() {
        String str = "abcd";
        String result = str.toUpperCase();
        assertEquals("ABCD", result);
    }

    @Test
    void length_exception() {
        String str = null;
        assertThrows(NullPointerException.class,
                () -> {
                    str.length();
                }
                );
    }
}