import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringTest {
    @Test
    void testLengthOfString() {
        SampleString sampleString = new SampleString();
        int actualLength = sampleString.testLength("ABCD");
        int expectedLength = 4;
        assertEquals(expectedLength, actualLength);
    }

    @Test
    void testCompareStrings() {
        SampleString sampleString = new SampleString();
        String a = "ABCDEFG";
        String b = "ABC";
        assertEquals(4, sampleString.compare(a, b));
    }

    @Test
    void testToUpperCase() {
        SampleString sampleString = new SampleString();
        String str = "abcd";
        String result = sampleString.toUpperCase(str);
        assertEquals("ABCD", result);
    }
}