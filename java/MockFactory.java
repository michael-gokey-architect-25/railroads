
package com.example.railyardapp.testutils;

import com.example.railyardapp.model.Car;
import com.example.railyardapp.model.Route;
import com.example.railyardapp.model.Train;
import com.example.railyardapp.model.Yard;

import java.time.LocalDateTime;

/**
 * Factory class for creating consistent mock objects for testing.
 */
public class MockFactory {

    public static Train createMockTrain() {
        Train train = new Train();
        train.setId(1L);
        train.setTrainNumber("NS9001");
        train.setRouteId(101L);
        train.setDepartureTime(LocalDateTime.of(2023, 5, 20, 8, 30));
        train.setArrivalTime(LocalDateTime.of(2023, 5, 20, 18, 45));
        train.setStatus("In Transit");
        return train;
    }

    public static Train createAnotherMockTrain() {
        Train train = new Train();
        train.setId(2L);
        train.setTrainNumber("CSX4450");
        train.setRouteId(102L);
        train.setDepartureTime(LocalDateTime.of(2023, 5, 21, 9, 0));
        train.setArrivalTime(LocalDateTime.of(2023, 5, 21, 19, 15));
        train.setStatus("Scheduled");
        return train;
    }

    public static Car createMockCar() {
        Car car = new Car();
        car.setId(1L);
        car.setType("Boxcar");
        car.setLoadType("Electronics");
        car.setWeight(30000);
        car.setTrainId(1L);
        return car;
    }

    public static Car createAnotherMockCar() {
        Car car = new Car();
        car.setId(2L);
        car.setType("Tanker");
        car.setLoadType("Fuel");
        car.setWeight(40000);
        car.setTrainId(2L);
        return car;
    }

    public static Route createMockRoute() {
        Route route = new Route();
        route.setId(101L);
        route.setOrigin("Atlanta");
        route.setDestination("Chicago");
        route.setDistance(715.5);
        route.setEstimatedTravelTime(12.5);
        return route;
    }

    public static Route createAnotherMockRoute() {
        Route route = new Route();
        route.setId(102L);
        route.setOrigin("Norfolk");
        route.setDestination("Philadelphia");
        route.setDistance(400.0);
        route.setEstimatedTravelTime(8.0);
        return route;
    }

    public static Yard createMockYard() {
        Yard yard = new Yard();
        yard.setId(201L);
        yard.setName("South Norfolk Yard");
        yard.setLocation("Norfolk, VA");
        yard.setCapacity(100);
        return yard;
    }

    public static Yard createAnotherMockYard() {
        Yard yard = new Yard();
        yard.setId(202L);
        yard.setName("Hammond Yard");
        yard.setLocation("Hammond, IN");
        yard.setCapacity(80);
        return yard;
    }
}
