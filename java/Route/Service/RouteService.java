
package com.railyard.service;

import com.railyard.model.Route;
import com.railyard.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RouteService {

    @Autowired
    private RouteRepository routeRepository;

    public List<Route> getAllRoutes() {
        return routeRepository.findAll();
    }

    public Optional<Route> getRouteById(Long id) {
        return routeRepository.findById(id);
    }

    public Route createRoute(Route route) {
        return routeRepository.save(route);
    }

    public Route updateRoute(Long id, Route updatedRoute) {
        return routeRepository.findById(id).map(route -> {
            route.setRouteCode(updatedRoute.getRouteCode());
            route.setOrigin(updatedRoute.getOrigin());
            route.setDestination(updatedRoute.getDestination());
            route.setDistance(updatedRoute.getDistance());
            route.setStatus(updatedRoute.getStatus());
            return routeRepository.save(route);
        }).orElse(null);
    }

    public void deleteRoute(Long id) {
        routeRepository.deleteById(id);
    }
}
