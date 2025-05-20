package com.railyard.controller;

import com.railyard.model.Train;
import com.railyard.service.TrainService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.mockito.Mockito.*;

import java.util.Collections;

@WebMvcTest(TrainController.class)
public class TrainControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TrainService service;

    @Test
    public void testGetAll() throws Exception {
        when(service.getAllTrains()).thenReturn(Collections.emptyList());
        mockMvc.perform(get("/api/trains"))
                .andExpect(status().isOk());
    }
}
