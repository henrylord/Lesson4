package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Car {

    HashMap<String,Integer> carInventory = new HashMap<String,Integer>();

    String make;
    String model;
    int year;
    String currentState;


    public void addCar(String make,int year){
        this.make = make;
        this.year = year;
        carInventory.put(this.make,this.year);
    }

    public void showInventory(){
        System.out.println(carInventory);
    }

    public void startCar(){
        System.out.println("Car Started");
        currentState = "Idle";
    }

    public void stopCar(){
        System.out.println("Car Stopped");
        currentState = "P";
    }

    public void carStateDisplay(){

        System.out.println(currentState);

    }

    public void carCompare(){

        ArrayList<Integer> year = new ArrayList<Integer>();

        for (String i: carInventory.keySet()){
            year.add(carInventory.get(i));
        }

        if (year.get(0)>year.get(1)) {
            System.out.println("First car is newer");
        }
        else if(year.get(0)<year.get(1)){
            System.out.println("Second car is newer");
        }
        else{
            System.out.println("They are manufactured at same year");
        }
    }
}
