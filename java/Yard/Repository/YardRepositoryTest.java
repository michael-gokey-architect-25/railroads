package com.railyard.repository;

import com.railyard.model.Yard;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class YardRepositoryTest {
    @Autowired
    private YardRepository repository;

    @Test
    public void testSaveAndFind() {
        Yard entity = new Yard();
        Yard saved = repository.save(entity);
        Optional<Yard> found = repository.findById(saved.getId());
        assertTrue(found.isPresent());
    }
}
