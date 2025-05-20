package com.railyard.controller;

import com.railyard.model.Train;
import com.railyard.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// annotate REST controllers for Swagger documentation.

// REST Controller
@RestController
@RequestMapping("/api/trains")
@Tag(name = "Trains", description = "Operations related to train management")
public class TrainController {

    @Autowired
    private TrainService trainService;

    @Operation(summary = "Get all trains")
    @GetMapping
    public List<Train> getAllTrains() {
        return trainService.getAllTrains();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Train> getTrainById(@PathVariable Long id) {
        return trainService.getTrainById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @Operation(summary = "Create a new train")
    @PostMapping
    public Train createTrain(@RequestBody Train train) {
        return trainService.createTrain(train);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Train> updateTrain(@PathVariable Long id, @RequestBody Train train) {
        Train updated = trainService.updateTrain(id, train);
        if (updated == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTrain(@PathVariable Long id) {
        trainService.deleteTrain(id);
        return ResponseEntity.noContent().build();
    }


// @Operation(summary = "Add a car to a train")
// @Operation(summary = "Dispatch a train")
}
