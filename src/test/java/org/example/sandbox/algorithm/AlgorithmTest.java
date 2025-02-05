package org.example.sandbox.algorithm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlgorithmTest {

    @Test
    void testFibonacci() {
        assertEquals(0, Algorithm.fibonacci(0));
        assertEquals(1, Algorithm.fibonacci(1));
        assertEquals(1, Algorithm.fibonacci(2));
        assertEquals(2, Algorithm.fibonacci(3));
        assertEquals(3, Algorithm.fibonacci(4));
        assertEquals(5, Algorithm.fibonacci(5));
        assertEquals(8, Algorithm.fibonacci(6));
        assertEquals(13, Algorithm.fibonacci(7));
        assertEquals(21, Algorithm.fibonacci(8));
        assertEquals(34, Algorithm.fibonacci(9));
        assertEquals(55, Algorithm.fibonacci(10));
    }

    @Test
    void testFibonacciRecursive() {
        assertEquals(0, Algorithm.fibonacciRecursive(0));
        assertEquals(1, Algorithm.fibonacciRecursive(1));
        assertEquals(1, Algorithm.fibonacciRecursive(2));
        assertEquals(2, Algorithm.fibonacciRecursive(3));
        assertEquals(3, Algorithm.fibonacciRecursive(4));
        assertEquals(5, Algorithm.fibonacciRecursive(5));
        assertEquals(8, Algorithm.fibonacciRecursive(6));
        assertEquals(13, Algorithm.fibonacciRecursive(7));
        assertEquals(21, Algorithm.fibonacciRecursive(8));
        assertEquals(34, Algorithm.fibonacciRecursive(9));
        assertEquals(55, Algorithm.fibonacciRecursive(10));
    }

    @Test
    void testFibonacciNegative() {
        assertThrows(IllegalArgumentException.class, () -> Algorithm.fibonacci(-1));
    }

    @Test
    void testFibonacciRecursiveNegative() {
        assertThrows(IllegalArgumentException.class, () -> Algorithm.fibonacciRecursive(-1));
    }
}