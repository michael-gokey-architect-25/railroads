package com.railyard.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RouteTest {
    @Test
    public void testEntityFields() {
        Route entity = new Route();
        entity.setId(1L);
        assertEquals(1L, entity.getId());
    }
}
