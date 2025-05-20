package com.railyard.service;

import com.railyard.model.Route;
import com.railyard.repository.RouteRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class RouteServiceTest {
    @Mock
    private RouteRepository repository;

    @InjectMocks
    private RouteService service;

    public RouteServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAll() {
        when(repository.findAll()).thenReturn(Collections.emptyList());
        assertTrue(service.getAllRoutes().isEmpty());
    }

    @Test
    public void testGetById() {
        Route entity = new Route();
        entity.setId(1L);
        when(repository.findById(1L)).thenReturn(Optional.of(entity));
        assertTrue(service.getRouteById(1L).isPresent());
    }
}
