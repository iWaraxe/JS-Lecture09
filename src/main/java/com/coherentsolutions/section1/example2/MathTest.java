package com.coherentsolutions.section1.example2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MathTest {
    public int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n-1);
    }

    @Test
    public void testFactorial() {
        assertEquals(120, factorial(5));
    }

    public static void main(String[] args) {
        // Demonstrate the factorial method here if needed
        MathTest mathTest = new MathTest();
        System.out.println("Factorial of 5: " + mathTest.factorial(6));
    }
}
