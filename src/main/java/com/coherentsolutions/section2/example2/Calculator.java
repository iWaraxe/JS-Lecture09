package com.coherentsolutions.section2.example2;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Divides two integers and returns the result as a double.
     * Throws an ArithmeticException if the divisor is zero.
     *
     * @param a the dividend
     * @param b the divisor
     * @return the result of the division
     * @throws ArithmeticException if the divisor is zero
     */
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return (double) a / b;
    }
}