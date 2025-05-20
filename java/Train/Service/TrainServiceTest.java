package com.railyard.service;

import com.railyard.model.Train;
import com.railyard.repository.TrainRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class TrainServiceTest {
    @Mock
    private TrainRepository repository;

    @InjectMocks
    private TrainService service;

    public TrainServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAll() {
        when(repository.findAll()).thenReturn(Collections.emptyList());
        assertTrue(service.getAllTrains().isEmpty());
    }

    @Test
    public void testGetById() {
        Train entity = new Train();
        entity.setId(1L);
        when(repository.findById(1L)).thenReturn(Optional.of(entity));
        assertTrue(service.getTrainById(1L).isPresent());
    }
}
