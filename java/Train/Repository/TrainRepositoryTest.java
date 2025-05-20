package com.railyard.repository;

import com.railyard.model.Train;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class TrainRepositoryTest {
    @Autowired
    private TrainRepository repository;

    @Test
    public void testSaveAndFind() {
        Train entity = new Train();
        Train saved = repository.save(entity);
        Optional<Train> found = repository.findById(saved.getId());
        assertTrue(found.isPresent());
    }
}
