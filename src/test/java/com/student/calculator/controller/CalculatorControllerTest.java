package com.student.calculator.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorControllerTest {

    private final CalculatorController controller = new CalculatorController();

    @Test
    void testAddUnit() {
        int result = Integer.parseInt(controller.add(10, 5));
        assertEquals(15, result, "10 + 5 має бути 15");
    }
}