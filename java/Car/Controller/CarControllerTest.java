package com.railyard.controller;

import com.railyard.model.Car;
import com.railyard.service.CarService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.mockito.Mockito.*;

import java.util.Collections;

@WebMvcTest(CarController.class)
public class CarControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CarService service;

    @Test
    public void testGetAll() throws Exception {
        when(service.getAllCars()).thenReturn(Collections.emptyList());
        mockMvc.perform(get("/api/cars"))
                .andExpect(status().isOk());
    }
}
