package com.example.webfluxmentoradvanced.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "cars")
@Builder
@AllArgsConstructor
public class Car {
    @Id
    private String id;
    private String model;
    private String color;
}
