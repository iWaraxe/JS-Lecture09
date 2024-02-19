package com.coherentsolutions.section2.example2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    void testAddition() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    void testSubtraction() {
        assertEquals(1, calculator.subtract(3,2),"3 - 2 should equal 1");
    }

    @Test
    void testPositiveSubtraction() {
        assertTrue(calculator.subtract(5, 3) > 0, "Subtraction result should be positive");
    }

    @Test
    void testObjectCreation() {
        Calculator calculator = new Calculator();
        assertNotNull(calculator, "Calculator object should not be null");
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }
}