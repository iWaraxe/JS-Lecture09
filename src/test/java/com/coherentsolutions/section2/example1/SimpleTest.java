package com.coherentsolutions.section2.example1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {

    @BeforeAll
    static void setupAll() {
        System.out.println("Runs once before any test method.");
    }

    @BeforeEach
    void setup() {
        System.out.println("Runs before each test method.");
    }

    @Test
    void testAddition() {
        assertEquals(5, 2 + 3, "2 + 3 should equal 5");
    }

    @Test
    void testMultiplication() {
        assertEquals(24, 6*4, "6 * 4 should equal 24");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Runs after each test method.");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Runs once after all test methods have been run.");
    }
}

