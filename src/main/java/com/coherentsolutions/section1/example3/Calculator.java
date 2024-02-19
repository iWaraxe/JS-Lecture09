package com.coherentsolutions.section1.example3;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    // ... other methods like multiply, divide etc.

    public static void main(String[] args) {
        // Demonstrate the add method here if needed
        Calculator calculator = new Calculator();
        System.out.println("2 + 3 = " + calculator.add(2, 3));
        System.out.println("5 - 2 = " + calculator.subtract(5,2));
    }
}

