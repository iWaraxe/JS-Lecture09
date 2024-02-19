package com.coherentsolutions.section1.example3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void testAddition() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    void testObjectCreation() {
        Calculator calculator = new Calculator();
        assertNotNull(calculator, "Calculator object should not be null");
    }

    @Test
    void testPositiveSubtraction() {
        Calculator calculator = new Calculator();
        assertTrue(calculator.subtract(5, 3) > 0, "Subtraction result should be positive");
    }
}
