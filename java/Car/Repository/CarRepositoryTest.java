package com.railyard.repository;

import com.railyard.model.Car;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class CarRepositoryTest {
    @Autowired
    private CarRepository repository;

    @Test
    public void testSaveAndFind() {
        Car entity = new Car();
        Car saved = repository.save(entity);
        Optional<Car> found = repository.findById(saved.getId());
        assertTrue(found.isPresent());
    }
}
