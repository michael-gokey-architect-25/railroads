package com.railyard.controller;

import com.railyard.model.Route;
import com.railyard.service.RouteService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.mockito.Mockito.*;

import java.util.Collections;

@WebMvcTest(RouteController.class)
public class RouteControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private RouteService service;

    @Test
    public void testGetAll() throws Exception {
        when(service.getAllRoutes()).thenReturn(Collections.emptyList());
        mockMvc.perform(get("/api/routes"))
                .andExpect(status().isOk());
    }
}
