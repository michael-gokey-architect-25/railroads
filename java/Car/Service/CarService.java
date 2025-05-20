
package com.railyard.service;

import com.railyard.model.Car;
import com.railyard.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Optional<Car> getCarById(Long id) {
        return carRepository.findById(id);
    }

    public Car createCar(Car car) {
        return carRepository.save(car);
    }

    public Car updateCar(Long id, Car updatedCar) {
        return carRepository.findById(id).map(car -> {
            car.setCarNumber(updatedCar.getCarNumber());
            car.setType(updatedCar.getType());
            car.setWeight(updatedCar.getWeight());
            car.setContents(updatedCar.getContents());
            car.setTrain(updatedCar.getTrain());
            return carRepository.save(car);
        }).orElse(null);
    }

    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }
}
