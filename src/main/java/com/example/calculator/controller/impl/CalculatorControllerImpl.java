package com.example.calculator.controller.impl;

import com.example.calculator.controller.ICalculatorController;
import com.example.calculator.service.impl.CalculatorServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.corp.calculator.TracerImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class CalculatorControllerImpl implements ICalculatorController {

    private final CalculatorServiceImpl service;
    private final ObjectMapper mapper;
    private final TracerImpl tracerImpl;

    @Override
    @GetMapping("/addition")
    public ResponseEntity<ObjectNode> addition(@RequestParam(name = "elem1") Double elem1,
                                               @RequestParam(name = "elem2") Double elem2) {
        tracerImpl.trace("CalculatorController: GetMapping addition");
        return ResponseEntity.ok(getJsonNodes(elem1, elem2, service.getAddition(elem1, elem2)));
    }

    @Override
    @GetMapping("/subtraction")
    public ResponseEntity<ObjectNode> subtraction(@RequestParam(name = "elem1") Double elem1,
                                                  @RequestParam(name = "elem2") Double elem2) {
        tracerImpl.trace("CalculatorController: GetMapping subtraction");
        return ResponseEntity.ok(getJsonNodes(elem1, elem2, service.getSubtraction(elem1, elem2)));
    }

    private ObjectNode getJsonNodes(Double elem1, Double elem2, Double result) {
        ObjectNode objectNode = mapper.createObjectNode();
        objectNode.put("element1", elem1);
        objectNode.put("element2", elem2);
        objectNode.put("result", result);
        return objectNode;
    }
}
