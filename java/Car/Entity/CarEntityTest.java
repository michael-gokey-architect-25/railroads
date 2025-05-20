package com.railyard.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
    @Test
    public void testEntityFields() {
        Car entity = new Car();
        entity.setId(1L);
        assertEquals(1L, entity.getId());
    }
}
