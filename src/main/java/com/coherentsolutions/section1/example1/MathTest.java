package com.coherentsolutions.section1.example1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MathTest {
    public int square(int n) {
        return n * n;
    }

    @Test
    public void testSquare() {
        assertEquals(25, square(5));
    }

    public static void main(String[] args) {
        // Demonstrate the square method here if needed
        MathTest mathTest = new MathTest();
        System.out.println("Square of 5: " + mathTest.square(5));
    }
}

