package com.railyard.service;

import com.railyard.model.Car;
import com.railyard.repository.CarRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class CarServiceTest {
    @Mock
    private CarRepository repository;

    @InjectMocks
    private CarService service;

    public CarServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAll() {
        when(repository.findAll()).thenReturn(Collections.emptyList());
        assertTrue(service.getAllCars().isEmpty());
    }

    @Test
    public void testGetById() {
        Car entity = new Car();
        entity.setId(1L);
        when(repository.findById(1L)).thenReturn(Optional.of(entity));
        assertTrue(service.getCarById(1L).isPresent());
    }
}
