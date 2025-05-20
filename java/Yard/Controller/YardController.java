package com.railyard.controller;

import com.railyard.model.Yard;
import com.railyard.service.YardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/yards")
public class YardController {

    @Autowired
    private YardService yardService;

    @GetMapping
    public List<Yard> getAllYards() {
        return yardService.getAllYards();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Yard> getYardById(@PathVariable Long id) {
        return yardService.getYardById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Yard createYard(@RequestBody Yard yard) {
        return yardService.createYard(yard);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Yard> updateYard(@PathVariable Long id, @RequestBody Yard yard) {
        Yard updated = yardService.updateYard(id, yard);
        if (updated == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteYard(@PathVariable Long id) {
        yardService.deleteYard(id);
        return ResponseEntity.noContent().build();
    }
}
