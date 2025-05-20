package com.railyard.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainTest {
    @Test
    public void testEntityFields() {
        Train entity = new Train();
        entity.setId(1L);
        assertEquals(1L, entity.getId());
    }
}
