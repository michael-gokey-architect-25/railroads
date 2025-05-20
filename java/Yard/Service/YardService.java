package com.railyard.service;

import com.railyard.model.Yard;
import com.railyard.repository.YardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class YardService {

    @Autowired
    private YardRepository yardRepository;

    public List<Yard> getAllYards() {
        return yardRepository.findAll();
    }

    public Optional<Yard> getYardById(Long id) {
        return yardRepository.findById(id);
    }

    public Yard createYard(Yard yard) {
        return yardRepository.save(yard);
    }

    public Yard updateYard(Long id, Yard updatedYard) {
        return yardRepository.findById(id).map(yard -> {
            yard.setYardCode(updatedYard.getYardCode());
            yard.setLocation(updatedYard.getLocation());
            yard.setCapacity(updatedYard.getCapacity());
            yard.setStatus(updatedYard.getStatus());
            return yardRepository.save(yard);
        }).orElse(null);
    }

    public void deleteYard(Long id) {
        yardRepository.deleteById(id);
    }
}
