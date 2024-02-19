package com.coherentsolutions.section2.example3;

import com.coherentsolutions.section2.example2.Calculator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedCalculatorTest {

    @ParameterizedTest
    @CsvSource({"1, 1, 2", "2, 3, 5", "10, 20, 30"})
    void testAddition(int a, int b, int expected) {
        Calculator calculator = new Calculator();
        assertEquals(expected, calculator.add(a, b));
    }
}
