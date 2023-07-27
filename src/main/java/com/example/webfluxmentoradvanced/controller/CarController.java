package com.example.webfluxmentoradvanced.controller;

import com.example.webfluxmentoradvanced.model.Car;
import com.example.webfluxmentoradvanced.service.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class CarController {

    CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/all")
    public Flux<Car> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping("/{id}")
    public Mono<Car> getCarById(@PathVariable("id") String id) {
        return carService.getCarById(id);
    }
}
