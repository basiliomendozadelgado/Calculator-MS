package com.example.calculator.service.impl;

import com.example.calculator.service.ICalculatorService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CalculatorServiceImpl implements ICalculatorService {

    private final ObjectMapper mapper;

    @Override
    public ObjectNode getAddition(Double elem1, Double elem2) {
        Double result = elem1 + elem2;
        return getJsonNodes(elem1, elem2, result);
    }

    @Override
    public ObjectNode getSubtraction(Double elem1, Double elem2) {
        Double result = elem1 - elem2;
        return getJsonNodes(elem1, elem2, result);
    }

    private ObjectNode getJsonNodes(Double elem1, Double elem2, Double result) {
        ObjectNode objectNode = mapper.createObjectNode();
        objectNode.put("element1", elem1);
        objectNode.put("element2", elem2);
        objectNode.put("result", result);
        return objectNode;
    }
}
