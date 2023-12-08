package org.example;

public class Flight {

    private String flightNumber = "AC103";
    private String destination = "China";
    private String departureTime = "12:30PM";


    public void flightDisplay(){

        System.out.println("Flight #: "+ this.flightNumber);
        System.out.println("Flight Destination: "+ this.destination);
        System.out.println("Fight Departure Time: "+ this.departureTime);

    }

}
