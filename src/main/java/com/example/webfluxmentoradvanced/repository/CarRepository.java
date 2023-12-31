package com.example.webfluxmentoradvanced.repository;

import com.example.webfluxmentoradvanced.model.Car;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface CarRepository extends ReactiveMongoRepository<Car, String> {
    Mono<Car> getCarById(String id);
}
