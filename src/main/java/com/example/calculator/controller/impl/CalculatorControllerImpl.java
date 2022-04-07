package com.example.calculator.controller.impl;

import com.example.calculator.controller.ICalculatorController;
import com.example.calculator.service.impl.CalculatorServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class CalculatorControllerImpl implements ICalculatorController {

    private final CalculatorServiceImpl service;

    @Override
    @GetMapping("/addition")
    public Double addition(@RequestParam(name="elem1") Double elem1,
                           @RequestParam(name="elem2") Double elem2) {
        return service.getAddition(elem1, elem2);
    }

    @Override
    @GetMapping("/subtraction")
    public Double subtraction(@RequestParam(name="elem1") Double elem1,
                              @RequestParam(name="elem2") Double elem2) {
        return service.getSubtraction(elem1, elem2);
    }
}
