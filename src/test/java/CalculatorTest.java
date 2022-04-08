import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("2 + 1 = 3")
    void testAddition() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(2, 1), "2 + 1 should equal 3");
    }

    @Test
    @DisplayName( "2 - 1 = 1")
    void testSubstraction() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.substract(2, 1), "2 - 1 should equal 1");
    }

    @Test
    @DisplayName("2 * 3 = 6")
    void testMultiplication() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3), "2 * 3 should equal 6");
    }
}