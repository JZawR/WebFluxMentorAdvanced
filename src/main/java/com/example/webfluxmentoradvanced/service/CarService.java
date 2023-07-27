package com.example.webfluxmentoradvanced.service;

import com.example.webfluxmentoradvanced.model.Car;
import com.example.webfluxmentoradvanced.repository.CarRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CarService {
    CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Flux<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Mono<Car> getCarById(String id) {
        return carRepository.getCarById(id);
    }

    @PostConstruct
    private void init() {
        carRepository.deleteAll().block();
        carRepository.save(Car.builder().color("red").model("bmw").build()).block();
        carRepository.save(Car.builder().color("blue").model("nissan").build()).block();
        carRepository.save(Car.builder().color("white").model("toyota").build()).block();
        carRepository.save(Car.builder().color("brown").model("volkswagen").build()).block();
        carRepository.save(Car.builder().color("grey").model("lada").build()).block();

    }
}
