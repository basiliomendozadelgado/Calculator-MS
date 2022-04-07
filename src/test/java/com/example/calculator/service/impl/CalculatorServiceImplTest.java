package com.example.calculator.service.impl;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorServiceImplTest {

    @Autowired
    private CalculatorServiceImpl service;

    @Test
    void getAddition() {
        Double result = service.getAddition(2.0, 2.0);
        Assertions.assertEquals(4.0, result);
    }

    @Test
    void getSubtraction() {
        Double result = service.getSubtraction(2.0, 2.0);
        Assertions.assertEquals(0.0, result);
    }
}