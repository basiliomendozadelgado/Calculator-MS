package com.example.calculator.service.impl;

import com.example.calculator.service.ICalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements ICalculatorService {

    @Override
    public Double getAddition(Double elem1, Double elem2) {
        return elem1 + elem2;
    }

    @Override
    public Double getSubtraction(Double elem1, Double elem2) {
        return elem1 - elem2;
    }
}
