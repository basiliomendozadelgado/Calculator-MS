package com.example.calculator.controller;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.http.ResponseEntity;

public interface ICalculatorController {

    ResponseEntity<ObjectNode> addition(Double elem1, Double elem2);

    ResponseEntity<ObjectNode> subtraction(Double elem1, Double elem2);
}
