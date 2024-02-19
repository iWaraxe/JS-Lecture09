package com.coherentsolutions.section2.example4;

import com.coherentsolutions.section2.example2.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionTest {

    @Test
    void testDivideByZeroException() {
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0));
    }
}

