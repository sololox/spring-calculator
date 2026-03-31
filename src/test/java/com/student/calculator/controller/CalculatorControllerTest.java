package com.student.calculator.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {

    CalculatorController calculator = new CalculatorController();

    @Test
    void testAddition() {
        int result = calculator.add(10, 5);
        assertEquals(15, result, "10 + 5 має бути 15");
    }

    @Test
    void testSubtraction() {
        int result = calculator.subtract(20, 8);
        assertEquals(12, result, "20 - 8 має бути 12");
    }

    @Test
    void testMultiplication() {
        int result = calculator.multiply(3, 4);
        assertEquals(12, result, "3 * 4 має бути 12");
    }

    @Test
    void testDivision() {
        int result = calculator.divide(10, 2);
        assertEquals(5, result, "10 / 2 має бути 5");
    }
}