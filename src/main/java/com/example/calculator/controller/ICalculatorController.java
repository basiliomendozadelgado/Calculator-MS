package com.example.calculator.controller;

import com.fasterxml.jackson.databind.node.ObjectNode;

public interface ICalculatorController {

    ObjectNode addition(Double elem1, Double elem2);

    ObjectNode subtraction(Double elem1, Double elem2);
}
