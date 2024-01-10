package com.example.finalProject.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.UUID;

@Data
public class AirportEntityDTO {

    private UUID id;

    @NotNull
    private String name;

    @NotNull
    String code;

    @NotNull
    String city;

    @NotNull
    String country;
}
