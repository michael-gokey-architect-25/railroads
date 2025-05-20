package com.railyard.controller;

import com.railyard.model.Yard;
import com.railyard.service.YardService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.mockito.Mockito.*;

import java.util.Collections;

@WebMvcTest(YardController.class)
public class YardControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private YardService service;

    @Test
    public void testGetAll() throws Exception {
        when(service.getAllYards()).thenReturn(Collections.emptyList());
        mockMvc.perform(get("/api/yards"))
                .andExpect(status().isOk());
    }
}
