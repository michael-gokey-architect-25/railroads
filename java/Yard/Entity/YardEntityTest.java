package com.railyard.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class YardTest {
    @Test
    public void testEntityFields() {
        Yard entity = new Yard();
        entity.setId(1L);
        assertEquals(1L, entity.getId());
    }
}
