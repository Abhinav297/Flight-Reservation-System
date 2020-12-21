package com.upgrad;

public class Passenger {
    public int Id;
    public Address address;
    public Contact contact;

    public Passenger() {

    }

    public Passenger(int Id, Address address,Contact contact) {
        this.Id = Id;
        this.address = address;
        this.contact = contact;
    }

    public Contact getContact() {
        return contact;
    }
    public Address getAddress() {
        return address;
    }
}
