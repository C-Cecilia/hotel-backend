package com.example.hotel_backend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hotel_backend.model.Hotel;
import com.example.hotel_backend.service.HotelService;


@RestController
@RequestMapping("/api/hotels")
public class HotelController {

    private final HotelService hotelService;

    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotels() {
        return ResponseEntity.ok(hotelService.getAllHotels());
    }

   @GetMapping("/{id}")
    public ResponseEntity<?> getHotelById(@PathVariable("id") int id) {
        try {
            Hotel hotel = hotelService.getHotelById(id);
            return ResponseEntity.ok(hotel);
        } catch (RuntimeException ex) {
            // Explicit handling for not found cases
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Hotel not found");
        }
    }
}
