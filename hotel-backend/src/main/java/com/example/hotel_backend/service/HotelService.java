package com.example.hotel_backend.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.hotel_backend.model.Hotel;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.annotation.PostConstruct;


@Service
public class HotelService {
    // Create list to store hotel data in memory
    private final List<Hotel> hotels = new ArrayList<>();

    // Load hotel data from JSON file when the service is initialized
    @PostConstruct
public void loadHotelsFromJson() {
    try {
        ObjectMapper objectMapper = new ObjectMapper();
        InputStream inputStream = getClass().getResourceAsStream("/static/hotels.json");

        if (inputStream == null) {
            throw new RuntimeException("hotels.json file not found");
        }

        List<Hotel> loadedHotels = objectMapper.readValue(inputStream, new TypeReference<>() {});
        hotels.addAll(loadedHotels);

        System.out.println("Loaded hotels: " + hotels.size()); // Debugging log
    } catch (IOException e) {
        throw new RuntimeException("Failed to load hotel data", e);
    }
}

    

    // Method to retrieve all hotels
    public List<Hotel> getAllHotels() {
        // Runtrun the result
        return hotels;
    }

    // Method to retrieve a hotel by its ID
    public Hotel getHotelById(int id) {
        // Use Java Streams to filter the hotels by ID and return the first match
        return hotels.stream()
                // check if the hotel id is equal to the given id
                .filter(hotel -> hotel.getId() == id)
                // return the first match 
                .findFirst()
                // if no match is found, throw an exception
                .orElseThrow(() -> new RuntimeException("Hotel not found"));
    }
    }
    