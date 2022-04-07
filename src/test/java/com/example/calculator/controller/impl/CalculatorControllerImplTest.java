package com.example.calculator.controller.impl;

import com.example.calculator.service.impl.CalculatorServiceImpl;
import io.corp.calculator.TracerImpl;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(controllers = CalculatorControllerImpl.class)
class CalculatorControllerImplTest {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private CalculatorServiceImpl service;
    @MockBean
    private TracerImpl tracerImpl;

    @Test
    void testGetAdditionIsOk() throws Exception {
        Mockito.when(service.getAddition(2.0, 2.0)).thenReturn(4.0);
        this.mockMvc.perform(get("/api/v1/addition?elem1=2.0&elem2=2.0"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json("{\"element1\":2.0,\"element2\":2.0,\"result\":4.0}"));
    }

    @Test
    void testGetAdditionIsKo() throws Exception {
        this.mockMvc.perform(get("/api/v1/addition?elem1=A&elem2=2.0"))
                .andDo(print())
                .andExpect(status().isBadRequest());
    }

    @Test
    void testGetSubtractionIsOk() throws Exception {
        Mockito.when(service.getSubtraction(2.0, 2.0)).thenReturn(0.0);
        this.mockMvc.perform(get("/api/v1/subtraction?elem1=2.0&elem2=2.0"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json("{\"element1\":2.0,\"element2\":2.0,\"result\":0.0}"));
    }

    @Test
    void testGetSubtractionIsKo() throws Exception {
        this.mockMvc.perform(get("/api/v1/subtraction?elem1=B&elem2=2.0"))
                .andDo(print())
                .andExpect(status().isBadRequest());
    }
}