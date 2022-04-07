package com.example.calculator.service;

import com.fasterxml.jackson.databind.node.ObjectNode;

public interface ICalculatorService {

    ObjectNode getAddition(Double elem1, Double elem2);

    ObjectNode getSubtraction(Double elem1, Double elem2);
}
