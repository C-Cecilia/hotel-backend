package com.example.hotel_backend.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.hotel_backend.model.Hotel;
import com.example.hotel_backend.service.HotelService;

@RestController
@CrossOrigin(origins = "http://localhost:3000") // Allow the frontend origin
public class HotelController {

    private final HotelService hotelService;

    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping("/api/hotels")
    public ResponseEntity<List<Hotel>> getAllHotels() {
        return ResponseEntity.ok(hotelService.getAllHotels());
    }

    @GetMapping("/api/hotels/{id}")
    public ResponseEntity<?> getHotelById(@PathVariable int id) {
        Hotel hotel = hotelService.getHotelById(id);
        if (hotel == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(hotel);
    }
}