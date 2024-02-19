package com.coherentsolutions.section1.example4;

public class AreaCalculator {
    public double calculateAndPrintAreaOfCircle(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area is: " + area);
        return area;
    }

    public double calculateAreaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        // Demonstrate the methods here if needed
        AreaCalculator areaCalculator = new AreaCalculator();
        System.out.println("Area with print: " + areaCalculator.calculateAndPrintAreaOfCircle(5));
        System.out.println("Area without print: " + areaCalculator.calculateAreaOfCircle(5));
    }
}
