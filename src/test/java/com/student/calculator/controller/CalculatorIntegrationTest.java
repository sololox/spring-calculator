package com.student.calculator.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class CalculatorIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testAdd() throws Exception {
        mockMvc.perform(get("/add").param("a", "10").param("b", "5"))
                .andExpect(status().isOk())
                .andExpect(content().string("15"));
    }

    @Test
    void testSubtract() throws Exception {
        mockMvc.perform(get("/subtract").param("a", "10").param("b", "5"))
                .andExpect(status().isOk())
                .andExpect(content().string("5"));
    }

    @Test
    void testMultiply() throws Exception {
        mockMvc.perform(get("/multiply").param("a", "4").param("b", "5"))
                .andExpect(status().isOk())
                .andExpect(content().string("20"));
    }

    @Test
    void testDivide() throws Exception {
        mockMvc.perform(get("/divide").param("a", "10").param("b", "2"))
                .andExpect(status().isOk())
                .andExpect(content().string("5"));
    }

    @Test
    void testDivideByZero() throws Exception {
        mockMvc.perform(get("/divide").param("a", "10").param("b", "0"))
                .andExpect(status().isOk())
                .andExpect(content().string("Error: Division by zero"));
    }
}