package com.coherentsolutions.section1.example4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AreaCalculatorTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testCalculateAndPrintAreaOfCircle() {
        AreaCalculator areaCalculator = new AreaCalculator();
        double area = areaCalculator.calculateAndPrintAreaOfCircle(5);
        assertEquals(78.53981633974483, area, 0.00001, "Area should be approximately 78.54");
        assertEquals("Area is: 78.53981633974483\n", outContent.toString(), "Output should match");
    }

    @Test
    void testCalculateAreaOfCircle() {
        AreaCalculator areaCalculator = new AreaCalculator();
        double area = areaCalculator.calculateAreaOfCircle(5);
        assertEquals(78.53981633974483, area, 0.00001, "Area should be approximately 78.54");
    }
}

