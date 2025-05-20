package com.railyard.repository;

import com.railyard.model.Route;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class RouteRepositoryTest {
    @Autowired
    private RouteRepository repository;

    @Test
    public void testSaveAndFind() {
        Route entity = new Route();
        Route saved = repository.save(entity);
        Optional<Route> found = repository.findById(saved.getId());
        assertTrue(found.isPresent());
    }
}
