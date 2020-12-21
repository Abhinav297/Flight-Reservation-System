package com.upgrad;

public class Main {

    public static void main(String[] args) {
        Address address1 = new Address("Mirzapur","UP", "Vasaliganj"); //Creating Address object
        System.out.println(address1.getAddressDetails());
        address1.updateAddressDetails("Lalbangla", "Kanpur", "UP");//Updating Address object
        System.out.println(address1.getAddressDetails());


        Contact contact1 = new Contact("Raj", "1234567890", "something@gmail.com");//Creating Contact object
        System.out.println(contact1.getContactDetails());
        contact1.updateContactDetails("Rajesh", "0987654321", "no@gmail.com");//Updating Contact object
        System.out.println(contact1.getContactDetails());

        Flight flight1 = new Flight("FED645", "Boieng", 125, 0);
        System.out.println(flight1.getFlightDetails());
        System.out.println(flight1.getBookedSeats());
        System.out.println(flight1.checkAvailability());

        Passenger passenger1 = new Passenger(567, address1,contact1);
        System.out.println(passenger1.getAddress());

        Ticket ticket1 = new Ticket("123456", "Mumbai", "banglore");
        System.out.println(ticket1.getFlightDuration());


	}
}
