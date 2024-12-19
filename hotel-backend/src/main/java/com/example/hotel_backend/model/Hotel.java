package com.example.hotel_backend.model;

import java.util.List;

public class Hotel {
    private int id;
    private String name;
    private String location;
    private double rating;
    private String imageUrl;
    private List<String> datesOfTravel;
    private String boardBasis;
    private List<Room> rooms;

    //Gtters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<String> getDatesOfTravel() {
        return datesOfTravel;
    }

    public void setDatesOfTravel(List<String> datasOfTravel) {
        this.datesOfTravel = datasOfTravel;
    }

    public String getBoardBasis() {
        return boardBasis;
    }

    public void setBoardBasis(String boardBasis) {
        this.boardBasis = boardBasis;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    //Nested Room class
    public static class Room {
        private String roomType;
        private int amount;

        public String getRoomType() {
            return roomType;
        }

        public void setRoomType(String roomType) {
            this.roomType = roomType;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }
    }
}
