package com.railyard.service;

import com.railyard.model.Train;
import com.railyard.repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrainService {

    @Autowired
    private TrainRepository trainRepository;

    public List<Train> getAllTrains() {
        return trainRepository.findAll();
    }

    public Optional<Train> getTrainById(Long id) {
        return trainRepository.findById(id);
    }

    public Train createTrain(Train train) {
        return trainRepository.save(train);
    }

    public Train updateTrain(Long id, Train updatedTrain) {
        return trainRepository.findById(id).map(train -> {
            train.setTrainNumber(updatedTrain.getTrainNumber());
            train.setRoute(updatedTrain.getRoute());
            train.setCurrentYard(updatedTrain.getCurrentYard());
            train.setCars(updatedTrain.getCars());
            return trainRepository.save(train);
        }).orElse(null);
    }

    public void deleteTrain(Long id) {
        trainRepository.deleteById(id);
    }
}
