package com.coherentsolutions.section3.task2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortingAlgorithmTest {
    // Initialize your SortingAlgorithm object here

    // Write parameterized tests for your sorting algorithm
    @ParameterizedTest
    @MethodSource("provideTestCases")
    public void testSort(int[] input, int[] expectedOutput) {
        // Your test code here
    }

    // Method to provide test cases
    public static Stream<Arguments> provideTestCases() {
        // Your test cases here
        return Stream.of(
                // Arguments.of(inputArray, expectedOutputArray)
        );
    }
}

