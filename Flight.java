package com.upgrad;

public class Flight {
    public String flightNumber;
    public String airline;
    public int capacity;
    private int bookedSeats;

    public Flight() {

    }

    public Flight(String flightNumber, String airline, int capacity,int bookedSeats) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public String getFlightDetails() {
        return flightNumber + ", " + airline;
    }
    public boolean checkAvailability() {
        if (capacity == bookedSeats) {
            return false;
        }
        else {
            return true;
        }
    }
    public void incrementBookingCounter() {

    }
}