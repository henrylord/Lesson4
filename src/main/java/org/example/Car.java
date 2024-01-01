package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Car {

    HashMap<String,Integer> carInventory = new HashMap<String,Integer>();

    String make;
    String model;
    int year;
    double price;
    String currentState;

    public Car(){};
    public Car(String make, String model, int year, double price){

        this.make=make;
        this.model=model;
        this.year=year;
        this.price=price;
    }

    public void mostExpensiveCar(Car[] c){

        double max=0;
        String carName = "";

        for (Car i: c) {

            if (i.price > max) {

                max = i.price;
                carName = i.make;
            }
        }
        System.out.println("The most expensive car is: " + carName + " $" + max);
    }


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


    /*public static void main(String[] args) {

        Car car1 = new Car("VW","Tiguan", 2023,  38975);
        Car car2 = new Car("Toyota","RAV4",2022,44650);
        Car car3 = new Car("Volvo","XC90",2024,69900);
        Car car4 = new Car("Porsche","Cayenne",2024,89000);
        Car car5 = new Car("Acura","RDX",2019,32588);
        Car car6 = new Car("BMW","X5",2012,13995);


        Car[] cars = {car1,car2,car3,car4,car5,car6};

        Car temp = new Car();

        temp.mostExpensiveCar(cars);

    }*/
}