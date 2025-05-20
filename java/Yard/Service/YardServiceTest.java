package com.railyard.service;

import com.railyard.model.Yard;
import com.railyard.repository.YardRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class YardServiceTest {
    @Mock
    private YardRepository repository;

    @InjectMocks
    private YardService service;

    public YardServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAll() {
        when(repository.findAll()).thenReturn(Collections.emptyList());
        assertTrue(service.getAllYards().isEmpty());
    }

    @Test
    public void testGetById() {
        Yard entity = new Yard();
        entity.setId(1L);
        when(repository.findById(1L)).thenReturn(Optional.of(entity));
        assertTrue(service.getYardById(1L).isPresent());
    }
}
