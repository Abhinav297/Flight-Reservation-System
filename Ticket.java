package com.upgrad;

public class Ticket {
    public String pnr;
    public String from;
    public String to;
    public Flight flight;
    public String departureDateTime;
    public String arrivalDateTime;
    public Passenger passenger;
    public String seatNo;
    public float price;
    public boolean isActive = false;

    public Ticket() {

    }

    public Ticket(String pnr, String from, String to) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
    }

    public String checkStatus() {
        if (isActive == true) {
            return "Booked";
        }
        else {
            return "Cancelled";
        }
    }

    public int getFlightDuration() {
        return 1;
    }

    public void cancelled() {
    }
}
